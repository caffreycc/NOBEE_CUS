package com.ricelink.weixin.service;

import com.ricelink.weixin.mapper.mapper.RlCustomersMapper;
import com.ricelink.weixin.mapper.model.RlCustomers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by chenshengju on 2017/8/16 0016.
 */
@Service
public class TestService {
    @Autowired
    private RlCustomersMapper rlCustomersMapper;
    @Transactional
    public void  test1()throws Exception{
        RlCustomers rlCustomers=new RlCustomers();
        rlCustomers.setCustomerId("yyyy");
        rlCustomers.setName("1");
        rlCustomers.setCreatedBy("1");
        rlCustomers.setCreationDate(new Date());
        rlCustomers.setVersionNumber(1L);
        rlCustomers.setRecordStatus("VALID");
        RlCustomers rlCustomers1=new RlCustomers();
        rlCustomers1.setCustomerId("uuuu");
        rlCustomers1.setName("1");
        rlCustomers1.setCreatedBy("1");
        rlCustomers1.setCreationDate(new Date());
        rlCustomers1.setVersionNumber(1L);
        rlCustomers1.setRecordStatus("VALID");
        rlCustomersMapper.insertSelective(rlCustomers);
        rlCustomersMapper.insertSelective(rlCustomers1);
        test2();

    }
//    @Transactional
    public void  test2(){
        RlCustomers rlCustomers=new RlCustomers();
        rlCustomers.setCustomerId("gggg");
        rlCustomers.setName("1");
        rlCustomers.setCreatedBy("1");
        rlCustomers.setCreationDate(new Date());
        rlCustomers.setVersionNumber(1L);
        rlCustomers.setRecordStatus("VALID");
        RlCustomers rlCustomers1=new RlCustomers();
        rlCustomers1.setCustomerId("pppp");
        rlCustomers1.setName("1");
        rlCustomers1.setCreatedBy("1");
        rlCustomers1.setCreationDate(new Date());
        rlCustomers1.setVersionNumber(1L);
        rlCustomers1.setRecordStatus("VALID");
        rlCustomersMapper.insertSelective(rlCustomers);
        try {
            int i=1/0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        rlCustomersMapper.insertSelective(rlCustomers1);

    }

}
