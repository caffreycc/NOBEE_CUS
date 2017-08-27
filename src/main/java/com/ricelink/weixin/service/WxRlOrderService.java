package com.ricelink.weixin.service;

import com.ricelink.baseframe.common.service.BaseService;
import com.ricelink.weixin.mapper.mapper.RlOrderMapper;
import com.ricelink.weixin.mapper.model.RlOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by chenshengju on 2017/8/14 0014.
 */
@Service
public class WxRlOrderService extends BaseService<RlOrder>{
    @Autowired
    private RlOrderMapper rlOrderMapper;

    public Map selectPrice(String opportunityId) {
        return rlOrderMapper.selectPrice(opportunityId);
    }

    public List<Map> selectRequireAndPrice(String opportunityId) {
        return rlOrderMapper.selectRequireAndPrice(opportunityId);
    }


    public List<Map> selectAttache(String optyId) {

        return  rlOrderMapper.selectAttache(optyId);
    }

    public List<Map> selectPicByResId(String orderId) {
        return rlOrderMapper.selectPicByResId(orderId);
    }
}
