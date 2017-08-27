package com.ricelink.weixin.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by chenshengju on 2017/7/24 0024.
 */
@Configuration
public class TestConfigurerAdapter extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
            registry.addInterceptor(new TestInterceptor()).addPathPatterns("/**/*");
    }
}
