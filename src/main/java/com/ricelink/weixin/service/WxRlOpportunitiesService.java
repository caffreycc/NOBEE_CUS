package com.ricelink.weixin.service;

import com.ricelink.baseframe.common.service.BaseService;
import com.ricelink.weixin.mapper.mapper.RlOpportunitiesMapper;
import com.ricelink.weixin.mapper.model.RlOpportunities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by chenshengju on 2017/7/31 0031.
 */
@Service
public class WxRlOpportunitiesService extends BaseService<RlOpportunities> {
    @Autowired
    private RlOpportunitiesMapper rlOpportunitiesMapper;

    public List<Map> selectOfficialRequire(String customerId) {
        return  rlOpportunitiesMapper.selectOfficialRequire(customerId);
    }

    public int selectCountById(String opportunityId) {
        return rlOpportunitiesMapper.selectCountById(opportunityId);
    }

    public Map selectOfficialRequireById(Map mapParam) {
        return rlOpportunitiesMapper.selectOfficialRequireById(mapParam);
    }

    public List<Map> selectOfficialOrder(String customerId) {
        return rlOpportunitiesMapper.selectOfficialOrder(customerId);
    }


    public Map selectOrderCodeAndDate(String opportunityId) {
        return rlOpportunitiesMapper.selectOrderCodeAndDate(opportunityId);
    }

    public Map selectPrice(String opportunityId) {
        return rlOpportunitiesMapper.selectPrice(opportunityId);
    }

    public String getOrderNum(String orgId) {
        return rlOpportunitiesMapper.getOrderNum(orgId);
    }
    public int selectCount(RlOpportunities rlOpportunities)
    {
        return rlOpportunitiesMapper.selectCount(rlOpportunities);
    }
}
