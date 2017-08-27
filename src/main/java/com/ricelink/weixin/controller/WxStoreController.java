package com.ricelink.weixin.controller;

import com.ricelink.baseframe.common.pojo.Message;
import com.ricelink.weixin.mapper.model.RlDealerOrg;
import com.ricelink.weixin.mapper.model.RlPotentialCustomers;
import com.ricelink.weixin.service.WxRlDealerOrgService;
import com.ricelink.weixin.service.WxRlPotentialCustomersService;
import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Map;

/**
 * Created by chenshengju on 2017/8/16 0016.
 */
@RestController
@RequestMapping("/store")
public class WxStoreController {
    @Autowired
    private WxRlPotentialCustomersService wxRlPotentialCustomersService;
    @Autowired
    private WxRlDealerOrgService wxRlDealerOrgService;
    @RequestMapping("/nearby")
    public Object nearby(Double latitude,Double longitude)
    {
        List<Map> mapList=wxRlDealerOrgService.selectNearbyOrg(latitude,longitude);
        return new Message(Message.SUCCESS,"success",mapList);
    }
    @RequestMapping("/myStore")
    public Object myStore(String userId)
    {
        List<Map> resultMap;
        RlPotentialCustomers rlPotentialCustomers = new RlPotentialCustomers();
        rlPotentialCustomers.setWxOpenid(userId);
        rlPotentialCustomers = wxRlPotentialCustomersService.selectOne(rlPotentialCustomers);
        if(StringUtils.isNotBlank(rlPotentialCustomers.getOrgId()))
        {
            Map parmMap=new HashedMap();
            parmMap.put("orgId",rlPotentialCustomers.getOrgId());
            parmMap.put("customerId",rlPotentialCustomers.getCustomerId());
            resultMap=wxRlDealerOrgService.selectRlDealerOrg(parmMap);
        }else
        {
            resultMap=wxRlDealerOrgService.selectRlDealerOrgNoOrgId(rlPotentialCustomers.getCustomerId());
        }

        return new Message(Message.SUCCESS,"success",resultMap);
    }
    @RequestMapping("/introduce")
    public Object introduce(String orgId)
    {
        String introHtml=wxRlDealerOrgService.selectOrgIntroduce(orgId);
        return introHtml;
    }
    @RequestMapping("/details")
    public Object details(String orgId)
    {
        Map map=wxRlDealerOrgService.selectStoreDetails(orgId);
        return new Message(Message.SUCCESS, "success",map);
    }

}
