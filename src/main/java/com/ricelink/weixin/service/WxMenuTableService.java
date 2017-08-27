package com.ricelink.weixin.service;

import com.ricelink.baseframe.common.service.BaseService;
import com.ricelink.weixin.mapper.mapper.WxMenuTableMapper;
import com.ricelink.weixin.mapper.model.WxMenuTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chenshengju on 2017/8/7 0007.
 */
@Service
public class WxMenuTableService extends BaseService<WxMenuTable>{
    @Autowired
    private WxMenuTableMapper wxMenuTableMapper;
}
