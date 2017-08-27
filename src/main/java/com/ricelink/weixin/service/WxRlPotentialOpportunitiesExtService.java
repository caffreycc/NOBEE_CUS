package com.ricelink.weixin.service;

import com.ricelink.baseframe.common.service.BaseService;
import com.ricelink.weixin.mapper.mapper.RlPotentialOpportunitiesExtMapper;
import com.ricelink.weixin.mapper.model.RlPotentialOpportunitiesExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chenshengju on 2017/8/8 0008.
 */
@Service
public class WxRlPotentialOpportunitiesExtService extends BaseService<RlPotentialOpportunitiesExt> {
    @Autowired
    private RlPotentialOpportunitiesExtMapper rlPotentialOpportunitiesExtMapper;
}
