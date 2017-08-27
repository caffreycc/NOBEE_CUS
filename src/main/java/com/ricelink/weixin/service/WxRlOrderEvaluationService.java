package com.ricelink.weixin.service;

import com.ricelink.baseframe.common.service.BaseService;
import com.ricelink.weixin.mapper.mapper.RlOrderEvaluationMapper;
import com.ricelink.weixin.mapper.model.RlOrderEvaluation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chenshengju on 2017/8/15 0015.
 */
@Service
public class WxRlOrderEvaluationService extends BaseService<RlOrderEvaluation>{
    @Autowired
    private RlOrderEvaluationMapper rlOrderEvaluationMapper;
    public int selectCount(RlOrderEvaluation rlOrderEvaluation)
    {
        return rlOrderEvaluationMapper.selectCount(rlOrderEvaluation);
    }
}
