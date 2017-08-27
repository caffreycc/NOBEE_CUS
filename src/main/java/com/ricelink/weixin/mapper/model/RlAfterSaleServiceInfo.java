package com.ricelink.weixin.mapper.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.ricelink.weixin.utils.MyDateDeserializer;

import javax.persistence.*;
import java.util.Date;

@Table(name = "rl_after_sale_service_info")
public class RlAfterSaleServiceInfo {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "UUID")
    private String id;

    /**
     * 售后服务单编号
     */
    @Column(name = "ASS_ID")
    private String assId;

    /**
     * 商机编号
     */
    @Column(name = "ORDER_ID")
    private String orderId;

    /**
     * 客户姓名
     */
    @Column(name = "CUSTOMER_NAME")
    private String customerName;

    /**
     * 客户电话
     */
    @Column(name = "CUSTOMER_TEL")
    private String customerTel;

    /**
     * 客户地址
     */
    @Column(name = "CUSTOMER_ADDRESS")
    private String customerAddress;

    /**
     * 经销商ID
     */
    @Column(name = "DEALER_ID")
    private String dealerId;

    /**
     * 是否由客户发起
     */
    @Column(name = "IS_CUS_START")
    private String isCusStart;

    /**
     * 是否需要维修
     */
    @Column(name = "IS_NEEN_REPAIR")
    private String isNeenRepair;

    /**
     * 解决时间
     */
    @Column(name = "PROCESS_TIME")
    private Date processTime;

    /**
     * 处理部门
     */
    @Column(name = "PROCESS_DEPARTMENT_NAME")
    private String processDepartmentName;

    /**
     * 人工费
     */
    @Column(name = "LABORCOST")
    private Double laborcost;

    /**
     * 是否解决
     */
    @Column(name = "IS_SOLVE")
    private String isSolve;

    /**
     * 创建人
     */
    @Column(name = "CREATE_BY")
    private String createBy;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_DATE")
    private Date createDate;

    /**
     * 期望解决时间
     */
    @JsonDeserialize(using = MyDateDeserializer.class)
    @Column(name = "EXPECT_TIME")
    private Date expectTime;

    /**
     * 交单人
     */
    @Column(name = "FINISH_BY")
    private String finishBy;

    /**
     * 交单时间
     */
    @Column(name = "FINISH_DATE")
    private Date finishDate;

    /**
     * 问题描述
     */
    @Column(name = "PROBLEM_DESCRIBE")
    private String problemDescribe;

    /**
     * 解决方案
     */
    @Column(name = "PROCESS_METHOD")
    private String processMethod;

    /**
     * 责任描述
     */
    @Column(name = "LIABLE_DESCRIBE")
    private String liableDescribe;

    /**
     * 获取主键
     *
     * @return ID - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取售后服务单编号
     *
     * @return ASS_ID - 售后服务单编号
     */
    public String getAssId() {
        return assId;
    }

    /**
     * 设置售后服务单编号
     *
     * @param assId 售后服务单编号
     */
    public void setAssId(String assId) {
        this.assId = assId;
    }

    /**
     * 获取商机编号
     *
     * @return ORDER_ID - 商机编号
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置商机编号
     *
     * @param orderId 商机编号
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取客户姓名
     *
     * @return CUSTOMER_NAME - 客户姓名
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 设置客户姓名
     *
     * @param customerName 客户姓名
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * 获取客户电话
     *
     * @return CUSTOMER_TEL - 客户电话
     */
    public String getCustomerTel() {
        return customerTel;
    }

    /**
     * 设置客户电话
     *
     * @param customerTel 客户电话
     */
    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel;
    }

    /**
     * 获取客户地址
     *
     * @return CUSTOMER_ADDRESS - 客户地址
     */
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * 设置客户地址
     *
     * @param customerAddress 客户地址
     */
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    /**
     * 获取经销商ID
     *
     * @return DEALER_ID - 经销商ID
     */
    public String getDealerId() {
        return dealerId;
    }

    /**
     * 设置经销商ID
     *
     * @param dealerId 经销商ID
     */
    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    /**
     * 获取是否由客户发起
     *
     * @return IS_CUS_START - 是否由客户发起
     */
    public String getIsCusStart() {
        return isCusStart;
    }

    /**
     * 设置是否由客户发起
     *
     * @param isCusStart 是否由客户发起
     */
    public void setIsCusStart(String isCusStart) {
        this.isCusStart = isCusStart;
    }

    /**
     * 获取是否需要维修
     *
     * @return IS_NEEN_REPAIR - 是否需要维修
     */
    public String getIsNeenRepair() {
        return isNeenRepair;
    }

    /**
     * 设置是否需要维修
     *
     * @param isNeenRepair 是否需要维修
     */
    public void setIsNeenRepair(String isNeenRepair) {
        this.isNeenRepair = isNeenRepair;
    }

    /**
     * 获取解决时间
     *
     * @return PROCESS_TIME - 解决时间
     */
    public Date getProcessTime() {
        return processTime;
    }

    /**
     * 设置解决时间
     *
     * @param processTime 解决时间
     */
    public void setProcessTime(Date processTime) {
        this.processTime = processTime;
    }

    /**
     * 获取处理部门
     *
     * @return PROCESS_DEPARTMENT_NAME - 处理部门
     */
    public String getProcessDepartmentName() {
        return processDepartmentName;
    }

    /**
     * 设置处理部门
     *
     * @param processDepartmentName 处理部门
     */
    public void setProcessDepartmentName(String processDepartmentName) {
        this.processDepartmentName = processDepartmentName;
    }

    /**
     * 获取人工费
     *
     * @return LABORCOST - 人工费
     */
    public Double getLaborcost() {
        return laborcost;
    }

    /**
     * 设置人工费
     *
     * @param laborcost 人工费
     */
    public void setLaborcost(Double laborcost) {
        this.laborcost = laborcost;
    }

    /**
     * 获取是否解决
     *
     * @return IS_SOLVE - 是否解决
     */
    public String getIsSolve() {
        return isSolve;
    }

    /**
     * 设置是否解决
     *
     * @param isSolve 是否解决
     */
    public void setIsSolve(String isSolve) {
        this.isSolve = isSolve;
    }

    /**
     * 获取创建人
     *
     * @return CREATE_BY - 创建人
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人
     *
     * @param createBy 创建人
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_DATE - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取期望解决时间
     *
     * @return EXPECT_TIME - 期望解决时间
     */
    public Date getExpectTime() {
        return expectTime;
    }

    /**
     * 设置期望解决时间
     *
     * @param expectTime 期望解决时间
     */
    public void setExpectTime(Date expectTime) {
        this.expectTime = expectTime;
    }

    /**
     * 获取交单人
     *
     * @return FINISH_BY - 交单人
     */
    public String getFinishBy() {
        return finishBy;
    }

    /**
     * 设置交单人
     *
     * @param finishBy 交单人
     */
    public void setFinishBy(String finishBy) {
        this.finishBy = finishBy;
    }

    /**
     * 获取交单时间
     *
     * @return FINISH_DATE - 交单时间
     */
    public Date getFinishDate() {
        return finishDate;
    }

    /**
     * 设置交单时间
     *
     * @param finishDate 交单时间
     */
    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    /**
     * 获取问题描述
     *
     * @return PROBLEM_DESCRIBE - 问题描述
     */
    public String getProblemDescribe() {
        return problemDescribe;
    }

    /**
     * 设置问题描述
     *
     * @param problemDescribe 问题描述
     */
    public void setProblemDescribe(String problemDescribe) {
        this.problemDescribe = problemDescribe;
    }

    /**
     * 获取解决方案
     *
     * @return PROCESS_METHOD - 解决方案
     */
    public String getProcessMethod() {
        return processMethod;
    }

    /**
     * 设置解决方案
     *
     * @param processMethod 解决方案
     */
    public void setProcessMethod(String processMethod) {
        this.processMethod = processMethod;
    }

    /**
     * 获取责任描述
     *
     * @return LIABLE_DESCRIBE - 责任描述
     */
    public String getLiableDescribe() {
        return liableDescribe;
    }

    /**
     * 设置责任描述
     *
     * @param liableDescribe 责任描述
     */
    public void setLiableDescribe(String liableDescribe) {
        this.liableDescribe = liableDescribe;
    }


}