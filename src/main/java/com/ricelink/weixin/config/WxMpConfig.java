package com.ricelink.weixin.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author Binary Wang
 *
 */
@Configuration
@ConfigurationProperties(prefix = "mp")
public class WxMpConfig {
  private String token;

  private String appid;

  private String appsecret;

  private String aesKey;

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public String getAppid() {
    return appid;
  }

  public void setAppid(String appid) {
    this.appid = appid;
  }

  public String getAppsecret() {
    return appsecret;
  }

  public void setAppsecret(String appsecret) {
    this.appsecret = appsecret;
  }

  public String getAesKey() {
    return aesKey;
  }

  public void setAesKey(String aesKey) {
    this.aesKey = aesKey;
  }
}
