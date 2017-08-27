package com.ricelink.weixin.controller;


import com.ricelink.baseframe.common.pojo.Message;
import com.ricelink.weixin.mapper.model.*;
import com.ricelink.weixin.service.*;
import com.ricelink.weixin.utils.*;
import com.ricelink.weixin.utils.UUID;
import com.tencent.common.RandomStringGenerator;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.map.HashedMap;
import org.jdom2.JDOMException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by zhuangjh on 2017/3/10.
 */
@Controller
@RequestMapping("/aliPay")
public class AliPayController {

    @Autowired
    private WxRlPaymentService wxRlPaymentService;
    @Autowired
    private WxRlPotentialCustomersService wxRlPotentialCustomersService;
    @Autowired
    private PayService payService;

    @RequestMapping("/wapPay")
    @ResponseBody
    public Object wapPay(String opportunityId,
                         String payment,
                         String amount,
                         String userId,
                         HttpServletRequest request) throws UnsupportedEncodingException {
        RlPotentialCustomers rlPotentialCustomers = new RlPotentialCustomers();
        rlPotentialCustomers.setWxOpenid(userId);
        rlPotentialCustomers = wxRlPotentialCustomersService.selectOne(rlPotentialCustomers);
        String customerId = rlPotentialCustomers.getCustomerId();
        String uuid = UUID.getUUID();
        Map<String, String> maps = new HashMap<String, String>();
        maps.put("out_trade_no", uuid);
        maps.put("total_amount", amount);//支付宝以元作为计价单位
        maps.put("subject", "issubject");
        maps.put("body", "isbody");
        maps.put("timeout_express", "2m");
        maps.put("product_code", "QUICK_WAP_PAY");
        String passback_params = URLEncoder.encode(uuid + "," + opportunityId + "," + payment + "," + customerId, "utf-8");
        maps.put("passback_params", uuid + "," + opportunityId + "," + payment + "," + customerId);//公用回传参数
        WapPayHandler handler = null;
        handler = new WapPayHandler(ConfigUtil.ALI_APPID, ConfigUtil.ALIPAY_PUBLIC_KEY, ConfigUtil.RSA_PRIVATE_KEY);
        String form = handler.wapPay(maps,uuid);
        return form;
    }

    @PostMapping("/notify")
    public String aliNotifyUrl(HttpServletRequest request) throws Exception {
        //TODO 签名验证
        //TODO 事务处理
        Map<String, String> params = new HashMap<String, String>();
        Map requestParams = request.getParameterMap();
        for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化
            //valueStr = new String(valueStr.getBytes("ISO-8859-1"), "gbk");
            params.put(name, valueStr);
        }
        //订单编号
        String payId = params.get("out_trade_no");
        /***
         *
         *
         * 业务逻辑代码
         *
         */
        String[] attachs = ((String) params.get("passback_params")).split(",");
        String total_amount = params.get("total_amount");
        BigDecimal amount = new BigDecimal(Double.parseDouble(total_amount));
        RlPayment rlPayment = new RlPayment();
        rlPayment.setPayId(attachs[0]);
        int countPayment = wxRlPaymentService.selectCount(rlPayment);
        if (countPayment > 0) {

            return "success";
        }
        payService.pay(attachs, amount, "支付宝");
        System.out.println("回调业务逻辑成功");
        return "success";

    }

}
