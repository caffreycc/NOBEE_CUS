package com.ricelink.weixin.utils;

/**
 * Created by chenshengju on 2017/8/2 0002.
 */
public class UUID {
    public static String getUUID()
    {
        String  uuid=java.util.UUID.randomUUID().toString().replaceAll("-","");
        return uuid;
    }
}
