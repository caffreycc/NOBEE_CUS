package com.ricelink.weixin.mapper.mapper;

import com.ricelink.weixin.mapper.model.RlPotentialOpportunities;
import com.ricelink.weixin.vo.OpportunitiesVo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface RlPotentialOpportunitiesMapper extends Mapper<RlPotentialOpportunities> {
    List<Map> selectPotentialRequire(String customerId);

    Map selectPotentialRequireById(Map mapParam);

    List<Map> selectPotentialOrder(String customerId);


    Map selectOrderCodeAndDate(String opportunityId);

    Map selectPrice(String opportunityId);

    String selectPicCountByOptId(String opportunityId);
}