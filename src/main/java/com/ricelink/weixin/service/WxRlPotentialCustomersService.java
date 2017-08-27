package com.ricelink.weixin.service;

import com.ricelink.baseframe.common.service.BaseService;
import com.ricelink.weixin.mapper.mapper.RlPotentialCustomersMapper;
import com.ricelink.weixin.mapper.model.RlCustomers;
import com.ricelink.weixin.mapper.model.RlPotentialCustomers;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/**
 * Created by chenshengju on 2017/7/25 0025.
 */
@Service
public class WxRlPotentialCustomersService extends BaseService<RlPotentialCustomers> {
    @Autowired
    private RlPotentialCustomersMapper rlPotentialCustomersMapper;
    @Autowired
    private WxRlCustomersService wxRlCustomersService;

    public int selectCount(RlPotentialCustomers rlPotentialCustomers) {
        return rlPotentialCustomersMapper.selectCount(rlPotentialCustomers);
    }

    public String selectCustomerIdByUserId(String userId) {
        return rlPotentialCustomersMapper.selectCustomerIdByUserId(userId);
    }

    @Transactional
    public void updateCustomers(RlPotentialCustomers rlPotentialCustomers) throws Exception {
        this.updateByPrimaryKeySelective(rlPotentialCustomers);
        RlCustomers rlCustomers = new RlCustomers();
        rlCustomers.setCustomerId(rlPotentialCustomers.getCustomerId());
        if (wxRlCustomersService.selectCount(rlCustomers) > 0) {
            BeanUtils.copyProperties(rlCustomers, rlPotentialCustomers);
            wxRlCustomersService.updateByPrimaryKeySelective(rlCustomers);
        }
    }

    /**
     * 创建正式客户，如果已经是正式客户则直接返回，否则创建
     * @param rlPotentialCustomers
     * @return
     * @throws Exception
     */
    @Transactional
    public RlCustomers createCustomer(RlPotentialCustomers rlPotentialCustomers) throws Exception {
        RlCustomers rlCustomers = new RlCustomers();
        rlCustomers.setCustomerId(rlPotentialCustomers.getCustomerId());
        rlCustomers = wxRlCustomersService.selectOne(rlCustomers);
        if (rlCustomers == null) {
            RlCustomers rlCustomersTemp = new RlCustomers();
            BeanUtils.copyProperties(rlCustomersTemp, rlPotentialCustomers);
            wxRlCustomersService.insertSelective(rlCustomersTemp);
            return rlCustomersTemp;
        } else {
             return rlCustomers;
        }
    }

    public Map selectStoreJson(String userId) {
        return rlPotentialCustomersMapper.selectStoreJson(userId);
    }
}
