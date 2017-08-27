package com.ricelink.weixin.jsonparam;

import com.ricelink.weixin.mapper.model.RlAfterSaleServiceInfo;

import java.util.List;

/**
 * Created by chenshengju on 2017/8/23 0023.
 */
public class ApplyForParam {
    private RlAfterSaleServiceInfo rlAfterSaleServiceInfo;
    private List<String> uuids;
    private String userId;

    public RlAfterSaleServiceInfo getRlAfterSaleServiceInfo() {
        return rlAfterSaleServiceInfo;
    }

    public void setRlAfterSaleServiceInfo(RlAfterSaleServiceInfo rlAfterSaleServiceInfo) {
        this.rlAfterSaleServiceInfo = rlAfterSaleServiceInfo;
    }

    public List<String> getUuids() {
        return uuids;
    }

    public void setUuids(List<String> uuids) {
        this.uuids = uuids;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
