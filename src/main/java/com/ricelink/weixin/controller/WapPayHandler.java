package com.ricelink.weixin.controller;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.ricelink.weixin.utils.ConfigUtil;

import java.util.Map;


/**
 * Created by zhuangjh on 2017/3/10.
 */
public class WapPayHandler {

    private String aliAppId;

    private String alipayPublicKey;

    private String rsaPrivateKey;

    private AlipayClient client;


    public WapPayHandler(String aliAppId, String alipayPublicKey, String rsaPrivateKey){
        this.aliAppId =aliAppId;
        this.alipayPublicKey = alipayPublicKey;
        this.rsaPrivateKey = rsaPrivateKey;
        this.client = new DefaultAlipayClient(
                ConfigUtil.URL,
                this.aliAppId,
                this.rsaPrivateKey,
                ConfigUtil.FORMAT,
                ConfigUtil.CHARSET,
                this.alipayPublicKey,
                ConfigUtil.SIGNTYPE);
    }

    public  AlipayClient getAlipayClientInstance(){
        return client;
    }


    /**
     * 手机网站支付
     * @param map
     * @return
     */
    public String wapPay(Map<String, String> map,String param){
        AlipayTradeWapPayRequest alipayRequest = new AlipayTradeWapPayRequest();
        String bizCon = JSON.toJSONString(map);
        alipayRequest.setBizContent(bizCon);
        alipayRequest.setNotifyUrl(ConfigUtil.ALI_NOTIFY_URL);
        alipayRequest.setReturnUrl(ConfigUtil.ALI_RETURN_URL+"?payId="+param);
        String form = "";
        try {
            form = getAlipayClientInstance().pageExecute(alipayRequest).getBody();
        } catch (AlipayApiException e) {
            form = "err";
            e.printStackTrace();
        }
        return form;
    }
}
