package com.ricelink.weixin.wxsdk.mp.api;

import com.ricelink.weixin.config.WxMpConfig;
import com.ricelink.weixin.handler.mp.LocationHandler;
import com.ricelink.weixin.handler.mp.WxSubscribeEventHandler;
import com.ricelink.weixin.handler.mp.WxUnSubscribeEventHandler;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.mp.api.WxMpInMemoryConfigStorage;
import me.chanjar.weixin.mp.api.WxMpMessageRouter;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by aixiaoai on 2016/10/11.
 */
@Component
public class WxMpServiceImpl extends me.chanjar.weixin.mp.api.impl.WxMpServiceImpl {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private WxMpConfig wxConfig;
    @Autowired
    private WxSubscribeEventHandler wxSubscribeEventHandler;
    @Autowired
    private LocationHandler locationHandler;
    @Autowired
    private WxUnSubscribeEventHandler wxUnSubscribeEventHandler;
    private WxMpMessageRouter router;
    @PostConstruct
    public void init() {
        final WxMpInMemoryConfigStorage config = new WxMpInMemoryConfigStorage();
        config.setAppId(this.wxConfig.getAppid());// 设置微信公众号的appid
        config.setSecret(this.wxConfig.getAppsecret());// 设置微信公众号的app corpSecret
        config.setToken(this.wxConfig.getToken());// 设置微信公众号的token
        config.setAesKey(this.wxConfig.getAesKey());// 设置消息加解密密钥
        super.setWxMpConfigStorage(config);

        this.refreshRouter();
    }
    private void refreshRouter() {
        final WxMpMessageRouter newRouter = new WxMpMessageRouter(this);
        // 关注事件
        newRouter.rule().async(false).msgType(WxConsts.XML_MSG_EVENT)
                .event(WxConsts.EVT_SUBSCRIBE).handler(this.getSubscribeHandler())
                .end();

        // 取消关注事件
        newRouter.rule().async(false).msgType(WxConsts.XML_MSG_EVENT)
                .event(WxConsts.EVT_UNSUBSCRIBE).handler(this.getUnsubscribeHandler())
                .end();
        // 上报地理位置事件
        newRouter.rule().async(false).msgType(WxConsts.XML_MSG_EVENT)
                .event(WxConsts.EVT_LOCATION).handler(this.getLocationHandler()).end();

        // 接收地理位置消息
        newRouter.rule().async(false).msgType(WxConsts.XML_MSG_LOCATION)
                .handler(this.getLocationHandler()).end();
        this.router = newRouter;

    }
    public WxMpXmlOutMessage route(WxMpXmlMessage message) {
        try {
            return this.router.route(message);
        } catch (Exception e) {
            this.logger.error(e.getMessage(), e);
        }

        return null;
    }
    protected LocationHandler getLocationHandler() {
        return this.locationHandler;
    }
    protected WxSubscribeEventHandler getSubscribeHandler() {
        return this.wxSubscribeEventHandler;
    }

    protected WxUnSubscribeEventHandler getUnsubscribeHandler() {
        return this.wxUnSubscribeEventHandler;
    }
}
