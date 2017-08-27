package com.ricelink.weixin.controller;

import com.ricelink.baseframe.common.pojo.Message;
import com.ricelink.weixin.mapper.model.RlPotentialCustomers;
import com.ricelink.weixin.service.WxRlPotentialCustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenshengju on 2017/8/21 0021.
 */
@RestController
@RequestMapping("/common")
public class WxCommonController {
    @Autowired
    private WxRlPotentialCustomersService wxRlPotentialCustomersService;
    @RequestMapping("/checkCustomer")
    public Object checkCustomer(String userId)
    {
        RlPotentialCustomers rlPotentialCustomers=new RlPotentialCustomers();
        rlPotentialCustomers.setWxOpenid(userId);
        rlPotentialCustomers=wxRlPotentialCustomersService.selectOne(rlPotentialCustomers);
        if(rlPotentialCustomers!=null)
        {
            return new Message(Message.SUCCESS,"success");
        }else
        {
            return new Message(Message.ERROR,"fail");
        }

    }
}
