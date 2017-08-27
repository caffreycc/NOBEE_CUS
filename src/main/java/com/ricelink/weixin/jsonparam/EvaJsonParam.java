package com.ricelink.weixin.jsonparam;

import com.ricelink.weixin.mapper.model.RlOrderEvaluation;

import java.util.List;

/**
 * Created by chenshengju on 2017/8/17 0017.
 */
public class EvaJsonParam {

    /**
     * eva : [{"evaDescription":"good","evaGrade":"5","evaObject":"配送速度"},{"evaDescription":"goodvery","evaGrade":"3","evaObject":"安装速度"}]
     * optyId : d88e95c610774e4d9fc528901f08f7b3
     * userId : dkfkk
     */

    private String optyId;
    private String userId;
    private List<RlOrderEvaluation> eva;

    public String getOptyId() {
        return optyId;
    }

    public void setOptyId(String optyId) {
        this.optyId = optyId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<RlOrderEvaluation> getEva() {
        return eva;
    }

    public void RlOrderEvaluation(List<RlOrderEvaluation> eva) {
        this.eva = eva;
    }


}
