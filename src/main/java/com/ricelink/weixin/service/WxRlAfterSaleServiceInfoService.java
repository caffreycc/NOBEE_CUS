package com.ricelink.weixin.service;

import com.ricelink.baseframe.common.service.BaseService;
import com.ricelink.weixin.mapper.mapper.RlAfterSaleServiceInfoMapper;
import com.ricelink.weixin.mapper.model.RlAfterSaleServiceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by chenshengju on 2017/8/23 0023.
 */
@Service
public class WxRlAfterSaleServiceInfoService extends BaseService<RlAfterSaleServiceInfo>{
    @Autowired
    private RlAfterSaleServiceInfoMapper rlAfterSaleServiceInfoMapper;

    public  String getSHOrderNum() {
        return rlAfterSaleServiceInfoMapper.getSHOrderNum();
    }
    public List<RlAfterSaleServiceInfo> select(RlAfterSaleServiceInfo rlAfterSaleServiceInfo)
    {
        return rlAfterSaleServiceInfoMapper.select(rlAfterSaleServiceInfo);
    }

    public List<Map> selectUrlById(String id) {
        return rlAfterSaleServiceInfoMapper.selectUrlById(id);
    }
}
