package com.ricelink.weixin.mapper.mapper;

import com.ricelink.weixin.mapper.model.RlOpportunityComments;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface RlOpportunityCommentsMapper extends Mapper<RlOpportunityComments> {
    List<Map> selectOrderStatusLog(String opportunityId);
}