package com.ricelink.weixin.mapper.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "rl_order")
public class RlOrder {
    /**
     * 主键
     */
    @Id
    @Column(name = "ORDER_ID")
    private String orderId;

    /**
     * 文件名
     */
    @Column(name = "OPTY_ID")
    private String optyId;

    /**
     * 订单编号
     */
    @Column(name = "ORDER_NUM")
    private String orderNum;

    /**
     * 订单类型
     */
    @Column(name = "ORDER_TYPE")
    private String orderType;

    /**
     * 阶段
     */
    @Column(name = "ORDER_STAGE")
    private String orderStage;

    /**
     * 促销活动ID
     */
    @Column(name = "PROM_ID")
    private String promId;

    /**
     * 促销活动
     */
    @Column(name = "PROMOTION")
    private String promotion;

    /**
     * 折扣
     */
    @Column(name = "DISCOUNT")
    private BigDecimal discount;

    /**
     * 报价审批意见
     */
    @Column(name = "QUOTE_APPRV_COMMENT")
    private String quoteApprvComment;

    /**
     * 状态
     */
    @Column(name = "ORDER_STATUS")
    private String orderStatus;

    /**
     * 报价名称
     */
    @Column(name = "COMMENTS")
    private String comments;

    /**
     * 经销商ID
     */
    @Column(name = "DEALER_ID")
    private String dealerId;

    /**
     * 门店ID
     */
    @Column(name = "SHOP_ID")
    private String shopId;

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
     * 柜身产品系列
     */
    @Column(name = "ARKBODY_PROD")
    private String arkbodyProd;

    /**
     * 柜身分类
     */
    @Column(name = "ARKBODY_TYPE")
    private String arkbodyType;

    /**
     * 拼框门吸塑分类
     */
    @Column(name = "DOOR_BC_TYPE")
    private String doorBcType;

    /**
     * 柜身装饰线类型
     */
    @Column(name = "ARKBODY_LINE_TYPE")
    private String arkbodyLineType;

    /**
     * 产品系列编码
     */
    @Column(name = "PROD_NUM")
    private String prodNum;

    /**
     * 是否有拼框门
     */
    @Column(name = "FRAME_DOOR")
    private String frameDoor;

    /**
     * 是否有趟门
     */
    @Column(name = "SLIDING_DOOR")
    private String slidingDoor;

    /**
     * 排单人员
     */
    @Column(name = "ALIGN_ORDERS_BY")
    private String alignOrdersBy;

    /**
     * 原单号
     */
    @Column(name = "ORIGINAL_NUM")
    private String originalNum;

    /**
     * 排单状态
     */
    @Column(name = "ALIGN_ORDERS_STATUS")
    private String alignOrdersStatus;

    /**
     * 排单日期
     */
    @Column(name = "ALIGN_ORDERS_DATE")
    private Date alignOrdersDate;

    /**
     * 报价审批状态
     */
    @Column(name = "ORDER_QUOTESTATUS")
    private String orderQuotestatus;

    /**
     * 跟单员
     */
    @Column(name = "FOLLOW_ID")
    private String followId;

    /**
     * 订单实际总价
     */
    @Column(name = "ITEM_TOTAL_PRICE")
    private BigDecimal itemTotalPrice;

    /**
     * 订单折扣后价格
     */
    @Column(name = "TOTAL_PRICE")
    private BigDecimal totalPrice;

    /**
     * 订单方数
     */
    @Column(name = "BOM_SQUARE")
    private BigDecimal bomSquare;

    /**
     * 首次下单时间
     */
    @Column(name = "FIRST_ORDER_DATE")
    private Date firstOrderDate;

    /**
     * 确认下单时间
     */
    @Column(name = "VERIFY_ORDER_DATE")
    private Date verifyOrderDate;

    /**
     * 工厂受理日期
     */
    @Column(name = "ACCEPTED_ORDER_DATE")
    private Date acceptedOrderDate;

    /**
     * 计划安装日期
     */
    @Column(name = "PLAN_INSTALL_DATE")
    private Date planInstallDate;

    /**
     * 计划出货日期
     */
    @Column(name = "PLAN_SHIP_DATE")
    private Date planShipDate;

    /**
     * 出货完成日期
     */
    @Column(name = "SHIP_FINISH_DATE")
    private Date shipFinishDate;

    /**
     * 是否为样板单
     */
    @Column(name = "SAMPLE_TAG")
    private String sampleTag;

    /**
     * 审批时间
     */
    @Column(name = "AUDIT_DATE")
    private Date auditDate;

    /**
     * 订单提交次数
     */
    @Column(name = "SUBMIT_COUNT")
    private Integer submitCount;

    /**
     * 更新标记位
     */
    @Column(name = "UPDATE_FLAG")
    private String updateFlag;

    /**
     * 订单审批意见
     */
    @Column(name = "ORDER_APPRV_COMMENT")
    private String orderApprvComment;

    /**
     * 下单人员
     */
    @Column(name = "SUBMIT_USER_ID")
    private String submitUserId;

    /**
     * 审核出货日期
     */
    @Column(name = "VERIFY_SHIP_DATE")
    private Date verifyShipDate;

    /**
     * 订单编号后缀
     */
    @Column(name = "ORDER_SEQ")
    private String orderSeq;

    /**
     * 件数
     */
    @Column(name = "PACKAGE_NUMBER")
    private Integer packageNumber;

    /**
     * 报价确认人
     */
    @Column(name = "AFFIRM_PEOPLE")
    private String affirmPeople;

    /**
     * 报价确认时间
     */
    @Column(name = "AFFIRM_TIME")
    private Date affirmTime;

    /**
     * 是否手工新建订单
     */
    @Column(name = "MANUAL_FLAG")
    private String manualFlag;

    /**
     * 审单人员
     */
    @Column(name = "APPRV_ORDERS_BY")
    private String apprvOrdersBy;

    /**
     * 预出货计划提交次数
     */
    @Column(name = "PLAN_SUBMIT_COUNT")
    private Integer planSubmitCount;

    /**
     * 实际提货日期
     */
    @Column(name = "ACT_DELIVERY_DATE")
    private Date actDeliveryDate;

    /**
     * 内部配件单备注信息
     */
    @Column(name = "IN_ORDER_COMMENTS")
    private String inOrderComments;

    /**
     * 预出货计划备注
     */
    @Column(name = "SHIP_PLAN_COMMENT")
    private String shipPlanComment;

    /**
     * 购货单备注信息(用于报价界面输入)
     */
    @Column(name = "BUY_ORDER_COMMENTS")
    private String buyOrderComments;

    /**
     * 实际出货时间
     */
    @Column(name = "TRUE_SHIP_TIME")
    private Date trueShipTime;

    /**
     * 区域审单备注（杭州）
     */
    @Column(name = "DEALER_ORDER_STATUS")
    private String dealerOrderStatus;

    /**
     * 广州安装日期同步ERP标记位
     */
    @Column(name = "INSTALL_DATE_FLAG")
    private String installDateFlag;

    /**
     * 点击确认下单人员
     */
    @Column(name = "CONFIRM_USER_ID")
    private String confirmUserId;

    /**
     * 是否已打印
     */
    @Column(name = "PAPER_IS_PRINT")
    private String paperIsPrint;

    /**
     * 工厂退单次数
     */
    @Column(name = "BACK_COUNT")
    private Integer backCount;

    /**
     * '是否终端客户' 
     */
    @Column(name = "IS_CLIENT_INFO")
    private String isClientInfo;

    /**
     * '复责安装队ID'
     */
    @Column(name = "INSTALL_TEAM_ID")
    private String installTeamId;

    @Column(name = "IS_SHIP_DATE_TAG")
    private String isShipDateTag;

    /**
     * '预扣款' 
     */
    @Column(name = "WITHHOLDING")
    private BigDecimal withholding;

    /**
     * 环保类型
     */
    @Column(name = "EPTYPE")
    private Integer eptype;

    /**
     * 出货方式
     */
    @Column(name = "SHIPMENTTYPE")
    private String shipmenttype;

    @Column(name = "FIRST_ORDER_AUDIT")
    private Date firstOrderAudit;

    /**
     * 订单撤回时间
     */
    @Column(name = "UNDO_ORDER_TIME")
    private Date undoOrderTime;

    /**
     * 区域审图通过时间
     */
    @Column(name = "DEALER_ORDER_STATUS_TIME")
    private Date dealerOrderStatusTime;

    /**
     * 直发单地址ID
     */
    @Column(name = "CLIENT_ADDRESS_ID")
    private String clientAddressId;

    /**
     * 特殊生产周期标志位
     */
    @Column(name = "SPECIAL_FLAG")
    private String specialFlag;

    /**
     * 生产周期类型
     */
    @Column(name = "PRODUCTION_TYPE")
    private String productionType;

    /**
     * 订单审批拒绝人
     */
    @Column(name = "ORDER_APPROVAL_MAN")
    private String orderApprovalMan;

    /**
     * 订单审批拒绝时间
     */
    @Column(name = "ORDER_APPROVAL_TIME")
    private Date orderApprovalTime;

    /**
     * 订单审批拒绝人电话
     */
    @Column(name = "ORDER_APPROVAL_PHONE")
    private String orderApprovalPhone;

    /**
     * 报价审批拒绝人
     */
    @Column(name = "QUOTE_APPROVAL_MAN")
    private String quoteApprovalMan;

    /**
     * 报价审批拒绝时间
     */
    @Column(name = "QUOTE_APPROVAL_TIME")
    private Date quoteApprovalTime;

    /**
     * 报价审批拒绝人电话
     */
    @Column(name = "QUOTE_APPROVAL_PHONE")
    private String quoteApprovalPhone;

    /**
     * 提交报价审批时间
     */
    @Column(name = "SUBMIT_QUOTE_TIME")
    private Date submitQuoteTime;

    /**
     * 货品规格ID
     */
    @Column(name = "GOODS_SPEC_ID")
    private String goodsSpecId;

    /**
     * 实际安装时间
     */
    @Column(name = "ACTUAL_INSTALL_DATE")
    private Date actualInstallDate;

    /**
     * 安装状态
     */
    @Column(name = "INSTALL_STATUS")
    private String installStatus;

    /**
     * 安装方式,ALONE独装，COOPERATION合装
     */
    @Column(name = "INSTALL_TYPE")
    private String installType;

    /**
     * 是否当日完成安装
     */
    @Column(name = "IS_INSTALL_DAY")
    private String isInstallDay;

    /**
     * 是否占据当日安装产能
     */
    @Column(name = "IS_OCCUPY_INSTALL_DAYS")
    private String isOccupyInstallDays;

    /**
     * 所属安装队ID
     */
    @Column(name = "INSTALLTEAM_ID")
    private String installteamId;

    /**
     * 门店地址
     */
    @Column(name = "SHOP_ADDRESS")
    private String shopAddress;

    /**
     * 门店电话
     */
    @Column(name = "SHOP_PHONE")
    private String shopPhone;

    /**
     * 自备备注
     */
    @Column(name = "BRING_COMMENTS")
    private String bringComments;

    /**
     * 预计送货时间
     */
    @Column(name = "DELIVERY_TIME")
    private Date deliveryTime;

    /**
     * 其他备注
     */
    @Column(name = "OTHER_COMMENTS")
    private String otherComments;

    /**
     * 安装队名称
     */
    @Column(name = "INS_TEAM_NAME")
    private String insTeamName;

    /**
     * 安装人
     */
    @Column(name = "INSTALL_USERNAME")
    private String installUsername;

    /**
     * 安装人电话
     */
    @Column(name = "INSTALL_USERPHONE")
    private String installUserphone;

    /**
     * 送货车
     */
    @Column(name = "DELIVERY_CAR")
    private String deliveryCar;

    /**
     * 送货人
     */
    @Column(name = "DELIVERYER")
    private String deliveryer;

    /**
     * 送货人电话
     */
    @Column(name = "DELIVERY_PHONE")
    private String deliveryPhone;

    /**
     * 实际送货日期
     */
    @Column(name = "ACTUAL_DELIVERY_DATE")
    private Date actualDeliveryDate;

    /**
     * 安装备注
     */
    @Column(name = "INSTALL_COMMENTS")
    private String installComments;

    /**
     * 送货备注
     */
    @Column(name = "DELIVERY_COMMENTS")
    private String deliveryComments;

    /**
     * 改补次数编码
     */
    @Column(name = "CHANGE_NUMBER_CODE")
    private String changeNumberCode;

    /**
     * 恒大券金额
     */
    @Column(name = "HD_COUPON_MONEY")
    private BigDecimal hdCouponMoney;

    /**
     * 门店现金收款
     */
    @Column(name = "HD_CASH_MONEY")
    private BigDecimal hdCashMoney;

    /**
     * 恒大订单标示
     */
    @Column(name = "HD_ORDER_FLAG")
    private String hdOrderFlag;

    /**
     * 恒大劵号
     */
    @Column(name = "HD_COUPON_NUMBER")
    private String hdCouponNumber;

    /**
     * 下厂订单地址（给计料）
     */
    @Column(name = "ORDER_ADDRESS")
    private String orderAddress;

    /**
     * 提交预出货计划人
     */
    @Column(name = "PLAN_SHIP_MAN")
    private String planShipMan;

    /**
     * 安装单
ID
     */
    @Column(name = "INSTALLBILL_ID")
    private String installbillId;

    /**
     * 审单拒绝次数
     */
    @Column(name = "REJECT_COUNT")
    private Integer rejectCount;

    /**
     * 躺门扇数
     */
    @Column(name = "DOOR_NUM")
    private Integer doorNum;

    /**
     * 吸塑款式
     */
    @Column(name = "XS_TYPE")
    private String xsType;

    /**
     * 提交预出货时间
     */
    @Column(name = "SUBMIT_SHIP_DATE")
    private Date submitShipDate;

    /**
     * 生产周期最大的物料ID
     */
    @Column(name = "PROD_ID")
    private String prodId;

    /**
     * 是否中转收发标识
     */
    @Column(name = "TRANSFER_ADDRESS_FLAG")
    private String transferAddressFlag;

    /**
     * 中转联系人
     */
    @Column(name = "TRANSFER_CONTACT")
    private String transferContact;

    /**
     * 报价审批通过时间
     */
    @Column(name = "QUOTE_PASS_TIME")
    private Date quotePassTime;

    /**
     * 订单图片是否上传到服务器标示
     */
    @Column(name = "IMGFLAG")
    private String imgflag;

    /**
     * 产品标识
     */
    @Column(name = "PROD_MARK")
    private String prodMark;

    /**
     * 柯乐芙订单标识
     */
    @Column(name = "SOLID_WOOD_ORDER")
    private String solidWoodOrder;

    /**
     * 主花色CODE
     */
    @Column(name = "MAIN_COLOR_CODE")
    private String mainColorCode;

    /**
     * 次花色Code
     */
    @Column(name = "SECOND_COLOR_CODE")
    private String secondColorCode;

    /**
     * 微信优惠劵类型
     */
    @Column(name = "WX_COUPON_TYPE")
    private String wxCouponType;

    /**
     * 是否锁定
     */
    @Column(name = "IS_CPLOCK")
    private String isCplock;

    /**
     * 订单预报价
     */
    @Column(name = "PRE_PRICE")
    private BigDecimal prePrice;

    /**
     * 装修计划ID
     */
    @Column(name = "DECORATED_PLAN_ID")
    private String decoratedPlanId;

    /**
     * 装修计划名称
     */
    @Column(name = "DECORATED_SHOP_NAME")
    private String decoratedShopName;

    /**
     * 生产OU
     */
    @Column(name = "PRODUCT_ORG")
    private String productOrg;

    /**
     * 业务实体
     */
    @Column(name = "BUSINESS_OU")
    private String businessOu;

    @Column(name = "PLANSHIP_STATUS")
    private String planshipStatus;

    @Column(name = "PLANSHIP_APPROVAL_MAN")
    private String planshipApprovalMan;

    @Column(name = "PLANSHIP_APPROVAL_TIME")
    private Date planshipApprovalTime;

    @Column(name = "PLANSHIP_APPROVAL_CONTENT")
    private String planshipApprovalContent;

    /**
     * 货币类型
     */
    @Column(name = "CURRENCY_TYPE")
    private String currencyType;

    /**
     * 图号
     */
    @Column(name = "DRAW_NO")
    private String drawNo;

    /**
     * 中转物流商
     */
    @Column(name = "TRANSFER_NAME")
    private String transferName;

    /**
     * 责任类型
     */
    @Column(name = "RESPONSIBILITY_TYPE")
    private String responsibilityType;

    /**
     * 责任部门
     */
    @Column(name = "RESPONSIBILITY_DEPARMENT")
    private String responsibilityDeparment;

    /**
     * 收件人
     */
    @Column(name = "RECEIVER_NAME")
    private String receiverName;

    /**
     * 收件人电话
     */
    @Column(name = "RECEIVER_PHONE")
    private String receiverPhone;

    /**
     * 改补原因
     */
    @Column(name = "CHANGE_REASON")
    private String changeReason;

    /**
     * 折扣/处理意见
     */
    @Column(name = "SUGGESTION")
    private String suggestion;

    /**
     * 原单生产OU
     */
    @Column(name = "OLD_PRODUCT_ORG")
    private String oldProductOrg;

    /**
     * 改补申请ID
     */
    @Column(name = "CHANGE_ORDER_ID")
    private String changeOrderId;

    /**
     * 房屋类型
     */
    @Column(name = "HOUSE_TYPE")
    private String houseType;

    /**
     * 房间楼层
     */
    @Column(name = "HOUSE_FLOOR")
    private String houseFloor;

    /**
     * 计料状态
     */
    @Column(name = "SPLIT_STATUS")
    private String splitStatus;

    /**
     * 客人省市县
     */
    @Column(name = "SPECIAL_DIRECT")
    private String specialDirect;

    /**
     * 中转联系人电话
     */
    @Column(name = "TRANSFER_PHONE")
    private String transferPhone;

    /**
     * 责任班组
     */
    @Column(name = "RESPONSIBILITY_TEAM")
    private String responsibilityTeam;

    /**
     * 计料完成时间
     */
    @Column(name = "SPLIT_TIME")
    private Date splitTime;

    /**
     * 内部直发单下单账户
     */
    @Column(name = "DIRECT_ACC_NUM")
    private String directAccNum;

    /**
     * 部门编码
     */
    @Column(name = "DEPARTMENT_ID")
    private String departmentId;

    @Column(name = "DIRECT_PROJECT_ID")
    private String directProjectId;

    /**
     * 投诉问题
     */
    @Column(name = "COMPLAIN_PROBLEM")
    private String complainProblem;

    /**
     * 0，代表非终端设计部下单，1，则代表终端设计部下单
     */
    @Column(name = "ORDER_DEPARTMENT")
    private Integer orderDepartment;

    /**
     * 仿实木系列
     */
    @Column(name = "IMITATE_SOLID_SERIES")
    private String imitateSolidSeries;

    /**
     * 中转地址
     */
    @Column(name = "TRANSFER_ADDRESS")
    private String transferAddress;

    /**
     * 获取主键
     *
     * @return ORDER_ID - 主键
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置主键
     *
     * @param orderId 主键
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取文件名
     *
     * @return OPTY_ID - 文件名
     */
    public String getOptyId() {
        return optyId;
    }

    /**
     * 设置文件名
     *
     * @param optyId 文件名
     */
    public void setOptyId(String optyId) {
        this.optyId = optyId;
    }

    /**
     * 获取订单编号
     *
     * @return ORDER_NUM - 订单编号
     */
    public String getOrderNum() {
        return orderNum;
    }

    /**
     * 设置订单编号
     *
     * @param orderNum 订单编号
     */
    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 获取订单类型
     *
     * @return ORDER_TYPE - 订单类型
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * 设置订单类型
     *
     * @param orderType 订单类型
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    /**
     * 获取阶段
     *
     * @return ORDER_STAGE - 阶段
     */
    public String getOrderStage() {
        return orderStage;
    }

    /**
     * 设置阶段
     *
     * @param orderStage 阶段
     */
    public void setOrderStage(String orderStage) {
        this.orderStage = orderStage;
    }

    /**
     * 获取促销活动ID
     *
     * @return PROM_ID - 促销活动ID
     */
    public String getPromId() {
        return promId;
    }

    /**
     * 设置促销活动ID
     *
     * @param promId 促销活动ID
     */
    public void setPromId(String promId) {
        this.promId = promId;
    }

    /**
     * 获取促销活动
     *
     * @return PROMOTION - 促销活动
     */
    public String getPromotion() {
        return promotion;
    }

    /**
     * 设置促销活动
     *
     * @param promotion 促销活动
     */
    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    /**
     * 获取折扣
     *
     * @return DISCOUNT - 折扣
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * 设置折扣
     *
     * @param discount 折扣
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * 获取报价审批意见
     *
     * @return QUOTE_APPRV_COMMENT - 报价审批意见
     */
    public String getQuoteApprvComment() {
        return quoteApprvComment;
    }

    /**
     * 设置报价审批意见
     *
     * @param quoteApprvComment 报价审批意见
     */
    public void setQuoteApprvComment(String quoteApprvComment) {
        this.quoteApprvComment = quoteApprvComment;
    }

    /**
     * 获取状态
     *
     * @return ORDER_STATUS - 状态
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置状态
     *
     * @param orderStatus 状态
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取报价名称
     *
     * @return COMMENTS - 报价名称
     */
    public String getComments() {
        return comments;
    }

    /**
     * 设置报价名称
     *
     * @param comments 报价名称
     */
    public void setComments(String comments) {
        this.comments = comments;
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
     * 获取门店ID
     *
     * @return SHOP_ID - 门店ID
     */
    public String getShopId() {
        return shopId;
    }

    /**
     * 设置门店ID
     *
     * @param shopId 门店ID
     */
    public void setShopId(String shopId) {
        this.shopId = shopId;
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

    /**
     * 获取柜身产品系列
     *
     * @return ARKBODY_PROD - 柜身产品系列
     */
    public String getArkbodyProd() {
        return arkbodyProd;
    }

    /**
     * 设置柜身产品系列
     *
     * @param arkbodyProd 柜身产品系列
     */
    public void setArkbodyProd(String arkbodyProd) {
        this.arkbodyProd = arkbodyProd;
    }

    /**
     * 获取柜身分类
     *
     * @return ARKBODY_TYPE - 柜身分类
     */
    public String getArkbodyType() {
        return arkbodyType;
    }

    /**
     * 设置柜身分类
     *
     * @param arkbodyType 柜身分类
     */
    public void setArkbodyType(String arkbodyType) {
        this.arkbodyType = arkbodyType;
    }

    /**
     * 获取拼框门吸塑分类
     *
     * @return DOOR_BC_TYPE - 拼框门吸塑分类
     */
    public String getDoorBcType() {
        return doorBcType;
    }

    /**
     * 设置拼框门吸塑分类
     *
     * @param doorBcType 拼框门吸塑分类
     */
    public void setDoorBcType(String doorBcType) {
        this.doorBcType = doorBcType;
    }

    /**
     * 获取柜身装饰线类型
     *
     * @return ARKBODY_LINE_TYPE - 柜身装饰线类型
     */
    public String getArkbodyLineType() {
        return arkbodyLineType;
    }

    /**
     * 设置柜身装饰线类型
     *
     * @param arkbodyLineType 柜身装饰线类型
     */
    public void setArkbodyLineType(String arkbodyLineType) {
        this.arkbodyLineType = arkbodyLineType;
    }

    /**
     * 获取产品系列编码
     *
     * @return PROD_NUM - 产品系列编码
     */
    public String getProdNum() {
        return prodNum;
    }

    /**
     * 设置产品系列编码
     *
     * @param prodNum 产品系列编码
     */
    public void setProdNum(String prodNum) {
        this.prodNum = prodNum;
    }

    /**
     * 获取是否有拼框门
     *
     * @return FRAME_DOOR - 是否有拼框门
     */
    public String getFrameDoor() {
        return frameDoor;
    }

    /**
     * 设置是否有拼框门
     *
     * @param frameDoor 是否有拼框门
     */
    public void setFrameDoor(String frameDoor) {
        this.frameDoor = frameDoor;
    }

    /**
     * 获取是否有趟门
     *
     * @return SLIDING_DOOR - 是否有趟门
     */
    public String getSlidingDoor() {
        return slidingDoor;
    }

    /**
     * 设置是否有趟门
     *
     * @param slidingDoor 是否有趟门
     */
    public void setSlidingDoor(String slidingDoor) {
        this.slidingDoor = slidingDoor;
    }

    /**
     * 获取排单人员
     *
     * @return ALIGN_ORDERS_BY - 排单人员
     */
    public String getAlignOrdersBy() {
        return alignOrdersBy;
    }

    /**
     * 设置排单人员
     *
     * @param alignOrdersBy 排单人员
     */
    public void setAlignOrdersBy(String alignOrdersBy) {
        this.alignOrdersBy = alignOrdersBy;
    }

    /**
     * 获取原单号
     *
     * @return ORIGINAL_NUM - 原单号
     */
    public String getOriginalNum() {
        return originalNum;
    }

    /**
     * 设置原单号
     *
     * @param originalNum 原单号
     */
    public void setOriginalNum(String originalNum) {
        this.originalNum = originalNum;
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
     * 获取排单日期
     *
     * @return ALIGN_ORDERS_DATE - 排单日期
     */
    public Date getAlignOrdersDate() {
        return alignOrdersDate;
    }

    /**
     * 设置排单日期
     *
     * @param alignOrdersDate 排单日期
     */
    public void setAlignOrdersDate(Date alignOrdersDate) {
        this.alignOrdersDate = alignOrdersDate;
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
     * 获取跟单员
     *
     * @return FOLLOW_ID - 跟单员
     */
    public String getFollowId() {
        return followId;
    }

    /**
     * 设置跟单员
     *
     * @param followId 跟单员
     */
    public void setFollowId(String followId) {
        this.followId = followId;
    }

    /**
     * 获取订单实际总价
     *
     * @return ITEM_TOTAL_PRICE - 订单实际总价
     */
    public BigDecimal getItemTotalPrice() {
        return itemTotalPrice;
    }

    /**
     * 设置订单实际总价
     *
     * @param itemTotalPrice 订单实际总价
     */
    public void setItemTotalPrice(BigDecimal itemTotalPrice) {
        this.itemTotalPrice = itemTotalPrice;
    }

    /**
     * 获取订单折扣后价格
     *
     * @return TOTAL_PRICE - 订单折扣后价格
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * 设置订单折扣后价格
     *
     * @param totalPrice 订单折扣后价格
     */
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * 获取订单方数
     *
     * @return BOM_SQUARE - 订单方数
     */
    public BigDecimal getBomSquare() {
        return bomSquare;
    }

    /**
     * 设置订单方数
     *
     * @param bomSquare 订单方数
     */
    public void setBomSquare(BigDecimal bomSquare) {
        this.bomSquare = bomSquare;
    }

    /**
     * 获取首次下单时间
     *
     * @return FIRST_ORDER_DATE - 首次下单时间
     */
    public Date getFirstOrderDate() {
        return firstOrderDate;
    }

    /**
     * 设置首次下单时间
     *
     * @param firstOrderDate 首次下单时间
     */
    public void setFirstOrderDate(Date firstOrderDate) {
        this.firstOrderDate = firstOrderDate;
    }

    /**
     * 获取确认下单时间
     *
     * @return VERIFY_ORDER_DATE - 确认下单时间
     */
    public Date getVerifyOrderDate() {
        return verifyOrderDate;
    }

    /**
     * 设置确认下单时间
     *
     * @param verifyOrderDate 确认下单时间
     */
    public void setVerifyOrderDate(Date verifyOrderDate) {
        this.verifyOrderDate = verifyOrderDate;
    }

    /**
     * 获取工厂受理日期
     *
     * @return ACCEPTED_ORDER_DATE - 工厂受理日期
     */
    public Date getAcceptedOrderDate() {
        return acceptedOrderDate;
    }

    /**
     * 设置工厂受理日期
     *
     * @param acceptedOrderDate 工厂受理日期
     */
    public void setAcceptedOrderDate(Date acceptedOrderDate) {
        this.acceptedOrderDate = acceptedOrderDate;
    }

    /**
     * 获取计划安装日期
     *
     * @return PLAN_INSTALL_DATE - 计划安装日期
     */
    public Date getPlanInstallDate() {
        return planInstallDate;
    }

    /**
     * 设置计划安装日期
     *
     * @param planInstallDate 计划安装日期
     */
    public void setPlanInstallDate(Date planInstallDate) {
        this.planInstallDate = planInstallDate;
    }

    /**
     * 获取计划出货日期
     *
     * @return PLAN_SHIP_DATE - 计划出货日期
     */
    public Date getPlanShipDate() {
        return planShipDate;
    }

    /**
     * 设置计划出货日期
     *
     * @param planShipDate 计划出货日期
     */
    public void setPlanShipDate(Date planShipDate) {
        this.planShipDate = planShipDate;
    }

    /**
     * 获取出货完成日期
     *
     * @return SHIP_FINISH_DATE - 出货完成日期
     */
    public Date getShipFinishDate() {
        return shipFinishDate;
    }

    /**
     * 设置出货完成日期
     *
     * @param shipFinishDate 出货完成日期
     */
    public void setShipFinishDate(Date shipFinishDate) {
        this.shipFinishDate = shipFinishDate;
    }

    /**
     * 获取是否为样板单
     *
     * @return SAMPLE_TAG - 是否为样板单
     */
    public String getSampleTag() {
        return sampleTag;
    }

    /**
     * 设置是否为样板单
     *
     * @param sampleTag 是否为样板单
     */
    public void setSampleTag(String sampleTag) {
        this.sampleTag = sampleTag;
    }

    /**
     * 获取审批时间
     *
     * @return AUDIT_DATE - 审批时间
     */
    public Date getAuditDate() {
        return auditDate;
    }

    /**
     * 设置审批时间
     *
     * @param auditDate 审批时间
     */
    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    /**
     * 获取订单提交次数
     *
     * @return SUBMIT_COUNT - 订单提交次数
     */
    public Integer getSubmitCount() {
        return submitCount;
    }

    /**
     * 设置订单提交次数
     *
     * @param submitCount 订单提交次数
     */
    public void setSubmitCount(Integer submitCount) {
        this.submitCount = submitCount;
    }

    /**
     * 获取更新标记位
     *
     * @return UPDATE_FLAG - 更新标记位
     */
    public String getUpdateFlag() {
        return updateFlag;
    }

    /**
     * 设置更新标记位
     *
     * @param updateFlag 更新标记位
     */
    public void setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag;
    }

    /**
     * 获取订单审批意见
     *
     * @return ORDER_APPRV_COMMENT - 订单审批意见
     */
    public String getOrderApprvComment() {
        return orderApprvComment;
    }

    /**
     * 设置订单审批意见
     *
     * @param orderApprvComment 订单审批意见
     */
    public void setOrderApprvComment(String orderApprvComment) {
        this.orderApprvComment = orderApprvComment;
    }

    /**
     * 获取下单人员
     *
     * @return SUBMIT_USER_ID - 下单人员
     */
    public String getSubmitUserId() {
        return submitUserId;
    }

    /**
     * 设置下单人员
     *
     * @param submitUserId 下单人员
     */
    public void setSubmitUserId(String submitUserId) {
        this.submitUserId = submitUserId;
    }

    /**
     * 获取审核出货日期
     *
     * @return VERIFY_SHIP_DATE - 审核出货日期
     */
    public Date getVerifyShipDate() {
        return verifyShipDate;
    }

    /**
     * 设置审核出货日期
     *
     * @param verifyShipDate 审核出货日期
     */
    public void setVerifyShipDate(Date verifyShipDate) {
        this.verifyShipDate = verifyShipDate;
    }

    /**
     * 获取订单编号后缀
     *
     * @return ORDER_SEQ - 订单编号后缀
     */
    public String getOrderSeq() {
        return orderSeq;
    }

    /**
     * 设置订单编号后缀
     *
     * @param orderSeq 订单编号后缀
     */
    public void setOrderSeq(String orderSeq) {
        this.orderSeq = orderSeq;
    }

    /**
     * 获取件数
     *
     * @return PACKAGE_NUMBER - 件数
     */
    public Integer getPackageNumber() {
        return packageNumber;
    }

    /**
     * 设置件数
     *
     * @param packageNumber 件数
     */
    public void setPackageNumber(Integer packageNumber) {
        this.packageNumber = packageNumber;
    }

    /**
     * 获取报价确认人
     *
     * @return AFFIRM_PEOPLE - 报价确认人
     */
    public String getAffirmPeople() {
        return affirmPeople;
    }

    /**
     * 设置报价确认人
     *
     * @param affirmPeople 报价确认人
     */
    public void setAffirmPeople(String affirmPeople) {
        this.affirmPeople = affirmPeople;
    }

    /**
     * 获取报价确认时间
     *
     * @return AFFIRM_TIME - 报价确认时间
     */
    public Date getAffirmTime() {
        return affirmTime;
    }

    /**
     * 设置报价确认时间
     *
     * @param affirmTime 报价确认时间
     */
    public void setAffirmTime(Date affirmTime) {
        this.affirmTime = affirmTime;
    }

    /**
     * 获取是否手工新建订单
     *
     * @return MANUAL_FLAG - 是否手工新建订单
     */
    public String getManualFlag() {
        return manualFlag;
    }

    /**
     * 设置是否手工新建订单
     *
     * @param manualFlag 是否手工新建订单
     */
    public void setManualFlag(String manualFlag) {
        this.manualFlag = manualFlag;
    }

    /**
     * 获取审单人员
     *
     * @return APPRV_ORDERS_BY - 审单人员
     */
    public String getApprvOrdersBy() {
        return apprvOrdersBy;
    }

    /**
     * 设置审单人员
     *
     * @param apprvOrdersBy 审单人员
     */
    public void setApprvOrdersBy(String apprvOrdersBy) {
        this.apprvOrdersBy = apprvOrdersBy;
    }

    /**
     * 获取预出货计划提交次数
     *
     * @return PLAN_SUBMIT_COUNT - 预出货计划提交次数
     */
    public Integer getPlanSubmitCount() {
        return planSubmitCount;
    }

    /**
     * 设置预出货计划提交次数
     *
     * @param planSubmitCount 预出货计划提交次数
     */
    public void setPlanSubmitCount(Integer planSubmitCount) {
        this.planSubmitCount = planSubmitCount;
    }

    /**
     * 获取实际提货日期
     *
     * @return ACT_DELIVERY_DATE - 实际提货日期
     */
    public Date getActDeliveryDate() {
        return actDeliveryDate;
    }

    /**
     * 设置实际提货日期
     *
     * @param actDeliveryDate 实际提货日期
     */
    public void setActDeliveryDate(Date actDeliveryDate) {
        this.actDeliveryDate = actDeliveryDate;
    }

    /**
     * 获取内部配件单备注信息
     *
     * @return IN_ORDER_COMMENTS - 内部配件单备注信息
     */
    public String getInOrderComments() {
        return inOrderComments;
    }

    /**
     * 设置内部配件单备注信息
     *
     * @param inOrderComments 内部配件单备注信息
     */
    public void setInOrderComments(String inOrderComments) {
        this.inOrderComments = inOrderComments;
    }

    /**
     * 获取预出货计划备注
     *
     * @return SHIP_PLAN_COMMENT - 预出货计划备注
     */
    public String getShipPlanComment() {
        return shipPlanComment;
    }

    /**
     * 设置预出货计划备注
     *
     * @param shipPlanComment 预出货计划备注
     */
    public void setShipPlanComment(String shipPlanComment) {
        this.shipPlanComment = shipPlanComment;
    }

    /**
     * 获取购货单备注信息(用于报价界面输入)
     *
     * @return BUY_ORDER_COMMENTS - 购货单备注信息(用于报价界面输入)
     */
    public String getBuyOrderComments() {
        return buyOrderComments;
    }

    /**
     * 设置购货单备注信息(用于报价界面输入)
     *
     * @param buyOrderComments 购货单备注信息(用于报价界面输入)
     */
    public void setBuyOrderComments(String buyOrderComments) {
        this.buyOrderComments = buyOrderComments;
    }

    /**
     * 获取实际出货时间
     *
     * @return TRUE_SHIP_TIME - 实际出货时间
     */
    public Date getTrueShipTime() {
        return trueShipTime;
    }

    /**
     * 设置实际出货时间
     *
     * @param trueShipTime 实际出货时间
     */
    public void setTrueShipTime(Date trueShipTime) {
        this.trueShipTime = trueShipTime;
    }

    /**
     * 获取区域审单备注（杭州）
     *
     * @return DEALER_ORDER_STATUS - 区域审单备注（杭州）
     */
    public String getDealerOrderStatus() {
        return dealerOrderStatus;
    }

    /**
     * 设置区域审单备注（杭州）
     *
     * @param dealerOrderStatus 区域审单备注（杭州）
     */
    public void setDealerOrderStatus(String dealerOrderStatus) {
        this.dealerOrderStatus = dealerOrderStatus;
    }

    /**
     * 获取广州安装日期同步ERP标记位
     *
     * @return INSTALL_DATE_FLAG - 广州安装日期同步ERP标记位
     */
    public String getInstallDateFlag() {
        return installDateFlag;
    }

    /**
     * 设置广州安装日期同步ERP标记位
     *
     * @param installDateFlag 广州安装日期同步ERP标记位
     */
    public void setInstallDateFlag(String installDateFlag) {
        this.installDateFlag = installDateFlag;
    }

    /**
     * 获取点击确认下单人员
     *
     * @return CONFIRM_USER_ID - 点击确认下单人员
     */
    public String getConfirmUserId() {
        return confirmUserId;
    }

    /**
     * 设置点击确认下单人员
     *
     * @param confirmUserId 点击确认下单人员
     */
    public void setConfirmUserId(String confirmUserId) {
        this.confirmUserId = confirmUserId;
    }

    /**
     * 获取是否已打印
     *
     * @return PAPER_IS_PRINT - 是否已打印
     */
    public String getPaperIsPrint() {
        return paperIsPrint;
    }

    /**
     * 设置是否已打印
     *
     * @param paperIsPrint 是否已打印
     */
    public void setPaperIsPrint(String paperIsPrint) {
        this.paperIsPrint = paperIsPrint;
    }

    /**
     * 获取工厂退单次数
     *
     * @return BACK_COUNT - 工厂退单次数
     */
    public Integer getBackCount() {
        return backCount;
    }

    /**
     * 设置工厂退单次数
     *
     * @param backCount 工厂退单次数
     */
    public void setBackCount(Integer backCount) {
        this.backCount = backCount;
    }

    /**
     * 获取'是否终端客户' 
     *
     * @return IS_CLIENT_INFO - '是否终端客户' 
     */
    public String getIsClientInfo() {
        return isClientInfo;
    }

    /**
     * 设置'是否终端客户' 
     *
     * @param isClientInfo '是否终端客户' 
     */
    public void setIsClientInfo(String isClientInfo) {
        this.isClientInfo = isClientInfo;
    }

    /**
     * 获取'复责安装队ID'
     *
     * @return INSTALL_TEAM_ID - '复责安装队ID'
     */
    public String getInstallTeamId() {
        return installTeamId;
    }

    /**
     * 设置'复责安装队ID'
     *
     * @param installTeamId '复责安装队ID'
     */
    public void setInstallTeamId(String installTeamId) {
        this.installTeamId = installTeamId;
    }

    /**
     * @return IS_SHIP_DATE_TAG
     */
    public String getIsShipDateTag() {
        return isShipDateTag;
    }

    /**
     * @param isShipDateTag
     */
    public void setIsShipDateTag(String isShipDateTag) {
        this.isShipDateTag = isShipDateTag;
    }

    /**
     * 获取'预扣款' 
     *
     * @return WITHHOLDING - '预扣款' 
     */
    public BigDecimal getWithholding() {
        return withholding;
    }

    /**
     * 设置'预扣款' 
     *
     * @param withholding '预扣款' 
     */
    public void setWithholding(BigDecimal withholding) {
        this.withholding = withholding;
    }

    /**
     * 获取环保类型
     *
     * @return EPTYPE - 环保类型
     */
    public Integer getEptype() {
        return eptype;
    }

    /**
     * 设置环保类型
     *
     * @param eptype 环保类型
     */
    public void setEptype(Integer eptype) {
        this.eptype = eptype;
    }

    /**
     * 获取出货方式
     *
     * @return SHIPMENTTYPE - 出货方式
     */
    public String getShipmenttype() {
        return shipmenttype;
    }

    /**
     * 设置出货方式
     *
     * @param shipmenttype 出货方式
     */
    public void setShipmenttype(String shipmenttype) {
        this.shipmenttype = shipmenttype;
    }

    /**
     * @return FIRST_ORDER_AUDIT
     */
    public Date getFirstOrderAudit() {
        return firstOrderAudit;
    }

    /**
     * @param firstOrderAudit
     */
    public void setFirstOrderAudit(Date firstOrderAudit) {
        this.firstOrderAudit = firstOrderAudit;
    }

    /**
     * 获取订单撤回时间
     *
     * @return UNDO_ORDER_TIME - 订单撤回时间
     */
    public Date getUndoOrderTime() {
        return undoOrderTime;
    }

    /**
     * 设置订单撤回时间
     *
     * @param undoOrderTime 订单撤回时间
     */
    public void setUndoOrderTime(Date undoOrderTime) {
        this.undoOrderTime = undoOrderTime;
    }

    /**
     * 获取区域审图通过时间
     *
     * @return DEALER_ORDER_STATUS_TIME - 区域审图通过时间
     */
    public Date getDealerOrderStatusTime() {
        return dealerOrderStatusTime;
    }

    /**
     * 设置区域审图通过时间
     *
     * @param dealerOrderStatusTime 区域审图通过时间
     */
    public void setDealerOrderStatusTime(Date dealerOrderStatusTime) {
        this.dealerOrderStatusTime = dealerOrderStatusTime;
    }

    /**
     * 获取直发单地址ID
     *
     * @return CLIENT_ADDRESS_ID - 直发单地址ID
     */
    public String getClientAddressId() {
        return clientAddressId;
    }

    /**
     * 设置直发单地址ID
     *
     * @param clientAddressId 直发单地址ID
     */
    public void setClientAddressId(String clientAddressId) {
        this.clientAddressId = clientAddressId;
    }

    /**
     * 获取特殊生产周期标志位
     *
     * @return SPECIAL_FLAG - 特殊生产周期标志位
     */
    public String getSpecialFlag() {
        return specialFlag;
    }

    /**
     * 设置特殊生产周期标志位
     *
     * @param specialFlag 特殊生产周期标志位
     */
    public void setSpecialFlag(String specialFlag) {
        this.specialFlag = specialFlag;
    }

    /**
     * 获取生产周期类型
     *
     * @return PRODUCTION_TYPE - 生产周期类型
     */
    public String getProductionType() {
        return productionType;
    }

    /**
     * 设置生产周期类型
     *
     * @param productionType 生产周期类型
     */
    public void setProductionType(String productionType) {
        this.productionType = productionType;
    }

    /**
     * 获取订单审批拒绝人
     *
     * @return ORDER_APPROVAL_MAN - 订单审批拒绝人
     */
    public String getOrderApprovalMan() {
        return orderApprovalMan;
    }

    /**
     * 设置订单审批拒绝人
     *
     * @param orderApprovalMan 订单审批拒绝人
     */
    public void setOrderApprovalMan(String orderApprovalMan) {
        this.orderApprovalMan = orderApprovalMan;
    }

    /**
     * 获取订单审批拒绝时间
     *
     * @return ORDER_APPROVAL_TIME - 订单审批拒绝时间
     */
    public Date getOrderApprovalTime() {
        return orderApprovalTime;
    }

    /**
     * 设置订单审批拒绝时间
     *
     * @param orderApprovalTime 订单审批拒绝时间
     */
    public void setOrderApprovalTime(Date orderApprovalTime) {
        this.orderApprovalTime = orderApprovalTime;
    }

    /**
     * 获取订单审批拒绝人电话
     *
     * @return ORDER_APPROVAL_PHONE - 订单审批拒绝人电话
     */
    public String getOrderApprovalPhone() {
        return orderApprovalPhone;
    }

    /**
     * 设置订单审批拒绝人电话
     *
     * @param orderApprovalPhone 订单审批拒绝人电话
     */
    public void setOrderApprovalPhone(String orderApprovalPhone) {
        this.orderApprovalPhone = orderApprovalPhone;
    }

    /**
     * 获取报价审批拒绝人
     *
     * @return QUOTE_APPROVAL_MAN - 报价审批拒绝人
     */
    public String getQuoteApprovalMan() {
        return quoteApprovalMan;
    }

    /**
     * 设置报价审批拒绝人
     *
     * @param quoteApprovalMan 报价审批拒绝人
     */
    public void setQuoteApprovalMan(String quoteApprovalMan) {
        this.quoteApprovalMan = quoteApprovalMan;
    }

    /**
     * 获取报价审批拒绝时间
     *
     * @return QUOTE_APPROVAL_TIME - 报价审批拒绝时间
     */
    public Date getQuoteApprovalTime() {
        return quoteApprovalTime;
    }

    /**
     * 设置报价审批拒绝时间
     *
     * @param quoteApprovalTime 报价审批拒绝时间
     */
    public void setQuoteApprovalTime(Date quoteApprovalTime) {
        this.quoteApprovalTime = quoteApprovalTime;
    }

    /**
     * 获取报价审批拒绝人电话
     *
     * @return QUOTE_APPROVAL_PHONE - 报价审批拒绝人电话
     */
    public String getQuoteApprovalPhone() {
        return quoteApprovalPhone;
    }

    /**
     * 设置报价审批拒绝人电话
     *
     * @param quoteApprovalPhone 报价审批拒绝人电话
     */
    public void setQuoteApprovalPhone(String quoteApprovalPhone) {
        this.quoteApprovalPhone = quoteApprovalPhone;
    }

    /**
     * 获取提交报价审批时间
     *
     * @return SUBMIT_QUOTE_TIME - 提交报价审批时间
     */
    public Date getSubmitQuoteTime() {
        return submitQuoteTime;
    }

    /**
     * 设置提交报价审批时间
     *
     * @param submitQuoteTime 提交报价审批时间
     */
    public void setSubmitQuoteTime(Date submitQuoteTime) {
        this.submitQuoteTime = submitQuoteTime;
    }

    /**
     * 获取货品规格ID
     *
     * @return GOODS_SPEC_ID - 货品规格ID
     */
    public String getGoodsSpecId() {
        return goodsSpecId;
    }

    /**
     * 设置货品规格ID
     *
     * @param goodsSpecId 货品规格ID
     */
    public void setGoodsSpecId(String goodsSpecId) {
        this.goodsSpecId = goodsSpecId;
    }

    /**
     * 获取实际安装时间
     *
     * @return ACTUAL_INSTALL_DATE - 实际安装时间
     */
    public Date getActualInstallDate() {
        return actualInstallDate;
    }

    /**
     * 设置实际安装时间
     *
     * @param actualInstallDate 实际安装时间
     */
    public void setActualInstallDate(Date actualInstallDate) {
        this.actualInstallDate = actualInstallDate;
    }

    /**
     * 获取安装状态
     *
     * @return INSTALL_STATUS - 安装状态
     */
    public String getInstallStatus() {
        return installStatus;
    }

    /**
     * 设置安装状态
     *
     * @param installStatus 安装状态
     */
    public void setInstallStatus(String installStatus) {
        this.installStatus = installStatus;
    }

    /**
     * 获取安装方式,ALONE独装，COOPERATION合装
     *
     * @return INSTALL_TYPE - 安装方式,ALONE独装，COOPERATION合装
     */
    public String getInstallType() {
        return installType;
    }

    /**
     * 设置安装方式,ALONE独装，COOPERATION合装
     *
     * @param installType 安装方式,ALONE独装，COOPERATION合装
     */
    public void setInstallType(String installType) {
        this.installType = installType;
    }

    /**
     * 获取是否当日完成安装
     *
     * @return IS_INSTALL_DAY - 是否当日完成安装
     */
    public String getIsInstallDay() {
        return isInstallDay;
    }

    /**
     * 设置是否当日完成安装
     *
     * @param isInstallDay 是否当日完成安装
     */
    public void setIsInstallDay(String isInstallDay) {
        this.isInstallDay = isInstallDay;
    }

    /**
     * 获取是否占据当日安装产能
     *
     * @return IS_OCCUPY_INSTALL_DAYS - 是否占据当日安装产能
     */
    public String getIsOccupyInstallDays() {
        return isOccupyInstallDays;
    }

    /**
     * 设置是否占据当日安装产能
     *
     * @param isOccupyInstallDays 是否占据当日安装产能
     */
    public void setIsOccupyInstallDays(String isOccupyInstallDays) {
        this.isOccupyInstallDays = isOccupyInstallDays;
    }

    /**
     * 获取所属安装队ID
     *
     * @return INSTALLTEAM_ID - 所属安装队ID
     */
    public String getInstallteamId() {
        return installteamId;
    }

    /**
     * 设置所属安装队ID
     *
     * @param installteamId 所属安装队ID
     */
    public void setInstallteamId(String installteamId) {
        this.installteamId = installteamId;
    }

    /**
     * 获取门店地址
     *
     * @return SHOP_ADDRESS - 门店地址
     */
    public String getShopAddress() {
        return shopAddress;
    }

    /**
     * 设置门店地址
     *
     * @param shopAddress 门店地址
     */
    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    /**
     * 获取门店电话
     *
     * @return SHOP_PHONE - 门店电话
     */
    public String getShopPhone() {
        return shopPhone;
    }

    /**
     * 设置门店电话
     *
     * @param shopPhone 门店电话
     */
    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone;
    }

    /**
     * 获取自备备注
     *
     * @return BRING_COMMENTS - 自备备注
     */
    public String getBringComments() {
        return bringComments;
    }

    /**
     * 设置自备备注
     *
     * @param bringComments 自备备注
     */
    public void setBringComments(String bringComments) {
        this.bringComments = bringComments;
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
     * 获取其他备注
     *
     * @return OTHER_COMMENTS - 其他备注
     */
    public String getOtherComments() {
        return otherComments;
    }

    /**
     * 设置其他备注
     *
     * @param otherComments 其他备注
     */
    public void setOtherComments(String otherComments) {
        this.otherComments = otherComments;
    }

    /**
     * 获取安装队名称
     *
     * @return INS_TEAM_NAME - 安装队名称
     */
    public String getInsTeamName() {
        return insTeamName;
    }

    /**
     * 设置安装队名称
     *
     * @param insTeamName 安装队名称
     */
    public void setInsTeamName(String insTeamName) {
        this.insTeamName = insTeamName;
    }

    /**
     * 获取安装人
     *
     * @return INSTALL_USERNAME - 安装人
     */
    public String getInstallUsername() {
        return installUsername;
    }

    /**
     * 设置安装人
     *
     * @param installUsername 安装人
     */
    public void setInstallUsername(String installUsername) {
        this.installUsername = installUsername;
    }

    /**
     * 获取安装人电话
     *
     * @return INSTALL_USERPHONE - 安装人电话
     */
    public String getInstallUserphone() {
        return installUserphone;
    }

    /**
     * 设置安装人电话
     *
     * @param installUserphone 安装人电话
     */
    public void setInstallUserphone(String installUserphone) {
        this.installUserphone = installUserphone;
    }

    /**
     * 获取送货车
     *
     * @return DELIVERY_CAR - 送货车
     */
    public String getDeliveryCar() {
        return deliveryCar;
    }

    /**
     * 设置送货车
     *
     * @param deliveryCar 送货车
     */
    public void setDeliveryCar(String deliveryCar) {
        this.deliveryCar = deliveryCar;
    }

    /**
     * 获取送货人
     *
     * @return DELIVERYER - 送货人
     */
    public String getDeliveryer() {
        return deliveryer;
    }

    /**
     * 设置送货人
     *
     * @param deliveryer 送货人
     */
    public void setDeliveryer(String deliveryer) {
        this.deliveryer = deliveryer;
    }

    /**
     * 获取送货人电话
     *
     * @return DELIVERY_PHONE - 送货人电话
     */
    public String getDeliveryPhone() {
        return deliveryPhone;
    }

    /**
     * 设置送货人电话
     *
     * @param deliveryPhone 送货人电话
     */
    public void setDeliveryPhone(String deliveryPhone) {
        this.deliveryPhone = deliveryPhone;
    }

    /**
     * 获取实际送货日期
     *
     * @return ACTUAL_DELIVERY_DATE - 实际送货日期
     */
    public Date getActualDeliveryDate() {
        return actualDeliveryDate;
    }

    /**
     * 设置实际送货日期
     *
     * @param actualDeliveryDate 实际送货日期
     */
    public void setActualDeliveryDate(Date actualDeliveryDate) {
        this.actualDeliveryDate = actualDeliveryDate;
    }

    /**
     * 获取安装备注
     *
     * @return INSTALL_COMMENTS - 安装备注
     */
    public String getInstallComments() {
        return installComments;
    }

    /**
     * 设置安装备注
     *
     * @param installComments 安装备注
     */
    public void setInstallComments(String installComments) {
        this.installComments = installComments;
    }

    /**
     * 获取送货备注
     *
     * @return DELIVERY_COMMENTS - 送货备注
     */
    public String getDeliveryComments() {
        return deliveryComments;
    }

    /**
     * 设置送货备注
     *
     * @param deliveryComments 送货备注
     */
    public void setDeliveryComments(String deliveryComments) {
        this.deliveryComments = deliveryComments;
    }

    /**
     * 获取改补次数编码
     *
     * @return CHANGE_NUMBER_CODE - 改补次数编码
     */
    public String getChangeNumberCode() {
        return changeNumberCode;
    }

    /**
     * 设置改补次数编码
     *
     * @param changeNumberCode 改补次数编码
     */
    public void setChangeNumberCode(String changeNumberCode) {
        this.changeNumberCode = changeNumberCode;
    }

    /**
     * 获取恒大券金额
     *
     * @return HD_COUPON_MONEY - 恒大券金额
     */
    public BigDecimal getHdCouponMoney() {
        return hdCouponMoney;
    }

    /**
     * 设置恒大券金额
     *
     * @param hdCouponMoney 恒大券金额
     */
    public void setHdCouponMoney(BigDecimal hdCouponMoney) {
        this.hdCouponMoney = hdCouponMoney;
    }

    /**
     * 获取门店现金收款
     *
     * @return HD_CASH_MONEY - 门店现金收款
     */
    public BigDecimal getHdCashMoney() {
        return hdCashMoney;
    }

    /**
     * 设置门店现金收款
     *
     * @param hdCashMoney 门店现金收款
     */
    public void setHdCashMoney(BigDecimal hdCashMoney) {
        this.hdCashMoney = hdCashMoney;
    }

    /**
     * 获取恒大订单标示
     *
     * @return HD_ORDER_FLAG - 恒大订单标示
     */
    public String getHdOrderFlag() {
        return hdOrderFlag;
    }

    /**
     * 设置恒大订单标示
     *
     * @param hdOrderFlag 恒大订单标示
     */
    public void setHdOrderFlag(String hdOrderFlag) {
        this.hdOrderFlag = hdOrderFlag;
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
     * 获取下厂订单地址（给计料）
     *
     * @return ORDER_ADDRESS - 下厂订单地址（给计料）
     */
    public String getOrderAddress() {
        return orderAddress;
    }

    /**
     * 设置下厂订单地址（给计料）
     *
     * @param orderAddress 下厂订单地址（给计料）
     */
    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    /**
     * 获取提交预出货计划人
     *
     * @return PLAN_SHIP_MAN - 提交预出货计划人
     */
    public String getPlanShipMan() {
        return planShipMan;
    }

    /**
     * 设置提交预出货计划人
     *
     * @param planShipMan 提交预出货计划人
     */
    public void setPlanShipMan(String planShipMan) {
        this.planShipMan = planShipMan;
    }

    /**
     * 获取安装单
ID
     *
     * @return INSTALLBILL_ID - 安装单
ID
     */
    public String getInstallbillId() {
        return installbillId;
    }

    /**
     * 设置安装单
ID
     *
     * @param installbillId 安装单
ID
     */
    public void setInstallbillId(String installbillId) {
        this.installbillId = installbillId;
    }

    /**
     * 获取审单拒绝次数
     *
     * @return REJECT_COUNT - 审单拒绝次数
     */
    public Integer getRejectCount() {
        return rejectCount;
    }

    /**
     * 设置审单拒绝次数
     *
     * @param rejectCount 审单拒绝次数
     */
    public void setRejectCount(Integer rejectCount) {
        this.rejectCount = rejectCount;
    }

    /**
     * 获取躺门扇数
     *
     * @return DOOR_NUM - 躺门扇数
     */
    public Integer getDoorNum() {
        return doorNum;
    }

    /**
     * 设置躺门扇数
     *
     * @param doorNum 躺门扇数
     */
    public void setDoorNum(Integer doorNum) {
        this.doorNum = doorNum;
    }

    /**
     * 获取吸塑款式
     *
     * @return XS_TYPE - 吸塑款式
     */
    public String getXsType() {
        return xsType;
    }

    /**
     * 设置吸塑款式
     *
     * @param xsType 吸塑款式
     */
    public void setXsType(String xsType) {
        this.xsType = xsType;
    }

    /**
     * 获取提交预出货时间
     *
     * @return SUBMIT_SHIP_DATE - 提交预出货时间
     */
    public Date getSubmitShipDate() {
        return submitShipDate;
    }

    /**
     * 设置提交预出货时间
     *
     * @param submitShipDate 提交预出货时间
     */
    public void setSubmitShipDate(Date submitShipDate) {
        this.submitShipDate = submitShipDate;
    }

    /**
     * 获取生产周期最大的物料ID
     *
     * @return PROD_ID - 生产周期最大的物料ID
     */
    public String getProdId() {
        return prodId;
    }

    /**
     * 设置生产周期最大的物料ID
     *
     * @param prodId 生产周期最大的物料ID
     */
    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    /**
     * 获取是否中转收发标识
     *
     * @return TRANSFER_ADDRESS_FLAG - 是否中转收发标识
     */
    public String getTransferAddressFlag() {
        return transferAddressFlag;
    }

    /**
     * 设置是否中转收发标识
     *
     * @param transferAddressFlag 是否中转收发标识
     */
    public void setTransferAddressFlag(String transferAddressFlag) {
        this.transferAddressFlag = transferAddressFlag;
    }

    /**
     * 获取中转联系人
     *
     * @return TRANSFER_CONTACT - 中转联系人
     */
    public String getTransferContact() {
        return transferContact;
    }

    /**
     * 设置中转联系人
     *
     * @param transferContact 中转联系人
     */
    public void setTransferContact(String transferContact) {
        this.transferContact = transferContact;
    }

    /**
     * 获取报价审批通过时间
     *
     * @return QUOTE_PASS_TIME - 报价审批通过时间
     */
    public Date getQuotePassTime() {
        return quotePassTime;
    }

    /**
     * 设置报价审批通过时间
     *
     * @param quotePassTime 报价审批通过时间
     */
    public void setQuotePassTime(Date quotePassTime) {
        this.quotePassTime = quotePassTime;
    }

    /**
     * 获取订单图片是否上传到服务器标示
     *
     * @return IMGFLAG - 订单图片是否上传到服务器标示
     */
    public String getImgflag() {
        return imgflag;
    }

    /**
     * 设置订单图片是否上传到服务器标示
     *
     * @param imgflag 订单图片是否上传到服务器标示
     */
    public void setImgflag(String imgflag) {
        this.imgflag = imgflag;
    }

    /**
     * 获取产品标识
     *
     * @return PROD_MARK - 产品标识
     */
    public String getProdMark() {
        return prodMark;
    }

    /**
     * 设置产品标识
     *
     * @param prodMark 产品标识
     */
    public void setProdMark(String prodMark) {
        this.prodMark = prodMark;
    }

    /**
     * 获取柯乐芙订单标识
     *
     * @return SOLID_WOOD_ORDER - 柯乐芙订单标识
     */
    public String getSolidWoodOrder() {
        return solidWoodOrder;
    }

    /**
     * 设置柯乐芙订单标识
     *
     * @param solidWoodOrder 柯乐芙订单标识
     */
    public void setSolidWoodOrder(String solidWoodOrder) {
        this.solidWoodOrder = solidWoodOrder;
    }

    /**
     * 获取主花色CODE
     *
     * @return MAIN_COLOR_CODE - 主花色CODE
     */
    public String getMainColorCode() {
        return mainColorCode;
    }

    /**
     * 设置主花色CODE
     *
     * @param mainColorCode 主花色CODE
     */
    public void setMainColorCode(String mainColorCode) {
        this.mainColorCode = mainColorCode;
    }

    /**
     * 获取次花色Code
     *
     * @return SECOND_COLOR_CODE - 次花色Code
     */
    public String getSecondColorCode() {
        return secondColorCode;
    }

    /**
     * 设置次花色Code
     *
     * @param secondColorCode 次花色Code
     */
    public void setSecondColorCode(String secondColorCode) {
        this.secondColorCode = secondColorCode;
    }

    /**
     * 获取微信优惠劵类型
     *
     * @return WX_COUPON_TYPE - 微信优惠劵类型
     */
    public String getWxCouponType() {
        return wxCouponType;
    }

    /**
     * 设置微信优惠劵类型
     *
     * @param wxCouponType 微信优惠劵类型
     */
    public void setWxCouponType(String wxCouponType) {
        this.wxCouponType = wxCouponType;
    }

    /**
     * 获取是否锁定
     *
     * @return IS_CPLOCK - 是否锁定
     */
    public String getIsCplock() {
        return isCplock;
    }

    /**
     * 设置是否锁定
     *
     * @param isCplock 是否锁定
     */
    public void setIsCplock(String isCplock) {
        this.isCplock = isCplock;
    }

    /**
     * 获取订单预报价
     *
     * @return PRE_PRICE - 订单预报价
     */
    public BigDecimal getPrePrice() {
        return prePrice;
    }

    /**
     * 设置订单预报价
     *
     * @param prePrice 订单预报价
     */
    public void setPrePrice(BigDecimal prePrice) {
        this.prePrice = prePrice;
    }

    /**
     * 获取装修计划ID
     *
     * @return DECORATED_PLAN_ID - 装修计划ID
     */
    public String getDecoratedPlanId() {
        return decoratedPlanId;
    }

    /**
     * 设置装修计划ID
     *
     * @param decoratedPlanId 装修计划ID
     */
    public void setDecoratedPlanId(String decoratedPlanId) {
        this.decoratedPlanId = decoratedPlanId;
    }

    /**
     * 获取装修计划名称
     *
     * @return DECORATED_SHOP_NAME - 装修计划名称
     */
    public String getDecoratedShopName() {
        return decoratedShopName;
    }

    /**
     * 设置装修计划名称
     *
     * @param decoratedShopName 装修计划名称
     */
    public void setDecoratedShopName(String decoratedShopName) {
        this.decoratedShopName = decoratedShopName;
    }

    /**
     * 获取生产OU
     *
     * @return PRODUCT_ORG - 生产OU
     */
    public String getProductOrg() {
        return productOrg;
    }

    /**
     * 设置生产OU
     *
     * @param productOrg 生产OU
     */
    public void setProductOrg(String productOrg) {
        this.productOrg = productOrg;
    }

    /**
     * 获取业务实体
     *
     * @return BUSINESS_OU - 业务实体
     */
    public String getBusinessOu() {
        return businessOu;
    }

    /**
     * 设置业务实体
     *
     * @param businessOu 业务实体
     */
    public void setBusinessOu(String businessOu) {
        this.businessOu = businessOu;
    }

    /**
     * @return PLANSHIP_STATUS
     */
    public String getPlanshipStatus() {
        return planshipStatus;
    }

    /**
     * @param planshipStatus
     */
    public void setPlanshipStatus(String planshipStatus) {
        this.planshipStatus = planshipStatus;
    }

    /**
     * @return PLANSHIP_APPROVAL_MAN
     */
    public String getPlanshipApprovalMan() {
        return planshipApprovalMan;
    }

    /**
     * @param planshipApprovalMan
     */
    public void setPlanshipApprovalMan(String planshipApprovalMan) {
        this.planshipApprovalMan = planshipApprovalMan;
    }

    /**
     * @return PLANSHIP_APPROVAL_TIME
     */
    public Date getPlanshipApprovalTime() {
        return planshipApprovalTime;
    }

    /**
     * @param planshipApprovalTime
     */
    public void setPlanshipApprovalTime(Date planshipApprovalTime) {
        this.planshipApprovalTime = planshipApprovalTime;
    }

    /**
     * @return PLANSHIP_APPROVAL_CONTENT
     */
    public String getPlanshipApprovalContent() {
        return planshipApprovalContent;
    }

    /**
     * @param planshipApprovalContent
     */
    public void setPlanshipApprovalContent(String planshipApprovalContent) {
        this.planshipApprovalContent = planshipApprovalContent;
    }

    /**
     * 获取货币类型
     *
     * @return CURRENCY_TYPE - 货币类型
     */
    public String getCurrencyType() {
        return currencyType;
    }

    /**
     * 设置货币类型
     *
     * @param currencyType 货币类型
     */
    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    /**
     * 获取图号
     *
     * @return DRAW_NO - 图号
     */
    public String getDrawNo() {
        return drawNo;
    }

    /**
     * 设置图号
     *
     * @param drawNo 图号
     */
    public void setDrawNo(String drawNo) {
        this.drawNo = drawNo;
    }

    /**
     * 获取中转物流商
     *
     * @return TRANSFER_NAME - 中转物流商
     */
    public String getTransferName() {
        return transferName;
    }

    /**
     * 设置中转物流商
     *
     * @param transferName 中转物流商
     */
    public void setTransferName(String transferName) {
        this.transferName = transferName;
    }

    /**
     * 获取责任类型
     *
     * @return RESPONSIBILITY_TYPE - 责任类型
     */
    public String getResponsibilityType() {
        return responsibilityType;
    }

    /**
     * 设置责任类型
     *
     * @param responsibilityType 责任类型
     */
    public void setResponsibilityType(String responsibilityType) {
        this.responsibilityType = responsibilityType;
    }

    /**
     * 获取责任部门
     *
     * @return RESPONSIBILITY_DEPARMENT - 责任部门
     */
    public String getResponsibilityDeparment() {
        return responsibilityDeparment;
    }

    /**
     * 设置责任部门
     *
     * @param responsibilityDeparment 责任部门
     */
    public void setResponsibilityDeparment(String responsibilityDeparment) {
        this.responsibilityDeparment = responsibilityDeparment;
    }

    /**
     * 获取收件人
     *
     * @return RECEIVER_NAME - 收件人
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * 设置收件人
     *
     * @param receiverName 收件人
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    /**
     * 获取收件人电话
     *
     * @return RECEIVER_PHONE - 收件人电话
     */
    public String getReceiverPhone() {
        return receiverPhone;
    }

    /**
     * 设置收件人电话
     *
     * @param receiverPhone 收件人电话
     */
    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    /**
     * 获取改补原因
     *
     * @return CHANGE_REASON - 改补原因
     */
    public String getChangeReason() {
        return changeReason;
    }

    /**
     * 设置改补原因
     *
     * @param changeReason 改补原因
     */
    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason;
    }

    /**
     * 获取折扣/处理意见
     *
     * @return SUGGESTION - 折扣/处理意见
     */
    public String getSuggestion() {
        return suggestion;
    }

    /**
     * 设置折扣/处理意见
     *
     * @param suggestion 折扣/处理意见
     */
    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    /**
     * 获取原单生产OU
     *
     * @return OLD_PRODUCT_ORG - 原单生产OU
     */
    public String getOldProductOrg() {
        return oldProductOrg;
    }

    /**
     * 设置原单生产OU
     *
     * @param oldProductOrg 原单生产OU
     */
    public void setOldProductOrg(String oldProductOrg) {
        this.oldProductOrg = oldProductOrg;
    }

    /**
     * 获取改补申请ID
     *
     * @return CHANGE_ORDER_ID - 改补申请ID
     */
    public String getChangeOrderId() {
        return changeOrderId;
    }

    /**
     * 设置改补申请ID
     *
     * @param changeOrderId 改补申请ID
     */
    public void setChangeOrderId(String changeOrderId) {
        this.changeOrderId = changeOrderId;
    }

    /**
     * 获取房屋类型
     *
     * @return HOUSE_TYPE - 房屋类型
     */
    public String getHouseType() {
        return houseType;
    }

    /**
     * 设置房屋类型
     *
     * @param houseType 房屋类型
     */
    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    /**
     * 获取房间楼层
     *
     * @return HOUSE_FLOOR - 房间楼层
     */
    public String getHouseFloor() {
        return houseFloor;
    }

    /**
     * 设置房间楼层
     *
     * @param houseFloor 房间楼层
     */
    public void setHouseFloor(String houseFloor) {
        this.houseFloor = houseFloor;
    }

    /**
     * 获取计料状态
     *
     * @return SPLIT_STATUS - 计料状态
     */
    public String getSplitStatus() {
        return splitStatus;
    }

    /**
     * 设置计料状态
     *
     * @param splitStatus 计料状态
     */
    public void setSplitStatus(String splitStatus) {
        this.splitStatus = splitStatus;
    }

    /**
     * 获取客人省市县
     *
     * @return SPECIAL_DIRECT - 客人省市县
     */
    public String getSpecialDirect() {
        return specialDirect;
    }

    /**
     * 设置客人省市县
     *
     * @param specialDirect 客人省市县
     */
    public void setSpecialDirect(String specialDirect) {
        this.specialDirect = specialDirect;
    }

    /**
     * 获取中转联系人电话
     *
     * @return TRANSFER_PHONE - 中转联系人电话
     */
    public String getTransferPhone() {
        return transferPhone;
    }

    /**
     * 设置中转联系人电话
     *
     * @param transferPhone 中转联系人电话
     */
    public void setTransferPhone(String transferPhone) {
        this.transferPhone = transferPhone;
    }

    /**
     * 获取责任班组
     *
     * @return RESPONSIBILITY_TEAM - 责任班组
     */
    public String getResponsibilityTeam() {
        return responsibilityTeam;
    }

    /**
     * 设置责任班组
     *
     * @param responsibilityTeam 责任班组
     */
    public void setResponsibilityTeam(String responsibilityTeam) {
        this.responsibilityTeam = responsibilityTeam;
    }

    /**
     * 获取计料完成时间
     *
     * @return SPLIT_TIME - 计料完成时间
     */
    public Date getSplitTime() {
        return splitTime;
    }

    /**
     * 设置计料完成时间
     *
     * @param splitTime 计料完成时间
     */
    public void setSplitTime(Date splitTime) {
        this.splitTime = splitTime;
    }

    /**
     * 获取内部直发单下单账户
     *
     * @return DIRECT_ACC_NUM - 内部直发单下单账户
     */
    public String getDirectAccNum() {
        return directAccNum;
    }

    /**
     * 设置内部直发单下单账户
     *
     * @param directAccNum 内部直发单下单账户
     */
    public void setDirectAccNum(String directAccNum) {
        this.directAccNum = directAccNum;
    }

    /**
     * 获取部门编码
     *
     * @return DEPARTMENT_ID - 部门编码
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * 设置部门编码
     *
     * @param departmentId 部门编码
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * @return DIRECT_PROJECT_ID
     */
    public String getDirectProjectId() {
        return directProjectId;
    }

    /**
     * @param directProjectId
     */
    public void setDirectProjectId(String directProjectId) {
        this.directProjectId = directProjectId;
    }

    /**
     * 获取投诉问题
     *
     * @return COMPLAIN_PROBLEM - 投诉问题
     */
    public String getComplainProblem() {
        return complainProblem;
    }

    /**
     * 设置投诉问题
     *
     * @param complainProblem 投诉问题
     */
    public void setComplainProblem(String complainProblem) {
        this.complainProblem = complainProblem;
    }

    /**
     * 获取0，代表非终端设计部下单，1，则代表终端设计部下单
     *
     * @return ORDER_DEPARTMENT - 0，代表非终端设计部下单，1，则代表终端设计部下单
     */
    public Integer getOrderDepartment() {
        return orderDepartment;
    }

    /**
     * 设置0，代表非终端设计部下单，1，则代表终端设计部下单
     *
     * @param orderDepartment 0，代表非终端设计部下单，1，则代表终端设计部下单
     */
    public void setOrderDepartment(Integer orderDepartment) {
        this.orderDepartment = orderDepartment;
    }

    /**
     * 获取仿实木系列
     *
     * @return IMITATE_SOLID_SERIES - 仿实木系列
     */
    public String getImitateSolidSeries() {
        return imitateSolidSeries;
    }

    /**
     * 设置仿实木系列
     *
     * @param imitateSolidSeries 仿实木系列
     */
    public void setImitateSolidSeries(String imitateSolidSeries) {
        this.imitateSolidSeries = imitateSolidSeries;
    }

    /**
     * 获取中转地址
     *
     * @return TRANSFER_ADDRESS - 中转地址
     */
    public String getTransferAddress() {
        return transferAddress;
    }

    /**
     * 设置中转地址
     *
     * @param transferAddress 中转地址
     */
    public void setTransferAddress(String transferAddress) {
        this.transferAddress = transferAddress;
    }
}