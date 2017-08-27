package com.ricelink.weixin.handler.mp;

import com.ricelink.weixin.mapper.model.*;
import com.ricelink.weixin.service.WxRlPotentialCustomersService;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpMessageHandler;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.kefu.WxMpKefuMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutTextMessage;
import me.chanjar.weixin.mp.bean.result.WxMpUser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Map;

/** 服务号关注处理
 * Created by aixiaoai on 2016/10/11.
 */
@Component
public class WxSubscribeEventHandler extends WxMpReplyHandler implements WxMpMessageHandler {

    private Logger LOGGER = LogManager.getLogger(WxSubscribeEventHandler.class);
    @Autowired
    private WxRlPotentialCustomersService wxRlPotentialCustomersService;


    @Override
    public WxMpXmlOutMessage handle(WxMpXmlMessage wxMpXmlMessage, Map<String, Object> map, WxMpService wxMpService, WxSessionManager wxSessionManager) throws WxErrorException {

        LOGGER.debug("用户关注" + wxMpXmlMessage.getFromUser());
        System.out.println("用户关注" + wxMpXmlMessage.getFromUser());
        System.out.println("openid"+wxMpXmlMessage.getFromUser());
        WxMpXmlOutTextMessage m = WxMpXmlOutMessage.TEXT().content("感谢关注诺贝尼")
                .fromUser(wxMpXmlMessage.getToUser()).toUser(wxMpXmlMessage.getFromUser())
                .build();
        return m;
    }
}
