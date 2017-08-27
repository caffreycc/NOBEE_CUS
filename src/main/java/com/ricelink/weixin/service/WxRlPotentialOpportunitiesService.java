package com.ricelink.weixin.service;

import com.ricelink.baseframe.common.service.BaseService;
import com.ricelink.weixin.mapper.mapper.RlPotentialOpportunitiesMapper;
import com.ricelink.weixin.mapper.model.RlOpportunities;
import com.ricelink.weixin.mapper.model.RlOpportunitiesExt;
import com.ricelink.weixin.mapper.model.RlPotentialOpportunities;
import com.ricelink.weixin.mapper.model.RlPotentialOpportunitiesExt;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/**
 * Created by chenshengju on 2017/7/25 0025.
 */
@Service
public class WxRlPotentialOpportunitiesService extends BaseService<RlPotentialOpportunities> {
    @Autowired
    private RlPotentialOpportunitiesMapper rlPotentialOpportunitiesMapper;
    @Autowired
    private WxRlOpportunitiesService wxRlOpportunitiesService;
    @Autowired
    private WxRlOpportunitiesExtService wxRlOpportunitiesExtService;
    @Autowired
    private WxRlPotentialOpportunitiesExtService wxRlPotentialOpportunitiesExtService;
    @Autowired
    private WxRlPotentialOpportunitiesService wxRlPotentialOpportunitiesService;

    public List<Map> selectPotentialRequire(String customerId) {
        return rlPotentialOpportunitiesMapper.selectPotentialRequire(customerId);
    }

    public Map selectPotentialRequireById(Map mapParam) {
        return rlPotentialOpportunitiesMapper.selectPotentialRequireById(mapParam);
    }

    public List<Map> selectPotentialOrder(String customerId) {
        return rlPotentialOpportunitiesMapper.selectPotentialOrder(customerId);
    }


    public Map selectOrderCodeAndDate(String opportunityId) {
        return rlPotentialOpportunitiesMapper.selectOrderCodeAndDate(opportunityId);
    }

    public Map selectPrice(String opportunityId) {
        return rlPotentialOpportunitiesMapper.selectPrice(opportunityId);
    }

    public String selectPicCountByOptId(String opportunityId) {
        return rlPotentialOpportunitiesMapper.selectPicCountByOptId(opportunityId);
    }

    @Transactional
    public void updateOpportunities(RlPotentialOpportunities rlPotentialOpportunities) throws Exception {
        RlOpportunities rlOpportunities = new RlOpportunities();
        rlOpportunities.setOpportunityId(rlPotentialOpportunities.getOpportunityId());
        this.updateByPrimaryKeySelective(rlPotentialOpportunities);
        int count= wxRlOpportunitiesService.selectCount(rlOpportunities);
        if(count>0)
        {
            BeanUtils.copyProperties(rlOpportunities, rlPotentialOpportunities);
            wxRlOpportunitiesService.updateByPrimaryKeySelective(rlOpportunities);
        }
    }
    @Transactional
    public RlOpportunities createOpportunities(RlPotentialOpportunities rlPotentialOpportunities)throws Exception
    {
        rlPotentialOpportunities.setIsFormal("Y");
        wxRlPotentialOpportunitiesService.updateByPrimaryKeySelective(rlPotentialOpportunities);
        RlOpportunities rlOpportunities = new RlOpportunities();
        BeanUtils.copyProperties(rlOpportunities, rlPotentialOpportunities);
        wxRlOpportunitiesService.insertSelective(rlOpportunities);
        //扩展商机表生成逻辑
        RlOpportunitiesExt rlOpportunitiesExt = new RlOpportunitiesExt();
        rlOpportunitiesExt.setOpportunityId(rlOpportunities.getOpportunityId());
        rlOpportunitiesExt.setSecondState(rlOpportunities.getCurrentStatus());
        wxRlOpportunitiesExtService.insertSelective(rlOpportunitiesExt);
        return rlOpportunities;
    }
    @Transactional
    public RlPotentialOpportunities createRlPotentialOpportunities(RlPotentialOpportunities rlPotentialOpportunities)
    {

        RlPotentialOpportunitiesExt rlPotentialOpportunitiesExt = new RlPotentialOpportunitiesExt();
        rlPotentialOpportunitiesExt.setOpportunityId(rlPotentialOpportunities.getOpportunityId());
        rlPotentialOpportunitiesExt.setIsValid("1");
        wxRlPotentialOpportunitiesService.insertSelective(rlPotentialOpportunities);
        wxRlPotentialOpportunitiesExtService.insertSelective(rlPotentialOpportunitiesExt);
        return rlPotentialOpportunities;
    }
}
