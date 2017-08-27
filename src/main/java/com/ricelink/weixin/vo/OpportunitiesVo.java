package com.ricelink.weixin.vo;

import javax.persistence.Column;
import java.util.Date;

/**
 * Created by chenshengju on 2017/7/28 0028.
 */
//我的订单
public class OpportunitiesVo {
    /**
     * 当前状态
     */
    private String currentStatus;
    /**
     * 定金
     */
    private Double amount=0.0;
    /**
     * 希望测量时间
     */
    private  Date expectMeasureDate;
    /**
     * 城市
     */
    private String addressCity;

    /**
     * 县
     */
    private String addressCounty;

    /**
     * 地址
     */
    private String addressDetail;

    /**
     * 小区
     */
    private String addressCell;

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getExpectMeasureDate() {
        return expectMeasureDate;
    }

    public void setExpectMeasureDate(Date expectMeasureDate) {
        this.expectMeasureDate = expectMeasureDate;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressCounty() {
        return addressCounty;
    }

    public void setAddressCounty(String addressCounty) {
        this.addressCounty = addressCounty;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getAddressCell() {
        return addressCell;
    }

    public void setAddressCell(String addressCell) {
        this.addressCell = addressCell;
    }
}
