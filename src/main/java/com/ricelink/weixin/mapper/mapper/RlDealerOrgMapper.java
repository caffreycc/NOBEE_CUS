package com.ricelink.weixin.mapper.mapper;

import com.ricelink.weixin.mapper.model.RlDealerOrg;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface RlDealerOrgMapper extends Mapper<RlDealerOrg> {
    List<Map> selectRlDealerOrg(Map orgId);

    String selectOrgIntroduce(String orgId);

    List<Map<String,Object>> selectNearbyOrg();

    List<Map> selectRlDealerOrgNoOrgId(String customerId);

    Map selectStoreDetails(String orgId);

    Map<String,String> selectOrgGuiDeaById(String orgId);
}