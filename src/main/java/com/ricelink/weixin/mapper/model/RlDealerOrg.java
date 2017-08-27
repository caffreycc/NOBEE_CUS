package com.ricelink.weixin.mapper.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "rl_dealer_org")
public class RlDealerOrg {
    @Id
    @Column(name = "ORG_ID")
    private String orgId;

    @Column(name = "ORG_NAME")
    private String orgName;

    @Column(name = "ORG_NUM")
    private String orgNum;

    @Column(name = "ORG_TYPE")
    private String orgType;

    @Column(name = "PAR_ORG_ID")
    private String parOrgId;

    @Column(name = "ORG_SEQ")
    private String orgSeq;

    @Column(name = "ORG_STATUS")
    private String orgStatus;

    @Column(name = "CLASS_TYPE")
    private String classType;

    @Column(name = "DEALER_AREA_TYPE")
    private String dealerAreaType;

    @Column(name = "OTHER_ORG_NAME")
    private String otherOrgName;

    @Column(name = "ORDER_MODEL")
    private String orderModel;

    @Column(name = "PROVINCE_ID")
    private String provinceId;

    @Column(name = "CITY_ID")
    private String cityId;

    @Column(name = "COUNTY_ID")
    private String countyId;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "WORK_PHONE")
    private String workPhone;

    @Column(name = "CELL_PHONE")
    private String cellPhone;

    @Column(name = "CREDIT_LEVEL")
    private String creditLevel;

    @Column(name = "ORG_LEVEL")
    private Long orgLevel;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "START_DATE")
    private Date startDate;

    @Column(name = "END_DATE")
    private Date endDate;

    @Column(name = "CIRCLE_NAME")
    private String circleName;

    @Column(name = "MALL_NAME")
    private String mallName;

    @Column(name = "OU_ID")
    private String ouId;

    @Column(name = "PY_SHOP")
    private String pyShop;

    @Column(name = "ADVICE_OU")
    private String adviceOu;

    @Column(name = "ACCOUNT_TYPE")
    private String accountType;

    @Column(name = "BUSINESSPURPOSE")
    private String businesspurpose;

    @Column(name = "MAINPURPOSE")
    private String mainpurpose;

    @Column(name = "SALE_TEAM")
    private String saleTeam;

    @Column(name = "SALE_MANAGER")
    private String saleManager;

    @Column(name = "RETAIL_STORE")
    private String retailStore;

    @Column(name = "SHOP_TYPE")
    private String shopType;

    @Column(name = "IS_TEMPLET")
    private String isTemplet;

    @Column(name = "SHOP_AREA")
    private String shopArea;

    @Column(name = "ORDER_NUM_RULE")
    private String orderNumRule;

    @Column(name = "STORE_LATITUDE")
    private String storeLatitude;

    @Column(name = "STORE_LONGITUDE")
    private String storeLongitude;

    @Column(name = "INAREA_ID")
    private String inareaId;

    @Column(name = "SHIPMENTTYPE")
    private String shipmenttype;

    @Column(name = "SHOP_FLAG")
    private String shopFlag;

    @Column(name = "DEALER_ORDER_FLAG")
    private String dealerOrderFlag;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;

    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;

    @Column(name = "VERSION_NUMBER")
    private String versionNumber;

    @Column(name = "RECORD_STATUS")
    private String recordStatus;

    @Column(name = "UPDATE_FLAG")
    private String updateFlag;

    @Column(name = "CLIENT_UPDATE_DATE")
    private Date clientUpdateDate;

    /**
     * 默认导购
     */
    @Column(name = "DEFAULT_GUIDE")
    private String defaultGuide;

    /**
     * 对门店的介绍
     */
    @Column(name = "STORE_INTRODUCTION")
    private String storeIntroduction;

    /**
     * @return ORG_ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * @param orgId
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * @return ORG_NAME
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * @param orgName
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * @return ORG_NUM
     */
    public String getOrgNum() {
        return orgNum;
    }

    /**
     * @param orgNum
     */
    public void setOrgNum(String orgNum) {
        this.orgNum = orgNum;
    }

    /**
     * @return ORG_TYPE
     */
    public String getOrgType() {
        return orgType;
    }

    /**
     * @param orgType
     */
    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    /**
     * @return PAR_ORG_ID
     */
    public String getParOrgId() {
        return parOrgId;
    }

    /**
     * @param parOrgId
     */
    public void setParOrgId(String parOrgId) {
        this.parOrgId = parOrgId;
    }

    /**
     * @return ORG_SEQ
     */
    public String getOrgSeq() {
        return orgSeq;
    }

    /**
     * @param orgSeq
     */
    public void setOrgSeq(String orgSeq) {
        this.orgSeq = orgSeq;
    }

    /**
     * @return ORG_STATUS
     */
    public String getOrgStatus() {
        return orgStatus;
    }

    /**
     * @param orgStatus
     */
    public void setOrgStatus(String orgStatus) {
        this.orgStatus = orgStatus;
    }

    /**
     * @return CLASS_TYPE
     */
    public String getClassType() {
        return classType;
    }

    /**
     * @param classType
     */
    public void setClassType(String classType) {
        this.classType = classType;
    }

    /**
     * @return DEALER_AREA_TYPE
     */
    public String getDealerAreaType() {
        return dealerAreaType;
    }

    /**
     * @param dealerAreaType
     */
    public void setDealerAreaType(String dealerAreaType) {
        this.dealerAreaType = dealerAreaType;
    }

    /**
     * @return OTHER_ORG_NAME
     */
    public String getOtherOrgName() {
        return otherOrgName;
    }

    /**
     * @param otherOrgName
     */
    public void setOtherOrgName(String otherOrgName) {
        this.otherOrgName = otherOrgName;
    }

    /**
     * @return ORDER_MODEL
     */
    public String getOrderModel() {
        return orderModel;
    }

    /**
     * @param orderModel
     */
    public void setOrderModel(String orderModel) {
        this.orderModel = orderModel;
    }

    /**
     * @return PROVINCE_ID
     */
    public String getProvinceId() {
        return provinceId;
    }

    /**
     * @param provinceId
     */
    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * @return CITY_ID
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * @param cityId
     */
    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    /**
     * @return COUNTY_ID
     */
    public String getCountyId() {
        return countyId;
    }

    /**
     * @param countyId
     */
    public void setCountyId(String countyId) {
        this.countyId = countyId;
    }

    /**
     * @return ADDRESS
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return WORK_PHONE
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * @param workPhone
     */
    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    /**
     * @return CELL_PHONE
     */
    public String getCellPhone() {
        return cellPhone;
    }

    /**
     * @param cellPhone
     */
    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    /**
     * @return CREDIT_LEVEL
     */
    public String getCreditLevel() {
        return creditLevel;
    }

    /**
     * @param creditLevel
     */
    public void setCreditLevel(String creditLevel) {
        this.creditLevel = creditLevel;
    }

    /**
     * @return ORG_LEVEL
     */
    public Long getOrgLevel() {
        return orgLevel;
    }

    /**
     * @param orgLevel
     */
    public void setOrgLevel(Long orgLevel) {
        this.orgLevel = orgLevel;
    }

    /**
     * @return EMAIL
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return START_DATE
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return END_DATE
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return CIRCLE_NAME
     */
    public String getCircleName() {
        return circleName;
    }

    /**
     * @param circleName
     */
    public void setCircleName(String circleName) {
        this.circleName = circleName;
    }

    /**
     * @return MALL_NAME
     */
    public String getMallName() {
        return mallName;
    }

    /**
     * @param mallName
     */
    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    /**
     * @return OU_ID
     */
    public String getOuId() {
        return ouId;
    }

    /**
     * @param ouId
     */
    public void setOuId(String ouId) {
        this.ouId = ouId;
    }

    /**
     * @return PY_SHOP
     */
    public String getPyShop() {
        return pyShop;
    }

    /**
     * @param pyShop
     */
    public void setPyShop(String pyShop) {
        this.pyShop = pyShop;
    }

    /**
     * @return ADVICE_OU
     */
    public String getAdviceOu() {
        return adviceOu;
    }

    /**
     * @param adviceOu
     */
    public void setAdviceOu(String adviceOu) {
        this.adviceOu = adviceOu;
    }

    /**
     * @return ACCOUNT_TYPE
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * @param accountType
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    /**
     * @return BUSINESSPURPOSE
     */
    public String getBusinesspurpose() {
        return businesspurpose;
    }

    /**
     * @param businesspurpose
     */
    public void setBusinesspurpose(String businesspurpose) {
        this.businesspurpose = businesspurpose;
    }

    /**
     * @return MAINPURPOSE
     */
    public String getMainpurpose() {
        return mainpurpose;
    }

    /**
     * @param mainpurpose
     */
    public void setMainpurpose(String mainpurpose) {
        this.mainpurpose = mainpurpose;
    }

    /**
     * @return SALE_TEAM
     */
    public String getSaleTeam() {
        return saleTeam;
    }

    /**
     * @param saleTeam
     */
    public void setSaleTeam(String saleTeam) {
        this.saleTeam = saleTeam;
    }

    /**
     * @return SALE_MANAGER
     */
    public String getSaleManager() {
        return saleManager;
    }

    /**
     * @param saleManager
     */
    public void setSaleManager(String saleManager) {
        this.saleManager = saleManager;
    }

    /**
     * @return RETAIL_STORE
     */
    public String getRetailStore() {
        return retailStore;
    }

    /**
     * @param retailStore
     */
    public void setRetailStore(String retailStore) {
        this.retailStore = retailStore;
    }

    /**
     * @return SHOP_TYPE
     */
    public String getShopType() {
        return shopType;
    }

    /**
     * @param shopType
     */
    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    /**
     * @return IS_TEMPLET
     */
    public String getIsTemplet() {
        return isTemplet;
    }

    /**
     * @param isTemplet
     */
    public void setIsTemplet(String isTemplet) {
        this.isTemplet = isTemplet;
    }

    /**
     * @return SHOP_AREA
     */
    public String getShopArea() {
        return shopArea;
    }

    /**
     * @param shopArea
     */
    public void setShopArea(String shopArea) {
        this.shopArea = shopArea;
    }

    /**
     * @return ORDER_NUM_RULE
     */
    public String getOrderNumRule() {
        return orderNumRule;
    }

    /**
     * @param orderNumRule
     */
    public void setOrderNumRule(String orderNumRule) {
        this.orderNumRule = orderNumRule;
    }

    /**
     * @return STORE_LATITUDE
     */
    public String getStoreLatitude() {
        return storeLatitude;
    }

    /**
     * @param storeLatitude
     */
    public void setStoreLatitude(String storeLatitude) {
        this.storeLatitude = storeLatitude;
    }

    /**
     * @return STORE_LONGITUDE
     */
    public String getStoreLongitude() {
        return storeLongitude;
    }

    /**
     * @param storeLongitude
     */
    public void setStoreLongitude(String storeLongitude) {
        this.storeLongitude = storeLongitude;
    }

    /**
     * @return INAREA_ID
     */
    public String getInareaId() {
        return inareaId;
    }

    /**
     * @param inareaId
     */
    public void setInareaId(String inareaId) {
        this.inareaId = inareaId;
    }

    /**
     * @return SHIPMENTTYPE
     */
    public String getShipmenttype() {
        return shipmenttype;
    }

    /**
     * @param shipmenttype
     */
    public void setShipmenttype(String shipmenttype) {
        this.shipmenttype = shipmenttype;
    }

    /**
     * @return SHOP_FLAG
     */
    public String getShopFlag() {
        return shopFlag;
    }

    /**
     * @param shopFlag
     */
    public void setShopFlag(String shopFlag) {
        this.shopFlag = shopFlag;
    }

    /**
     * @return DEALER_ORDER_FLAG
     */
    public String getDealerOrderFlag() {
        return dealerOrderFlag;
    }

    /**
     * @param dealerOrderFlag
     */
    public void setDealerOrderFlag(String dealerOrderFlag) {
        this.dealerOrderFlag = dealerOrderFlag;
    }

    /**
     * @return CREATED_BY
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * @param createdBy
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return CREATION_DATE
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * @param creationDate
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * @return LAST_UPDATED_BY
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * @param lastUpdatedBy
     */
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * @return LAST_UPDATE_DATE
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * @param lastUpdateDate
     */
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * @return VERSION_NUMBER
     */
    public String getVersionNumber() {
        return versionNumber;
    }

    /**
     * @param versionNumber
     */
    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * @return RECORD_STATUS
     */
    public String getRecordStatus() {
        return recordStatus;
    }

    /**
     * @param recordStatus
     */
    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    /**
     * @return UPDATE_FLAG
     */
    public String getUpdateFlag() {
        return updateFlag;
    }

    /**
     * @param updateFlag
     */
    public void setUpdateFlag(String updateFlag) {
        this.updateFlag = updateFlag;
    }

    /**
     * @return CLIENT_UPDATE_DATE
     */
    public Date getClientUpdateDate() {
        return clientUpdateDate;
    }

    /**
     * @param clientUpdateDate
     */
    public void setClientUpdateDate(Date clientUpdateDate) {
        this.clientUpdateDate = clientUpdateDate;
    }

    /**
     * 获取默认导购
     *
     * @return DEFAULT_GUIDE - 默认导购
     */
    public String getDefaultGuide() {
        return defaultGuide;
    }

    /**
     * 设置默认导购
     *
     * @param defaultGuide 默认导购
     */
    public void setDefaultGuide(String defaultGuide) {
        this.defaultGuide = defaultGuide;
    }

    /**
     * 获取对门店的介绍
     *
     * @return STORE_INTRODUCTION - 对门店的介绍
     */
    public String getStoreIntroduction() {
        return storeIntroduction;
    }

    /**
     * 设置对门店的介绍
     *
     * @param storeIntroduction 对门店的介绍
     */
    public void setStoreIntroduction(String storeIntroduction) {
        this.storeIntroduction = storeIntroduction;
    }
}