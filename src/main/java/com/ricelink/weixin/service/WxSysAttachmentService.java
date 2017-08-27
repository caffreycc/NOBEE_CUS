package com.ricelink.weixin.service;

import com.ricelink.baseframe.common.service.BaseService;
import com.ricelink.weixin.mapper.mapper.SysAttachmentMapper;
import com.ricelink.weixin.mapper.model.RlAfterSaleServiceInfo;
import com.ricelink.weixin.mapper.model.RlPotentialCustomers;
import com.ricelink.weixin.mapper.model.RlPotentialOpportunities;
import com.ricelink.weixin.mapper.model.SysAttachment;
import com.ricelink.weixin.utils.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by chenshengju on 2017/8/23 0023.
 */
@Service
public class WxSysAttachmentService extends BaseService<SysAttachment>{
    @Autowired
    private SysAttachmentMapper sysAttachmentMapper;
    @Autowired
    private WxSysAttachmentService wxSysAttachmentService;
    @Autowired
    private WxRlAfterSaleServiceInfoService wxRlAfterSaleServiceInfoService;
    @Autowired
    private WxRlPotentialOpportunitiesService wxRlPotentialOpportunitiesService;
    @Transactional
    public void batchUpdate(RlAfterSaleServiceInfo rlAfterSaleServiceInfo, List<String> uuids, RlPotentialCustomers rlPotentialCustomers) {
        RlPotentialOpportunities rlPotentialOpportunities=new RlPotentialOpportunities();
        rlPotentialOpportunities.setOpportunityId(rlAfterSaleServiceInfo.getOrderId());
        rlPotentialOpportunities=wxRlPotentialOpportunitiesService.selectOne(rlPotentialOpportunities);
        String uuid= UUID.getUUID();
        synchronized (this) {
            String orderNum = wxRlAfterSaleServiceInfoService.getSHOrderNum();
            rlAfterSaleServiceInfo.setAssId(orderNum);
            rlAfterSaleServiceInfo.setId(uuid);
            rlAfterSaleServiceInfo.setCustomerName(rlPotentialCustomers.getName());
            //todo
            rlAfterSaleServiceInfo.setCustomerTel(rlPotentialCustomers.getPhone1());
            rlAfterSaleServiceInfo.setCustomerAddress(rlPotentialOpportunities.getAddressCity() + rlPotentialOpportunities.getAddressCounty() + rlPotentialOpportunities.getAddressCell() + rlPotentialOpportunities.getAddressDetail());
            rlAfterSaleServiceInfo.setDealerId(rlPotentialOpportunities.getDealerId());
            rlAfterSaleServiceInfo.setIsCusStart("Y");
            rlAfterSaleServiceInfo.setIsSolve("N");
            rlAfterSaleServiceInfo.setCreateBy(rlPotentialCustomers.getCustomerId());
            rlAfterSaleServiceInfo.setCreateDate(new Date());
            wxRlAfterSaleServiceInfoService.insertSelective(rlAfterSaleServiceInfo);
            uuids.forEach(id -> {
                SysAttachment sysAttachment = new SysAttachment();
                sysAttachment.setFileId(id);
                sysAttachment.setResourceId(orderNum);
                sysAttachment.setResourceType("rl_after_sale_service_info");
                wxSysAttachmentService.updateByPrimaryKeySelective(sysAttachment);
            });
        }
    }
}
