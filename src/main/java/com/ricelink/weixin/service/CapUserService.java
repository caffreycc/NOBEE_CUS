package com.ricelink.weixin.service;

import com.ricelink.baseframe.common.service.BaseService;
import com.ricelink.weixin.mapper.mapper.CapUserMapper;
import com.ricelink.weixin.mapper.model.CapUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chenshengju on 2017/8/9 0009.
 */
@Service
public class CapUserService extends BaseService<CapUser>{
    @Autowired
    private CapUserMapper capUserMapper;
    public int selectCount(CapUser capUser)
    {
        return capUserMapper.selectCount(capUser);
    }
}
