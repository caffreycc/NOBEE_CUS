package com.ricelink.weixin.controller;

import com.ricelink.weixin.mapper.model.RlPotentialCustomers;
import com.ricelink.weixin.utils.ConfigUtil;
import com.ricelink.weixin.utils.PayCommonUtil;
import com.ricelink.weixin.utils.UUID;
import com.ricelink.weixin.utils.XMLUtil;
import com.tencent.common.RandomStringGenerator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created by chenshengju on 2017/8/18 0018.
 */
@RestController
@RequestMapping("/location")
public class WxLocationController {
    @RequestMapping("/getLocation")
    public Object getLocation()
    {
        SortedMap<Object, Object> resultJson = new TreeMap<Object, Object>();
        resultJson.put("appId", ConfigUtil.APPID);
        resultJson.put("timeStamp", PayCommonUtil.getTimer());//时间戳
        resultJson.put("nonceStr", RandomStringGenerator.getRandomStringByLength(32));
        resultJson.put("signType", "MD5");
        resultJson.put("paySign", PayCommonUtil.createSign("UTF-8", resultJson));//重新签名
        int i = 1;
        return resultJson;
    }
}
