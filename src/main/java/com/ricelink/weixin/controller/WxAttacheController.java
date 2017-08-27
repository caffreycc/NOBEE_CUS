package com.ricelink.weixin.controller;

import com.ricelink.baseframe.common.pojo.Message;
import com.ricelink.weixin.service.WxRlOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by chenshengju on 2017/8/17 0017.
 */
@RestController
@RequestMapping("/attach")
public class WxAttacheController {
    @Autowired
    private WxRlOrderService wxRlOrderService;
    @RequestMapping("/show")
    public Object show(String optyId)
    {
       List<Map> mapList=wxRlOrderService.selectAttache(optyId);
        for (Map map : mapList) {
            String orderId = (String) map.get("orderId");
            List<Map> picListMap=wxRlOrderService.selectPicByResId(orderId);
            map.put("pics", picListMap);
        }
        return new Message(Message.SUCCESS, "success", mapList);
    }
}
