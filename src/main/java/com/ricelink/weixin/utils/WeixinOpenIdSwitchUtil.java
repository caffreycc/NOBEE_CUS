package com.ricelink.weixin.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by chenshengju on 2017/8/7 0007.
 */
//测试微信支付环境专用
public class WeixinOpenIdSwitchUtil {
    public static String  switchOpenId(String name)
    {
        String openId="";
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            conn=getConnection();
            String sql="SELECT m.USEROPENID FROM wx_micruser_table m WHERE m.MICUSERT_NAME = ? and m.MICRO_ORIGINALID='gh_897439f95f2f'";
            ps=conn.prepareStatement(sql);
            ps.setString(1, name);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                openId=rs.getString(1);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return openId;
    }
    private static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://dbserver.ricelink.cn:33061/weixin?useUnicode=true&characterEncoding=UTF-8", "root", "000000");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

}
