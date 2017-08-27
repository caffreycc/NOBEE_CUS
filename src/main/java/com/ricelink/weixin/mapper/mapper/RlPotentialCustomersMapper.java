package com.ricelink.weixin.mapper.mapper;

import com.ricelink.weixin.mapper.model.RlPotentialCustomers;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface RlPotentialCustomersMapper extends Mapper<RlPotentialCustomers> {
    List<Map> selectTestone();

    Map selectStoreJson(String userId);

    String selectCustomerIdByUserId(String userId);
}