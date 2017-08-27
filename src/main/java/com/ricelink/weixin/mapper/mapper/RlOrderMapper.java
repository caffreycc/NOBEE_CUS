package com.ricelink.weixin.mapper.mapper;

import com.ricelink.weixin.mapper.model.RlOrder;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface RlOrderMapper extends Mapper<RlOrder> {
    Map selectPrice(String opportunityId);


    List<Map> selectRequireAndPrice(String opportunityId);

    List<Map> selectAttache(String optyId);

    List<Map> selectPicByResId(String orderId);
}