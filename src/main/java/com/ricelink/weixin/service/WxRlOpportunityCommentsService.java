package com.ricelink.weixin.service;

import com.ricelink.baseframe.common.service.BaseService;
import com.ricelink.weixin.mapper.mapper.RlOpportunityCommentsMapper;
import com.ricelink.weixin.mapper.model.RlOpportunityComments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by chenshengju on 2017/8/14 0014.
 */
@Service
public class WxRlOpportunityCommentsService extends BaseService<RlOpportunityComments>{
    @Autowired
    private RlOpportunityCommentsMapper rlOpportunityCommentsMapper;

    public List<Map> selectOrderStatusLog(String opportunityId) {
        return rlOpportunityCommentsMapper.selectOrderStatusLog(opportunityId);
    }
}
