package com.ricelink.weixin.utils;

import java.util.Random;

/**
 * Created by chenshengju on 2017/8/14 0014.
 */
public class getRandomNumByLength {
    public static String getRandomNum(int length)
    {
        Random random=new Random();
        StringBuilder sb=new StringBuilder();
        for(int i=length;i<length;i++)
        {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }
}
