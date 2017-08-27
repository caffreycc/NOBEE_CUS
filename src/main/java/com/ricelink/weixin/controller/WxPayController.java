package com.ricelink.weixin.controller;

import com.ricelink.baseframe.common.pojo.Message;
import com.ricelink.weixin.config.WxMpConfig;
import com.ricelink.weixin.mapper.model.*;
import com.ricelink.weixin.service.*;
import com.ricelink.weixin.utils.*;
import com.ricelink.weixin.wxsdk.mp.api.WxMpServiceImpl;
import com.tencent.common.RandomStringGenerator;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpUserService;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import me.chanjar.weixin.mp.bean.result.WxMpUser;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.map.HashedMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jdom2.JDOMException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

//import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * Created by chenshengju on 2017/8/1 0001.
 */
@Controller
@RequestMapping("/order")
public class WxPayController {
    @Autowired
    private PayService payService;
    @Autowired
    private WxMpServiceImpl wxMpService;
    @Autowired
    private WxRlPotentialCustomersService wxRlPotentialCustomersService;
    @Autowired
    private WxRlPaymentService wxRlPaymentService;
    private Logger LOGGER = LogManager.getLogger(WxPayController.class);
    /**
     * 微信支付：统一下单
     *
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/unifiedOrder")
    public Map UnifiedOrder(@RequestParam(required = false) String opportunityId,
                            @RequestParam(required = false) String payment,
                            @RequestParam(required = false) String amount,
                            @RequestParam(required = false) String userId,
                            HttpServletRequest request) throws Exception {
        //TODO 测试专用(注意回调)
//        WxMpUserService userService = wxMpService.getUserService();
//        WxMpUser wxMpUser = userService.userInfo(userId);
//        String openId = WeixinOpenIdSwitchUtil.switchOpenId(wxMpUser.getNickname());
        //TODO 测试专用
        LOGGER.debug("微信支付：统一下单开始");
        RlPotentialCustomers rlPotentialCustomers = new RlPotentialCustomers();
        rlPotentialCustomers.setWxOpenid(userId);
        rlPotentialCustomers = wxRlPotentialCustomersService.selectOne(rlPotentialCustomers);
        String customerId = rlPotentialCustomers.getCustomerId();
        String uuid = UUID.getUUID();
        SortedMap<Object, Object> parameters = new TreeMap<Object, Object>();
        parameters.put("appid", ConfigUtil.APPID);
        parameters.put("mch_id", ConfigUtil.MCH_ID);
        parameters.put("nonce_str", RandomStringGenerator.getRandomStringByLength(32));
        parameters.put("body", "诺贝尼" + payment);
        parameters.put("out_trade_no", uuid);
        parameters.put("total_fee", amount);
        parameters.put("attach", uuid + "," + opportunityId + "," + payment + "," + customerId);
        parameters.put("spbill_create_ip", request.getRemoteAddr());
        parameters.put("notify_url", ConfigUtil.NOTIFY_URL);
        parameters.put("trade_type", "JSAPI");
        //TODO 测试专用
        parameters.put("openid", userId);
//        parameters.put("openid", openId);
        //TODO 测试专用
        String sign = PayCommonUtil.createSign("UTF-8", parameters);//生成签名
        parameters.put("sign", sign);
        String requestXML = PayCommonUtil.getRequestXml(parameters);//转成string XML
        String result = PayCommonUtil.httpRequest(ConfigUtil.PAY_API, "POST", requestXML);//统一下单
        Map<String, Object> resultMap = XMLUtil.doXMLParse(result);
        SortedMap<Object, Object> resultJson = new TreeMap<Object, Object>();
        resultJson.put("appId", ConfigUtil.APPID);
        resultJson.put("timeStamp", PayCommonUtil.getTimer());//时间戳
        resultJson.put("nonceStr", RandomStringGenerator.getRandomStringByLength(32));
        resultJson.put("package", "prepay_id=" + resultMap.get("prepay_id"));
        resultJson.put("signType", "MD5");
        resultJson.put("paySign", PayCommonUtil.createSign("UTF-8", resultJson));//重新签名
        resultJson.put("payId", uuid);
        int i = 1;
        return resultJson;
    }

    @RequestMapping("/getOpenId")
    public void getOpenId(String state, String code, HttpServletResponse response) throws Exception {
        WxMpOAuth2AccessToken accessToken = wxMpService.oauth2getAccessToken(code);
        //设置cookie
        Cookie cookie = new Cookie("userId", accessToken.getOpenId());
        cookie.setPath("/");
        response.addCookie(cookie);
        response.sendRedirect("http://chenjiajian.tunnel.qydev.com/gzh/or/payOrder");
    }

    /**
     * 回调方法
     *
     * @param request
     * @return
     * @throws IOException
     * @throws JDOMException
     */
    @ResponseBody
    @RequestMapping("/notifyMethod")
    public String notifyMethod(HttpServletRequest request) throws Exception {
        //TODO 签名验证（可不做）
        //TODO 事务处理
        BufferedReader reader;
        reader = request.getReader();
        String line;
        String xmlString;
        StringBuffer inputString = new StringBuffer();

        while ((line = reader.readLine()) != null) {
            inputString.append(line);
        }
        xmlString = inputString.toString();
        request.getReader().close();
        System.out.println(xmlString);

        Map<String, String> map = XMLUtil.doXMLParse(xmlString);
        SortedMap mapResult = new TreeMap();
        mapResult.put("return_code", "<![CDATA[SUCCESS]]>");
        mapResult.put("return_msg", "<![CDATA[OK]]>");
        String returnMap = PayCommonUtil.getRequestXml(mapResult);
        /***
         *
         *
         * 业务逻辑代码
         *
         */
        String[] attachs = ((String) map.get("attach")).split(",");
        RlPayment rlPayment = new RlPayment();
        rlPayment.setPayId(attachs[0]);
        int countPayment = wxRlPaymentService.selectCount(rlPayment);
        if (countPayment > 0) {

            return returnMap;
        }
        String total_fee = map.get("total_fee");
        BigDecimal amount = new BigDecimal(Double.parseDouble(total_fee) / 100);
        payService.pay(attachs,amount,"微信");
        System.out.println("回调业务逻辑成功");
        return returnMap;
    }

    //查询微信支付宝支付是否成功
    @ResponseBody
    @RequestMapping("/isPaySuccess")
    public Object isPaySuccess(String payId) throws Exception {
        RlPayment rlPayment = new RlPayment();
        rlPayment.setPayId(payId);
        rlPayment = wxRlPaymentService.selectOne(rlPayment);
        Map<String, Object> dataMap = new HashedMap();
        //微信则调微信查询订单的接口，支付宝没有查询的接口
        if(rlPayment==null)
        {
            SortedMap<Object, Object> parameters = new TreeMap<Object, Object>();
            parameters.put("appid", ConfigUtil.APPID);
            parameters.put("mch_id", ConfigUtil.MCH_ID);
            parameters.put("nonce_str", RandomStringGenerator.getRandomStringByLength(32));
            parameters.put("out_trade_no", rlPayment.getPayId());
            String sign = PayCommonUtil.createSign("UTF-8", parameters);//生成签名
            parameters.put("sign", sign);
            String requestXML = PayCommonUtil.getRequestXml(parameters);//转成string XML
            String result = PayCommonUtil.httpRequest(ConfigUtil.QUERY_PAY, "POST", requestXML);//统一下单
            Map<String, Object> resultMap = XMLUtil.doXMLParse(result);
            String trade_state = (String) resultMap.get("trade_state");
            String total_fee = (String) resultMap.get("total_fee");
            String time_end = (String) resultMap.get("time_end");
            dataMap.put("trade_state", trade_state);
            dataMap.put("total_fee", total_fee);
            dataMap.put("time_end", time_end);
            if ("SUCCESS".equals(trade_state)) {
                return new Message(Message.SUCCESS, "success", dataMap);
            } else {
                return new Message(Message.ERROR, "fail", dataMap);
            }
        }else//如果没有接到通知，或支付宝支付，则会进入此分支
        {
            dataMap.put("trade_state", "SUCCESS");
            dataMap.put("total_fee", rlPayment.getAmount().multiply(new BigDecimal(100L)));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMDDHHmmss");
            dataMap.put("time_end", sdf.format(rlPayment.getCreationDate()));
            return new Message(Message.SUCCESS, "success", dataMap);
        }

    }
}
