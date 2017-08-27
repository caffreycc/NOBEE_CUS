package com.ricelink.weixin.controller;

import com.ricelink.weixin.jsonparam.MyRequirdParam;
import com.ricelink.weixin.mapper.model.RlOpportunities;
import com.ricelink.weixin.mapper.model.RlPayment;
import com.ricelink.weixin.mapper.model.RlPotentialCustomers;
import com.ricelink.weixin.mapper.model.RlPotentialOpportunities;
import com.ricelink.weixin.service.*;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenshengju on 2017/7/24 0024.
 */
@Controller
@RequestMapping()
public class TestController {
    @Autowired
    private WxRlPotentialCustomersService wxRlPotentialCustomersService;
    @Autowired
    private WxRlPotentialOpportunitiesService wxRlPotentialOpportunitiesService;
    @Autowired
    private WxRlOpportunitiesService wxRlOpportunitiesService;
    @Autowired
    private WxRlPaymentService wxRlPaymentService;
    @Autowired
    private TestService testService;
    @ResponseBody
    @RequestMapping("/test")
    public Object myTest(String oppenId, String opportunityId, String payment, BigDecimal amount, HttpServletRequest request) {
        String openId = (String) request.getSession().getAttribute("openId");
        String customerId = (String) request.getSession().getAttribute("customerId");
        if (wxRlOpportunitiesService.selectCountById(opportunityId) == 1) {
            //说明是付全款
            RlPayment rlPayment = new RlPayment();
            rlPayment.setOptyId(opportunityId);
            rlPayment.setType(payment);
            rlPayment.setAmount(amount);
            //TODO 收款人
            rlPayment.setPayWay("微信");
            rlPayment.setStatus("0");
            rlPayment.setPayTime(new Date());
            rlPayment.setCreatedBy(customerId);
            rlPayment.setVersionNumber(1L);

            wxRlPaymentService.insertSelective(rlPayment);
        } else {
            //说明是付定金或者全款
            RlPayment rlPayment = new RlPayment();
            rlPayment.setOptyId(opportunityId);
            rlPayment.setType(payment);
            rlPayment.setAmount(amount);
            //TODO 收款人
            rlPayment.setPayWay("微信");
            rlPayment.setStatus("0");
//            rlPayment.setPayTime(new Date());
            rlPayment.setCreationDate(new Date());
            rlPayment.setCreatedBy(customerId);
            rlPayment.setVersionNumber(1L);
            //TODO
            rlPayment.setLastUpdateDate(new Date());
            rlPayment.setLastUpdatedBy(customerId);
            wxRlPaymentService.insertSelective(rlPayment);
            RlPotentialOpportunities rlPotentialOpportunities = new RlPotentialOpportunities();
            rlPotentialOpportunities.setOpportunityId(opportunityId);
            rlPotentialOpportunities = wxRlPotentialOpportunitiesService.selectByPrimaryKey(rlPotentialOpportunities);
            RlOpportunities rlOpportunities = new RlOpportunities();
            try {
                BeanUtils.copyProperties(rlOpportunities, rlPotentialOpportunities);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            wxRlOpportunitiesService.insertSelective(rlOpportunities);
        }
        return "success";
    }
    @ResponseBody
    @RequestMapping("/test2")
    public Object myTest2(String oppenId, String opportunityId, String payment, BigDecimal amount, HttpServletRequest request)
    {
      Map map=new HashMap();
      String payId = (String)map.get("attach");
      RlPayment rlPayment=new RlPayment();
      rlPayment.setPayId(payId);
      rlPayment=wxRlPaymentService.selectOne(rlPayment);
      if("1".equals(rlPayment.getStatus()))
      {
          return "success";
      }
      rlPayment.setStatus("1");
      rlPayment.setPayTime(new Date());
      rlPayment.setLastUpdateDate(new Date());
//      rlPayment.setLastUpdatedBy();
        rlPayment.setVersionNumber(2L);
        wxRlPaymentService.updateByPrimaryKeySelective(rlPayment);
        return "success";




    }
    @ResponseBody
    @RequestMapping("/test3")
    public Object myTest3(Map obj) {
        try {
            testService.test1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "success";




    }
    @RequestMapping("/weixinLogin")
    @ResponseBody
    public Object weixinLogin(String openId, HttpServletRequest httpServletRequest)
    {
        //用于测试
        httpServletRequest.getSession().setAttribute("wxOpenId",openId);
        RlPotentialCustomers rlPotentialCustomers=new RlPotentialCustomers();
        rlPotentialCustomers.setWxOpenid(openId);
        rlPotentialCustomers=wxRlPotentialCustomersService.selectOne(rlPotentialCustomers);
        httpServletRequest.getSession().setAttribute("customerId",rlPotentialCustomers.getCustomerId());
        //用于测试
        return "success";
    }
}
