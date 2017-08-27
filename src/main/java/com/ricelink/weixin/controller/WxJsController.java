package com.ricelink.weixin.controller;

import com.ricelink.weixin.wxsdk.mp.api.WxMpServiceImpl;
import me.chanjar.weixin.common.bean.WxJsapiSignature;
import me.chanjar.weixin.common.exception.WxErrorException;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created by chenshengju on 2017/8/18 0018.
 */
@RestController
@RequestMapping("/jsConfig")
public class WxJsController {
    @Autowired
    private WxMpServiceImpl wxMpService;
    @RequestMapping("/getConfig")
    public Object getConfig(String url) throws Exception {
        WxJsapiSignature jsapiSignature = wxMpService.createJsapiSignature(url);
        String a=wxMpService.getJsapiTicket();
        String[] jsApiList={"getLocation","openLocation"};
        Map map=new HashedMap();
//        map.put("debug",true);
        map.put("appId",jsapiSignature.getAppid());
        map.put("nonceStr",jsapiSignature.getNoncestr());
        map.put("timestamp",jsapiSignature.getTimestamp());
        map.put("signature",jsapiSignature.getSignature());
        map.put("jsApiList",jsApiList);
        return map;


    }

}
