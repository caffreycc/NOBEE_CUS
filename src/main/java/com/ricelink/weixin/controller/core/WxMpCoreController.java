package com.ricelink.weixin.controller.core;

import com.ricelink.weixin.mapper.model.WxMenuTable;
import com.ricelink.weixin.service.WxMenuTableService;
import com.ricelink.weixin.utils.WeixinOpenIdSwitchUtil;
import com.ricelink.weixin.wxsdk.mp.api.WxMpServiceImpl;
import me.chanjar.weixin.mp.api.WxMpUserService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import me.chanjar.weixin.mp.bean.result.WxMpUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by chenshengju on 2017/8/7 0007.
 */
@Controller
@RequestMapping("/mp")
public class WxMpCoreController {
    protected Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private WxMpServiceImpl wxMpService;
    @Autowired
    private WxMenuTableService wxMenuTableService;

    @RequestMapping("/menuCore/{appId}")
    public void menuCore(@PathVariable("appId")Integer appId, String state, String code, HttpServletRequest request, HttpServletResponse response) throws Exception {
        WxMpOAuth2AccessToken wxAccessToken = wxMpService.oauth2getAccessToken(code);
        WxMpUserService userService = wxMpService.getUserService();
        WxMpUser wxMpUser = userService.userInfo(wxAccessToken.getOpenId());
        request.getSession().setAttribute("openId",wxMpUser.getOpenId());
        System.out.println(wxMpUser);
        WxMenuTable wxMenuTable=new WxMenuTable();
        wxMenuTable.setId(Integer.parseInt(state));
        wxMenuTable=wxMenuTableService.selectByPrimaryKey(wxMenuTable);
        String url=wxMenuTable.getMenuAppUrl();
        //设置cookie
        Cookie cookie = new Cookie("userId", wxAccessToken.getOpenId());
        cookie.setPath("/");
        response.addCookie(cookie);
        response.sendRedirect(url);
    }
    @ResponseBody
    @RequestMapping("/core/{appId}")
    public String post(@RequestBody String requestBody, @RequestParam("signature") String signature,
                       @RequestParam(name = "encrypt_type", required = false) String encType,
                       @RequestParam(name = "msg_signature", required = false) String msgSignature,
                       @RequestParam("timestamp") String timestamp, @RequestParam("nonce") String nonce) {
        this.logger.info(
                "\n接收微信请求：[signature=[{}], encType=[{}], msgSignature=[{}],"
                        + " timestamp=[{}], nonce=[{}], requestBody=[\n{}\n] ",
                signature, encType, msgSignature, timestamp, nonce, requestBody);

        if (!wxMpService.checkSignature(timestamp, nonce, signature)) {
            throw new IllegalArgumentException("非法请求，可能属于伪造的请求！");
        }

        String out = null;
        if (encType == null) {
            // 明文传输的消息
            WxMpXmlMessage inMessage = WxMpXmlMessage.fromXml(requestBody);
            WxMpXmlOutMessage outMessage = wxMpService.route(inMessage);
            if (outMessage == null) {
                return "";
            }

            out = outMessage.toXml();
        } else if ("aes".equals(encType)) {
            // aes加密的消息
            WxMpXmlMessage inMessage = WxMpXmlMessage.fromEncryptedXml(requestBody,
                    this.wxMpService.getWxMpConfigStorage(), timestamp, nonce, msgSignature);
            this.logger.debug("\n消息解密后内容为：\n{} ", inMessage.toString());
            WxMpXmlOutMessage outMessage = this.wxMpService.route(inMessage);
            if (outMessage == null) {
                return "";
            }

            out = outMessage.toEncryptedXml(this.wxMpService.getWxMpConfigStorage());
        }

        this.logger.debug("\n组装回复信息：{}", out);

        return out;
    }
}
