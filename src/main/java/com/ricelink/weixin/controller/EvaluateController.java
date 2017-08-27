package com.ricelink.weixin.controller;

import com.ricelink.baseframe.common.pojo.Message;
import com.ricelink.weixin.jsonparam.EvaJsonParam;
import com.ricelink.weixin.mapper.model.RlOrderEvaluation;
import com.ricelink.weixin.service.WxRlOrderEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

/**
 * Created by chenshengju on 2017/8/15 0015.
 */
@RestController
@RequestMapping("/evaluate")
public class EvaluateController {
    @Autowired
    private WxRlOrderEvaluationService wxRlOrderEvaluationService;

    @RequestMapping("/insert")
    public Object evaluateInsert(@RequestBody EvaJsonParam evaJsonParam) {
        if (evaJsonParam.getOptyId() != null && evaJsonParam.getUserId() != null) {
            List<RlOrderEvaluation> eva = evaJsonParam.getEva();
            for (RlOrderEvaluation rlOrderEvaluation : eva) {
                rlOrderEvaluation.setVersionNumber(1L);
                rlOrderEvaluation.setOptyId(evaJsonParam.getOptyId());
                rlOrderEvaluation.setCreationDate(new Date());
                rlOrderEvaluation.setLastUpdatedBy(evaJsonParam.getUserId());
                rlOrderEvaluation.setLastUpdateDate(new Date());
                rlOrderEvaluation.setCreatedBy(evaJsonParam.getUserId());
                rlOrderEvaluation.setRecordStatus("VALID");
                wxRlOrderEvaluationService.insertSelective(rlOrderEvaluation);
            }
            return new Message(Message.SUCCESS, "success");
        }
        return new Message(Message.ERROR, "fail");
    }

    @RequestMapping("/show")
    public Object evaluateShow(String opportunityId, String userId) {
        if (userId != null) {
            Example example = new Example(RlOrderEvaluation.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andEqualTo("optyId", opportunityId);
            List<RlOrderEvaluation> rlOrderEvaluationList = wxRlOrderEvaluationService.selectByExample(example);
            return new Message(Message.SUCCESS, "success", rlOrderEvaluationList);
        }
        return new Message(Message.ERROR, "fail");
    }
}
