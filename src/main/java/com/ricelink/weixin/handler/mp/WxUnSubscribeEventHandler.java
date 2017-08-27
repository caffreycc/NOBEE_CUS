package com.ricelink.weixin.handler.mp;

import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpMessageHandler;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/** 服务号取消关注处理
 * Created by aixiaoai on 2016/10/11.
 */
@Component
public class WxUnSubscribeEventHandler implements WxMpMessageHandler {

    private Logger LOGGER = LogManager.getLogger(WxUnSubscribeEventHandler.class);


    @Override
    public WxMpXmlOutMessage handle(WxMpXmlMessage wxMpXmlMessage, Map<String, Object> map, WxMpService wxMpService, WxSessionManager wxSessionManager) throws WxErrorException {
        LOGGER.debug("用户取消关注" + wxMpXmlMessage.getFromUser());

        System.out.println("用户取消关注" + wxMpXmlMessage.getFromUser());
        return null;
    }
}
