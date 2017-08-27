package com.ricelink.weixin.controller;

import com.ricelink.baseframe.common.pojo.Message;
import com.ricelink.weixin.service.WxDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/weixin/api/dict")
public class WxDictController {
    @Autowired
    private WxDictService wxDictService;


    @RequestMapping("/getDictInfo")
    @ResponseBody
    public Object getDictInfo(@RequestBody List<String> dictCodes)
    {
        Map map=new  HashMap<String,Object>();
        for (String dictCode : dictCodes) {
            map.put(dictCode,wxDictService.selectDictInfo(dictCode));
        }
        return new Message(Message.SUCCESS,"success",map);
    }

    @RequestMapping("/getDictInfoFilter1")
    @ResponseBody
    public Object getDictInfoFilter1(@RequestBody List<String> dictCodes)
    {
        Map map=new  HashMap<String,Object>();
        for (String dictCode : dictCodes) {
            map.put(dictCode,wxDictService.selectDictInfoFilter1(dictCode));
        }
        return new Message(Message.SUCCESS,"success",map);
    }

    @RequestMapping("/getCity")
    @ResponseBody
    public Object getCity(HttpServletRequest request, HttpServletResponse response)
    {
        List<Map> mapList=wxDictService.selectCity();
//        Object openId = request.getSession().getAttribute("openId");
        Cookie cookie = new Cookie("ddd", "abc");
        cookie.setPath("/");
        response.addCookie(cookie);
//        System.out.println(openId);
        return new Message(Message.SUCCESS,"success",mapList);
    }

    @RequestMapping("/getArea")
    @ResponseBody
    public Object getArea()
    {
        List<Map> mapList=wxDictService.selectCountry();
        return new Message(Message.SUCCESS,"success",mapList);
    }

    @RequestMapping("/getAddress")
    @ResponseBody
    public Object getAddress()
    {
        List<Map> mapList=wxDictService.selectAddress();
        return new Message(Message.SUCCESS,"success",mapList);
    }
}
