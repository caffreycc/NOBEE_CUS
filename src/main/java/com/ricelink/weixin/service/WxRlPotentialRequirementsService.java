package com.ricelink.weixin.service;

import com.ricelink.baseframe.common.service.BaseService;
import com.ricelink.weixin.mapper.mapper.RlPotentialRequirementsMapper;
import com.ricelink.weixin.mapper.model.RlPotentialRequirements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by chenshengju on 2017/7/31 0031.
 */
@Service
public class WxRlPotentialRequirementsService extends BaseService<RlPotentialRequirements>{
    @Autowired
    private RlPotentialRequirementsMapper rlPotentialRequirementsMapper;
    public List<Map> selectRequire(String opportunityId) {
        return rlPotentialRequirementsMapper.selectRequire(opportunityId);
    }
}
