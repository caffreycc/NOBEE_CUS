package com.ricelink.weixin.mapper.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "rl_customers")
public class RlCustomers {
    /**
     * 客户id
     */
    @Id
    @Column(name = "CUSTOMER_ID")
    private String customerId;

    /**
     * 姓名
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 性别
     */
    @Column(name = "SEX")
    private String sex;

    /**
     * 电话
     */
    @Column(name = "PHONE1")
    private String phone1;

    /**
     * 创建人
     */
    @Column(name = "CREATED_BY")
    private String createdBy;

    /**
     * 创建日期
     */
    @Column(name = "CREATION_DATE")
    private Date creationDate;

    /**
     * 最新更新者
     */
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;

    /**
     * 最新更新日期
     */
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;

    /**
     * 版本号
     */
    @Column(name = "VERSION_NUMBER")
    private Long versionNumber;

    /**
     * 记录状态
     */
    @Column(name = "RECORD_STATUS")
    private String recordStatus;

    /**
     * 客户更新日期
     */
    @Column(name = "CLIENT_UPDATE_DATE")
    private Date clientUpdateDate;

    /**
     * 绑定微信返回的openid
     */
    @Column(name = "WX_OPENID")
    private String wxOpenid;

    /**
     * 客户信息来源
     */
    @Column(name = "INFO_SOURCE")
    private String infoSource;

    /**
     * 当前门店ID（二维码信息）
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 导购员Id(二维码信息)
     */
    @Column(name = "GUIDE_ID")
    private String guideId;

    /**
     * 经销商ID
     */
    @Column(name = "DEALER")
    private String dealer;

    /**
     * 年收入
     */
    @Column(name = "ANNUAL_INCOME")
    private String annualIncome;

    /**
     * 学历背景(业务字典degree)
     */
    @Column(name = "EDUCATION_TYPE")
    private String educationType;

    /**
     * 获取客户id
     *
     * @return CUSTOMER_ID - 客户id
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 设置客户id
     *
     * @param customerId 客户id
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * 获取姓名
     *
     * @return NAME - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取性别
     *
     * @return SEX - 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取电话
     *
     * @return PHONE1 - 电话
     */
    public String getPhone1() {
        return phone1;
    }

    /**
     * 设置电话
     *
     * @param phone1 电话
     */
    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    /**
     * 获取创建人
     *
     * @return CREATED_BY - 创建人
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置创建人
     *
     * @param createdBy 创建人
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * 获取创建日期
     *
     * @return CREATION_DATE - 创建日期
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * 设置创建日期
     *
     * @param creationDate 创建日期
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * 获取最新更新者
     *
     * @return LAST_UPDATED_BY - 最新更新者
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * 设置最新更新者
     *
     * @param lastUpdatedBy 最新更新者
     */
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * 获取最新更新日期
     *
     * @return LAST_UPDATE_DATE - 最新更新日期
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * 设置最新更新日期
     *
     * @param lastUpdateDate 最新更新日期
     */
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * 获取版本号
     *
     * @return VERSION_NUMBER - 版本号
     */
    public Long getVersionNumber() {
        return versionNumber;
    }

    /**
     * 设置版本号
     *
     * @param versionNumber 版本号
     */
    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * 获取记录状态
     *
     * @return RECORD_STATUS - 记录状态
     */
    public String getRecordStatus() {
        return recordStatus;
    }

    /**
     * 设置记录状态
     *
     * @param recordStatus 记录状态
     */
    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    /**
     * 获取客户更新日期
     *
     * @return CLIENT_UPDATE_DATE - 客户更新日期
     */
    public Date getClientUpdateDate() {
        return clientUpdateDate;
    }

    /**
     * 设置客户更新日期
     *
     * @param clientUpdateDate 客户更新日期
     */
    public void setClientUpdateDate(Date clientUpdateDate) {
        this.clientUpdateDate = clientUpdateDate;
    }

    /**
     * 获取绑定微信返回的openid
     *
     * @return WX_OPENID - 绑定微信返回的openid
     */
    public String getWxOpenid() {
        return wxOpenid;
    }

    /**
     * 设置绑定微信返回的openid
     *
     * @param wxOpenid 绑定微信返回的openid
     */
    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid;
    }

    /**
     * 获取客户信息来源
     *
     * @return INFO_SOURCE - 客户信息来源
     */
    public String getInfoSource() {
        return infoSource;
    }

    /**
     * 设置客户信息来源
     *
     * @param infoSource 客户信息来源
     */
    public void setInfoSource(String infoSource) {
        this.infoSource = infoSource;
    }

    /**
     * 获取当前门店ID（二维码信息）
     *
     * @return ORG_ID - 当前门店ID（二维码信息）
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置当前门店ID（二维码信息）
     *
     * @param orgId 当前门店ID（二维码信息）
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取导购员Id(二维码信息)
     *
     * @return GUIDE_ID - 导购员Id(二维码信息)
     */
    public String getGuideId() {
        return guideId;
    }

    /**
     * 设置导购员Id(二维码信息)
     *
     * @param guideId 导购员Id(二维码信息)
     */
    public void setGuideId(String guideId) {
        this.guideId = guideId;
    }

    /**
     * 获取经销商ID
     *
     * @return DEALER - 经销商ID
     */
    public String getDealer() {
        return dealer;
    }

    /**
     * 设置经销商ID
     *
     * @param dealer 经销商ID
     */
    public void setDealer(String dealer) {
        this.dealer = dealer;
    }

    /**
     * 获取年收入
     *
     * @return ANNUAL_INCOME - 年收入
     */
    public String getAnnualIncome() {
        return annualIncome;
    }

    /**
     * 设置年收入
     *
     * @param annualIncome 年收入
     */
    public void setAnnualIncome(String annualIncome) {
        this.annualIncome = annualIncome;
    }

    /**
     * 获取学历背景(业务字典degree)
     *
     * @return EDUCATION_TYPE - 学历背景(业务字典degree)
     */
    public String getEducationType() {
        return educationType;
    }

    /**
     * 设置学历背景(业务字典degree)
     *
     * @param educationType 学历背景(业务字典degree)
     */
    public void setEducationType(String educationType) {
        this.educationType = educationType;
    }
}