package com.ricelink.weixin.service;

import com.ricelink.baseframe.common.service.BaseService;
import com.ricelink.weixin.mapper.mapper.RlCustomersMapper;
import com.ricelink.weixin.mapper.model.RlCustomers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by chenshengju on 2017/8/3 0003.
 */
@Service
public class WxRlCustomersService extends BaseService<RlCustomers> {
    @Autowired
    private RlCustomersMapper rlCustomersMapper;
    public int selectCount(RlCustomers rlCustomers)
    {
       return rlCustomersMapper.selectCount(rlCustomers);
    }

}
