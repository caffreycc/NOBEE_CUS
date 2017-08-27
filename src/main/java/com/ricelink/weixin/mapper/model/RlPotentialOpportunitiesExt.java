package com.ricelink.weixin.mapper.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "rl_potential_opportunities_ext")
public class RlPotentialOpportunitiesExt {
    /**
     * 商机ID
     */
    @Id
    @Column(name = "OPPORTUNITY_ID")
    @GeneratedValue(generator = "UUID")
    private String opportunityId;

    /**
     * 集客人
     */
    @Column(name = "CUSTOMER_MANAGER")
    private String customerManager;

    /**
     * 接收人
     */
    @Column(name = "CUSTOMER_RECEIVER")
    private String customerReceiver;

    /**
     * 指派状态
     */
    @Column(name = "ASSIGN_STATUS")
    private String assignStatus;

    /**
     * 是否总部推送的电商潜客信息
     */
    @Column(name = "IS_HEADQUARTERS")
    private String isHeadquarters;

    /**
     * 是否已分配电商潜客信息
     */
    @Column(name = "IS_ALLOT")
    private String isAllot;

    /**
     * 创建时间
     */
    @Column(name = "CREATION_DATE")
    private Date creationDate;

    /**
     * 所属销售纵队
     */
    @Column(name = "COLUMN_SALE")
    private String columnSale;

    @Column(name = "IS_VALID")
    private String isValid;

    @Column(name = "ASSIGN_DEPARTMENT")
    private String assignDepartment;

    /**
     * 指派时间
     */
    @Column(name = "ASSIGN_TIME")
    private Date assignTime;

    @Column(name = "RECEIVE_TIME")
    private Date receiveTime;

    @Column(name = "BJ_LAST_TIME")
    private Date bjLastTime;

    /**
     * 沟通次数
     */
    @Column(name = "CONTACT_COUNT")
    private Integer contactCount;

    @Column(name = "NEXT_CONTACT_TIME")
    private Date nextContactTime;

    @Column(name = "CONTACT_DETAIL")
    private String contactDetail;

    /**
     * 最近标记无效的操作人
     */
    @Column(name = "BJ_LAST_OPERATOR")
    private String bjLastOperator;

    /**
     * 订单类型
     */
    @Column(name = "ORDER_TYPE_NUM")
    private String orderTypeNum;

    /**
     * 推荐人
     */
    @Column(name = "CUSTOMER_REFERRER")
    private String customerReferrer;

    /**
     * 创建人所属组织
     */
    @Column(name = "ORG_ID")
    private String orgId;

    @Column(name = "TOOL_ID")
    private String toolId;

    /**
     * 安装区域ID
     */
    @Column(name = "AZ_REA_ID")
    private String azReaId;

    /**
     * 指派人
     */
    @Column(name = "ASSIGN_BY")
    private String assignBy;

    @Column(name = "CHANNEL_ID")
    private String channelId;

    /**
     * 是否老客户介绍(1.是2.否)
     */
    @Column(name = "IS_INTRODUCE")
    private String isIntroduce;

    /**
     * 沟通工具
     */
    @Column(name = "COMMUNICATOR")
    private String communicator;

    /**
     * 投放设备
     */
    @Column(name = "LAUNCH_EQUIPMENT")
    private String launchEquipment;

    /**
     * 电商预约码
     */
    @Column(name = "APPOINTMENT_NUMBER")
    private String appointmentNumber;

    /**
     * 品牌
     */
    @Column(name = "BRAND")
    private String brand;

    /**
     * 介绍备注
     */
    @Column(name = "INTRODUCE_DETAIL")
    private String introduceDetail;

    /**
     * 合作方
     */
    @Column(name = "COOPERATOR")
    private String cooperator;

    /**
     * 装修状态
     */
    @Column(name = "DECORATION_STATUS")
    private String decorationStatus;

    /**
     * 是否预测量
     */
    @Column(name = "IS_MEASURE")
    private String isMeasure;

    /**
     * 渠道客户审批状态(1.审批中,2.审批通过,3.审批不通过,4.退回修改)
     */
    @Column(name = "CHANNEL_STATUS")
    private String channelStatus;

    /**
     * 附件ID
     */
    @Column(name = "ATTACHMENT_ID")
    private String attachmentId;

    /**
     * 老客户带单关系
     */
    @Column(name = "CUSTOMER_THIRD")
    private String customerThird;

    /**
     * 是否送礼
     */
    @Column(name = "SEND_GIFT")
    private String sendGift;

    /**
     * 礼物
     */
    @Column(name = "GIFT")
    private String gift;

    /**
     * 审批专员审批状态(1.批准,2.否决,3.发起人修改)
     */
    @Column(name = "COMMISSIONER_APPROVE_STATUS")
    private String commissionerApproveStatus;

    /**
     * 经理审批状态(1.批准2.否决3.发起人修改)
     */
    @Column(name = "MANAGER_APPROVE_STATUS")
    private String managerApproveStatus;

    /**
     * 意向收款方法
     */
    @Column(name = "WANT_COL_MTHD")
    private Integer wantColMthd;

    /**
     * 获取商机ID
     *
     * @return OPPORTUNITY_ID - 商机ID
     */
    public String getOpportunityId() {
        return opportunityId;
    }

    /**
     * 设置商机ID
     *
     * @param opportunityId 商机ID
     */
    public void setOpportunityId(String opportunityId) {
        this.opportunityId = opportunityId;
    }

    /**
     * 获取集客人
     *
     * @return CUSTOMER_MANAGER - 集客人
     */
    public String getCustomerManager() {
        return customerManager;
    }

    /**
     * 设置集客人
     *
     * @param customerManager 集客人
     */
    public void setCustomerManager(String customerManager) {
        this.customerManager = customerManager;
    }

    /**
     * 获取接收人
     *
     * @return CUSTOMER_RECEIVER - 接收人
     */
    public String getCustomerReceiver() {
        return customerReceiver;
    }

    /**
     * 设置接收人
     *
     * @param customerReceiver 接收人
     */
    public void setCustomerReceiver(String customerReceiver) {
        this.customerReceiver = customerReceiver;
    }

    /**
     * 获取指派状态
     *
     * @return ASSIGN_STATUS - 指派状态
     */
    public String getAssignStatus() {
        return assignStatus;
    }

    /**
     * 设置指派状态
     *
     * @param assignStatus 指派状态
     */
    public void setAssignStatus(String assignStatus) {
        this.assignStatus = assignStatus;
    }

    /**
     * 获取是否总部推送的电商潜客信息
     *
     * @return IS_HEADQUARTERS - 是否总部推送的电商潜客信息
     */
    public String getIsHeadquarters() {
        return isHeadquarters;
    }

    /**
     * 设置是否总部推送的电商潜客信息
     *
     * @param isHeadquarters 是否总部推送的电商潜客信息
     */
    public void setIsHeadquarters(String isHeadquarters) {
        this.isHeadquarters = isHeadquarters;
    }

    /**
     * 获取是否已分配电商潜客信息
     *
     * @return IS_ALLOT - 是否已分配电商潜客信息
     */
    public String getIsAllot() {
        return isAllot;
    }

    /**
     * 设置是否已分配电商潜客信息
     *
     * @param isAllot 是否已分配电商潜客信息
     */
    public void setIsAllot(String isAllot) {
        this.isAllot = isAllot;
    }

    /**
     * 获取创建时间
     *
     * @return CREATION_DATE - 创建时间
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * 设置创建时间
     *
     * @param creationDate 创建时间
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * 获取所属销售纵队
     *
     * @return COLUMN_SALE - 所属销售纵队
     */
    public String getColumnSale() {
        return columnSale;
    }

    /**
     * 设置所属销售纵队
     *
     * @param columnSale 所属销售纵队
     */
    public void setColumnSale(String columnSale) {
        this.columnSale = columnSale;
    }

    /**
     * @return IS_VALID
     */
    public String getIsValid() {
        return isValid;
    }

    /**
     * @param isValid
     */
    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    /**
     * @return ASSIGN_DEPARTMENT
     */
    public String getAssignDepartment() {
        return assignDepartment;
    }

    /**
     * @param assignDepartment
     */
    public void setAssignDepartment(String assignDepartment) {
        this.assignDepartment = assignDepartment;
    }

    /**
     * 获取指派时间
     *
     * @return ASSIGN_TIME - 指派时间
     */
    public Date getAssignTime() {
        return assignTime;
    }

    /**
     * 设置指派时间
     *
     * @param assignTime 指派时间
     */
    public void setAssignTime(Date assignTime) {
        this.assignTime = assignTime;
    }

    /**
     * @return RECEIVE_TIME
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * @param receiveTime
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * @return BJ_LAST_TIME
     */
    public Date getBjLastTime() {
        return bjLastTime;
    }

    /**
     * @param bjLastTime
     */
    public void setBjLastTime(Date bjLastTime) {
        this.bjLastTime = bjLastTime;
    }

    /**
     * 获取沟通次数
     *
     * @return CONTACT_COUNT - 沟通次数
     */
    public Integer getContactCount() {
        return contactCount;
    }

    /**
     * 设置沟通次数
     *
     * @param contactCount 沟通次数
     */
    public void setContactCount(Integer contactCount) {
        this.contactCount = contactCount;
    }

    /**
     * @return NEXT_CONTACT_TIME
     */
    public Date getNextContactTime() {
        return nextContactTime;
    }

    /**
     * @param nextContactTime
     */
    public void setNextContactTime(Date nextContactTime) {
        this.nextContactTime = nextContactTime;
    }

    /**
     * @return CONTACT_DETAIL
     */
    public String getContactDetail() {
        return contactDetail;
    }

    /**
     * @param contactDetail
     */
    public void setContactDetail(String contactDetail) {
        this.contactDetail = contactDetail;
    }

    /**
     * 获取最近标记无效的操作人
     *
     * @return BJ_LAST_OPERATOR - 最近标记无效的操作人
     */
    public String getBjLastOperator() {
        return bjLastOperator;
    }

    /**
     * 设置最近标记无效的操作人
     *
     * @param bjLastOperator 最近标记无效的操作人
     */
    public void setBjLastOperator(String bjLastOperator) {
        this.bjLastOperator = bjLastOperator;
    }

    /**
     * 获取订单类型
     *
     * @return ORDER_TYPE_NUM - 订单类型
     */
    public String getOrderTypeNum() {
        return orderTypeNum;
    }

    /**
     * 设置订单类型
     *
     * @param orderTypeNum 订单类型
     */
    public void setOrderTypeNum(String orderTypeNum) {
        this.orderTypeNum = orderTypeNum;
    }

    /**
     * 获取推荐人
     *
     * @return CUSTOMER_REFERRER - 推荐人
     */
    public String getCustomerReferrer() {
        return customerReferrer;
    }

    /**
     * 设置推荐人
     *
     * @param customerReferrer 推荐人
     */
    public void setCustomerReferrer(String customerReferrer) {
        this.customerReferrer = customerReferrer;
    }

    /**
     * 获取创建人所属组织
     *
     * @return ORG_ID - 创建人所属组织
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置创建人所属组织
     *
     * @param orgId 创建人所属组织
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * @return TOOL_ID
     */
    public String getToolId() {
        return toolId;
    }

    /**
     * @param toolId
     */
    public void setToolId(String toolId) {
        this.toolId = toolId;
    }

    /**
     * 获取安装区域ID
     *
     * @return AZ_REA_ID - 安装区域ID
     */
    public String getAzReaId() {
        return azReaId;
    }

    /**
     * 设置安装区域ID
     *
     * @param azReaId 安装区域ID
     */
    public void setAzReaId(String azReaId) {
        this.azReaId = azReaId;
    }

    /**
     * 获取指派人
     *
     * @return ASSIGN_BY - 指派人
     */
    public String getAssignBy() {
        return assignBy;
    }

    /**
     * 设置指派人
     *
     * @param assignBy 指派人
     */
    public void setAssignBy(String assignBy) {
        this.assignBy = assignBy;
    }

    /**
     * @return CHANNEL_ID
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * @param channelId
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * 获取是否老客户介绍(1.是2.否)
     *
     * @return IS_INTRODUCE - 是否老客户介绍(1.是2.否)
     */
    public String getIsIntroduce() {
        return isIntroduce;
    }

    /**
     * 设置是否老客户介绍(1.是2.否)
     *
     * @param isIntroduce 是否老客户介绍(1.是2.否)
     */
    public void setIsIntroduce(String isIntroduce) {
        this.isIntroduce = isIntroduce;
    }

    /**
     * 获取沟通工具
     *
     * @return COMMUNICATOR - 沟通工具
     */
    public String getCommunicator() {
        return communicator;
    }

    /**
     * 设置沟通工具
     *
     * @param communicator 沟通工具
     */
    public void setCommunicator(String communicator) {
        this.communicator = communicator;
    }

    /**
     * 获取投放设备
     *
     * @return LAUNCH_EQUIPMENT - 投放设备
     */
    public String getLaunchEquipment() {
        return launchEquipment;
    }

    /**
     * 设置投放设备
     *
     * @param launchEquipment 投放设备
     */
    public void setLaunchEquipment(String launchEquipment) {
        this.launchEquipment = launchEquipment;
    }

    /**
     * 获取电商预约码
     *
     * @return APPOINTMENT_NUMBER - 电商预约码
     */
    public String getAppointmentNumber() {
        return appointmentNumber;
    }

    /**
     * 设置电商预约码
     *
     * @param appointmentNumber 电商预约码
     */
    public void setAppointmentNumber(String appointmentNumber) {
        this.appointmentNumber = appointmentNumber;
    }

    /**
     * 获取品牌
     *
     * @return BRAND - 品牌
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置品牌
     *
     * @param brand 品牌
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取介绍备注
     *
     * @return INTRODUCE_DETAIL - 介绍备注
     */
    public String getIntroduceDetail() {
        return introduceDetail;
    }

    /**
     * 设置介绍备注
     *
     * @param introduceDetail 介绍备注
     */
    public void setIntroduceDetail(String introduceDetail) {
        this.introduceDetail = introduceDetail;
    }

    /**
     * 获取合作方
     *
     * @return COOPERATOR - 合作方
     */
    public String getCooperator() {
        return cooperator;
    }

    /**
     * 设置合作方
     *
     * @param cooperator 合作方
     */
    public void setCooperator(String cooperator) {
        this.cooperator = cooperator;
    }

    /**
     * 获取装修状态
     *
     * @return DECORATION_STATUS - 装修状态
     */
    public String getDecorationStatus() {
        return decorationStatus;
    }

    /**
     * 设置装修状态
     *
     * @param decorationStatus 装修状态
     */
    public void setDecorationStatus(String decorationStatus) {
        this.decorationStatus = decorationStatus;
    }

    /**
     * 获取是否预测量
     *
     * @return IS_MEASURE - 是否预测量
     */
    public String getIsMeasure() {
        return isMeasure;
    }

    /**
     * 设置是否预测量
     *
     * @param isMeasure 是否预测量
     */
    public void setIsMeasure(String isMeasure) {
        this.isMeasure = isMeasure;
    }

    /**
     * 获取渠道客户审批状态(1.审批中,2.审批通过,3.审批不通过,4.退回修改)
     *
     * @return CHANNEL_STATUS - 渠道客户审批状态(1.审批中,2.审批通过,3.审批不通过,4.退回修改)
     */
    public String getChannelStatus() {
        return channelStatus;
    }

    /**
     * 设置渠道客户审批状态(1.审批中,2.审批通过,3.审批不通过,4.退回修改)
     *
     * @param channelStatus 渠道客户审批状态(1.审批中,2.审批通过,3.审批不通过,4.退回修改)
     */
    public void setChannelStatus(String channelStatus) {
        this.channelStatus = channelStatus;
    }

    /**
     * 获取附件ID
     *
     * @return ATTACHMENT_ID - 附件ID
     */
    public String getAttachmentId() {
        return attachmentId;
    }

    /**
     * 设置附件ID
     *
     * @param attachmentId 附件ID
     */
    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    /**
     * 获取老客户带单关系
     *
     * @return CUSTOMER_THIRD - 老客户带单关系
     */
    public String getCustomerThird() {
        return customerThird;
    }

    /**
     * 设置老客户带单关系
     *
     * @param customerThird 老客户带单关系
     */
    public void setCustomerThird(String customerThird) {
        this.customerThird = customerThird;
    }

    /**
     * 获取是否送礼
     *
     * @return SEND_GIFT - 是否送礼
     */
    public String getSendGift() {
        return sendGift;
    }

    /**
     * 设置是否送礼
     *
     * @param sendGift 是否送礼
     */
    public void setSendGift(String sendGift) {
        this.sendGift = sendGift;
    }

    /**
     * 获取礼物
     *
     * @return GIFT - 礼物
     */
    public String getGift() {
        return gift;
    }

    /**
     * 设置礼物
     *
     * @param gift 礼物
     */
    public void setGift(String gift) {
        this.gift = gift;
    }

    /**
     * 获取审批专员审批状态(1.批准,2.否决,3.发起人修改)
     *
     * @return COMMISSIONER_APPROVE_STATUS - 审批专员审批状态(1.批准,2.否决,3.发起人修改)
     */
    public String getCommissionerApproveStatus() {
        return commissionerApproveStatus;
    }

    /**
     * 设置审批专员审批状态(1.批准,2.否决,3.发起人修改)
     *
     * @param commissionerApproveStatus 审批专员审批状态(1.批准,2.否决,3.发起人修改)
     */
    public void setCommissionerApproveStatus(String commissionerApproveStatus) {
        this.commissionerApproveStatus = commissionerApproveStatus;
    }

    /**
     * 获取经理审批状态(1.批准2.否决3.发起人修改)
     *
     * @return MANAGER_APPROVE_STATUS - 经理审批状态(1.批准2.否决3.发起人修改)
     */
    public String getManagerApproveStatus() {
        return managerApproveStatus;
    }

    /**
     * 设置经理审批状态(1.批准2.否决3.发起人修改)
     *
     * @param managerApproveStatus 经理审批状态(1.批准2.否决3.发起人修改)
     */
    public void setManagerApproveStatus(String managerApproveStatus) {
        this.managerApproveStatus = managerApproveStatus;
    }

    /**
     * 获取意向收款方法
     *
     * @return WANT_COL_MTHD - 意向收款方法
     */
    public Integer getWantColMthd() {
        return wantColMthd;
    }

    /**
     * 设置意向收款方法
     *
     * @param wantColMthd 意向收款方法
     */
    public void setWantColMthd(Integer wantColMthd) {
        this.wantColMthd = wantColMthd;
    }
}