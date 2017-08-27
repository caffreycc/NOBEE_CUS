package com.ricelink.weixin.mapper.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rl_opportunities")
public class RlOpportunities {
    /**
     * 商机ID
     */
    @Id
    @Column(name = "OPPORTUNITY_ID")
    @GeneratedValue(generator = "UUID")
    private String opportunityId;


    /**
     * （1,0）交定金为预定单，交全款为正式订单
     */
    @Column(name = "IS_OFFICIAL")
    private String isOfficial;

    /**
     * 客户ID
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

    /**
     * 系统自动生成的订单号
     */
    @Column(name = "SYS_GEN_ORDNUM")
    private String sysGenOrdnum;

    @Column(name = "DEVELOPER")
    private String developer;

    /**
     * 上门实际测量时间
     */
    @Column(name = "MEASURED")
    private Date measured;

    @Column(name = "MEASURE")
    private Date measure;

    @Column(name = "TOTAL_SQUARE")
    private BigDecimal totalSquare;

    @Column(name = "TOTAL_PRICE")
    private BigDecimal totalPrice;

    /**
     * 送货人
     */
    @Column(name = "DELIVERY_MAN")
    private String deliveryMan;

    /**
     * 送货电话
     */
    @Column(name = "DELIVERY_PHONE")
    private String deliveryPhone;

    @Column(name = "RELATION_FLAG")
    private String relationFlag;

    /**
     * 预计送货日期
     */
    @Column(name = "DELIVERY_DATE")
    private Date deliveryDate;

    /**
     * 确图实际日期
     */
    @Column(name = "COMMIT_DRAWED")
    private Date commitDrawed;

    /**
     * 未付金额
     */
    @Column(name = "UNPAID_AMOUNT")
    private BigDecimal unpaidAmount;

    /**
     * 已付金额（财务添加）
     */
    @Column(name = "PAID_AMOUNT")
    private BigDecimal paidAmount;

    /**
     * 实际金额
     */
    @Column(name = "ACTUAL_AMOUNT")
    private BigDecimal actualAmount;

    /**
     * 其他金额
     */
    @Column(name = "OTHER_PREFERENTIAL")
    private BigDecimal otherPreferential;

    /**
     * 定金金额
     */
    @Column(name = "DEPOSIT_AMOUNT")
    private BigDecimal depositAmount;

    /**
     * 趟门扇数
     */
    @Column(name = "DOOR_NUM")
    private Integer doorNum;

    /**
     * 订单状态
     */
    @Column(name = "ORDER_STATUS")
    private String orderStatus;

    /**
     * 下单实际时间
     */
    @Column(name = "COMMIT_ORDERED")
    private Date commitOrdered;

    /**
     * 报价审批状态
     */
    @Column(name = "ORDER_QUOTESTATUS")
    private String orderQuotestatus;

    /**
     * 报价审核人员
     */
    @Column(name = "REVIEWER")
    private String reviewer;

    /**
     * 预计出图时间
     */
    @Column(name = "DRAW")
    private Date draw;

    /**
     * 实际出图时间
     */
    @Column(name = "DRAWED")
    private Date drawed;

    /**
     * 复尺日期
     */
    @Column(name = "RE_MEASURE")
    private Date reMeasure;

    /**
     * 是否正式订单
     */
    @Column(name = "IS_FORMAL")
    private String isFormal;

    /**
     * 上门安装预计时间
     */
    @Column(name = "EXECUTE")
    private Date execute;

    /**
     * 上门安装实际时间
     */
    @Column(name = "EXECUTED")
    private Date executed;

    /**
     * 预计送货时间
     */
    @Column(name = "ISSUED_ORDER_DATE")
    private Date issuedOrderDate;

    /**
     * 手工确图时间
     */
    @Column(name = "HAND_DRAWING_TIME")
    private Date handDrawingTime;

    /**
     * 确图人
     */
    @Column(name = "HAND_DRAWING_BY")
    private String handDrawingBy;

    /**
     * 确图价格
     */
    @Column(name = "HAND_DRAWING_PRICE")
    private BigDecimal handDrawingPrice;

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
     * 复尺出图日期
     */
    @Column(name = "RE_DRAW")
    private Date reDraw;

    /**
     * 确图预计日期
     */
    @Column(name = "COMMIT_DRAW")
    private Date commitDraw;

    /**
     * 下单预计时间
     */
    @Column(name = "COMMIT_ORDER")
    private Date commitOrder;

    /**
     * 生产确认时间
     */
    @Column(name = "PRODUCTION")
    private Date production;

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
     * 工厂出货预计时间
     */
    @Column(name = "PRODUCE")
    private Date produce;

    /**
     * 工厂出货实际时间
     */
    @Column(name = "PRODUCED")
    private Date produced;

    /**
     * 客户回访预计时间
     */
    @Column(name = "INTERVIEW")
    private Date interview;

    /**
     * 客户回访实际时间
     */
    @Column(name = "INTERVIEWED")
    private Date interviewed;

    /**
     * 预计送货时间
     */
    @Column(name = "DELIVERY_TIME")
    private Date deliveryTime;

    /**
     * 创建导购
     */
    @Column(name = "CREATED_GUIDE")
    private String createdGuide;

    /**
     * 排单客户需求日期
     */
    @Column(name = "ISSUE_ORDER_DATE")
    private Date issueOrderDate;

    /**
     * 排单状态
     */
    @Column(name = "ALIGN_ORDERS_STATUS")
    private String alignOrdersStatus;

    /**
     * 时间是否已调整
     */
    @Column(name = "TIMEADJUST")
    private String timeadjust;

    /**
     * 最大订单序号
     */
    @Column(name = "MAX_ORD_SEQ")
    private String maxOrdSeq;

    /**
     * 实际送货时间
     */
    @Column(name = "DELIVERYED_DATE")
    private Date deliveryedDate;

    /**
     * 更新标志位
     */
    @Column(name = "UPDATE_FLAG")
    private String updateFlag;

    /**
     * 回访备注
     */
    @Column(name = "CALLBACK_COMMENTS")
    private String callbackComments;

    /**
     * 收款跟进事项
     */
    @Column(name = "GATHERING_FOLLOW_MATTER")
    private String gatheringFollowMatter;

    /**
     * 跟进说明
     */
    @Column(name = "FOLLOW_EXPLAIN")
    private String followExplain;

    /**
     * 下定金时间
     */
    @Column(name = "DEPOSIT_DATE")
    private Date depositDate;

    /**
     * 是否有待审的订单
     */
    @Column(name = "CHECK_ORDER")
    private String checkOrder;

    /**
     * 是否打印
     */
    @Column(name = "PRINT_FLAG")
    private String printFlag;

    /**
     * 抢单标志位
     */
    @Column(name = "GRAB_ORDER_FLAG")
    private String grabOrderFlag;

    /**
     * 客户更新日期
     */
    @Column(name = "CLIENT_UPDATE_DATE")
    private Date clientUpdateDate;

    /**
     * 抢单分配人
     */
    @Column(name = "GRAB_OPTY_ALLOT_ID")
    private String grabOptyAllotId;

    /**
     * 合同到期日期
     */
    @Column(name = "CONTRACT_EXPIRY_DATE")
    private Date contractExpiryDate;

    /**
     * PORTAL提交测量
     */
    @Column(name = "IS_PORTAL")
    private String isPortal;

    /**
     * 工厂受理订单标记位（接口更新
     */
    @Column(name = "ACCEPTED_FLAG")
    private String acceptedFlag;

    /**
     * 财务终审
     */
    @Column(name = "FINALLY_AUDIT")
    private String finallyAudit;

    /**
     * 第三级来源
     */
    @Column(name = "THIRD_SOURCE")
    private String thirdSource;

    /**
     * 广州快速下单审单状态
     */
    @Column(name = "QUICKORDER_STATUS")
    private String quickorderStatus;

    /**
     * 天猫交易号
     */
    @Column(name = "TBTRADE_ID")
    private String tbtradeId;

    /**
     * 买家昵称
     */
    @Column(name = "BUYER_NICK")
    private String buyerNick;

    /**
     * 电商三级来源
     */
    @Column(name = "THREE_SOURCE")
    private String threeSource;

    /**
     * 区域审单备注
     */
    @Column(name = "DEALER_OPTY_STATUS")
    private String dealerOptyStatus;

    /**
     * 财务终审人
     */
    @Column(name = "FINALLY_AUDIT_MAN")
    private String finallyAuditMan;

    /**
     * 财务终审时间
     */
    @Column(name = "FINALLY_AUDIT_TIME")
    private Date finallyAuditTime;

    /**
     * 单号生产时间
     */
    @Column(name = "ORDER_CREATE_TIME")
    private Date orderCreateTime;

    /**
     * 抢单客服ID
     */
    @Column(name = "GUEST_ID")
    private String guestId;

    /**
     * 发货计划时间
     */
    @Column(name = "DELIVER_SEND_TIME")
    private Date deliverSendTime;

    /**
     * 自备单备注
     */
    @Column(name = "BRING_COMMENTS")
    private String bringComments;

    /**
     * 官网主站第四来源
     */
    @Column(name = "FOUR_SOURCE")
    private String fourSource;

    /**
     * 官网主站第五来源
     */
    @Column(name = "FIVE_SOURCE")
    private String fiveSource;

    /**
     * 淘宝订单标志位
     */
    @Column(name = "TBORDER_FLAG")
    private String tborderFlag;

    /**
     * 未排出货订单数
     */
    @Column(name = "NOTPUT_PLANSHIP_ORDERNUM")
    private Long notputPlanshipOrdernum;

    /**
     * 未排订单安装数
     */
    @Column(name = "NOTPUT_INSTALL_ORDERNUM")
    private Long notputInstallOrdernum;

    /**
     * 已排安装出货订单数
     */
    @Column(name = "FULLPUT_INSTALL_ORDERNUM")
    private Long fullputInstallOrdernum;

    /**
     * 已排出货订单数
     */
    @Column(name = "FULLPUT_PLANSHIP_ORDERNUM")
    private Long fullputPlanshipOrdernum;

    /**
     * 区域审单时间
     */
    @Column(name = "DEALER_OPTY_STATUS_TIME")
    private Date dealerOptyStatusTime;

    /**
     * 包数
     */
    @Column(name = "PACKAGE_NUM")
    private Long packageNum;

    /**
     * 是否自备单
     */
    @Column(name = "IS_BRING_ORDER")
    private String isBringOrder;

    /**
     * 复尺人员
     */
    @Column(name = "RE_MEASURE_MAN")
    private String reMeasureMan;

    /**
     * 实际复尺日期
     */
    @Column(name = "RE_MEASURED")
    private Date reMeasured;

    /**
     * 接口状态：新增=1,修改=2,失效=3,已同步接口表=7
     */
    @Column(name = "PROCESS_OPERACTION")
    private Integer processOperaction;

    /**
     * 预约安装微信消息 1代表未发送 7代表已发送
     */
    @Column(name = "PROCESS_TYPE")
    private Integer processType;

    /**
     * 同步订单表的审核出货日期
     */
    @Column(name = "VERIFY_SHIP_DATE")
    private Date verifyShipDate;

    /**
     * 实际提货日期
     */
    @Column(name = "ACTUAL_DELIVERY_DATE")
    private Date actualDeliveryDate;

    /**
     * 首次提交报价时间
     */
    @Column(name = "FIRST_SUBMIT_QUOTE_TIME")
    private Date firstSubmitQuoteTime;

    /**
     * 首次报价拒绝时间
     */
    @Column(name = "FIRST_QUOTE_REJUSE_TIME")
    private Date firstQuoteRejuseTime;

    /**
     * 报价拒绝时间
     */
    @Column(name = "QUOTE_REJUSE_TIME")
    private Date quoteRejuseTime;

    /**
     * 报价通过时间
     */
    @Column(name = "QUOTE_PASS_TIME")
    private Date quotePassTime;

    /**
     * 报价拒绝次数
     */
    @Column(name = "QUOTE_REJUSE_COUNT")
    private Integer quoteRejuseCount;

    /**
     * 预计欠货到货时间
     */
    @Column(name = "ESTIMATE_OWE_TIME")
    private Date estimateOweTime;

    /**
     * 实际欠货到货时间
     */
    @Column(name = "ACTUAL_OWE_TIME")
    private Date actualOweTime;

    /**
     * 是否欠货
     */
    @Column(name = "IS_OWE")
    private String isOwe;

    /**
     * 是否可下单
     */
    @Column(name = "IS_PLACE_ORDER")
    private String isPlaceOrder;

    /**
     * 复尺备注
     */
    @Column(name = "REMEASRUE_COMMENTS")
    private String remeasrueComments;

    /**
     * IP地址
     */
    @Column(name = "IP_ADDRESS")
    private String ipAddress;

    /**
     * 撤销原因
     */
    @Column(name = "REVOKE_REASONS")
    private String revokeReasons;

    /**
     * 是否撤单
     */
    @Column(name = "IS_REVOKE")
    private String isRevoke;

    /**
     * 京东订单标志位
     */
    @Column(name = "JDORDER_FLAG")
    private String jdorderFlag;

    /**
     * 是否抽奖
     */
    @Column(name = "IS_LOTTERY")
    private String isLottery;

    /**
     * 设计师（最初）
     */
    @Column(name = "FIRST_DESIGNER")
    private String firstDesigner;

    /**
     * 改图员ID
     */
    @Column(name = "CHANGE_DRAW_ID")
    private String changeDrawId;

    /**
     * 推送微信回访状态
     */
    @Column(name = "WX_VISIT")
    private String wxVisit;

    /**
     * 1家具家品；2衣柜业务
     */
    @Column(name = "DIRECT_ORDER")
    private String directOrder;

    /**
     * 秘钥
     */
    @Column(name = "KEY_WORDS")
    private String keyWords;

    /**
     * 是否收销售款
     */
    @Column(name = "IS_GATHERING")
    private String isGathering;

    /**
     * 页面地址来源
     */
    @Column(name = "PAGE_SOURCE")
    private String pageSource;

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
     * 获取（1,0）交定金为预定单，交全款为正式订单
     *
     * @return IS_OFFICIAL - （1,0）交定金为预定单，交全款为正式订单
     */
    public String getIsOfficial() {
        return isOfficial;
    }

    /**
     * 设置（1,0）交定金为预定单，交全款为正式订单
     *
     * @param isOfficial （1,0）交定金为预定单，交全款为正式订单
     */
    public void setIsOfficial(String isOfficial) {
        this.isOfficial = isOfficial;
    }

    /**
     * 获取客户ID
     *
     * @return CUSTOMER_ID - 客户ID
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 设置客户ID
     *
     * @param customerId 客户ID
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
     * 获取系统自动生成的订单号
     *
     * @return SYS_GEN_ORDNUM - 系统自动生成的订单号
     */
    public String getSysGenOrdnum() {
        return sysGenOrdnum;
    }

    /**
     * 设置系统自动生成的订单号
     *
     * @param sysGenOrdnum 系统自动生成的订单号
     */
    public void setSysGenOrdnum(String sysGenOrdnum) {
        this.sysGenOrdnum = sysGenOrdnum;
    }

    /**
     * @return DEVELOPER
     */
    public String getDeveloper() {
        return developer;
    }

    /**
     * @param developer
     */
    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    /**
     * 获取上门实际测量时间
     *
     * @return MEASURED - 上门实际测量时间
     */
    public Date getMeasured() {
        return measured;
    }

    /**
     * 设置上门实际测量时间
     *
     * @param measured 上门实际测量时间
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
     * @return TOTAL_SQUARE
     */
    public BigDecimal getTotalSquare() {
        return totalSquare;
    }

    /**
     * @param totalSquare
     */
    public void setTotalSquare(BigDecimal totalSquare) {
        this.totalSquare = totalSquare;
    }

    /**
     * @return TOTAL_PRICE
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice
     */
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * 获取送货人
     *
     * @return DELIVERY_MAN - 送货人
     */
    public String getDeliveryMan() {
        return deliveryMan;
    }

    /**
     * 设置送货人
     *
     * @param deliveryMan 送货人
     */
    public void setDeliveryMan(String deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    /**
     * 获取送货电话
     *
     * @return DELIVERY_PHONE - 送货电话
     */
    public String getDeliveryPhone() {
        return deliveryPhone;
    }

    /**
     * 设置送货电话
     *
     * @param deliveryPhone 送货电话
     */
    public void setDeliveryPhone(String deliveryPhone) {
        this.deliveryPhone = deliveryPhone;
    }

    /**
     * @return RELATION_FLAG
     */
    public String getRelationFlag() {
        return relationFlag;
    }

    /**
     * @param relationFlag
     */
    public void setRelationFlag(String relationFlag) {
        this.relationFlag = relationFlag;
    }

    /**
     * 获取预计送货日期
     *
     * @return DELIVERY_DATE - 预计送货日期
     */
    public Date getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * 设置预计送货日期
     *
     * @param deliveryDate 预计送货日期
     */
    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
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
     * 获取未付金额
     *
     * @return UNPAID_AMOUNT - 未付金额
     */
    public BigDecimal getUnpaidAmount() {
        return unpaidAmount;
    }

    /**
     * 设置未付金额
     *
     * @param unpaidAmount 未付金额
     */
    public void setUnpaidAmount(BigDecimal unpaidAmount) {
        this.unpaidAmount = unpaidAmount;
    }

    /**
     * 获取已付金额（财务添加）
     *
     * @return PAID_AMOUNT - 已付金额（财务添加）
     */
    public BigDecimal getPaidAmount() {
        return paidAmount;
    }

    /**
     * 设置已付金额（财务添加）
     *
     * @param paidAmount 已付金额（财务添加）
     */
    public void setPaidAmount(BigDecimal paidAmount) {
        this.paidAmount = paidAmount;
    }

    /**
     * 获取实际金额
     *
     * @return ACTUAL_AMOUNT - 实际金额
     */
    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    /**
     * 设置实际金额
     *
     * @param actualAmount 实际金额
     */
    public void setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
    }

    /**
     * 获取其他金额
     *
     * @return OTHER_PREFERENTIAL - 其他金额
     */
    public BigDecimal getOtherPreferential() {
        return otherPreferential;
    }

    /**
     * 设置其他金额
     *
     * @param otherPreferential 其他金额
     */
    public void setOtherPreferential(BigDecimal otherPreferential) {
        this.otherPreferential = otherPreferential;
    }

    /**
     * 获取定金金额
     *
     * @return DEPOSIT_AMOUNT - 定金金额
     */
    public BigDecimal getDepositAmount() {
        return depositAmount;
    }

    /**
     * 设置定金金额
     *
     * @param depositAmount 定金金额
     */
    public void setDepositAmount(BigDecimal depositAmount) {
        this.depositAmount = depositAmount;
    }

    /**
     * 获取趟门扇数
     *
     * @return DOOR_NUM - 趟门扇数
     */
    public Integer getDoorNum() {
        return doorNum;
    }

    /**
     * 设置趟门扇数
     *
     * @param doorNum 趟门扇数
     */
    public void setDoorNum(Integer doorNum) {
        this.doorNum = doorNum;
    }

    /**
     * 获取订单状态
     *
     * @return ORDER_STATUS - 订单状态
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单状态
     *
     * @param orderStatus 订单状态
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
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
     * 获取报价审批状态
     *
     * @return ORDER_QUOTESTATUS - 报价审批状态
     */
    public String getOrderQuotestatus() {
        return orderQuotestatus;
    }

    /**
     * 设置报价审批状态
     *
     * @param orderQuotestatus 报价审批状态
     */
    public void setOrderQuotestatus(String orderQuotestatus) {
        this.orderQuotestatus = orderQuotestatus;
    }

    /**
     * 获取报价审核人员
     *
     * @return REVIEWER - 报价审核人员
     */
    public String getReviewer() {
        return reviewer;
    }

    /**
     * 设置报价审核人员
     *
     * @param reviewer 报价审核人员
     */
    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
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
     * 获取复尺日期
     *
     * @return RE_MEASURE - 复尺日期
     */
    public Date getReMeasure() {
        return reMeasure;
    }

    /**
     * 设置复尺日期
     *
     * @param reMeasure 复尺日期
     */
    public void setReMeasure(Date reMeasure) {
        this.reMeasure = reMeasure;
    }

    /**
     * 获取是否正式订单
     *
     * @return IS_FORMAL - 是否正式订单
     */
    public String getIsFormal() {
        return isFormal;
    }

    /**
     * 设置是否正式订单
     *
     * @param isFormal 是否正式订单
     */
    public void setIsFormal(String isFormal) {
        this.isFormal = isFormal;
    }

    /**
     * 获取上门安装预计时间
     *
     * @return EXECUTE - 上门安装预计时间
     */
    public Date getExecute() {
        return execute;
    }

    /**
     * 设置上门安装预计时间
     *
     * @param execute 上门安装预计时间
     */
    public void setExecute(Date execute) {
        this.execute = execute;
    }

    /**
     * 获取上门安装实际时间
     *
     * @return EXECUTED - 上门安装实际时间
     */
    public Date getExecuted() {
        return executed;
    }

    /**
     * 设置上门安装实际时间
     *
     * @param executed 上门安装实际时间
     */
    public void setExecuted(Date executed) {
        this.executed = executed;
    }

    /**
     * 获取预计送货时间
     *
     * @return ISSUED_ORDER_DATE - 预计送货时间
     */
    public Date getIssuedOrderDate() {
        return issuedOrderDate;
    }

    /**
     * 设置预计送货时间
     *
     * @param issuedOrderDate 预计送货时间
     */
    public void setIssuedOrderDate(Date issuedOrderDate) {
        this.issuedOrderDate = issuedOrderDate;
    }

    /**
     * 获取手工确图时间
     *
     * @return HAND_DRAWING_TIME - 手工确图时间
     */
    public Date getHandDrawingTime() {
        return handDrawingTime;
    }

    /**
     * 设置手工确图时间
     *
     * @param handDrawingTime 手工确图时间
     */
    public void setHandDrawingTime(Date handDrawingTime) {
        this.handDrawingTime = handDrawingTime;
    }

    /**
     * 获取确图人
     *
     * @return HAND_DRAWING_BY - 确图人
     */
    public String getHandDrawingBy() {
        return handDrawingBy;
    }

    /**
     * 设置确图人
     *
     * @param handDrawingBy 确图人
     */
    public void setHandDrawingBy(String handDrawingBy) {
        this.handDrawingBy = handDrawingBy;
    }

    /**
     * 获取确图价格
     *
     * @return HAND_DRAWING_PRICE - 确图价格
     */
    public BigDecimal getHandDrawingPrice() {
        return handDrawingPrice;
    }

    /**
     * 设置确图价格
     *
     * @param handDrawingPrice 确图价格
     */
    public void setHandDrawingPrice(BigDecimal handDrawingPrice) {
        this.handDrawingPrice = handDrawingPrice;
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
     * 获取生产确认时间
     *
     * @return PRODUCTION - 生产确认时间
     */
    public Date getProduction() {
        return production;
    }

    /**
     * 设置生产确认时间
     *
     * @param production 生产确认时间
     */
    public void setProduction(Date production) {
        this.production = production;
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
     * 获取工厂出货预计时间
     *
     * @return PRODUCE - 工厂出货预计时间
     */
    public Date getProduce() {
        return produce;
    }

    /**
     * 设置工厂出货预计时间
     *
     * @param produce 工厂出货预计时间
     */
    public void setProduce(Date produce) {
        this.produce = produce;
    }

    /**
     * 获取工厂出货实际时间
     *
     * @return PRODUCED - 工厂出货实际时间
     */
    public Date getProduced() {
        return produced;
    }

    /**
     * 设置工厂出货实际时间
     *
     * @param produced 工厂出货实际时间
     */
    public void setProduced(Date produced) {
        this.produced = produced;
    }

    /**
     * 获取客户回访预计时间
     *
     * @return INTERVIEW - 客户回访预计时间
     */
    public Date getInterview() {
        return interview;
    }

    /**
     * 设置客户回访预计时间
     *
     * @param interview 客户回访预计时间
     */
    public void setInterview(Date interview) {
        this.interview = interview;
    }

    /**
     * 获取客户回访实际时间
     *
     * @return INTERVIEWED - 客户回访实际时间
     */
    public Date getInterviewed() {
        return interviewed;
    }

    /**
     * 设置客户回访实际时间
     *
     * @param interviewed 客户回访实际时间
     */
    public void setInterviewed(Date interviewed) {
        this.interviewed = interviewed;
    }

    /**
     * 获取预计送货时间
     *
     * @return DELIVERY_TIME - 预计送货时间
     */
    public Date getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * 设置预计送货时间
     *
     * @param deliveryTime 预计送货时间
     */
    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * 获取创建导购
     *
     * @return CREATED_GUIDE - 创建导购
     */
    public String getCreatedGuide() {
        return createdGuide;
    }

    /**
     * 设置创建导购
     *
     * @param createdGuide 创建导购
     */
    public void setCreatedGuide(String createdGuide) {
        this.createdGuide = createdGuide;
    }

    /**
     * 获取排单客户需求日期
     *
     * @return ISSUE_ORDER_DATE - 排单客户需求日期
     */
    public Date getIssueOrderDate() {
        return issueOrderDate;
    }

    /**
     * 设置排单客户需求日期
     *
     * @param issueOrderDate 排单客户需求日期
     */
    public void setIssueOrderDate(Date issueOrderDate) {
        this.issueOrderDate = issueOrderDate;
    }

    /**
     * 获取排单状态
     *
     * @return ALIGN_ORDERS_STATUS - 排单状态
     */
    public String getAlignOrdersStatus() {
        return alignOrdersStatus;
    }

    /**
     * 设置排单状态
     *
     * @param alignOrdersStatus 排单状态
     */
    public void setAlignOrdersStatus(String alignOrdersStatus) {
        this.alignOrdersStatus = alignOrdersStatus;
    }

    /**
     * 获取时间是否已调整
     *
     * @return TIMEADJUST - 时间是否已调整
     */
    public String getTimeadjust() {
        return timeadjust;
    }

    /**
     * 设置时间是否已调整
     *
     * @param timeadjust 时间是否已调整
     */
    public void setTimeadjust(String timeadjust) {
        this.timeadjust = timeadjust;
    }

    /**
     * 获取最大订单序号
     *
     * @return MAX_ORD_SEQ - 最大订单序号
     */
    public String getMaxOrdSeq() {
        return maxOrdSeq;
    }

    /**
     * 设置最大订单序号
     *
     * @param maxOrdSeq 最大订单序号
     */
    public void setMaxOrdSeq(String maxOrdSeq) {
        this.maxOrdSeq = maxOrdSeq;
    }

    /**
     * 获取实际送货时间
     *
     * @return DELIVERYED_DATE - 实际送货时间
     */
    public Date getDeliveryedDate() {
        return deliveryedDate;
    }

    /**
     * 设置实际送货时间
     *
     * @param deliveryedDate 实际送货时间
     */
    public void setDeliveryedDate(Date deliveryedDate) {
        this.deliveryedDate = deliveryedDate;
    }

    /**
     * 获取更新标志位
     *
     * @return UPDATE_FLAG - 更新标志位
     */
    public String getUpdateFlag() {
        return updateFlag;
    }

    /**
     * 设置更新标志位
     *
     * @param updateFlag 更新标志位
     */
    public void setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag;
    }

    /**
     * 获取回访备注
     *
     * @return CALLBACK_COMMENTS - 回访备注
     */
    public String getCallbackComments() {
        return callbackComments;
    }

    /**
     * 设置回访备注
     *
     * @param callbackComments 回访备注
     */
    public void setCallbackComments(String callbackComments) {
        this.callbackComments = callbackComments;
    }

    /**
     * 获取收款跟进事项
     *
     * @return GATHERING_FOLLOW_MATTER - 收款跟进事项
     */
    public String getGatheringFollowMatter() {
        return gatheringFollowMatter;
    }

    /**
     * 设置收款跟进事项
     *
     * @param gatheringFollowMatter 收款跟进事项
     */
    public void setGatheringFollowMatter(String gatheringFollowMatter) {
        this.gatheringFollowMatter = gatheringFollowMatter;
    }

    /**
     * 获取跟进说明
     *
     * @return FOLLOW_EXPLAIN - 跟进说明
     */
    public String getFollowExplain() {
        return followExplain;
    }

    /**
     * 设置跟进说明
     *
     * @param followExplain 跟进说明
     */
    public void setFollowExplain(String followExplain) {
        this.followExplain = followExplain;
    }

    /**
     * 获取下定金时间
     *
     * @return DEPOSIT_DATE - 下定金时间
     */
    public Date getDepositDate() {
        return depositDate;
    }

    /**
     * 设置下定金时间
     *
     * @param depositDate 下定金时间
     */
    public void setDepositDate(Date depositDate) {
        this.depositDate = depositDate;
    }

    /**
     * 获取是否有待审的订单
     *
     * @return CHECK_ORDER - 是否有待审的订单
     */
    public String getCheckOrder() {
        return checkOrder;
    }

    /**
     * 设置是否有待审的订单
     *
     * @param checkOrder 是否有待审的订单
     */
    public void setCheckOrder(String checkOrder) {
        this.checkOrder = checkOrder;
    }

    /**
     * 获取是否打印
     *
     * @return PRINT_FLAG - 是否打印
     */
    public String getPrintFlag() {
        return printFlag;
    }

    /**
     * 设置是否打印
     *
     * @param printFlag 是否打印
     */
    public void setPrintFlag(String printFlag) {
        this.printFlag = printFlag;
    }

    /**
     * 获取抢单标志位
     *
     * @return GRAB_ORDER_FLAG - 抢单标志位
     */
    public String getGrabOrderFlag() {
        return grabOrderFlag;
    }

    /**
     * 设置抢单标志位
     *
     * @param grabOrderFlag 抢单标志位
     */
    public void setGrabOrderFlag(String grabOrderFlag) {
        this.grabOrderFlag = grabOrderFlag;
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
     * 获取抢单分配人
     *
     * @return GRAB_OPTY_ALLOT_ID - 抢单分配人
     */
    public String getGrabOptyAllotId() {
        return grabOptyAllotId;
    }

    /**
     * 设置抢单分配人
     *
     * @param grabOptyAllotId 抢单分配人
     */
    public void setGrabOptyAllotId(String grabOptyAllotId) {
        this.grabOptyAllotId = grabOptyAllotId;
    }

    /**
     * 获取合同到期日期
     *
     * @return CONTRACT_EXPIRY_DATE - 合同到期日期
     */
    public Date getContractExpiryDate() {
        return contractExpiryDate;
    }

    /**
     * 设置合同到期日期
     *
     * @param contractExpiryDate 合同到期日期
     */
    public void setContractExpiryDate(Date contractExpiryDate) {
        this.contractExpiryDate = contractExpiryDate;
    }

    /**
     * 获取PORTAL提交测量
     *
     * @return IS_PORTAL - PORTAL提交测量
     */
    public String getIsPortal() {
        return isPortal;
    }

    /**
     * 设置PORTAL提交测量
     *
     * @param isPortal PORTAL提交测量
     */
    public void setIsPortal(String isPortal) {
        this.isPortal = isPortal;
    }

    /**
     * 获取工厂受理订单标记位（接口更新
     *
     * @return ACCEPTED_FLAG - 工厂受理订单标记位（接口更新
     */
    public String getAcceptedFlag() {
        return acceptedFlag;
    }

    /**
     * 设置工厂受理订单标记位（接口更新
     *
     * @param acceptedFlag 工厂受理订单标记位（接口更新
     */
    public void setAcceptedFlag(String acceptedFlag) {
        this.acceptedFlag = acceptedFlag;
    }

    /**
     * 获取财务终审
     *
     * @return FINALLY_AUDIT - 财务终审
     */
    public String getFinallyAudit() {
        return finallyAudit;
    }

    /**
     * 设置财务终审
     *
     * @param finallyAudit 财务终审
     */
    public void setFinallyAudit(String finallyAudit) {
        this.finallyAudit = finallyAudit;
    }

    /**
     * 获取第三级来源
     *
     * @return THIRD_SOURCE - 第三级来源
     */
    public String getThirdSource() {
        return thirdSource;
    }

    /**
     * 设置第三级来源
     *
     * @param thirdSource 第三级来源
     */
    public void setThirdSource(String thirdSource) {
        this.thirdSource = thirdSource;
    }

    /**
     * 获取广州快速下单审单状态
     *
     * @return QUICKORDER_STATUS - 广州快速下单审单状态
     */
    public String getQuickorderStatus() {
        return quickorderStatus;
    }

    /**
     * 设置广州快速下单审单状态
     *
     * @param quickorderStatus 广州快速下单审单状态
     */
    public void setQuickorderStatus(String quickorderStatus) {
        this.quickorderStatus = quickorderStatus;
    }

    /**
     * 获取天猫交易号
     *
     * @return TBTRADE_ID - 天猫交易号
     */
    public String getTbtradeId() {
        return tbtradeId;
    }

    /**
     * 设置天猫交易号
     *
     * @param tbtradeId 天猫交易号
     */
    public void setTbtradeId(String tbtradeId) {
        this.tbtradeId = tbtradeId;
    }

    /**
     * 获取买家昵称
     *
     * @return BUYER_NICK - 买家昵称
     */
    public String getBuyerNick() {
        return buyerNick;
    }

    /**
     * 设置买家昵称
     *
     * @param buyerNick 买家昵称
     */
    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    /**
     * 获取电商三级来源
     *
     * @return THREE_SOURCE - 电商三级来源
     */
    public String getThreeSource() {
        return threeSource;
    }

    /**
     * 设置电商三级来源
     *
     * @param threeSource 电商三级来源
     */
    public void setThreeSource(String threeSource) {
        this.threeSource = threeSource;
    }

    /**
     * 获取区域审单备注
     *
     * @return DEALER_OPTY_STATUS - 区域审单备注
     */
    public String getDealerOptyStatus() {
        return dealerOptyStatus;
    }

    /**
     * 设置区域审单备注
     *
     * @param dealerOptyStatus 区域审单备注
     */
    public void setDealerOptyStatus(String dealerOptyStatus) {
        this.dealerOptyStatus = dealerOptyStatus;
    }

    /**
     * 获取财务终审人
     *
     * @return FINALLY_AUDIT_MAN - 财务终审人
     */
    public String getFinallyAuditMan() {
        return finallyAuditMan;
    }

    /**
     * 设置财务终审人
     *
     * @param finallyAuditMan 财务终审人
     */
    public void setFinallyAuditMan(String finallyAuditMan) {
        this.finallyAuditMan = finallyAuditMan;
    }

    /**
     * 获取财务终审时间
     *
     * @return FINALLY_AUDIT_TIME - 财务终审时间
     */
    public Date getFinallyAuditTime() {
        return finallyAuditTime;
    }

    /**
     * 设置财务终审时间
     *
     * @param finallyAuditTime 财务终审时间
     */
    public void setFinallyAuditTime(Date finallyAuditTime) {
        this.finallyAuditTime = finallyAuditTime;
    }

    /**
     * 获取单号生产时间
     *
     * @return ORDER_CREATE_TIME - 单号生产时间
     */
    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    /**
     * 设置单号生产时间
     *
     * @param orderCreateTime 单号生产时间
     */
    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    /**
     * 获取抢单客服ID
     *
     * @return GUEST_ID - 抢单客服ID
     */
    public String getGuestId() {
        return guestId;
    }

    /**
     * 设置抢单客服ID
     *
     * @param guestId 抢单客服ID
     */
    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    /**
     * 获取发货计划时间
     *
     * @return DELIVER_SEND_TIME - 发货计划时间
     */
    public Date getDeliverSendTime() {
        return deliverSendTime;
    }

    /**
     * 设置发货计划时间
     *
     * @param deliverSendTime 发货计划时间
     */
    public void setDeliverSendTime(Date deliverSendTime) {
        this.deliverSendTime = deliverSendTime;
    }

    /**
     * 获取自备单备注
     *
     * @return BRING_COMMENTS - 自备单备注
     */
    public String getBringComments() {
        return bringComments;
    }

    /**
     * 设置自备单备注
     *
     * @param bringComments 自备单备注
     */
    public void setBringComments(String bringComments) {
        this.bringComments = bringComments;
    }

    /**
     * 获取官网主站第四来源
     *
     * @return FOUR_SOURCE - 官网主站第四来源
     */
    public String getFourSource() {
        return fourSource;
    }

    /**
     * 设置官网主站第四来源
     *
     * @param fourSource 官网主站第四来源
     */
    public void setFourSource(String fourSource) {
        this.fourSource = fourSource;
    }

    /**
     * 获取官网主站第五来源
     *
     * @return FIVE_SOURCE - 官网主站第五来源
     */
    public String getFiveSource() {
        return fiveSource;
    }

    /**
     * 设置官网主站第五来源
     *
     * @param fiveSource 官网主站第五来源
     */
    public void setFiveSource(String fiveSource) {
        this.fiveSource = fiveSource;
    }

    /**
     * 获取淘宝订单标志位
     *
     * @return TBORDER_FLAG - 淘宝订单标志位
     */
    public String getTborderFlag() {
        return tborderFlag;
    }

    /**
     * 设置淘宝订单标志位
     *
     * @param tborderFlag 淘宝订单标志位
     */
    public void setTborderFlag(String tborderFlag) {
        this.tborderFlag = tborderFlag;
    }

    /**
     * 获取未排出货订单数
     *
     * @return NOTPUT_PLANSHIP_ORDERNUM - 未排出货订单数
     */
    public Long getNotputPlanshipOrdernum() {
        return notputPlanshipOrdernum;
    }

    /**
     * 设置未排出货订单数
     *
     * @param notputPlanshipOrdernum 未排出货订单数
     */
    public void setNotputPlanshipOrdernum(Long notputPlanshipOrdernum) {
        this.notputPlanshipOrdernum = notputPlanshipOrdernum;
    }

    /**
     * 获取未排订单安装数
     *
     * @return NOTPUT_INSTALL_ORDERNUM - 未排订单安装数
     */
    public Long getNotputInstallOrdernum() {
        return notputInstallOrdernum;
    }

    /**
     * 设置未排订单安装数
     *
     * @param notputInstallOrdernum 未排订单安装数
     */
    public void setNotputInstallOrdernum(Long notputInstallOrdernum) {
        this.notputInstallOrdernum = notputInstallOrdernum;
    }

    /**
     * 获取已排安装出货订单数
     *
     * @return FULLPUT_INSTALL_ORDERNUM - 已排安装出货订单数
     */
    public Long getFullputInstallOrdernum() {
        return fullputInstallOrdernum;
    }

    /**
     * 设置已排安装出货订单数
     *
     * @param fullputInstallOrdernum 已排安装出货订单数
     */
    public void setFullputInstallOrdernum(Long fullputInstallOrdernum) {
        this.fullputInstallOrdernum = fullputInstallOrdernum;
    }

    /**
     * 获取已排出货订单数
     *
     * @return FULLPUT_PLANSHIP_ORDERNUM - 已排出货订单数
     */
    public Long getFullputPlanshipOrdernum() {
        return fullputPlanshipOrdernum;
    }

    /**
     * 设置已排出货订单数
     *
     * @param fullputPlanshipOrdernum 已排出货订单数
     */
    public void setFullputPlanshipOrdernum(Long fullputPlanshipOrdernum) {
        this.fullputPlanshipOrdernum = fullputPlanshipOrdernum;
    }

    /**
     * 获取区域审单时间
     *
     * @return DEALER_OPTY_STATUS_TIME - 区域审单时间
     */
    public Date getDealerOptyStatusTime() {
        return dealerOptyStatusTime;
    }

    /**
     * 设置区域审单时间
     *
     * @param dealerOptyStatusTime 区域审单时间
     */
    public void setDealerOptyStatusTime(Date dealerOptyStatusTime) {
        this.dealerOptyStatusTime = dealerOptyStatusTime;
    }

    /**
     * 获取包数
     *
     * @return PACKAGE_NUM - 包数
     */
    public Long getPackageNum() {
        return packageNum;
    }

    /**
     * 设置包数
     *
     * @param packageNum 包数
     */
    public void setPackageNum(Long packageNum) {
        this.packageNum = packageNum;
    }

    /**
     * 获取是否自备单
     *
     * @return IS_BRING_ORDER - 是否自备单
     */
    public String getIsBringOrder() {
        return isBringOrder;
    }

    /**
     * 设置是否自备单
     *
     * @param isBringOrder 是否自备单
     */
    public void setIsBringOrder(String isBringOrder) {
        this.isBringOrder = isBringOrder;
    }

    /**
     * 获取复尺人员
     *
     * @return RE_MEASURE_MAN - 复尺人员
     */
    public String getReMeasureMan() {
        return reMeasureMan;
    }

    /**
     * 设置复尺人员
     *
     * @param reMeasureMan 复尺人员
     */
    public void setReMeasureMan(String reMeasureMan) {
        this.reMeasureMan = reMeasureMan;
    }

    /**
     * 获取实际复尺日期
     *
     * @return RE_MEASURED - 实际复尺日期
     */
    public Date getReMeasured() {
        return reMeasured;
    }

    /**
     * 设置实际复尺日期
     *
     * @param reMeasured 实际复尺日期
     */
    public void setReMeasured(Date reMeasured) {
        this.reMeasured = reMeasured;
    }

    /**
     * 获取接口状态：新增=1,修改=2,失效=3,已同步接口表=7
     *
     * @return PROCESS_OPERACTION - 接口状态：新增=1,修改=2,失效=3,已同步接口表=7
     */
    public Integer getProcessOperaction() {
        return processOperaction;
    }

    /**
     * 设置接口状态：新增=1,修改=2,失效=3,已同步接口表=7
     *
     * @param processOperaction 接口状态：新增=1,修改=2,失效=3,已同步接口表=7
     */
    public void setProcessOperaction(Integer processOperaction) {
        this.processOperaction = processOperaction;
    }

    /**
     * 获取预约安装微信消息 1代表未发送 7代表已发送
     *
     * @return PROCESS_TYPE - 预约安装微信消息 1代表未发送 7代表已发送
     */
    public Integer getProcessType() {
        return processType;
    }

    /**
     * 设置预约安装微信消息 1代表未发送 7代表已发送
     *
     * @param processType 预约安装微信消息 1代表未发送 7代表已发送
     */
    public void setProcessType(Integer processType) {
        this.processType = processType;
    }

    /**
     * 获取同步订单表的审核出货日期
     *
     * @return VERIFY_SHIP_DATE - 同步订单表的审核出货日期
     */
    public Date getVerifyShipDate() {
        return verifyShipDate;
    }

    /**
     * 设置同步订单表的审核出货日期
     *
     * @param verifyShipDate 同步订单表的审核出货日期
     */
    public void setVerifyShipDate(Date verifyShipDate) {
        this.verifyShipDate = verifyShipDate;
    }

    /**
     * 获取实际提货日期
     *
     * @return ACTUAL_DELIVERY_DATE - 实际提货日期
     */
    public Date getActualDeliveryDate() {
        return actualDeliveryDate;
    }

    /**
     * 设置实际提货日期
     *
     * @param actualDeliveryDate 实际提货日期
     */
    public void setActualDeliveryDate(Date actualDeliveryDate) {
        this.actualDeliveryDate = actualDeliveryDate;
    }

    /**
     * 获取首次提交报价时间
     *
     * @return FIRST_SUBMIT_QUOTE_TIME - 首次提交报价时间
     */
    public Date getFirstSubmitQuoteTime() {
        return firstSubmitQuoteTime;
    }

    /**
     * 设置首次提交报价时间
     *
     * @param firstSubmitQuoteTime 首次提交报价时间
     */
    public void setFirstSubmitQuoteTime(Date firstSubmitQuoteTime) {
        this.firstSubmitQuoteTime = firstSubmitQuoteTime;
    }

    /**
     * 获取首次报价拒绝时间
     *
     * @return FIRST_QUOTE_REJUSE_TIME - 首次报价拒绝时间
     */
    public Date getFirstQuoteRejuseTime() {
        return firstQuoteRejuseTime;
    }

    /**
     * 设置首次报价拒绝时间
     *
     * @param firstQuoteRejuseTime 首次报价拒绝时间
     */
    public void setFirstQuoteRejuseTime(Date firstQuoteRejuseTime) {
        this.firstQuoteRejuseTime = firstQuoteRejuseTime;
    }

    /**
     * 获取报价拒绝时间
     *
     * @return QUOTE_REJUSE_TIME - 报价拒绝时间
     */
    public Date getQuoteRejuseTime() {
        return quoteRejuseTime;
    }

    /**
     * 设置报价拒绝时间
     *
     * @param quoteRejuseTime 报价拒绝时间
     */
    public void setQuoteRejuseTime(Date quoteRejuseTime) {
        this.quoteRejuseTime = quoteRejuseTime;
    }

    /**
     * 获取报价通过时间
     *
     * @return QUOTE_PASS_TIME - 报价通过时间
     */
    public Date getQuotePassTime() {
        return quotePassTime;
    }

    /**
     * 设置报价通过时间
     *
     * @param quotePassTime 报价通过时间
     */
    public void setQuotePassTime(Date quotePassTime) {
        this.quotePassTime = quotePassTime;
    }

    /**
     * 获取报价拒绝次数
     *
     * @return QUOTE_REJUSE_COUNT - 报价拒绝次数
     */
    public Integer getQuoteRejuseCount() {
        return quoteRejuseCount;
    }

    /**
     * 设置报价拒绝次数
     *
     * @param quoteRejuseCount 报价拒绝次数
     */
    public void setQuoteRejuseCount(Integer quoteRejuseCount) {
        this.quoteRejuseCount = quoteRejuseCount;
    }

    /**
     * 获取预计欠货到货时间
     *
     * @return ESTIMATE_OWE_TIME - 预计欠货到货时间
     */
    public Date getEstimateOweTime() {
        return estimateOweTime;
    }

    /**
     * 设置预计欠货到货时间
     *
     * @param estimateOweTime 预计欠货到货时间
     */
    public void setEstimateOweTime(Date estimateOweTime) {
        this.estimateOweTime = estimateOweTime;
    }

    /**
     * 获取实际欠货到货时间
     *
     * @return ACTUAL_OWE_TIME - 实际欠货到货时间
     */
    public Date getActualOweTime() {
        return actualOweTime;
    }

    /**
     * 设置实际欠货到货时间
     *
     * @param actualOweTime 实际欠货到货时间
     */
    public void setActualOweTime(Date actualOweTime) {
        this.actualOweTime = actualOweTime;
    }

    /**
     * 获取是否欠货
     *
     * @return IS_OWE - 是否欠货
     */
    public String getIsOwe() {
        return isOwe;
    }

    /**
     * 设置是否欠货
     *
     * @param isOwe 是否欠货
     */
    public void setIsOwe(String isOwe) {
        this.isOwe = isOwe;
    }

    /**
     * 获取是否可下单
     *
     * @return IS_PLACE_ORDER - 是否可下单
     */
    public String getIsPlaceOrder() {
        return isPlaceOrder;
    }

    /**
     * 设置是否可下单
     *
     * @param isPlaceOrder 是否可下单
     */
    public void setIsPlaceOrder(String isPlaceOrder) {
        this.isPlaceOrder = isPlaceOrder;
    }

    /**
     * 获取复尺备注
     *
     * @return REMEASRUE_COMMENTS - 复尺备注
     */
    public String getRemeasrueComments() {
        return remeasrueComments;
    }

    /**
     * 设置复尺备注
     *
     * @param remeasrueComments 复尺备注
     */
    public void setRemeasrueComments(String remeasrueComments) {
        this.remeasrueComments = remeasrueComments;
    }

    /**
     * 获取IP地址
     *
     * @return IP_ADDRESS - IP地址
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * 设置IP地址
     *
     * @param ipAddress IP地址
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * 获取撤销原因
     *
     * @return REVOKE_REASONS - 撤销原因
     */
    public String getRevokeReasons() {
        return revokeReasons;
    }

    /**
     * 设置撤销原因
     *
     * @param revokeReasons 撤销原因
     */
    public void setRevokeReasons(String revokeReasons) {
        this.revokeReasons = revokeReasons;
    }

    /**
     * 获取是否撤单
     *
     * @return IS_REVOKE - 是否撤单
     */
    public String getIsRevoke() {
        return isRevoke;
    }

    /**
     * 设置是否撤单
     *
     * @param isRevoke 是否撤单
     */
    public void setIsRevoke(String isRevoke) {
        this.isRevoke = isRevoke;
    }

    /**
     * 获取京东订单标志位
     *
     * @return JDORDER_FLAG - 京东订单标志位
     */
    public String getJdorderFlag() {
        return jdorderFlag;
    }

    /**
     * 设置京东订单标志位
     *
     * @param jdorderFlag 京东订单标志位
     */
    public void setJdorderFlag(String jdorderFlag) {
        this.jdorderFlag = jdorderFlag;
    }

    /**
     * 获取是否抽奖
     *
     * @return IS_LOTTERY - 是否抽奖
     */
    public String getIsLottery() {
        return isLottery;
    }

    /**
     * 设置是否抽奖
     *
     * @param isLottery 是否抽奖
     */
    public void setIsLottery(String isLottery) {
        this.isLottery = isLottery;
    }

    /**
     * 获取设计师（最初）
     *
     * @return FIRST_DESIGNER - 设计师（最初）
     */
    public String getFirstDesigner() {
        return firstDesigner;
    }

    /**
     * 设置设计师（最初）
     *
     * @param firstDesigner 设计师（最初）
     */
    public void setFirstDesigner(String firstDesigner) {
        this.firstDesigner = firstDesigner;
    }

    /**
     * 获取改图员ID
     *
     * @return CHANGE_DRAW_ID - 改图员ID
     */
    public String getChangeDrawId() {
        return changeDrawId;
    }

    /**
     * 设置改图员ID
     *
     * @param changeDrawId 改图员ID
     */
    public void setChangeDrawId(String changeDrawId) {
        this.changeDrawId = changeDrawId;
    }

    /**
     * 获取推送微信回访状态
     *
     * @return WX_VISIT - 推送微信回访状态
     */
    public String getWxVisit() {
        return wxVisit;
    }

    /**
     * 设置推送微信回访状态
     *
     * @param wxVisit 推送微信回访状态
     */
    public void setWxVisit(String wxVisit) {
        this.wxVisit = wxVisit;
    }

    /**
     * 获取1家具家品；2衣柜业务
     *
     * @return DIRECT_ORDER - 1家具家品；2衣柜业务
     */
    public String getDirectOrder() {
        return directOrder;
    }

    /**
     * 设置1家具家品；2衣柜业务
     *
     * @param directOrder 1家具家品；2衣柜业务
     */
    public void setDirectOrder(String directOrder) {
        this.directOrder = directOrder;
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
     * 获取页面地址来源
     *
     * @return PAGE_SOURCE - 页面地址来源
     */
    public String getPageSource() {
        return pageSource;
    }

    /**
     * 设置页面地址来源
     *
     * @param pageSource 页面地址来源
     */
    public void setPageSource(String pageSource) {
        this.pageSource = pageSource;
    }
}