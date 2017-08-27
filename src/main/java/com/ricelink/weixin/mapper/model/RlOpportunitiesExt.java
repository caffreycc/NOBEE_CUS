package com.ricelink.weixin.mapper.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "rl_opportunities_ext")
public class RlOpportunitiesExt {
    /**
     * 商机ID
     */
    @Id
    @Column(name = "OPPORTUNITY_ID")
    @GeneratedValue(generator = "UUID")
    private String opportunityId;

    /**
     * 所属销售纵队
     */
    @Column(name = "COLUMN_ID")
    private String columnId;

    /**
     * 所属设计纵队
     */
    @Column(name = "COLUMN_DESIGN")
    private String columnDesign;

    /**
     * 紧急度
     */
    @Column(name = "ORDER_PRIORITY_CODE")
    private String orderPriorityCode;

    /**
     * 带单类型
     */
    @Column(name = "LEAD_TYPE")
    private String leadType;

    /**
     * 审图负责人
     */
    @Column(name = "DRAW_MANAGER")
    private String drawManager;

    /**
     * 生产确认时间
     */
    @Column(name = "PRODUCE_PLAN_TIME")
    private Date producePlanTime;

    /**
     * 生产计划沟通次数
     */
    @Column(name = "COMUNICATION_TIMES")
    private Integer comunicationTimes;

    /**
     * 首次计划员
     */
    @Column(name = "FIRST_PLANNER")
    private String firstPlanner;

    /**
     * 派遣车次
     */
    @Column(name = "DRIVER_LINE")
    private String driverLine;

    /**
     * 物流接单人
     */
    @Column(name = "LOGISTICS_PICKER")
    private String logisticsPicker;

    /**
     * 物流接单时间
     */
    @Column(name = "LOGISTICS_PICK_TIME")
    private Date logisticsPickTime;

    /**
     * 客户签收时间
     */
    @Column(name = "CUSTOMER_ACCEPT_TIME")
    private Date customerAcceptTime;

    /**
     * 所属安装队
     */
    @Column(name = "INSTALLTEAM_ID")
    private String installteamId;

    /**
     * 所属安装组id
     */
    @Column(name = "INSTALLSMALLGROUP_ID")
    private String installsmallgroupId;

    /**
     * 安装人员
     */
    @Column(name = "INSTALLER")
    private String installer;

    /**
     * 交单日期
     */
    @Column(name = "PAYFOR_DATE")
    private Date payforDate;

    /**
     * 回访人
     */
    @Column(name = "BACK_PERSON")
    private String backPerson;

    /**
     * 刷卡金额
     */
    @Column(name = "PAYCAR_MONEY")
    private BigDecimal paycarMoney;

    /**
     * 让利金额
     */
    @Column(name = "OFFER_MONEY")
    private BigDecimal offerMoney;

    /**
     * 下单验证工期（数）
     */
    @Column(name = "ORDERED_VALIDATE_TIME")
    private Integer orderedValidateTime;

    /**
     * 财务验证工期
     */
    @Column(name = "FIN_TIME_LIMIT")
    private Integer finTimeLimit;

    /**
     * 验证工期时间
     */
    @Column(name = "VALIDATE_PRERIOD_TIME")
    private Integer validatePreriodTime;

    /**
     * 不需验证工期
     */
    @Column(name = "IS_VERIFY_LIMIT")
    private String isVerifyLimit;

    /**
     * 工期不足状态
     */
    @Column(name = "LESSTIME_STATUS")
    private String lesstimeStatus;

    /**
     * 是否司索联动单
     */
    @Column(name = "IS_SSLDD")
    private String isSsldd;

    /**
     * 司米带单人员
     */
    @Column(name = "SM_LEADER")
    private String smLeader;

    /**
     * 经销商编号
     */
    @Column(name = "ORG_ID")
    private String orgId;

    @Column(name = "PRE_PLAN_USER")
    private String prePlanUser;

    /**
     * 县区ID
     */
    @Column(name = "AREA_ID")
    private String areaId;

    @Column(name = "SINGLE_TRIAL_TIME")
    private Date singleTrialTime;

    @Column(name = "REFUND_AMOUNT")
    private BigDecimal refundAmount;

    /**
     * 投影面积
     */
    @Column(name = "SHADOW_AREA")
    private BigDecimal shadowArea;

    /**
     * 改补次数
     */
    @Column(name = "CHANGE_AMOUNT")
    private Integer changeAmount;

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
     * 推荐人
     */
    @Column(name = "CUSTOMER_REFERRER")
    private String customerReferrer;

    /**
     * 装修完成情况
     */
    @Column(name = "DECORATION_SITUATION")
    private String decorationSituation;

    /**
     * 所属片区
     */
    @Column(name = "REGION")
    private String region;

    /**
     * 商机二级状态
     */
    @Column(name = "SECOND_STATE")
    private String secondState;

    /**
     * 正单折扣率
     */
    @Column(name = "SINGLE_DISCOUNT_RATE")
    private BigDecimal singleDiscountRate;

    /**
     * 正单折扣优惠金额
     */
    @Column(name = "SINGLE_DISCOUNT_AMOUT")
    private BigDecimal singleDiscountAmout;

    /**
     * 装修状况备注
     */
    @Column(name = "DECORATION_REMARKS")
    private String decorationRemarks;

    /**
     * 审价存档日期
     */
    @Column(name = "VERIFYDATE")
    private Date verifydate;

    /**
     * 审价存档优惠实收
     */
    @Column(name = "VERIFY_REAL_AMOUNT")
    private BigDecimal verifyRealAmount;

    /**
     * 审价存档否
     */
    @Column(name = "VERIFYED")
    private Byte verifyed;

    /**
     * 已分配设计师(Y,N)
     */
    @Column(name = "IS_ASSIGNED")
    private String isAssigned;

    /**
     * 是否复尺(Y,N)
     */
    @Column(name = "IS_RE_MEASURE")
    private String isReMeasure;

    /**
     * 退回标识
     */
    @Column(name = "REFUND_TYPE")
    private String refundType;

    /**
     * 有无电梯(Y,N)
     */
    @Column(name = "ELEVATOR")
    private String elevator;

    /**
     * 出货章修改金额
     */
    @Column(name = "CHANG_PAID_AMOUNT")
    private BigDecimal changPaidAmount;

    /**
     * 出货章修改标识
     */
    @Column(name = "CHANG_FLAG")
    private Integer changFlag;

    /**
     * 生产计划ID
     */
    @Column(name = "PLAN_ID")
    private Long planId;

    /**
     * Y:支付方式使用了装饰服务 N：支付方式未使用装饰服务
     */
    @Column(name = "DECORATE_FLAG")
    private String decorateFlag;

    /**
     * 柜身展开面积
     */
    @Column(name = "GS_AREA")
    private BigDecimal gsArea;

    /**
     * 柜门展开面积
     */
    @Column(name = "GM_AREA")
    private BigDecimal gmArea;

    /**
     * 商机总展开面积
     */
    @Column(name = "TOTAL_SQUARE")
    private BigDecimal totalSquare;

    /**
     * 满减优惠说明
     */
    @Column(name = "DISCOUNT_DESC")
    private String discountDesc;

    /**
     * 退回到确图环节说明
     */
    @Column(name = "BACKDRAW_DESC")
    private String backdrawDesc;

    /**
     * 首次提交审图时间
     */
    @Column(name = "FIRST_SUBMIT_TIME")
    private Date firstSubmitTime;

    /**
     * 提交审图次数
     */
    @Column(name = "SUBMIT_COUNT")
    private Integer submitCount;

    /**
     * 创建时间
     */
    @Column(name = "CREATION_DATE")
    private Date creationDate;

    /**
     * 存档号
     */
    @Column(name = "VERIFY_CODE")
    private String verifyCode;

    /**
     * 终审指派人
     */
    @Column(name = "FINAL_ASSIGN_PERSON")
    private String finalAssignPerson;

    /**
     * 终审审图退回次数
     */
    @Column(name = "TRIAL_RETURN_COUNT")
    private Integer trialReturnCount;

    /**
     * 终审审图状态
     */
    @Column(name = "TRIAL_STATE")
    private String trialState;

    /**
     * 投影面积审核状态
     */
    @Column(name = "SHADOW_CHECK_STATE")
    private String shadowCheckState;

    /**
     * 投影面积审核人
     */
    @Column(name = "SHADOW_CHECK_PERSON")
    private String shadowCheckPerson;

    /**
     * 投影面积审核时间
     */
    @Column(name = "SHADOW_CHECK_TIME")
    private Date shadowCheckTime;

    /**
     * 成品订货数量
     */
    @Column(name = "PROD_NUMBER")
    private Integer prodNumber;

    /**
     * 成品图纸单个数
     */
    @Column(name = "PROD_DRAW_NUMBER")
    private Integer prodDrawNumber;

    /**
     * 物流归档时间
     */
    @Column(name = "FILING_TIME")
    private Date filingTime;

    /**
     * 物流归档号
     */
    @Column(name = "FILING_NUMBER")
    private String filingNumber;

    /**
     * 首次门店安装日期
     */
    @Column(name = "EXTEND2")
    private Date extend2;

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
     * 获取所属销售纵队
     *
     * @return COLUMN_ID - 所属销售纵队
     */
    public String getColumnId() {
        return columnId;
    }

    /**
     * 设置所属销售纵队
     *
     * @param columnId 所属销售纵队
     */
    public void setColumnId(String columnId) {
        this.columnId = columnId;
    }

    /**
     * 获取所属设计纵队
     *
     * @return COLUMN_DESIGN - 所属设计纵队
     */
    public String getColumnDesign() {
        return columnDesign;
    }

    /**
     * 设置所属设计纵队
     *
     * @param columnDesign 所属设计纵队
     */
    public void setColumnDesign(String columnDesign) {
        this.columnDesign = columnDesign;
    }

    /**
     * 获取紧急度
     *
     * @return ORDER_PRIORITY_CODE - 紧急度
     */
    public String getOrderPriorityCode() {
        return orderPriorityCode;
    }

    /**
     * 设置紧急度
     *
     * @param orderPriorityCode 紧急度
     */
    public void setOrderPriorityCode(String orderPriorityCode) {
        this.orderPriorityCode = orderPriorityCode;
    }

    /**
     * 获取带单类型
     *
     * @return LEAD_TYPE - 带单类型
     */
    public String getLeadType() {
        return leadType;
    }

    /**
     * 设置带单类型
     *
     * @param leadType 带单类型
     */
    public void setLeadType(String leadType) {
        this.leadType = leadType;
    }

    /**
     * 获取审图负责人
     *
     * @return DRAW_MANAGER - 审图负责人
     */
    public String getDrawManager() {
        return drawManager;
    }

    /**
     * 设置审图负责人
     *
     * @param drawManager 审图负责人
     */
    public void setDrawManager(String drawManager) {
        this.drawManager = drawManager;
    }

    /**
     * 获取生产确认时间
     *
     * @return PRODUCE_PLAN_TIME - 生产确认时间
     */
    public Date getProducePlanTime() {
        return producePlanTime;
    }

    /**
     * 设置生产确认时间
     *
     * @param producePlanTime 生产确认时间
     */
    public void setProducePlanTime(Date producePlanTime) {
        this.producePlanTime = producePlanTime;
    }

    /**
     * 获取生产计划沟通次数
     *
     * @return COMUNICATION_TIMES - 生产计划沟通次数
     */
    public Integer getComunicationTimes() {
        return comunicationTimes;
    }

    /**
     * 设置生产计划沟通次数
     *
     * @param comunicationTimes 生产计划沟通次数
     */
    public void setComunicationTimes(Integer comunicationTimes) {
        this.comunicationTimes = comunicationTimes;
    }

    /**
     * 获取首次计划员
     *
     * @return FIRST_PLANNER - 首次计划员
     */
    public String getFirstPlanner() {
        return firstPlanner;
    }

    /**
     * 设置首次计划员
     *
     * @param firstPlanner 首次计划员
     */
    public void setFirstPlanner(String firstPlanner) {
        this.firstPlanner = firstPlanner;
    }

    /**
     * 获取派遣车次
     *
     * @return DRIVER_LINE - 派遣车次
     */
    public String getDriverLine() {
        return driverLine;
    }

    /**
     * 设置派遣车次
     *
     * @param driverLine 派遣车次
     */
    public void setDriverLine(String driverLine) {
        this.driverLine = driverLine;
    }

    /**
     * 获取物流接单人
     *
     * @return LOGISTICS_PICKER - 物流接单人
     */
    public String getLogisticsPicker() {
        return logisticsPicker;
    }

    /**
     * 设置物流接单人
     *
     * @param logisticsPicker 物流接单人
     */
    public void setLogisticsPicker(String logisticsPicker) {
        this.logisticsPicker = logisticsPicker;
    }

    /**
     * 获取物流接单时间
     *
     * @return LOGISTICS_PICK_TIME - 物流接单时间
     */
    public Date getLogisticsPickTime() {
        return logisticsPickTime;
    }

    /**
     * 设置物流接单时间
     *
     * @param logisticsPickTime 物流接单时间
     */
    public void setLogisticsPickTime(Date logisticsPickTime) {
        this.logisticsPickTime = logisticsPickTime;
    }

    /**
     * 获取客户签收时间
     *
     * @return CUSTOMER_ACCEPT_TIME - 客户签收时间
     */
    public Date getCustomerAcceptTime() {
        return customerAcceptTime;
    }

    /**
     * 设置客户签收时间
     *
     * @param customerAcceptTime 客户签收时间
     */
    public void setCustomerAcceptTime(Date customerAcceptTime) {
        this.customerAcceptTime = customerAcceptTime;
    }

    /**
     * 获取所属安装队
     *
     * @return INSTALLTEAM_ID - 所属安装队
     */
    public String getInstallteamId() {
        return installteamId;
    }

    /**
     * 设置所属安装队
     *
     * @param installteamId 所属安装队
     */
    public void setInstallteamId(String installteamId) {
        this.installteamId = installteamId;
    }

    /**
     * 获取所属安装组id
     *
     * @return INSTALLSMALLGROUP_ID - 所属安装组id
     */
    public String getInstallsmallgroupId() {
        return installsmallgroupId;
    }

    /**
     * 设置所属安装组id
     *
     * @param installsmallgroupId 所属安装组id
     */
    public void setInstallsmallgroupId(String installsmallgroupId) {
        this.installsmallgroupId = installsmallgroupId;
    }

    /**
     * 获取安装人员
     *
     * @return INSTALLER - 安装人员
     */
    public String getInstaller() {
        return installer;
    }

    /**
     * 设置安装人员
     *
     * @param installer 安装人员
     */
    public void setInstaller(String installer) {
        this.installer = installer;
    }

    /**
     * 获取交单日期
     *
     * @return PAYFOR_DATE - 交单日期
     */
    public Date getPayforDate() {
        return payforDate;
    }

    /**
     * 设置交单日期
     *
     * @param payforDate 交单日期
     */
    public void setPayforDate(Date payforDate) {
        this.payforDate = payforDate;
    }

    /**
     * 获取回访人
     *
     * @return BACK_PERSON - 回访人
     */
    public String getBackPerson() {
        return backPerson;
    }

    /**
     * 设置回访人
     *
     * @param backPerson 回访人
     */
    public void setBackPerson(String backPerson) {
        this.backPerson = backPerson;
    }

    /**
     * 获取刷卡金额
     *
     * @return PAYCAR_MONEY - 刷卡金额
     */
    public BigDecimal getPaycarMoney() {
        return paycarMoney;
    }

    /**
     * 设置刷卡金额
     *
     * @param paycarMoney 刷卡金额
     */
    public void setPaycarMoney(BigDecimal paycarMoney) {
        this.paycarMoney = paycarMoney;
    }

    /**
     * 获取让利金额
     *
     * @return OFFER_MONEY - 让利金额
     */
    public BigDecimal getOfferMoney() {
        return offerMoney;
    }

    /**
     * 设置让利金额
     *
     * @param offerMoney 让利金额
     */
    public void setOfferMoney(BigDecimal offerMoney) {
        this.offerMoney = offerMoney;
    }

    /**
     * 获取下单验证工期（数）
     *
     * @return ORDERED_VALIDATE_TIME - 下单验证工期（数）
     */
    public Integer getOrderedValidateTime() {
        return orderedValidateTime;
    }

    /**
     * 设置下单验证工期（数）
     *
     * @param orderedValidateTime 下单验证工期（数）
     */
    public void setOrderedValidateTime(Integer orderedValidateTime) {
        this.orderedValidateTime = orderedValidateTime;
    }

    /**
     * 获取财务验证工期
     *
     * @return FIN_TIME_LIMIT - 财务验证工期
     */
    public Integer getFinTimeLimit() {
        return finTimeLimit;
    }

    /**
     * 设置财务验证工期
     *
     * @param finTimeLimit 财务验证工期
     */
    public void setFinTimeLimit(Integer finTimeLimit) {
        this.finTimeLimit = finTimeLimit;
    }

    /**
     * 获取验证工期时间
     *
     * @return VALIDATE_PRERIOD_TIME - 验证工期时间
     */
    public Integer getValidatePreriodTime() {
        return validatePreriodTime;
    }

    /**
     * 设置验证工期时间
     *
     * @param validatePreriodTime 验证工期时间
     */
    public void setValidatePreriodTime(Integer validatePreriodTime) {
        this.validatePreriodTime = validatePreriodTime;
    }

    /**
     * 获取不需验证工期
     *
     * @return IS_VERIFY_LIMIT - 不需验证工期
     */
    public String getIsVerifyLimit() {
        return isVerifyLimit;
    }

    /**
     * 设置不需验证工期
     *
     * @param isVerifyLimit 不需验证工期
     */
    public void setIsVerifyLimit(String isVerifyLimit) {
        this.isVerifyLimit = isVerifyLimit;
    }

    /**
     * 获取工期不足状态
     *
     * @return LESSTIME_STATUS - 工期不足状态
     */
    public String getLesstimeStatus() {
        return lesstimeStatus;
    }

    /**
     * 设置工期不足状态
     *
     * @param lesstimeStatus 工期不足状态
     */
    public void setLesstimeStatus(String lesstimeStatus) {
        this.lesstimeStatus = lesstimeStatus;
    }

    /**
     * 获取是否司索联动单
     *
     * @return IS_SSLDD - 是否司索联动单
     */
    public String getIsSsldd() {
        return isSsldd;
    }

    /**
     * 设置是否司索联动单
     *
     * @param isSsldd 是否司索联动单
     */
    public void setIsSsldd(String isSsldd) {
        this.isSsldd = isSsldd;
    }

    /**
     * 获取司米带单人员
     *
     * @return SM_LEADER - 司米带单人员
     */
    public String getSmLeader() {
        return smLeader;
    }

    /**
     * 设置司米带单人员
     *
     * @param smLeader 司米带单人员
     */
    public void setSmLeader(String smLeader) {
        this.smLeader = smLeader;
    }

    /**
     * 获取经销商编号
     *
     * @return ORG_ID - 经销商编号
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置经销商编号
     *
     * @param orgId 经销商编号
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * @return PRE_PLAN_USER
     */
    public String getPrePlanUser() {
        return prePlanUser;
    }

    /**
     * @param prePlanUser
     */
    public void setPrePlanUser(String prePlanUser) {
        this.prePlanUser = prePlanUser;
    }

    /**
     * 获取县区ID
     *
     * @return AREA_ID - 县区ID
     */
    public String getAreaId() {
        return areaId;
    }

    /**
     * 设置县区ID
     *
     * @param areaId 县区ID
     */
    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    /**
     * @return SINGLE_TRIAL_TIME
     */
    public Date getSingleTrialTime() {
        return singleTrialTime;
    }

    /**
     * @param singleTrialTime
     */
    public void setSingleTrialTime(Date singleTrialTime) {
        this.singleTrialTime = singleTrialTime;
    }

    /**
     * @return REFUND_AMOUNT
     */
    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    /**
     * @param refundAmount
     */
    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * 获取投影面积
     *
     * @return SHADOW_AREA - 投影面积
     */
    public BigDecimal getShadowArea() {
        return shadowArea;
    }

    /**
     * 设置投影面积
     *
     * @param shadowArea 投影面积
     */
    public void setShadowArea(BigDecimal shadowArea) {
        this.shadowArea = shadowArea;
    }

    /**
     * 获取改补次数
     *
     * @return CHANGE_AMOUNT - 改补次数
     */
    public Integer getChangeAmount() {
        return changeAmount;
    }

    /**
     * 设置改补次数
     *
     * @param changeAmount 改补次数
     */
    public void setChangeAmount(Integer changeAmount) {
        this.changeAmount = changeAmount;
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
     * 获取装修完成情况
     *
     * @return DECORATION_SITUATION - 装修完成情况
     */
    public String getDecorationSituation() {
        return decorationSituation;
    }

    /**
     * 设置装修完成情况
     *
     * @param decorationSituation 装修完成情况
     */
    public void setDecorationSituation(String decorationSituation) {
        this.decorationSituation = decorationSituation;
    }

    /**
     * 获取所属片区
     *
     * @return REGION - 所属片区
     */
    public String getRegion() {
        return region;
    }

    /**
     * 设置所属片区
     *
     * @param region 所属片区
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * 获取商机二级状态
     *
     * @return SECOND_STATE - 商机二级状态
     */
    public String getSecondState() {
        return secondState;
    }

    /**
     * 设置商机二级状态
     *
     * @param secondState 商机二级状态
     */
    public void setSecondState(String secondState) {
        this.secondState = secondState;
    }

    /**
     * 获取正单折扣率
     *
     * @return SINGLE_DISCOUNT_RATE - 正单折扣率
     */
    public BigDecimal getSingleDiscountRate() {
        return singleDiscountRate;
    }

    /**
     * 设置正单折扣率
     *
     * @param singleDiscountRate 正单折扣率
     */
    public void setSingleDiscountRate(BigDecimal singleDiscountRate) {
        this.singleDiscountRate = singleDiscountRate;
    }

    /**
     * 获取正单折扣优惠金额
     *
     * @return SINGLE_DISCOUNT_AMOUT - 正单折扣优惠金额
     */
    public BigDecimal getSingleDiscountAmout() {
        return singleDiscountAmout;
    }

    /**
     * 设置正单折扣优惠金额
     *
     * @param singleDiscountAmout 正单折扣优惠金额
     */
    public void setSingleDiscountAmout(BigDecimal singleDiscountAmout) {
        this.singleDiscountAmout = singleDiscountAmout;
    }

    /**
     * 获取装修状况备注
     *
     * @return DECORATION_REMARKS - 装修状况备注
     */
    public String getDecorationRemarks() {
        return decorationRemarks;
    }

    /**
     * 设置装修状况备注
     *
     * @param decorationRemarks 装修状况备注
     */
    public void setDecorationRemarks(String decorationRemarks) {
        this.decorationRemarks = decorationRemarks;
    }

    /**
     * 获取审价存档日期
     *
     * @return VERIFYDATE - 审价存档日期
     */
    public Date getVerifydate() {
        return verifydate;
    }

    /**
     * 设置审价存档日期
     *
     * @param verifydate 审价存档日期
     */
    public void setVerifydate(Date verifydate) {
        this.verifydate = verifydate;
    }

    /**
     * 获取审价存档优惠实收
     *
     * @return VERIFY_REAL_AMOUNT - 审价存档优惠实收
     */
    public BigDecimal getVerifyRealAmount() {
        return verifyRealAmount;
    }

    /**
     * 设置审价存档优惠实收
     *
     * @param verifyRealAmount 审价存档优惠实收
     */
    public void setVerifyRealAmount(BigDecimal verifyRealAmount) {
        this.verifyRealAmount = verifyRealAmount;
    }

    /**
     * 获取审价存档否
     *
     * @return VERIFYED - 审价存档否
     */
    public Byte getVerifyed() {
        return verifyed;
    }

    /**
     * 设置审价存档否
     *
     * @param verifyed 审价存档否
     */
    public void setVerifyed(Byte verifyed) {
        this.verifyed = verifyed;
    }

    /**
     * 获取已分配设计师(Y,N)
     *
     * @return IS_ASSIGNED - 已分配设计师(Y,N)
     */
    public String getIsAssigned() {
        return isAssigned;
    }

    /**
     * 设置已分配设计师(Y,N)
     *
     * @param isAssigned 已分配设计师(Y,N)
     */
    public void setIsAssigned(String isAssigned) {
        this.isAssigned = isAssigned;
    }

    /**
     * 获取是否复尺(Y,N)
     *
     * @return IS_RE_MEASURE - 是否复尺(Y,N)
     */
    public String getIsReMeasure() {
        return isReMeasure;
    }

    /**
     * 设置是否复尺(Y,N)
     *
     * @param isReMeasure 是否复尺(Y,N)
     */
    public void setIsReMeasure(String isReMeasure) {
        this.isReMeasure = isReMeasure;
    }

    /**
     * 获取退回标识
     *
     * @return REFUND_TYPE - 退回标识
     */
    public String getRefundType() {
        return refundType;
    }

    /**
     * 设置退回标识
     *
     * @param refundType 退回标识
     */
    public void setRefundType(String refundType) {
        this.refundType = refundType;
    }

    /**
     * 获取有无电梯(Y,N)
     *
     * @return ELEVATOR - 有无电梯(Y,N)
     */
    public String getElevator() {
        return elevator;
    }

    /**
     * 设置有无电梯(Y,N)
     *
     * @param elevator 有无电梯(Y,N)
     */
    public void setElevator(String elevator) {
        this.elevator = elevator;
    }

    /**
     * 获取出货章修改金额
     *
     * @return CHANG_PAID_AMOUNT - 出货章修改金额
     */
    public BigDecimal getChangPaidAmount() {
        return changPaidAmount;
    }

    /**
     * 设置出货章修改金额
     *
     * @param changPaidAmount 出货章修改金额
     */
    public void setChangPaidAmount(BigDecimal changPaidAmount) {
        this.changPaidAmount = changPaidAmount;
    }

    /**
     * 获取出货章修改标识
     *
     * @return CHANG_FLAG - 出货章修改标识
     */
    public Integer getChangFlag() {
        return changFlag;
    }

    /**
     * 设置出货章修改标识
     *
     * @param changFlag 出货章修改标识
     */
    public void setChangFlag(Integer changFlag) {
        this.changFlag = changFlag;
    }

    /**
     * 获取生产计划ID
     *
     * @return PLAN_ID - 生产计划ID
     */
    public Long getPlanId() {
        return planId;
    }

    /**
     * 设置生产计划ID
     *
     * @param planId 生产计划ID
     */
    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    /**
     * 获取Y:支付方式使用了装饰服务 N：支付方式未使用装饰服务
     *
     * @return DECORATE_FLAG - Y:支付方式使用了装饰服务 N：支付方式未使用装饰服务
     */
    public String getDecorateFlag() {
        return decorateFlag;
    }

    /**
     * 设置Y:支付方式使用了装饰服务 N：支付方式未使用装饰服务
     *
     * @param decorateFlag Y:支付方式使用了装饰服务 N：支付方式未使用装饰服务
     */
    public void setDecorateFlag(String decorateFlag) {
        this.decorateFlag = decorateFlag;
    }

    /**
     * 获取柜身展开面积
     *
     * @return GS_AREA - 柜身展开面积
     */
    public BigDecimal getGsArea() {
        return gsArea;
    }

    /**
     * 设置柜身展开面积
     *
     * @param gsArea 柜身展开面积
     */
    public void setGsArea(BigDecimal gsArea) {
        this.gsArea = gsArea;
    }

    /**
     * 获取柜门展开面积
     *
     * @return GM_AREA - 柜门展开面积
     */
    public BigDecimal getGmArea() {
        return gmArea;
    }

    /**
     * 设置柜门展开面积
     *
     * @param gmArea 柜门展开面积
     */
    public void setGmArea(BigDecimal gmArea) {
        this.gmArea = gmArea;
    }

    /**
     * 获取商机总展开面积
     *
     * @return TOTAL_SQUARE - 商机总展开面积
     */
    public BigDecimal getTotalSquare() {
        return totalSquare;
    }

    /**
     * 设置商机总展开面积
     *
     * @param totalSquare 商机总展开面积
     */
    public void setTotalSquare(BigDecimal totalSquare) {
        this.totalSquare = totalSquare;
    }

    /**
     * 获取满减优惠说明
     *
     * @return DISCOUNT_DESC - 满减优惠说明
     */
    public String getDiscountDesc() {
        return discountDesc;
    }

    /**
     * 设置满减优惠说明
     *
     * @param discountDesc 满减优惠说明
     */
    public void setDiscountDesc(String discountDesc) {
        this.discountDesc = discountDesc;
    }

    /**
     * 获取退回到确图环节说明
     *
     * @return BACKDRAW_DESC - 退回到确图环节说明
     */
    public String getBackdrawDesc() {
        return backdrawDesc;
    }

    /**
     * 设置退回到确图环节说明
     *
     * @param backdrawDesc 退回到确图环节说明
     */
    public void setBackdrawDesc(String backdrawDesc) {
        this.backdrawDesc = backdrawDesc;
    }

    /**
     * 获取首次提交审图时间
     *
     * @return FIRST_SUBMIT_TIME - 首次提交审图时间
     */
    public Date getFirstSubmitTime() {
        return firstSubmitTime;
    }

    /**
     * 设置首次提交审图时间
     *
     * @param firstSubmitTime 首次提交审图时间
     */
    public void setFirstSubmitTime(Date firstSubmitTime) {
        this.firstSubmitTime = firstSubmitTime;
    }

    /**
     * 获取提交审图次数
     *
     * @return SUBMIT_COUNT - 提交审图次数
     */
    public Integer getSubmitCount() {
        return submitCount;
    }

    /**
     * 设置提交审图次数
     *
     * @param submitCount 提交审图次数
     */
    public void setSubmitCount(Integer submitCount) {
        this.submitCount = submitCount;
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
     * 获取存档号
     *
     * @return VERIFY_CODE - 存档号
     */
    public String getVerifyCode() {
        return verifyCode;
    }

    /**
     * 设置存档号
     *
     * @param verifyCode 存档号
     */
    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    /**
     * 获取终审指派人
     *
     * @return FINAL_ASSIGN_PERSON - 终审指派人
     */
    public String getFinalAssignPerson() {
        return finalAssignPerson;
    }

    /**
     * 设置终审指派人
     *
     * @param finalAssignPerson 终审指派人
     */
    public void setFinalAssignPerson(String finalAssignPerson) {
        this.finalAssignPerson = finalAssignPerson;
    }

    /**
     * 获取终审审图退回次数
     *
     * @return TRIAL_RETURN_COUNT - 终审审图退回次数
     */
    public Integer getTrialReturnCount() {
        return trialReturnCount;
    }

    /**
     * 设置终审审图退回次数
     *
     * @param trialReturnCount 终审审图退回次数
     */
    public void setTrialReturnCount(Integer trialReturnCount) {
        this.trialReturnCount = trialReturnCount;
    }

    /**
     * 获取终审审图状态
     *
     * @return TRIAL_STATE - 终审审图状态
     */
    public String getTrialState() {
        return trialState;
    }

    /**
     * 设置终审审图状态
     *
     * @param trialState 终审审图状态
     */
    public void setTrialState(String trialState) {
        this.trialState = trialState;
    }

    /**
     * 获取投影面积审核状态
     *
     * @return SHADOW_CHECK_STATE - 投影面积审核状态
     */
    public String getShadowCheckState() {
        return shadowCheckState;
    }

    /**
     * 设置投影面积审核状态
     *
     * @param shadowCheckState 投影面积审核状态
     */
    public void setShadowCheckState(String shadowCheckState) {
        this.shadowCheckState = shadowCheckState;
    }

    /**
     * 获取投影面积审核人
     *
     * @return SHADOW_CHECK_PERSON - 投影面积审核人
     */
    public String getShadowCheckPerson() {
        return shadowCheckPerson;
    }

    /**
     * 设置投影面积审核人
     *
     * @param shadowCheckPerson 投影面积审核人
     */
    public void setShadowCheckPerson(String shadowCheckPerson) {
        this.shadowCheckPerson = shadowCheckPerson;
    }

    /**
     * 获取投影面积审核时间
     *
     * @return SHADOW_CHECK_TIME - 投影面积审核时间
     */
    public Date getShadowCheckTime() {
        return shadowCheckTime;
    }

    /**
     * 设置投影面积审核时间
     *
     * @param shadowCheckTime 投影面积审核时间
     */
    public void setShadowCheckTime(Date shadowCheckTime) {
        this.shadowCheckTime = shadowCheckTime;
    }

    /**
     * 获取成品订货数量
     *
     * @return PROD_NUMBER - 成品订货数量
     */
    public Integer getProdNumber() {
        return prodNumber;
    }

    /**
     * 设置成品订货数量
     *
     * @param prodNumber 成品订货数量
     */
    public void setProdNumber(Integer prodNumber) {
        this.prodNumber = prodNumber;
    }

    /**
     * 获取成品图纸单个数
     *
     * @return PROD_DRAW_NUMBER - 成品图纸单个数
     */
    public Integer getProdDrawNumber() {
        return prodDrawNumber;
    }

    /**
     * 设置成品图纸单个数
     *
     * @param prodDrawNumber 成品图纸单个数
     */
    public void setProdDrawNumber(Integer prodDrawNumber) {
        this.prodDrawNumber = prodDrawNumber;
    }

    /**
     * 获取物流归档时间
     *
     * @return FILING_TIME - 物流归档时间
     */
    public Date getFilingTime() {
        return filingTime;
    }

    /**
     * 设置物流归档时间
     *
     * @param filingTime 物流归档时间
     */
    public void setFilingTime(Date filingTime) {
        this.filingTime = filingTime;
    }

    /**
     * 获取物流归档号
     *
     * @return FILING_NUMBER - 物流归档号
     */
    public String getFilingNumber() {
        return filingNumber;
    }

    /**
     * 设置物流归档号
     *
     * @param filingNumber 物流归档号
     */
    public void setFilingNumber(String filingNumber) {
        this.filingNumber = filingNumber;
    }

    /**
     * 获取首次门店安装日期
     *
     * @return EXTEND2 - 首次门店安装日期
     */
    public Date getExtend2() {
        return extend2;
    }

    /**
     * 设置首次门店安装日期
     *
     * @param extend2 首次门店安装日期
     */
    public void setExtend2(Date extend2) {
        this.extend2 = extend2;
    }
}