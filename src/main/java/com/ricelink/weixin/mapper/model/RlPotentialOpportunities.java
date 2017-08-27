package com.ricelink.weixin.mapper.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rl_potential_opportunities")
public class RlPotentialOpportunities {
    /**
     * 商机ID
     */
    @Id
    @Column(name = "OPPORTUNITY_ID")
    @GeneratedValue(generator = "UUID")
    private String opportunityId;

    /**
     * 潜客Id
     */
    @Column(name = "CUSTOMER_ID")
    private String customerId;

    /**
     * 导购ID
     */
    @Column(name = "GUIDE_ID")
    private String guideId;

    /**
     * 设计师ID
     */
    @Column(name = "DESIGNER_ID")
    private String designerId;

    /**
     * 一级来源
     */
    @Column(name = "SOURCE")
    private String source;

    /**
     * 次要电话号码
     */
    @Column(name = "PHONE2")
    private String phone2;

    /**
     * 邮箱
     */
    @Column(name = "EMAIL")
    private String email;

    /**
     * 其他联系姓名
     */
    @Column(name = "CONNECT_NAME")
    private String connectName;

    /**
     * 其他联系性别
     */
    @Column(name = "CONNECT_SEX")
    private String connectSex;

    /**
     * 联系内容（备注）
     */
    @Column(name = "CONNECT_COMMENT")
    private String connectComment;

    /**
     * 其他联系电话
     */
    @Column(name = "CONNECT_PHONE")
    private String connectPhone;

    /**
     * 门店ID
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 城市
     */
    @Column(name = "ADDRESS_CITY")
    private String addressCity;

    /**
     * 县
     */
    @Column(name = "ADDRESS_COUNTY")
    private String addressCounty;

    /**
     * 地址
     */
    @Column(name = "ADDRESS_DETAIL")
    private String addressDetail;

    /**
     * 小区
     */
    @Column(name = "ADDRESS_CELL")
    private String addressCell;

    /**
     * 主订单编号
     */
    @Column(name = "ORDER_CODE")
    private String orderCode;

    /**
     * 参加的活动编码
     */
    @Column(name = "ACTIVITY_CODE")
    private String activityCode;

    /**
     * 活动备注
     */
    @Column(name = "ACTIVITY_DESCRIPTION")
    private String activityDescription;

    /**
     * 希望测量日期
     */
    @Column(name = "EXPECT_MEASURE_DATE")
    private Date expectMeasureDate;

    /**
     * 希望安装日期
     */
    @Column(name = "EXPECT_INSTALL_DATE")
    private Date expectInstallDate;

    /**
     * 房屋户型
     */
    @Column(name = "HOUSE_TYPE_CODE")
    private String houseTypeCode;

    /**
     * 装修风格
     */
    @Column(name = "DECORATION_STYLE_CODE")
    private String decorationStyleCode;

    /**
     * 装修进度
     */
    @Column(name = "DECORATION_PROGRESS_CODE")
    private String decorationProgressCode;

    /**
     * 职 业
     */
    @Column(name = "JOB")
    private String job;

    /**
     * 年 龄段
     */
    @Column(name = "AGE")
    private String age;

    /**
     * 装修方式
     */
    @Column(name = "DECORATION_METHOD_CODE")
    private String decorationMethodCode;

    /**
     * 大致预算
     */
    @Column(name = "BUDGET")
    private String budget;

    /**
     * 单子大小
     */
    @Column(name = "ORDER_SIZE_CODE")
    private String orderSizeCode;

    /**
     * 客户消费能力
     */
    @Column(name = "COSUME_ABLITY_CODE")
    private String cosumeAblityCode;

    /**
     * 单子紧迫性
     */
    @Column(name = "ORDER_PRIORITY_CODE")
    private String orderPriorityCode;

    /**
     * 客户可说服性
     */
    @Column(name = "PERSUADE_LEVEL_CODE")
    private String persuadeLevelCode;

    /**
     * 创建客户时间
     */
    @Column(name = "CREATE_CUS")
    private Date createCus;

    /**
     * 当前状态
     */
    @Column(name = "CURRENT_STATUS")
    private String currentStatus;

    /**
     * 创建人
     */
    @Column(name = "CREATED_BY")
    private String createdBy;

    /**
     * 创建时间
     */
    @Column(name = "CREATION_DATE")
    private Date creationDate;

    /**
     * 最新更新者
     */
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;

    /**
     * 最新更新时间
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
     * 退单时间
     */
    @Column(name = "CHARGE_BACK_TIME")
    private Date chargeBackTime;

    /**
     * 退单原因
     */
    @Column(name = "CHARGE_BACK_REASON")
    private String chargeBackReason;

    /**
     * 退单备注
     */
    @Column(name = "CHARGE_BACK_COMMENT")
    private String chargeBackComment;

    /**
     * 备注
     */
    @Column(name = "COMMENTS")
    private String comments;

    /**
     * 活动备注
     */
    @Column(name = "ACTIVITY_COMMENTS")
    private String activityComments;

    /**
     * 无效原因
     */
    @Column(name = "ESHOP_INVALID_REASON")
    private String eshopInvalidReason;

    /**
     * 无效说明
     */
    @Column(name = "ESHOP_INVALID_COMMENT")
    private String eshopInvalidComment;

    /**
     * 撤销经销商说明
     */
    @Column(name = "REVOKE_ORG_COMMENT")
    private String revokeOrgComment;

    /**
     * 客户二级来源
     */
    @Column(name = "SECOND_SOURCE")
    private String secondSource;

    /**
     * 电商二级来源渠道
     */
    @Column(name = "TWO_SOURCE")
    private String twoSource;

    /**
     * 电商潜客需求
     */
    @Column(name = "LATENT_DEMAND")
    private String latentDemand;

    /**
     * 楼盘状况
     */
    @Column(name = "TBORDER_ID")
    private String tborderId;

    /**
     * 订单退款状态
     */
    @Column(name = "REFUND_STATUS")
    private String refundStatus;

    /**
     * 经销商ID
     */
    @Column(name = "DEALER_ID")
    private String dealerId;

    /**
     * 接单时间
     */
    @Column(name = "ACCEPT_DATE")
    private Date acceptDate;

    /**
     * 客人特征
     */
    @Column(name = "CUSTOMER_FEATURE")
    private String customerFeature;

    /**
     * 所属销售纵队
     */
    @Column(name = "COLUMN_SALE")
    private String columnSale;

    /**
     * 所属设计纵队
     */
    @Column(name = "COLUMN_DESIGN")
    private String columnDesign;

    /**
     * 客户装修状态
     */
    @Column(name = "DECORATION_STATUS")
    private String decorationStatus;

    /**
     * 是否交定金
     */
    @Column(name = "DEPOSIT_FLAG")
    private String depositFlag;

    @Column(name = "SYS_GEN_ORDNUM")
    private String sysGenOrdnum;

    @Column(name = "ACTUAL_AMOUNT")
    private BigDecimal actualAmount;

    @Column(name = "PAID_AMOUNT")
    private BigDecimal paidAmount;

    /**
     * 小区开发商
     */
    @Column(name = "DEVELOPER")
    private String developer;

    @Column(name = "MEASURED")
    private Date measured;

    @Column(name = "MEASURE")
    private Date measure;

    /**
     * 实际出图时间
     */
    @Column(name = "DRAWED")
    private Date drawed;

    /**
     * 预计出图时间
     */
    @Column(name = "DRAW")
    private Date draw;

    @Column(name = "CHANNEL_ID")
    private String channelId;

    /**
     * 秘钥
     */
    @Column(name = "KEY_WORDS")
    private String keyWords;

    /**
     * 下预订单预计时间
     */
    @Column(name = "CREATE_ORDER")
    private Date createOrder;

    /**
     * 下预订单实际时间
     */
    @Column(name = "CREATE_ORDERED")
    private Date createOrdered;

    /**
     * 确图预计日期
     */
    @Column(name = "COMMIT_DRAW")
    private Date commitDraw;

    /**
     * 确图实际日期
     */
    @Column(name = "COMMIT_DRAWED")
    private Date commitDrawed;

    /**
     * 下单预计时间
     */
    @Column(name = "COMMIT_ORDER")
    private Date commitOrder;

    /**
     * 下单实际时间
     */
    @Column(name = "COMMIT_ORDERED")
    private Date commitOrdered;

    /**
     * 审图预计时间
     */
    @Column(name = "CHECK_DRAW")
    private Date checkDraw;

    /**
     * 审图实际时间
     */
    @Column(name = "CHECK_DRAWED")
    private Date checkDrawed;

    /**
     * 拍单日期
     */
    @Column(name = "ISSUE_ORDER_DATE")
    private Date issueOrderDate;

    /**
     * 是否被转换成正式订单
     */
    @Column(name = "IS_FORMAL")
    private String isFormal;

    /**
     * 复尺出图日期
     */
    @Column(name = "RE_DRAW")
    private Date reDraw;

    /**
     * 是否收销售款
     */
    @Column(name = "IS_GATHERING")
    private String isGathering;

    /**
     * 信息录入来源（WEIXIN, PC, IPAD）
     */
    @Column(name = "INFO_SOURCE")
    private String infoSource;

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
     * 获取潜客Id
     *
     * @return CUSTOMER_ID - 潜客Id
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 设置潜客Id
     *
     * @param customerId 潜客Id
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * 获取导购ID
     *
     * @return GUIDE_ID - 导购ID
     */
    public String getGuideId() {
        return guideId;
    }

    /**
     * 设置导购ID
     *
     * @param guideId 导购ID
     */
    public void setGuideId(String guideId) {
        this.guideId = guideId;
    }

    /**
     * 获取设计师ID
     *
     * @return DESIGNER_ID - 设计师ID
     */
    public String getDesignerId() {
        return designerId;
    }

    /**
     * 设置设计师ID
     *
     * @param designerId 设计师ID
     */
    public void setDesignerId(String designerId) {
        this.designerId = designerId;
    }

    /**
     * 获取一级来源
     *
     * @return SOURCE - 一级来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置一级来源
     *
     * @param source 一级来源
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获取次要电话号码
     *
     * @return PHONE2 - 次要电话号码
     */
    public String getPhone2() {
        return phone2;
    }

    /**
     * 设置次要电话号码
     *
     * @param phone2 次要电话号码
     */
    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    /**
     * 获取邮箱
     *
     * @return EMAIL - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取其他联系姓名
     *
     * @return CONNECT_NAME - 其他联系姓名
     */
    public String getConnectName() {
        return connectName;
    }

    /**
     * 设置其他联系姓名
     *
     * @param connectName 其他联系姓名
     */
    public void setConnectName(String connectName) {
        this.connectName = connectName;
    }

    /**
     * 获取其他联系性别
     *
     * @return CONNECT_SEX - 其他联系性别
     */
    public String getConnectSex() {
        return connectSex;
    }

    /**
     * 设置其他联系性别
     *
     * @param connectSex 其他联系性别
     */
    public void setConnectSex(String connectSex) {
        this.connectSex = connectSex;
    }

    /**
     * 获取联系内容（备注）
     *
     * @return CONNECT_COMMENT - 联系内容（备注）
     */
    public String getConnectComment() {
        return connectComment;
    }

    /**
     * 设置联系内容（备注）
     *
     * @param connectComment 联系内容（备注）
     */
    public void setConnectComment(String connectComment) {
        this.connectComment = connectComment;
    }

    /**
     * 获取其他联系电话
     *
     * @return CONNECT_PHONE - 其他联系电话
     */
    public String getConnectPhone() {
        return connectPhone;
    }

    /**
     * 设置其他联系电话
     *
     * @param connectPhone 其他联系电话
     */
    public void setConnectPhone(String connectPhone) {
        this.connectPhone = connectPhone;
    }

    /**
     * 获取门店ID
     *
     * @return ORG_ID - 门店ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置门店ID
     *
     * @param orgId 门店ID
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取城市
     *
     * @return ADDRESS_CITY - 城市
     */
    public String getAddressCity() {
        return addressCity;
    }

    /**
     * 设置城市
     *
     * @param addressCity 城市
     */
    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    /**
     * 获取县
     *
     * @return ADDRESS_COUNTY - 县
     */
    public String getAddressCounty() {
        return addressCounty;
    }

    /**
     * 设置县
     *
     * @param addressCounty 县
     */
    public void setAddressCounty(String addressCounty) {
        this.addressCounty = addressCounty;
    }

    /**
     * 获取地址
     *
     * @return ADDRESS_DETAIL - 地址
     */
    public String getAddressDetail() {
        return addressDetail;
    }

    /**
     * 设置地址
     *
     * @param addressDetail 地址
     */
    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    /**
     * 获取小区
     *
     * @return ADDRESS_CELL - 小区
     */
    public String getAddressCell() {
        return addressCell;
    }

    /**
     * 设置小区
     *
     * @param addressCell 小区
     */
    public void setAddressCell(String addressCell) {
        this.addressCell = addressCell;
    }

    /**
     * 获取主订单编号
     *
     * @return ORDER_CODE - 主订单编号
     */
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * 设置主订单编号
     *
     * @param orderCode 主订单编号
     */
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    /**
     * 获取参加的活动编码
     *
     * @return ACTIVITY_CODE - 参加的活动编码
     */
    public String getActivityCode() {
        return activityCode;
    }

    /**
     * 设置参加的活动编码
     *
     * @param activityCode 参加的活动编码
     */
    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    /**
     * 获取活动备注
     *
     * @return ACTIVITY_DESCRIPTION - 活动备注
     */
    public String getActivityDescription() {
        return activityDescription;
    }

    /**
     * 设置活动备注
     *
     * @param activityDescription 活动备注
     */
    public void setActivityDescription(String activityDescription) {
        this.activityDescription = activityDescription;
    }

    /**
     * 获取希望测量日期
     *
     * @return EXPECT_MEASURE_DATE - 希望测量日期
     */
    public Date getExpectMeasureDate() {
        return expectMeasureDate;
    }

    /**
     * 设置希望测量日期
     *
     * @param expectMeasureDate 希望测量日期
     */
    public void setExpectMeasureDate(Date expectMeasureDate) {
        this.expectMeasureDate = expectMeasureDate;
    }

    /**
     * 获取希望安装日期
     *
     * @return EXPECT_INSTALL_DATE - 希望安装日期
     */
    public Date getExpectInstallDate() {
        return expectInstallDate;
    }

    /**
     * 设置希望安装日期
     *
     * @param expectInstallDate 希望安装日期
     */
    public void setExpectInstallDate(Date expectInstallDate) {
        this.expectInstallDate = expectInstallDate;
    }

    /**
     * 获取房屋户型
     *
     * @return HOUSE_TYPE_CODE - 房屋户型
     */
    public String getHouseTypeCode() {
        return houseTypeCode;
    }

    /**
     * 设置房屋户型
     *
     * @param houseTypeCode 房屋户型
     */
    public void setHouseTypeCode(String houseTypeCode) {
        this.houseTypeCode = houseTypeCode;
    }

    /**
     * 获取装修风格
     *
     * @return DECORATION_STYLE_CODE - 装修风格
     */
    public String getDecorationStyleCode() {
        return decorationStyleCode;
    }

    /**
     * 设置装修风格
     *
     * @param decorationStyleCode 装修风格
     */
    public void setDecorationStyleCode(String decorationStyleCode) {
        this.decorationStyleCode = decorationStyleCode;
    }

    /**
     * 获取装修进度
     *
     * @return DECORATION_PROGRESS_CODE - 装修进度
     */
    public String getDecorationProgressCode() {
        return decorationProgressCode;
    }

    /**
     * 设置装修进度
     *
     * @param decorationProgressCode 装修进度
     */
    public void setDecorationProgressCode(String decorationProgressCode) {
        this.decorationProgressCode = decorationProgressCode;
    }

    /**
     * 获取职 业
     *
     * @return JOB - 职 业
     */
    public String getJob() {
        return job;
    }

    /**
     * 设置职 业
     *
     * @param job 职 业
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * 获取年 龄段
     *
     * @return AGE - 年 龄段
     */
    public String getAge() {
        return age;
    }

    /**
     * 设置年 龄段
     *
     * @param age 年 龄段
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * 获取装修方式
     *
     * @return DECORATION_METHOD_CODE - 装修方式
     */
    public String getDecorationMethodCode() {
        return decorationMethodCode;
    }

    /**
     * 设置装修方式
     *
     * @param decorationMethodCode 装修方式
     */
    public void setDecorationMethodCode(String decorationMethodCode) {
        this.decorationMethodCode = decorationMethodCode;
    }

    /**
     * 获取大致预算
     *
     * @return BUDGET - 大致预算
     */
    public String getBudget() {
        return budget;
    }

    /**
     * 设置大致预算
     *
     * @param budget 大致预算
     */
    public void setBudget(String budget) {
        this.budget = budget;
    }

    /**
     * 获取单子大小
     *
     * @return ORDER_SIZE_CODE - 单子大小
     */
    public String getOrderSizeCode() {
        return orderSizeCode;
    }

    /**
     * 设置单子大小
     *
     * @param orderSizeCode 单子大小
     */
    public void setOrderSizeCode(String orderSizeCode) {
        this.orderSizeCode = orderSizeCode;
    }

    /**
     * 获取客户消费能力
     *
     * @return COSUME_ABLITY_CODE - 客户消费能力
     */
    public String getCosumeAblityCode() {
        return cosumeAblityCode;
    }

    /**
     * 设置客户消费能力
     *
     * @param cosumeAblityCode 客户消费能力
     */
    public void setCosumeAblityCode(String cosumeAblityCode) {
        this.cosumeAblityCode = cosumeAblityCode;
    }

    /**
     * 获取单子紧迫性
     *
     * @return ORDER_PRIORITY_CODE - 单子紧迫性
     */
    public String getOrderPriorityCode() {
        return orderPriorityCode;
    }

    /**
     * 设置单子紧迫性
     *
     * @param orderPriorityCode 单子紧迫性
     */
    public void setOrderPriorityCode(String orderPriorityCode) {
        this.orderPriorityCode = orderPriorityCode;
    }

    /**
     * 获取客户可说服性
     *
     * @return PERSUADE_LEVEL_CODE - 客户可说服性
     */
    public String getPersuadeLevelCode() {
        return persuadeLevelCode;
    }

    /**
     * 设置客户可说服性
     *
     * @param persuadeLevelCode 客户可说服性
     */
    public void setPersuadeLevelCode(String persuadeLevelCode) {
        this.persuadeLevelCode = persuadeLevelCode;
    }

    /**
     * 获取创建客户时间
     *
     * @return CREATE_CUS - 创建客户时间
     */
    public Date getCreateCus() {
        return createCus;
    }

    /**
     * 设置创建客户时间
     *
     * @param createCus 创建客户时间
     */
    public void setCreateCus(Date createCus) {
        this.createCus = createCus;
    }

    /**
     * 获取当前状态
     *
     * @return CURRENT_STATUS - 当前状态
     */
    public String getCurrentStatus() {
        return currentStatus;
    }

    /**
     * 设置当前状态
     *
     * @param currentStatus 当前状态
     */
    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
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
     * 获取最新更新时间
     *
     * @return LAST_UPDATE_DATE - 最新更新时间
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * 设置最新更新时间
     *
     * @param lastUpdateDate 最新更新时间
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
     * 获取退单时间
     *
     * @return CHARGE_BACK_TIME - 退单时间
     */
    public Date getChargeBackTime() {
        return chargeBackTime;
    }

    /**
     * 设置退单时间
     *
     * @param chargeBackTime 退单时间
     */
    public void setChargeBackTime(Date chargeBackTime) {
        this.chargeBackTime = chargeBackTime;
    }

    /**
     * 获取退单原因
     *
     * @return CHARGE_BACK_REASON - 退单原因
     */
    public String getChargeBackReason() {
        return chargeBackReason;
    }

    /**
     * 设置退单原因
     *
     * @param chargeBackReason 退单原因
     */
    public void setChargeBackReason(String chargeBackReason) {
        this.chargeBackReason = chargeBackReason;
    }

    /**
     * 获取退单备注
     *
     * @return CHARGE_BACK_COMMENT - 退单备注
     */
    public String getChargeBackComment() {
        return chargeBackComment;
    }

    /**
     * 设置退单备注
     *
     * @param chargeBackComment 退单备注
     */
    public void setChargeBackComment(String chargeBackComment) {
        this.chargeBackComment = chargeBackComment;
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
     * 获取活动备注
     *
     * @return ACTIVITY_COMMENTS - 活动备注
     */
    public String getActivityComments() {
        return activityComments;
    }

    /**
     * 设置活动备注
     *
     * @param activityComments 活动备注
     */
    public void setActivityComments(String activityComments) {
        this.activityComments = activityComments;
    }

    /**
     * 获取无效原因
     *
     * @return ESHOP_INVALID_REASON - 无效原因
     */
    public String getEshopInvalidReason() {
        return eshopInvalidReason;
    }

    /**
     * 设置无效原因
     *
     * @param eshopInvalidReason 无效原因
     */
    public void setEshopInvalidReason(String eshopInvalidReason) {
        this.eshopInvalidReason = eshopInvalidReason;
    }

    /**
     * 获取无效说明
     *
     * @return ESHOP_INVALID_COMMENT - 无效说明
     */
    public String getEshopInvalidComment() {
        return eshopInvalidComment;
    }

    /**
     * 设置无效说明
     *
     * @param eshopInvalidComment 无效说明
     */
    public void setEshopInvalidComment(String eshopInvalidComment) {
        this.eshopInvalidComment = eshopInvalidComment;
    }

    /**
     * 获取撤销经销商说明
     *
     * @return REVOKE_ORG_COMMENT - 撤销经销商说明
     */
    public String getRevokeOrgComment() {
        return revokeOrgComment;
    }

    /**
     * 设置撤销经销商说明
     *
     * @param revokeOrgComment 撤销经销商说明
     */
    public void setRevokeOrgComment(String revokeOrgComment) {
        this.revokeOrgComment = revokeOrgComment;
    }

    /**
     * 获取客户二级来源
     *
     * @return SECOND_SOURCE - 客户二级来源
     */
    public String getSecondSource() {
        return secondSource;
    }

    /**
     * 设置客户二级来源
     *
     * @param secondSource 客户二级来源
     */
    public void setSecondSource(String secondSource) {
        this.secondSource = secondSource;
    }

    /**
     * 获取电商二级来源渠道
     *
     * @return TWO_SOURCE - 电商二级来源渠道
     */
    public String getTwoSource() {
        return twoSource;
    }

    /**
     * 设置电商二级来源渠道
     *
     * @param twoSource 电商二级来源渠道
     */
    public void setTwoSource(String twoSource) {
        this.twoSource = twoSource;
    }

    /**
     * 获取电商潜客需求
     *
     * @return LATENT_DEMAND - 电商潜客需求
     */
    public String getLatentDemand() {
        return latentDemand;
    }

    /**
     * 设置电商潜客需求
     *
     * @param latentDemand 电商潜客需求
     */
    public void setLatentDemand(String latentDemand) {
        this.latentDemand = latentDemand;
    }

    /**
     * 获取楼盘状况
     *
     * @return TBORDER_ID - 楼盘状况
     */
    public String getTborderId() {
        return tborderId;
    }

    /**
     * 设置楼盘状况
     *
     * @param tborderId 楼盘状况
     */
    public void setTborderId(String tborderId) {
        this.tborderId = tborderId;
    }

    /**
     * 获取订单退款状态
     *
     * @return REFUND_STATUS - 订单退款状态
     */
    public String getRefundStatus() {
        return refundStatus;
    }

    /**
     * 设置订单退款状态
     *
     * @param refundStatus 订单退款状态
     */
    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
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
     * 获取接单时间
     *
     * @return ACCEPT_DATE - 接单时间
     */
    public Date getAcceptDate() {
        return acceptDate;
    }

    /**
     * 设置接单时间
     *
     * @param acceptDate 接单时间
     */
    public void setAcceptDate(Date acceptDate) {
        this.acceptDate = acceptDate;
    }

    /**
     * 获取客人特征
     *
     * @return CUSTOMER_FEATURE - 客人特征
     */
    public String getCustomerFeature() {
        return customerFeature;
    }

    /**
     * 设置客人特征
     *
     * @param customerFeature 客人特征
     */
    public void setCustomerFeature(String customerFeature) {
        this.customerFeature = customerFeature;
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
     * 获取客户装修状态
     *
     * @return DECORATION_STATUS - 客户装修状态
     */
    public String getDecorationStatus() {
        return decorationStatus;
    }

    /**
     * 设置客户装修状态
     *
     * @param decorationStatus 客户装修状态
     */
    public void setDecorationStatus(String decorationStatus) {
        this.decorationStatus = decorationStatus;
    }

    /**
     * 获取是否交定金
     *
     * @return DEPOSIT_FLAG - 是否交定金
     */
    public String getDepositFlag() {
        return depositFlag;
    }

    /**
     * 设置是否交定金
     *
     * @param depositFlag 是否交定金
     */
    public void setDepositFlag(String depositFlag) {
        this.depositFlag = depositFlag;
    }

    /**
     * @return SYS_GEN_ORDNUM
     */
    public String getSysGenOrdnum() {
        return sysGenOrdnum;
    }

    /**
     * @param sysGenOrdnum
     */
    public void setSysGenOrdnum(String sysGenOrdnum) {
        this.sysGenOrdnum = sysGenOrdnum;
    }

    /**
     * @return ACTUAL_AMOUNT
     */
    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    /**
     * @param actualAmount
     */
    public void setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
    }

    /**
     * @return PAID_AMOUNT
     */
    public BigDecimal getPaidAmount() {
        return paidAmount;
    }

    /**
     * @param paidAmount
     */
    public void setPaidAmount(BigDecimal paidAmount) {
        this.paidAmount = paidAmount;
    }

    /**
     * 获取小区开发商
     *
     * @return DEVELOPER - 小区开发商
     */
    public String getDeveloper() {
        return developer;
    }

    /**
     * 设置小区开发商
     *
     * @param developer 小区开发商
     */
    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    /**
     * @return MEASURED
     */
    public Date getMeasured() {
        return measured;
    }

    /**
     * @param measured
     */
    public void setMeasured(Date measured) {
        this.measured = measured;
    }

    /**
     * @return MEASURE
     */
    public Date getMeasure() {
        return measure;
    }

    /**
     * @param measure
     */
    public void setMeasure(Date measure) {
        this.measure = measure;
    }

    /**
     * 获取实际出图时间
     *
     * @return DRAWED - 实际出图时间
     */
    public Date getDrawed() {
        return drawed;
    }

    /**
     * 设置实际出图时间
     *
     * @param drawed 实际出图时间
     */
    public void setDrawed(Date drawed) {
        this.drawed = drawed;
    }

    /**
     * 获取预计出图时间
     *
     * @return DRAW - 预计出图时间
     */
    public Date getDraw() {
        return draw;
    }

    /**
     * 设置预计出图时间
     *
     * @param draw 预计出图时间
     */
    public void setDraw(Date draw) {
        this.draw = draw;
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
     * 获取秘钥
     *
     * @return KEY_WORDS - 秘钥
     */
    public String getKeyWords() {
        return keyWords;
    }

    /**
     * 设置秘钥
     *
     * @param keyWords 秘钥
     */
    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    /**
     * 获取下预订单预计时间
     *
     * @return CREATE_ORDER - 下预订单预计时间
     */
    public Date getCreateOrder() {
        return createOrder;
    }

    /**
     * 设置下预订单预计时间
     *
     * @param createOrder 下预订单预计时间
     */
    public void setCreateOrder(Date createOrder) {
        this.createOrder = createOrder;
    }

    /**
     * 获取下预订单实际时间
     *
     * @return CREATE_ORDERED - 下预订单实际时间
     */
    public Date getCreateOrdered() {
        return createOrdered;
    }

    /**
     * 设置下预订单实际时间
     *
     * @param createOrdered 下预订单实际时间
     */
    public void setCreateOrdered(Date createOrdered) {
        this.createOrdered = createOrdered;
    }

    /**
     * 获取确图预计日期
     *
     * @return COMMIT_DRAW - 确图预计日期
     */
    public Date getCommitDraw() {
        return commitDraw;
    }

    /**
     * 设置确图预计日期
     *
     * @param commitDraw 确图预计日期
     */
    public void setCommitDraw(Date commitDraw) {
        this.commitDraw = commitDraw;
    }

    /**
     * 获取确图实际日期
     *
     * @return COMMIT_DRAWED - 确图实际日期
     */
    public Date getCommitDrawed() {
        return commitDrawed;
    }

    /**
     * 设置确图实际日期
     *
     * @param commitDrawed 确图实际日期
     */
    public void setCommitDrawed(Date commitDrawed) {
        this.commitDrawed = commitDrawed;
    }

    /**
     * 获取下单预计时间
     *
     * @return COMMIT_ORDER - 下单预计时间
     */
    public Date getCommitOrder() {
        return commitOrder;
    }

    /**
     * 设置下单预计时间
     *
     * @param commitOrder 下单预计时间
     */
    public void setCommitOrder(Date commitOrder) {
        this.commitOrder = commitOrder;
    }

    /**
     * 获取下单实际时间
     *
     * @return COMMIT_ORDERED - 下单实际时间
     */
    public Date getCommitOrdered() {
        return commitOrdered;
    }

    /**
     * 设置下单实际时间
     *
     * @param commitOrdered 下单实际时间
     */
    public void setCommitOrdered(Date commitOrdered) {
        this.commitOrdered = commitOrdered;
    }

    /**
     * 获取审图预计时间
     *
     * @return CHECK_DRAW - 审图预计时间
     */
    public Date getCheckDraw() {
        return checkDraw;
    }

    /**
     * 设置审图预计时间
     *
     * @param checkDraw 审图预计时间
     */
    public void setCheckDraw(Date checkDraw) {
        this.checkDraw = checkDraw;
    }

    /**
     * 获取审图实际时间
     *
     * @return CHECK_DRAWED - 审图实际时间
     */
    public Date getCheckDrawed() {
        return checkDrawed;
    }

    /**
     * 设置审图实际时间
     *
     * @param checkDrawed 审图实际时间
     */
    public void setCheckDrawed(Date checkDrawed) {
        this.checkDrawed = checkDrawed;
    }

    /**
     * 获取拍单日期
     *
     * @return ISSUE_ORDER_DATE - 拍单日期
     */
    public Date getIssueOrderDate() {
        return issueOrderDate;
    }

    /**
     * 设置拍单日期
     *
     * @param issueOrderDate 拍单日期
     */
    public void setIssueOrderDate(Date issueOrderDate) {
        this.issueOrderDate = issueOrderDate;
    }

    /**
     * 获取是否被转换成正式订单
     *
     * @return IS_FORMAL - 是否被转换成正式订单
     */
    public String getIsFormal() {
        return isFormal;
    }

    /**
     * 设置是否被转换成正式订单
     *
     * @param isFormal 是否被转换成正式订单
     */
    public void setIsFormal(String isFormal) {
        this.isFormal = isFormal;
    }

    /**
     * 获取复尺出图日期
     *
     * @return RE_DRAW - 复尺出图日期
     */
    public Date getReDraw() {
        return reDraw;
    }

    /**
     * 设置复尺出图日期
     *
     * @param reDraw 复尺出图日期
     */
    public void setReDraw(Date reDraw) {
        this.reDraw = reDraw;
    }

    /**
     * 获取是否收销售款
     *
     * @return IS_GATHERING - 是否收销售款
     */
    public String getIsGathering() {
        return isGathering;
    }

    /**
     * 设置是否收销售款
     *
     * @param isGathering 是否收销售款
     */
    public void setIsGathering(String isGathering) {
        this.isGathering = isGathering;
    }

    /**
     * 获取信息录入来源（WEIXIN, PC, IPAD）
     *
     * @return INFO_SOURCE - 信息录入来源（WEIXIN, PC, IPAD）
     */
    public String getInfoSource() {
        return infoSource;
    }

    /**
     * 设置信息录入来源（WEIXIN, PC, IPAD）
     *
     * @param infoSource 信息录入来源（WEIXIN, PC, IPAD）
     */
    public void setInfoSource(String infoSource) {
        this.infoSource = infoSource;
    }
}