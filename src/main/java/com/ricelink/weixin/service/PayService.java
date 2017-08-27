package com.ricelink.weixin.service;

import com.ricelink.weixin.config.WxMpConfig;
import com.ricelink.weixin.controller.WxPayController;
import com.ricelink.weixin.mapper.model.*;
import com.ricelink.weixin.utils.getRandomNumByLength;
import com.ricelink.weixin.wxsdk.mp.api.WxMpServiceImpl;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by chenshengju on 2017/8/16 0016.
 */
@Service
public class PayService {
    @Autowired
    private WxRlPotentialOpportunitiesService wxRlPotentialOpportunitiesService;
    @Autowired
    private WxRlOpportunitiesService wxRlOpportunitiesService;
    @Autowired
    private WxRlPaymentService wxRlPaymentService;
    @Autowired
    private WxRlPotentialCustomersService wxRlPotentialCustomersService;
    @Autowired
    private WxRlCustomersService wxRlCustomersService;
    @Autowired
    private WxRlOpportunitiesExtService wxRlOpportunitiesExtService;
    @Autowired
    private WxRlPaymentExtService wxRlPaymentExtService;

    @Transactional
    public void pay(String[] attachs, BigDecimal amount, String payWay) throws Exception {
        RlPayment rlPayment = new RlPayment();
        rlPayment.setPayId(attachs[0]);
        rlPayment.setAmount(amount);
        rlPayment.setOptyId(attachs[1]);
        rlPayment.setPayWay(payWay);
        rlPayment.setType(attachs[2]);
        rlPayment.setCreatedBy(attachs[3]);
        rlPayment.setPayTime(new Date());
        rlPayment.setVersionNumber(1L);
        rlPayment.setLastUpdateDate(new Date());
        rlPayment.setLastUpdatedBy(attachs[3]);
        rlPayment.setStatus("有效");
        rlPayment.setCreationDate(new Date());
        rlPayment.setAmount(amount);
        rlPayment.setVersionNumber(rlPayment.getVersionNumber() + 1);
        wxRlPaymentService.insertSelective(rlPayment);
        RlPaymentExt rlPaymentExt = new RlPaymentExt();
        rlPaymentExt.setPayId(rlPayment.getPayId());
        wxRlPaymentExtService.insertSelective(rlPaymentExt);
//        int count = wxRlOpportunitiesService.selectCountById(rlPayment.getOptyId());
////        如果本身还是潜客商机
//        if (count < 1) {
//            //处理商机与潜客商机的关系
//            RlPotentialOpportunities rlPotentialOpportunities = new RlPotentialOpportunities();
//            rlPotentialOpportunities.setOpportunityId(rlPayment.getOptyId());
//            rlPotentialOpportunities = wxRlPotentialOpportunitiesService.selectByPrimaryKey(rlPotentialOpportunities);
//            rlPotentialOpportunities.setIsGathering("Y");
//            rlPotentialOpportunities.setDepositFlag("Y");
//            String orgId = wxRlOpportunitiesService.getOrderNum(rlPotentialOpportunities.getOrgId());
//            rlPotentialOpportunities.setSysGenOrdnum(orgId);
//            RlOpportunities rlOpportunities = wxRlPotentialOpportunitiesService.createOpportunities(rlPotentialOpportunities);
////            rlPotentialOpportunities.setCurrentStatus("CREATE_ORDERED");
////            rlOpportunities.setCurrentStatus("CREATE_ORDERED");
//            //原来的潜在商机标记为已经为正式
//            //TODO 测一下换位会出错不？
//            //处理潜客与正式客户的表
//            RlPotentialCustomers rlPotentialCustomers = new RlPotentialCustomers();
//            rlPotentialCustomers.setCustomerId(rlPayment.getCreatedBy());
//            rlPotentialCustomers = wxRlPotentialCustomersService.selectByPrimaryKey(rlPotentialCustomers);
//            wxRlPotentialCustomersService.createCustomer(rlPotentialCustomers);
//
//        }
//        //处理潜客与正式客户的表（结束）------


        RlPotentialOpportunities rlPotentialOpportunities = new RlPotentialOpportunities();
        rlPotentialOpportunities.setOpportunityId(rlPayment.getOptyId());
        rlPotentialOpportunities = wxRlPotentialOpportunitiesService.selectByPrimaryKey(rlPotentialOpportunities);
        rlPotentialOpportunities.setIsGathering("Y");
        rlPotentialOpportunities.setDepositFlag("Y");
        String orgId = wxRlOpportunitiesService.getOrderNum(rlPotentialOpportunities.getOrgId());
        rlPotentialOpportunities.setSysGenOrdnum(orgId);
        rlPotentialOpportunities.setIsFormal("Y");
        wxRlPotentialOpportunitiesService.updateOpportunities(rlPotentialOpportunities);
    }
}
