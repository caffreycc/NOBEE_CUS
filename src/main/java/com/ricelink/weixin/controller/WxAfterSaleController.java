package com.ricelink.weixin.controller;

import com.ricelink.baseframe.common.pojo.Message;
import com.ricelink.weixin.jsonparam.ApplyForParam;
import com.ricelink.weixin.mapper.model.RlAfterSaleServiceInfo;
import com.ricelink.weixin.mapper.model.RlPotentialCustomers;
import com.ricelink.weixin.mapper.model.SysAttachment;
import com.ricelink.weixin.service.WxRlAfterSaleServiceInfoService;
import com.ricelink.weixin.service.WxRlPotentialCustomersService;
import com.ricelink.weixin.service.WxSysAttachmentService;
import com.ricelink.weixin.utils.UUID;
import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chenshengju on 2017/8/23 0023.
 */
@RestController
@RequestMapping("/afterSale")
public class WxAfterSaleController {
    @Autowired
    private WxRlPotentialCustomersService wxRlPotentialCustomersService;
    @Autowired
    private WxSysAttachmentService wxSysAttachmentService;
    @Autowired
    private WxRlAfterSaleServiceInfoService wxRlAfterSaleServiceInfoService;

    @RequestMapping("/uploadApplyFor")
    public Object uploadApplyFor(@RequestParam("file") MultipartFile file, String userId, HttpServletRequest request) throws Exception {
        String customerId = wxRlPotentialCustomersService.selectCustomerIdByUserId(userId);
        String path = request.getSession().getServletContext().getRealPath("upload");
        String name = file.getOriginalFilename();
        // 获取图片的扩展名
        String extensionName = name.substring(name.lastIndexOf(".") + 1);
        String url = request.getContextPath() + "/upload/" + name;
        File saveFilePath = new File(path);
        File savefile = new File(path + name);
        if (!saveFilePath.exists()) {
            saveFilePath.mkdirs();
        }
        file.transferTo(savefile);
        String uuid = UUID.getUUID();
        SysAttachment sysAttachment = new SysAttachment();
        sysAttachment.setFileId(uuid);
        sysAttachment.setFileName(name);
        sysAttachment.setFileSource(name);
        sysAttachment.setFileType(extensionName);
        sysAttachment.setFilePath(url);
        sysAttachment.setGroupNo("shfw");
        sysAttachment.setFileSize(Long.parseLong(savefile.length() + ""));
        sysAttachment.setAbsPath(savefile.getAbsolutePath());
        sysAttachment.setCreateby(customerId);
        sysAttachment.setCreateTime(new Date());
        wxSysAttachmentService.insertSelective(sysAttachment);
        Map map = new HashMap<>();
        map.put("uuid", uuid);
        map.put("url", url);
        return new Message(Message.SUCCESS, "success", map);
    }

    @RequestMapping("/applyFor")
    public Object applyFor(@RequestBody ApplyForParam applyForParam) {
        RlPotentialCustomers rlPotentialCustomers = new RlPotentialCustomers();
        rlPotentialCustomers.setWxOpenid(applyForParam.getUserId());
        rlPotentialCustomers = wxRlPotentialCustomersService.selectOne(rlPotentialCustomers);
        RlAfterSaleServiceInfo rlAfterSaleServiceInfo = applyForParam.getRlAfterSaleServiceInfo();
        List<String> uuids = applyForParam.getUuids();
        wxSysAttachmentService.batchUpdate(rlAfterSaleServiceInfo, uuids, rlPotentialCustomers);
        return new Message(Message.SUCCESS, "success");

    }

    @RequestMapping("/showList")
    public Object showList(String optyId) {
        if (StringUtils.isNotBlank(optyId)) {
            RlAfterSaleServiceInfo rlAfterSaleServiceInfo = new RlAfterSaleServiceInfo();
            rlAfterSaleServiceInfo.setOrderId(optyId);
            List<RlAfterSaleServiceInfo> rlAfterSaleServiceInfos = wxRlAfterSaleServiceInfoService.select(rlAfterSaleServiceInfo);
            return new Message(Message.SUCCESS, "success", rlAfterSaleServiceInfos);
        }
        return new Message(Message.ERROR, "fail");
    }

    @RequestMapping("/showDetail")
    public Object showDetail(String id) {
        if (StringUtils.isNotBlank(id)) {
            Map resultMap = new HashedMap();
            RlAfterSaleServiceInfo rlAfterSaleServiceInfo = new RlAfterSaleServiceInfo();
            rlAfterSaleServiceInfo.setId(id);
            rlAfterSaleServiceInfo = wxRlAfterSaleServiceInfoService.selectOne(rlAfterSaleServiceInfo);
            List<Map> mapList = wxRlAfterSaleServiceInfoService.selectUrlById(id);
            resultMap.put("urls", mapList);
            resultMap.put("rlAfterSaleServiceInfo", rlAfterSaleServiceInfo);
            return new Message(Message.SUCCESS, "success", resultMap);
        }
        return new Message(Message.ERROR, "fail");
    }
}
