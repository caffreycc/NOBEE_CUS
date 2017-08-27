package com.ricelink.weixin.mapper.mapper;

import com.ricelink.weixin.mapper.model.RlAfterSaleServiceInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface RlAfterSaleServiceInfoMapper extends Mapper<RlAfterSaleServiceInfo> {
    String getSHOrderNum();

    List<Map> selectUrlById(String id);
}