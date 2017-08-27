package com.ricelink.weixin.mapper.mapper;

import com.ricelink.weixin.mapper.model.RlPotentialRequirements;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface RlPotentialRequirementsMapper extends Mapper<RlPotentialRequirements> {
    List<Map> selectRequire(String opportunityId);
}