package com.ricelink.weixin.utils;

import java.io.File;

/**
 * Created by zhuangjh on 2017/2/4.
 */
public class ConfigUtil {

    public static String PAY_WEIXIN = "wx";//微信支付方式

    public static String PAY_ALI = "ali";//支付宝支付方式

    /***
     * 微信配置
     */
    public static String APPID = "wx82f324bfd635923e";//公众号ID

    public static String MCH_ID = "1251008901";//商户号

    public static String KEY = "b827261e7be210d556486c1b5e7d6962";//密钥

    public static String NOTIFY_URL = "http://milinkinfo.com/nobee_weixin_ipad_api/order/notifyMethod";//回调地址

    public static String QUERY_PAY="https://api.mch.weixin.qq.com/pay/orderquery";
    public  static String TRADE_TYPE_JSAPI = "JSAPI";

    public static String PAY_TYPE_BALANCE = "balance";//结算

    public static String PAY_TYPE_CHANNEL = "channel";//渠道

    public static String SSL_PATH = "WEB-INF" +File.separator + "classes" + File.separator + "apiclient_cert" +
            File.separator + "apiclient_cert.p12";

    public static String PAY_API = "https://api.mch.weixin.qq.com/pay/unifiedorder"; //统一下单接口

    public static String REFUND_API = "https://api.mch.weixin.qq.com/secapi/pay/refund";//退款接口



    /**
     * 支付宝配置
     * **/

    // 开发者应用私钥。java配置PKCS8格式，PHP/.Net语言配置rsa_private_key.pem文件中原始私钥。
    public static final String RSA_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDROd4i68mvi+q1" +
            "sNwpl9x6jiCqo14WpYKm3k7RtyjkPRKsJsSHO9LAB7gKHHVIY0HONbJncOr/GiOY" +
            "xNejv3UJLmNNb/scpY1vw307CorUfNeHKVq47ZrgiBs6Y+1GW7GNXE03naOFBpp/" +
            "vIIAjQCVS580ssNi323LPWtCSYmwgIG3YMjU62nClJjN1J9zwIkKiFEDL7S4RFKl" +
            "YUvQF5YHcUnZX9kXuWyrtWAtOcC9NfAGXFw1FWAaF1IrdZh4kOttFKVuD/rRjzFC" +
            "Xl8Im2AWcrvBl3MnQU0yRgeS7TBdmk1RCzp9POr1NMC5WWIWgiKtUcQZWajlinNP" +
            "6aspQ/qFAgMBAAECggEAPwHGO432Nr9T91NDeeMZqm6St9BqzTcamVXpNo6J6fHa" +
            "Za1nEbKaTOoGKkVXrGz3rDnPeAcxPZGJlr/wkIdfn1ww22kVnhLc/QNJ+zW5iTPv" +
            "U+zIPViQg315daQSGFYUqhVZy53VWIIclMsX+0J7Inqbfys2W9gdIE9mtZeft17w" +
            "Sz8zJB+RwofTmwc6flR7J2IDC51z2q0hV6Z+EJaPxvOSe+iATHgCPBAwpdquVovw" +
            "9UfFTOz/To7M0MCER183p2/uBMMBGbNNb1ms4J7R8pZdUQ1HhE8l15+Ye8OfN6Xa" +
            "ZUFp5p0/M/MnRCd9miwp0PtlZytBRveMXL7Lmp8wAQKBgQDpzMRzYC6WINS2043e" +
            "nuIaxYbVeNTtb0cgZVSPBZcycOdCIv+E9EQqdAA2PYh6X1ENDP7/C4eBf9cthN2v" +
            "WeaPFSkocdHZqS7GUVg8z+q2vNjVru1yyWlfVwdsc1Roj9CwWFu/2w0vkapxxhnH" +
            "demXeyvTKpZ8wRKPsr1ACl0QgQKBgQDlF8HQy47HxlwUlIuVselpPQ1idX2MV5uZ" +
            "wBqRh+zS3IpSpBL3MzogcIrDv5qZQ0yprWVSGhALsj71O9lS92Uorvz0XQvuxLNX" +
            "S2tBHXRWhgK1GeTvbnbF0TZNkFdd6pHcv9++L/Jur/zuqSxHsZdZvBgpJIGwG9g/" +
            "f47kM56oBQKBgQDAa8kbdAOjh63KMt9GY9mPUxafxuzn5XfSj9NCSsWfvBB4/Dj0" +
            "gd1AW2x5N7eFj8EzTojn++Mwj7jXO80ALqt1A2N2aAbgbz+R9Qz8L9rrPw3vACNp" +
            "H59b2lK/zUOhMwv8txv8ERsPFYIEVZiN8tun0rXE+/4S+wx9vAvKEz15AQKBgF74" +
            "GkCUIfxvHnzpl3PW7QvTY1kNm54yMy7plBoAXwyKoEzh93rCobYQ8XV0WIJwg7dT" +
            "Sk1ewIgYvECtLspWBHl5ESO77tZsdGwbt7qmmzPDGhw5P86B3Hrk374HuDAWraD1" +
            "aatN9RItoozNVK3j0PpCH0HvAFQhNuQb3QB85aiBAoGAYxzqazlKGk+pn7nFl5mX" +
            "a0eeLCHUFpOHjjgEVPPNSJnqUZImJTRDoEYRYfQb8ITYpq1EuMVDe9Pm296j2HXh" +
            "cLc7KgJpD/QxRNUj0e2qt+dScZP4BxAx+4uroRmZ/NJMIQVAm9XzXxKdpKbYzcS0" +
            "G26Vj2YEtmY9UIdoLN1JWgw=";
    // 接口请求网关。当面付支付、查询、退款、撤销接口中为固定值
    public static final String URL = "https://openapi.alipay.com/gateway.do";
    // 商户应用APPID，只要您的应用中包含当面付接口且是开通状态，就可以用此应用对应的appid。开发者可登录开放平台-管理中心-对应应用中查看
    public static final String ALI_APPID = "2017051307225182";
    // 编码字符集。默认 utf-8
    public static final String CHARSET = "utf-8";
    // 返回格式。默认json
    public static final String FORMAT = "json";
    public static final  String SIGNTYPE = "RSA2";
    // 支付宝公钥，用于获取同步返回信息后进行验证，验证是否是支付宝发送的信息。
    public static final String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0TneIuvJr4vqtbDcKZfceo4gqqNeFqWCpt5O0bco5D0SrCbEhzvSwAe4Chx1SGNBzjWyZ3Dq/xojmMTXo791CS5jTW/7HKWNb8N9OwqK1HzXhylauO2a4IgbOmPtRluxjVxNN52jhQaaf7yCAI0AlUufNLLDYt9tyz1rQkmJsICBt2DI1OtpwpSYzdSfc8CJCohRAy+0uERSpWFL0BeWB3FJ2V/ZF7lsq7VgLTnAvTXwBlxcNRVgGhdSK3WYeJDrbRSlbg/60Y8xQl5fCJtgFnK7wZdzJ0FNMkYHku0wXZpNUQs6fTzq9TTAuVliFoIirVHEGVmo5YpzT+mrKUP6hQIDAQAB";

    public static  final String ALI_RETURN_URL = "http://milinkinfo.com/nobee_weixin_ipad_api/page/mobile/index.html#/payResult";

    public static  final String ALI_NOTIFY_URL = "http://milinkinfo.com/nobee_weixin_ipad_api/aliPay/notify";

    public static final String OPEN_AUTH = "https://openauth.alipaydev.com/oauth2/appToAppAuth.htm";

    public static final String OPEN_AUTH_REDIRECT_URI = "http://www.milinkinfo.com/cloud-pay/aliAuthorization/saveAuthQrcode";
}
