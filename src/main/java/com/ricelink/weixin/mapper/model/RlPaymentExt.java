package com.ricelink.weixin.mapper.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "rl_payment_ext")
public class RlPaymentExt {
    /**
     * 主键ID（收款）
     */
    @Id
    @Column(name = "PAY_ID")
    private String payId;

    /**
     * 交市场方式
     */
    @Column(name = "TURN_MARKET")
    private String turnMarket;

    /**
     * 是否共享
     */
    @Column(name = "WHETHER_SHARE")
    private String whetherShare;

    /**
     * 小票附件（多个）
     */
    @Column(name = "SMALL_TICKET_ACCESSORIES")
    private String smallTicketAccessories;

    /**
     * 手续费
     */
    @Column(name = "COUNTER_FEE")
    private BigDecimal counterFee;

    /**
     * 财务审核人
     */
    @Column(name = "EXECUTIVE_CONFIRMATION")
    private String executiveConfirmation;

    /**
     * 财务确认时间
     */
    @Column(name = "EXECUTION_CONFIRMATION_TIME")
    private Date executionConfirmationTime;

    /**
     * 交款对象ID
     */
    @Column(name = "ACCT_ID")
    private String acctId;

    /**
     * 卖场合同金额
     */
    @Column(name = "SCONTRACT_AMOUNT")
    private BigDecimal scontractAmount;

    /**
     * 财务审核状态(1.待确认，  2.已确认)
     */
    @Column(name = "FINANCE_CHECK_STATUS")
    private String financeCheckStatus;

    /**
     * 财务退回原因
     */
    @Column(name = "FINANCE_CHECK_RESULT")
    private String financeCheckResult;

    /**
     * 交款商户/门店ID/POS机编码
     */
    @Column(name = "SHOP_ID")
    private String shopId;

    /**
     * 交款归属经销商编码
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 交款对象名称
     */
    @Column(name = "ACCT_NAME")
    private String acctName;

    /**
     * 交款对象类型
     */
    @Column(name = "ACCT_TYPE")
    private String acctType;

    /**
     * 付款编号
     */
    @Column(name = "PAY_CODE")
    private String payCode;

    /**
     * 交款市场ID
     */
    @Column(name = "MARKET_ID")
    private String marketId;

    /**
     * 共享小票金额
     */
    @Column(name = "SHARE_SMALL_AMOUNT")
    private BigDecimal shareSmallAmount;

    /**
     * 市场对账金额
     */
    @Column(name = "MARKET_AMOUNT")
    private BigDecimal marketAmount;

    /**
     * 是否扣罚
     */
    @Column(name = "IS_PUNISH")
    private String isPunish;

    /**
     * 创建时间
     */
    @Column(name = "CREATION_DATE")
    private Date creationDate;

    /**
     * 系统来源（0-DMS，1-北京ERP）
     */
    @Column(name = "SYSTEM_SOURCE")
    private Integer systemSource;

    /**
     * 本地附件
     */
    @Column(name = "PAY_PATH")
    private String payPath;

    /**
     * 获取主键ID（收款）
     *
     * @return PAY_ID - 主键ID（收款）
     */
    public String getPayId() {
        return payId;
    }

    /**
     * 设置主键ID（收款）
     *
     * @param payId 主键ID（收款）
     */
    public void setPayId(String payId) {
        this.payId = payId;
    }

    /**
     * 获取交市场方式
     *
     * @return TURN_MARKET - 交市场方式
     */
    public String getTurnMarket() {
        return turnMarket;
    }

    /**
     * 设置交市场方式
     *
     * @param turnMarket 交市场方式
     */
    public void setTurnMarket(String turnMarket) {
        this.turnMarket = turnMarket;
    }

    /**
     * 获取是否共享
     *
     * @return WHETHER_SHARE - 是否共享
     */
    public String getWhetherShare() {
        return whetherShare;
    }

    /**
     * 设置是否共享
     *
     * @param whetherShare 是否共享
     */
    public void setWhetherShare(String whetherShare) {
        this.whetherShare = whetherShare;
    }

    /**
     * 获取小票附件（多个）
     *
     * @return SMALL_TICKET_ACCESSORIES - 小票附件（多个）
     */
    public String getSmallTicketAccessories() {
        return smallTicketAccessories;
    }

    /**
     * 设置小票附件（多个）
     *
     * @param smallTicketAccessories 小票附件（多个）
     */
    public void setSmallTicketAccessories(String smallTicketAccessories) {
        this.smallTicketAccessories = smallTicketAccessories;
    }

    /**
     * 获取手续费
     *
     * @return COUNTER_FEE - 手续费
     */
    public BigDecimal getCounterFee() {
        return counterFee;
    }

    /**
     * 设置手续费
     *
     * @param counterFee 手续费
     */
    public void setCounterFee(BigDecimal counterFee) {
        this.counterFee = counterFee;
    }

    /**
     * 获取财务审核人
     *
     * @return EXECUTIVE_CONFIRMATION - 财务审核人
     */
    public String getExecutiveConfirmation() {
        return executiveConfirmation;
    }

    /**
     * 设置财务审核人
     *
     * @param executiveConfirmation 财务审核人
     */
    public void setExecutiveConfirmation(String executiveConfirmation) {
        this.executiveConfirmation = executiveConfirmation;
    }

    /**
     * 获取财务确认时间
     *
     * @return EXECUTION_CONFIRMATION_TIME - 财务确认时间
     */
    public Date getExecutionConfirmationTime() {
        return executionConfirmationTime;
    }

    /**
     * 设置财务确认时间
     *
     * @param executionConfirmationTime 财务确认时间
     */
    public void setExecutionConfirmationTime(Date executionConfirmationTime) {
        this.executionConfirmationTime = executionConfirmationTime;
    }

    /**
     * 获取交款对象ID
     *
     * @return ACCT_ID - 交款对象ID
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * 设置交款对象ID
     *
     * @param acctId 交款对象ID
     */
    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    /**
     * 获取卖场合同金额
     *
     * @return SCONTRACT_AMOUNT - 卖场合同金额
     */
    public BigDecimal getScontractAmount() {
        return scontractAmount;
    }

    /**
     * 设置卖场合同金额
     *
     * @param scontractAmount 卖场合同金额
     */
    public void setScontractAmount(BigDecimal scontractAmount) {
        this.scontractAmount = scontractAmount;
    }

    /**
     * 获取财务审核状态(1.待确认，  2.已确认)
     *
     * @return FINANCE_CHECK_STATUS - 财务审核状态(1.待确认，  2.已确认)
     */
    public String getFinanceCheckStatus() {
        return financeCheckStatus;
    }

    /**
     * 设置财务审核状态(1.待确认，  2.已确认)
     *
     * @param financeCheckStatus 财务审核状态(1.待确认，  2.已确认)
     */
    public void setFinanceCheckStatus(String financeCheckStatus) {
        this.financeCheckStatus = financeCheckStatus;
    }

    /**
     * 获取财务退回原因
     *
     * @return FINANCE_CHECK_RESULT - 财务退回原因
     */
    public String getFinanceCheckResult() {
        return financeCheckResult;
    }

    /**
     * 设置财务退回原因
     *
     * @param financeCheckResult 财务退回原因
     */
    public void setFinanceCheckResult(String financeCheckResult) {
        this.financeCheckResult = financeCheckResult;
    }

    /**
     * 获取交款商户/门店ID/POS机编码
     *
     * @return SHOP_ID - 交款商户/门店ID/POS机编码
     */
    public String getShopId() {
        return shopId;
    }

    /**
     * 设置交款商户/门店ID/POS机编码
     *
     * @param shopId 交款商户/门店ID/POS机编码
     */
    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    /**
     * 获取交款归属经销商编码
     *
     * @return ORG_ID - 交款归属经销商编码
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置交款归属经销商编码
     *
     * @param orgId 交款归属经销商编码
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取交款对象名称
     *
     * @return ACCT_NAME - 交款对象名称
     */
    public String getAcctName() {
        return acctName;
    }

    /**
     * 设置交款对象名称
     *
     * @param acctName 交款对象名称
     */
    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    /**
     * 获取交款对象类型
     *
     * @return ACCT_TYPE - 交款对象类型
     */
    public String getAcctType() {
        return acctType;
    }

    /**
     * 设置交款对象类型
     *
     * @param acctType 交款对象类型
     */
    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    /**
     * 获取付款编号
     *
     * @return PAY_CODE - 付款编号
     */
    public String getPayCode() {
        return payCode;
    }

    /**
     * 设置付款编号
     *
     * @param payCode 付款编号
     */
    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    /**
     * 获取交款市场ID
     *
     * @return MARKET_ID - 交款市场ID
     */
    public String getMarketId() {
        return marketId;
    }

    /**
     * 设置交款市场ID
     *
     * @param marketId 交款市场ID
     */
    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    /**
     * 获取共享小票金额
     *
     * @return SHARE_SMALL_AMOUNT - 共享小票金额
     */
    public BigDecimal getShareSmallAmount() {
        return shareSmallAmount;
    }

    /**
     * 设置共享小票金额
     *
     * @param shareSmallAmount 共享小票金额
     */
    public void setShareSmallAmount(BigDecimal shareSmallAmount) {
        this.shareSmallAmount = shareSmallAmount;
    }

    /**
     * 获取市场对账金额
     *
     * @return MARKET_AMOUNT - 市场对账金额
     */
    public BigDecimal getMarketAmount() {
        return marketAmount;
    }

    /**
     * 设置市场对账金额
     *
     * @param marketAmount 市场对账金额
     */
    public void setMarketAmount(BigDecimal marketAmount) {
        this.marketAmount = marketAmount;
    }

    /**
     * 获取是否扣罚
     *
     * @return IS_PUNISH - 是否扣罚
     */
    public String getIsPunish() {
        return isPunish;
    }

    /**
     * 设置是否扣罚
     *
     * @param isPunish 是否扣罚
     */
    public void setIsPunish(String isPunish) {
        this.isPunish = isPunish;
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
     * 获取系统来源（0-DMS，1-北京ERP）
     *
     * @return SYSTEM_SOURCE - 系统来源（0-DMS，1-北京ERP）
     */
    public Integer getSystemSource() {
        return systemSource;
    }

    /**
     * 设置系统来源（0-DMS，1-北京ERP）
     *
     * @param systemSource 系统来源（0-DMS，1-北京ERP）
     */
    public void setSystemSource(Integer systemSource) {
        this.systemSource = systemSource;
    }

    /**
     * 获取本地附件
     *
     * @return PAY_PATH - 本地附件
     */
    public String getPayPath() {
        return payPath;
    }

    /**
     * 设置本地附件
     *
     * @param payPath 本地附件
     */
    public void setPayPath(String payPath) {
        this.payPath = payPath;
    }
}