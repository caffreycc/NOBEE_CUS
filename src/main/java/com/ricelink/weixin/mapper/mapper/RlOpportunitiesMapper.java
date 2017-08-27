package com.ricelink.weixin.mapper.mapper;

import com.ricelink.weixin.mapper.model.RlOpportunities;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface RlOpportunitiesMapper extends Mapper<RlOpportunities> {

    List<Map> selectOfficialRequire(String customerId);

    int selectCountById(String opportunityId);

    Map selectOfficialRequireById(Map mapParam);

    List<Map> selectOfficialOrder(String customerId);

    Map selectOrderCodeAndDate(String opportunityId);

    Map selectPrice(String opportunityId);

    String getOrderNum(String orgId);
}