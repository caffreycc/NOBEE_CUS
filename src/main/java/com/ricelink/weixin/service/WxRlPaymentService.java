package com.ricelink.weixin.service;

import com.ricelink.baseframe.common.service.BaseService;
import com.ricelink.weixin.mapper.mapper.RlPaymentMapper;
import com.ricelink.weixin.mapper.model.RlPayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chenshengju on 2017/8/2 0002.
 */
@Service
public class WxRlPaymentService extends BaseService<RlPayment>{
    @Autowired
    private RlPaymentMapper rlPaymentMapper;
    public int selectCount(RlPayment rlPayment)
    {
        return rlPaymentMapper.selectCount(rlPayment);
    }
}
