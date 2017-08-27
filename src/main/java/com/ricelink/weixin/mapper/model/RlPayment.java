package com.ricelink.weixin.mapper.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "rl_payment")
public class RlPayment {
    /**
     * 主键
     */
    @Id
    @Column(name = "PAY_ID")
    @GeneratedValue(generator = "UUID")
    private String payId;

    /**
     * 商机ID
     */
    @Column(name = "OPTY_ID")
    private String optyId;

    /**
     * 付款类型
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * 收款金额
     */
    @Column(name = "AMOUNT")
    private BigDecimal amount;

    /**
     * 收款人
     */
    @Column(name = "RECEIVER")
    private String receiver;

    /**
     * 付款方式
     */
    @Column(name = "PAY_WAY")
    private String payWay;

    /**
     * 付款时间
     */
    @Column(name = "PAY_TIME")
    private Date payTime;

    /**
     * 状态
     */
    @Column(name = "STATUS")
    private String status;

    /**
     * 备注
     */
    @Column(name = "COMMENTS")
    private String comments;

    /**
     * 付款凭证资源ID
     */
    @Column(name = "PAY_VOU_ID")
    private String payVouId;

    /**
     * 付款凭证号
     */
    @Column(name = "PAY_VOU_NO")
    private String payVouNo;

    /**
     * 恒大劵号
     */
    @Column(name = "HD_COUPON_NUMBER")
    private String hdCouponNumber;

    /**
     * 创建者ID
     */
    @Column(name = "CREATED_BY")
    private String createdBy;

    /**
     * 创建日期
     */
    @Column(name = "CREATION_DATE")
    private Date creationDate;

    /**
     * 最后更新者
     */
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;

    /**
     * 最后更新日期
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
     * 获取主键
     *
     * @return PAY_ID - 主键
     */
    public String getPayId() {
        return payId;
    }

    /**
     * 设置主键
     *
     * @param payId 主键
     */
    public void setPayId(String payId) {
        this.payId = payId;
    }

    /**
     * 获取商机ID
     *
     * @return OPTY_ID - 商机ID
     */
    public String getOptyId() {
        return optyId;
    }

    /**
     * 设置商机ID
     *
     * @param optyId 商机ID
     */
    public void setOptyId(String optyId) {
        this.optyId = optyId;
    }

    /**
     * 获取付款类型
     *
     * @return TYPE - 付款类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置付款类型
     *
     * @param type 付款类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取收款金额
     *
     * @return AMOUNT - 收款金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置收款金额
     *
     * @param amount 收款金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取收款人
     *
     * @return RECEIVER - 收款人
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * 设置收款人
     *
     * @param receiver 收款人
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    /**
     * 获取付款方式
     *
     * @return PAY_WAY - 付款方式
     */
    public String getPayWay() {
        return payWay;
    }

    /**
     * 设置付款方式
     *
     * @param payWay 付款方式
     */
    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    /**
     * 获取付款时间
     *
     * @return PAY_TIME - 付款时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置付款时间
     *
     * @param payTime 付款时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取状态
     *
     * @return STATUS - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取备注
     *
     * @return COMMENTS - 备注
     */
    public String getComments() {
        return comments;
    }

    /**
     * 设置备注
     *
     * @param comments 备注
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * 获取付款凭证资源ID
     *
     * @return PAY_VOU_ID - 付款凭证资源ID
     */
    public String getPayVouId() {
        return payVouId;
    }

    /**
     * 设置付款凭证资源ID
     *
     * @param payVouId 付款凭证资源ID
     */
    public void setPayVouId(String payVouId) {
        this.payVouId = payVouId;
    }

    /**
     * 获取付款凭证号
     *
     * @return PAY_VOU_NO - 付款凭证号
     */
    public String getPayVouNo() {
        return payVouNo;
    }

    /**
     * 设置付款凭证号
     *
     * @param payVouNo 付款凭证号
     */
    public void setPayVouNo(String payVouNo) {
        this.payVouNo = payVouNo;
    }

    /**
     * 获取恒大劵号
     *
     * @return HD_COUPON_NUMBER - 恒大劵号
     */
    public String getHdCouponNumber() {
        return hdCouponNumber;
    }

    /**
     * 设置恒大劵号
     *
     * @param hdCouponNumber 恒大劵号
     */
    public void setHdCouponNumber(String hdCouponNumber) {
        this.hdCouponNumber = hdCouponNumber;
    }

    /**
     * 获取创建者ID
     *
     * @return CREATED_BY - 创建者ID
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置创建者ID
     *
     * @param createdBy 创建者ID
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
     * 获取最后更新者
     *
     * @return LAST_UPDATED_BY - 最后更新者
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * 设置最后更新者
     *
     * @param lastUpdatedBy 最后更新者
     */
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * 获取最后更新日期
     *
     * @return LAST_UPDATE_DATE - 最后更新日期
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * 设置最后更新日期
     *
     * @param lastUpdateDate 最后更新日期
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
}