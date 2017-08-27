package com.ricelink.weixin.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonParser;
import com.ricelink.baseframe.common.pojo.Message;
import com.ricelink.weixin.jsonparam.MyRequirdParam;
import com.ricelink.weixin.jsonparam.StoreJson;
import com.ricelink.weixin.mapper.model.*;
import com.ricelink.weixin.service.*;
import com.ricelink.weixin.utils.UUID;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.collections.map.LinkedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by chenshengju on 2017/7/25 0025.
 */
@Controller
@RequestMapping("/user")
public class WxMpUserController {
    @Autowired
    private WxRlPotentialCustomersService wxRlPotentialCustomersService;
    @Autowired
    private WxRlCustomersService wxRlCustomersService;
    @Autowired
    private WxRlPotentialOpportunitiesService wxRlPotentialOpportunitiesService;
    @Autowired
    private WxRlOpportunitiesService wxRlOpportunitiesService;
    @Autowired
    private WxRlPotentialRequirementsService wxRlPotentialRequirementsService;
    @Autowired
    private WxRlPotentialOpportunitiesExtService wxRlPotentialOpportunitiesExtService;
    @Autowired
    private CapUserService capUserService;
    @Autowired
    private WxRlOrderService wxRlOrderService;
    @Autowired
    private WxRlOrderEvaluationService wxRlOrderEvaluationService;
    @Autowired
    private WxRlOpportunityCommentsService wxRlOpportunityCommentsService;
    @Autowired
    private WxRlDealerOrgService wxRlDealerOrgService;

    @ResponseBody
    @RequestMapping("/savePotentialCustomer")
    public Object savePotentialCustomer(String userId, String userName, String phone, String sex, String educationType, String annualIncome) {
        RlPotentialCustomers rlPotentialCustomers = new RlPotentialCustomers();
        rlPotentialCustomers.setWxOpenid(userId);
        rlPotentialCustomers.setVersionNumber(1L);
        rlPotentialCustomers.setName(userName);
        rlPotentialCustomers.setPhone1(phone);
        rlPotentialCustomers.setSex(sex);
        rlPotentialCustomers.setCreationDate(new java.util.Date());
        rlPotentialCustomers.setCreatedBy(userId);
        rlPotentialCustomers.setCreatedBy(userId);
        rlPotentialCustomers.setLastUpdateDate(new java.util.Date());
        rlPotentialCustomers.setLastUpdatedBy(userId);
        rlPotentialCustomers.setInfoSource("WEIXIN");
        rlPotentialCustomers.setEducationType(educationType);
        rlPotentialCustomers.setAnnualIncome(annualIncome);
        //导购门店经销商插入
        try {
            Map mapJson = wxRlPotentialCustomersService.selectStoreJson(userId);
            String storeJson = (String) mapJson.get("storeJson");
            StoreJson store = JSON.parseObject(storeJson, StoreJson.class);
            rlPotentialCustomers.setOrgId(store.getOrg_id());
            rlPotentialCustomers.setGuideId(store.getGuide_id());
            rlPotentialCustomers.setDealer(store.getDealer_id());
        } catch (Exception e) {
            //TODO 暂时写死，影后要从粉丝表取
            e.printStackTrace();
            System.out.println("暂时固定死");
            rlPotentialCustomers.setOrgId("402828c74973b20001497a7d5bc30028");
//            rlPotentialCustomers.setGuideId("224f32508df5416b99f3a3fdc4bbab0c");
            rlPotentialCustomers.setGuideId("402828c74c28334b014c2c15a0260581");
            rlPotentialCustomers.setDealer("485bf350bb7d4b5b8fcb583f5c50c036");
        }
        wxRlPotentialCustomersService.insertSelective(rlPotentialCustomers);
        return new Message(Message.SUCCESS, "success");
    }

    @RequestMapping("/modifyPersonal")
    @ResponseBody
    public Object modifyPersonal(String userId, String userName, String sex, String educationType, String annualIncome) throws Exception {
        RlPotentialCustomers rlPotentialCustomers = new RlPotentialCustomers();
        rlPotentialCustomers.setWxOpenid(userId);
        rlPotentialCustomers = wxRlPotentialCustomersService.selectOne(rlPotentialCustomers);
        if (rlPotentialCustomers != null) {
            rlPotentialCustomers.setName(userName);
            rlPotentialCustomers.setSex(sex);
            rlPotentialCustomers.setLastUpdateDate(new java.util.Date());
            rlPotentialCustomers.setLastUpdatedBy(userId);
            rlPotentialCustomers.setVersionNumber(rlPotentialCustomers.getVersionNumber() + 1);
            rlPotentialCustomers.setEducationType(educationType);
            rlPotentialCustomers.setAnnualIncome(annualIncome);
            wxRlPotentialCustomersService.updateCustomers(rlPotentialCustomers);
        }
        return new Message(Message.SUCCESS, "success");
    }

    @ResponseBody
    @RequestMapping("/appointmentMeasure")
    public Object appointmentMeasure(@RequestParam(required = false) String connectPhone, @RequestParam(required = false) String email,
                                     @RequestParam(required = false) String addressCell, @RequestParam(required = false) String addressCity, @RequestParam(required = false) String addressCounty, @RequestParam(required = false) String addressDetail,
                                     @RequestParam(required = false) String decorationStyleCode, @RequestParam(required = false) String houseTypeCode, @RequestParam(required = false) String decorationProgressCode,
                                     @RequestParam(required = false) String developer, @RequestParam(required = false) String decorationMethodCode, @RequestParam(required = false) String budget, @RequestParam(required = false) String expectMeasureDate,
                                     @RequestParam(required = false) String orderPriorityCode, @RequestParam(required = false) String age,
                                     @RequestParam(required = false) String job, @RequestParam(required = false) String orgId,
                                     String userId) throws Exception {
        RlPotentialCustomers rlPotentialCustomers = new RlPotentialCustomers();
        rlPotentialCustomers.setWxOpenid(userId);
        rlPotentialCustomers = wxRlPotentialCustomersService.selectOne(rlPotentialCustomers);
        RlPotentialOpportunities rlPotentialOpportunities = new RlPotentialOpportunities();
        rlPotentialOpportunities.setOpportunityId(UUID.getUUID());
        rlPotentialOpportunities.setCustomerId(rlPotentialCustomers.getCustomerId());
        rlPotentialOpportunities.setAge(age);
        rlPotentialOpportunities.setJob(job);
        rlPotentialOpportunities.setConnectPhone(connectPhone);
        rlPotentialOpportunities.setEmail(email);
        rlPotentialOpportunities.setAddressCity(addressCity);
        rlPotentialOpportunities.setAddressCell(addressCell);
        rlPotentialOpportunities.setAddressCounty(addressCounty);
        rlPotentialOpportunities.setAddressDetail(addressDetail);
        rlPotentialOpportunities.setDecorationStyleCode(decorationStyleCode);
        rlPotentialOpportunities.setHouseTypeCode(houseTypeCode);
        rlPotentialOpportunities.setDecorationProgressCode(decorationProgressCode);
        rlPotentialOpportunities.setDecorationMethodCode(decorationMethodCode);
        rlPotentialOpportunities.setOrderPriorityCode(orderPriorityCode);
        rlPotentialOpportunities.setBudget(budget);
        rlPotentialOpportunities.setCreateCus(new java.util.Date());
        rlPotentialOpportunities.setCreationDate(new java.util.Date());
        rlPotentialOpportunities.setCreatedBy(userId);
        rlPotentialOpportunities.setDeveloper(developer);
        rlPotentialOpportunities.setVersionNumber(1L);
        if(orgId!=null){
            Map<String,String> map=wxRlDealerOrgService.selectOrgGuiDeaById(orgId);
            rlPotentialOpportunities.setOrgId(map.get("orgId"));
            rlPotentialOpportunities.setGuideId(map.get("guideId"));
            rlPotentialOpportunities.setDealerId(map.get("dealer"));
        }else
        {
            rlPotentialOpportunities.setOrgId(rlPotentialCustomers.getOrgId());
            rlPotentialOpportunities.setGuideId(rlPotentialCustomers.getGuideId());
            rlPotentialOpportunities.setDealerId(rlPotentialCustomers.getDealer());
        }


        rlPotentialOpportunities.setSource("Natural");
        rlPotentialOpportunities.setInfoSource("WEIXIN");
        rlPotentialOpportunities.setCurrentStatus("CREATE_ORDERED");
        if (org.apache.commons.lang.StringUtils.isNotBlank(expectMeasureDate)) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date = null;
            try {
                date = sdf.parse(expectMeasureDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            rlPotentialOpportunities.setExpectMeasureDate(date);
        }

        wxRlPotentialOpportunitiesService.createRlPotentialOpportunities(rlPotentialOpportunities);
        wxRlPotentialOpportunitiesService.createOpportunities(rlPotentialOpportunities);//TODO 改动测试
        wxRlPotentialCustomersService.createCustomer(rlPotentialCustomers);//TODO 改动测试
        return new Message(Message.SUCCESS, "success");
    }

    //我的订单和订单详情
    @ResponseBody
    @RequestMapping(value = "/myRequire")
    public Object myRequire(HttpServletRequest httpServletRequest,
                            @RequestParam(required = false, name = "opportunityId") String opportunityId,
                            String userId
    ) {
        //TODO sql需要优化，用了mysql专有的group by用法，迁移数据库可能有问题
        RlPotentialCustomers rlPotentialCustomers = new RlPotentialCustomers();
        rlPotentialCustomers.setWxOpenid(userId);
        rlPotentialCustomers = wxRlPotentialCustomersService.selectOne(rlPotentialCustomers);
        String customerId = rlPotentialCustomers.getCustomerId();
        Object data = null;
        if (opportunityId == null) {
            List<Map> list = new ArrayList<>();
            List<Map> mapListPotential = wxRlPotentialOpportunitiesService.selectPotentialRequire(customerId);
            List<Map> mapListOfficial = wxRlOpportunitiesService.selectOfficialRequire(customerId);
            list.addAll(mapListPotential);
            list.addAll(mapListOfficial);
            data = list;
        } else {
            int count = wxRlOpportunitiesService.selectCountById(opportunityId);
            Map mapParam = new HashMap();
            mapParam.put("opportunityId", opportunityId);
            mapParam.put("customerId", customerId);
            Map mapResult = new HashMap();
            if (count == 1) {
                Map<String,String> mapRequire = wxRlOpportunitiesService.selectOfficialRequireById(mapParam);
                //需求背景
                Map mapProgress = new LinkedHashMap();
                mapProgress.put("statu", mapRequire.get("currentStatus"));
                mapProgress.put("startDate", mapRequire.get("creationDate"));
                mapProgress.put("expectMeasureDate", mapRequire.get("expectMeasureDate"));
                mapProgress.put("recentlyMeasureDate", mapRequire.get("measured"));
                //最新进度
                Map mapOpportunities = new HashedMap();
                mapOpportunities.put("decorationStyleCode", mapRequire.get("decorationStyleCode"));
                mapOpportunities.put("houseTypeCode", mapRequire.get("houseTypeCode"));
                mapOpportunities.put("decorationMethodCode", mapRequire.get("decorationStyleCode"));
                mapOpportunities.put("decorationProgressCode", mapRequire.get("decorationProgressCode"));
                mapOpportunities.put("developer", mapRequire.get("developer"));
                mapOpportunities.put("budget", mapRequire.get("budget"));
                //联系方式
                Map mapContact = new LinkedHashMap();
                mapContact.put("shop", mapRequire.get("shop"));
                mapContact.put("shopAddress", mapRequire.get("shopAddress"));
                mapContact.put("shopGuide", mapRequire.get("shopGuide"));
                mapContact.put("designer", mapRequire.get("designer"));
                List<Map> mapRequirement = wxRlPotentialRequirementsService.selectRequire(opportunityId);
                mapResult.put("requirements", mapRequirement);
                mapResult.put("opportunities", mapOpportunities);
                mapResult.put("progress", mapProgress);
                mapResult.put("contact", mapContact);
                mapResult.put("countPic",wxRlPotentialOpportunitiesService.selectPicCountByOptId(opportunityId));
                data = mapResult;
            } else {
                Map<String,String> mapRequire = wxRlPotentialOpportunitiesService.selectPotentialRequireById(mapParam);
                //需求背景
                Map mapProgress = new LinkedHashMap();
                mapProgress.put("statu", mapRequire.get("currentStatus"));
                mapProgress.put("startDate", mapRequire.get("creationDate"));
                mapProgress.put("expectMeasureDate", mapRequire.get("expectMeasureDate"));
                mapProgress.put("recentlyMeasureDate", mapRequire.get("measured"));
                //最新进度
                Map mapOpportunities = new HashedMap();
                mapOpportunities.put("decorationStyleCode", mapRequire.get("decorationStyleCode"));
                mapOpportunities.put("houseTypeCode", mapRequire.get("houseTypeCode"));
                mapOpportunities.put("decorationMethodCode", mapRequire.get("decorationStyleCode"));
                mapOpportunities.put("decorationProgressCode", mapRequire.get("decorationProgressCode"));
                mapOpportunities.put("developer", mapRequire.get("developer"));
                mapOpportunities.put("budget", mapRequire.get("budget"));
                //联系方式
                Map mapContact = new LinkedHashMap();
                mapContact.put("shop", mapRequire.get("shop"));
                mapContact.put("shopAddress", mapRequire.get("shopAddress"));
                mapContact.put("shopGuide", mapRequire.get("shopGuide"));
                mapContact.put("designer", mapRequire.get("designer"));
                List<Map> mapRequirement = wxRlPotentialRequirementsService.selectRequire(opportunityId);
                mapResult.put("requirements", mapRequirement);
                mapResult.put("opportunities", mapOpportunities);
                mapResult.put("progress", mapProgress);
                mapResult.put("contact", mapContact);
                mapResult.put("countPic",wxRlPotentialOpportunitiesService.selectPicCountByOptId(opportunityId));
                data = mapResult;
            }
        }
        return new Message(Message.SUCCESS, "success", data);

    }
    @RequestMapping("/deleteRequire")
    @ResponseBody
    public Object deleteRequire(@RequestBody List<String> rlPotentialRequirements)
    {
        Example example=new Example(RlPotentialRequirements.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andIn("requirementId",rlPotentialRequirements);
        wxRlPotentialRequirementsService.deleteByExample(example);
        return new Message(Message.SUCCESS,"success");

    }


    //我的订单和订单详情
    @ResponseBody
    @RequestMapping(value = "/myOrder")
    public Object myOrder(HttpServletRequest httpServletRequest,
                          @RequestParam(required = false, name = "opportunityId") String opportunityId,
                          String userId
    ) {

        RlPotentialCustomers rlPotentialCustomers = new RlPotentialCustomers();
        rlPotentialCustomers.setWxOpenid(userId);
        rlPotentialCustomers = wxRlPotentialCustomersService.selectOne(rlPotentialCustomers);
        String customerId = rlPotentialCustomers.getCustomerId();
        Object data = null;
        //查出我的订单列表
        if (opportunityId == null) {
            List<Map> list = new ArrayList<>();
            List<Map> mapListPotential = wxRlPotentialOpportunitiesService.selectPotentialOrder(customerId);
            List<Map> mapListOfficial = wxRlOpportunitiesService.selectOfficialOrder(customerId);
            list.addAll(mapListPotential);
            list.addAll(mapListOfficial);
            data = list;
        } //根据商机id来查我的订单详情
        else {
            Map mapResult = new HashedMap();
            List<Map> mapListOrder = wxRlOpportunityCommentsService.selectOrderStatusLog(opportunityId);
            List<Map> mapRequirement = wxRlOrderService.selectRequireAndPrice(opportunityId);
            Map mapPrice = null;
            Map orderCodeAndDateMap = null;
            //如果该商机是是正式商机
            int count = wxRlOpportunitiesService.selectCountById(opportunityId);
            if (count > 0) {
                mapPrice = wxRlOpportunitiesService.selectPrice(opportunityId);
                orderCodeAndDateMap = wxRlOpportunitiesService.selectOrderCodeAndDate(opportunityId);

            } else//如果该商机还是潜在商机
            {
                //没有OTHER_PREFERENTIAL字段
                mapPrice = wxRlPotentialOpportunitiesService.selectPrice(opportunityId);
                orderCodeAndDateMap = wxRlPotentialOpportunitiesService.selectOrderCodeAndDate(opportunityId);
            }
            if (orderCodeAndDateMap == null) {
                orderCodeAndDateMap = new HashedMap();
            }

            RlOrderEvaluation rlOrderEvaluation=new RlOrderEvaluation();
            rlOrderEvaluation.setOptyId(opportunityId);
            //是否评价过
            int evaluationCount=wxRlOrderEvaluationService.selectCount(rlOrderEvaluation);
            mapResult.put("order", mapListOrder);
            mapResult.put("requirement", mapRequirement);
            mapResult.put("price", mapPrice);
            mapResult.put("submitOrder", orderCodeAndDateMap.get("submitOrder"));
            mapResult.put("orderCode", orderCodeAndDateMap.get("orderCode"));
            mapResult.put("evaluate", evaluationCount>0?true:false);
            data = mapResult;
        }
        return new Message(Message.SUCCESS, "success", data);

    }


    @ResponseBody
    @RequestMapping("/updateRequire")
    public Object updateRequire(@RequestBody List<RlPotentialRequirements> rlPotentialRequirementss) {


        for (RlPotentialRequirements requirement : rlPotentialRequirementss) {
            wxRlPotentialRequirementsService.updateByPrimaryKeySelective(requirement);
        }
        return new Message(Message.SUCCESS, "success");
    }

    @ResponseBody
    @RequestMapping("/addRequire")
    public Object addRequire(RlPotentialRequirements rlPotentialRequirements) {
        rlPotentialRequirements.setCreatedBy(rlPotentialRequirements.getCreatedBy());
        rlPotentialRequirements.setCreationDate(new java.util.Date());
        rlPotentialRequirements.setVersionNumber(1L);
        wxRlPotentialRequirementsService.insertSelective(rlPotentialRequirements);
        return new Message(Message.SUCCESS, "success");
    }

    @ResponseBody
    @RequestMapping("/getPhoneCode")
    public Object getPhoneCode(HttpServletRequest request, String phone, String userId) {
        RlPotentialCustomers rlPotentialCustomers = new RlPotentialCustomers();
        rlPotentialCustomers.setPhone1(phone);
        rlPotentialCustomers = wxRlPotentialCustomersService.selectOne(rlPotentialCustomers);
        if (rlPotentialCustomers == null || (rlPotentialCustomers != null && rlPotentialCustomers.getWxOpenid() == null)) {
            return new Message(Message.SUCCESS, "success");
        } else {
            return new Message(Message.ERROR, "你已经微信注册过了");
        }


    }

    @ResponseBody
    @RequestMapping("/checkCode")
    public Object getPhoneCode(String checkCode) {
        if ("2403".equals(checkCode)) {
            return new Message(Message.SUCCESS, "success");
        } else {
            return new Message(Message.ERROR, "fail");
        }
    }

    @ResponseBody
    @RequestMapping("/checkOpenId")
    public Object checkOpenId(String userId) {
        int count = 0;
        CapUser capUser = new CapUser();
        capUser.setWxOpenid(userId);
        capUser = capUserService.selectOne(capUser);
        Map data=new HashedMap();
        if (capUser !=null) {
            data.put("userName",capUser.getRealName());
            data.put("phone",capUser.getUserName());
            //TODO
            data.put("sex","男");
            data.put("educationType",null);
            data.put("annualIncome",null);
            return new Message(Message.ERROR, "用户已经注册",data);
        }
        RlPotentialCustomers rlPotentialCustomers = new RlPotentialCustomers();
        rlPotentialCustomers.setWxOpenid(userId);
        rlPotentialCustomers = wxRlPotentialCustomersService.selectOne(rlPotentialCustomers);
        if (rlPotentialCustomers !=null) {
            data.put("userName",rlPotentialCustomers.getName());
            data.put("phone",rlPotentialCustomers.getPhone1());
            //TODO
            data.put("sex",rlPotentialCustomers.getSex());
            data.put("educationType",rlPotentialCustomers.getEducationType());
            data.put("annualIncome",rlPotentialCustomers.getAnnualIncome());
            return new Message(Message.ERROR, "用户已经注册",data);
        }
        return new Message(Message.SUCCESS, "success");
    }


}
