package com.ricelink.weixin.mapper.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "rl_dms_user")
public class RlDmsUser {
    /**
     * id
     */
    @Id
    @Column(name = "USER_ID")
    private String userId;

    /**
     * 组织id
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 部门id
     */
    @Column(name = "BROKER_ID")
    private String brokerId;

    /**
     * 用户人员
     */
    @Column(name = "USER_NAME")
    private String userName;

    /**
     * 组织名称
     */
    @Column(name = "ORG_NAME")
    private String orgName;

    /**
     * 用户性别
     */
    @Column(name = "USER_SEX")
    private String userSex;

    /**
     * 用户电话
     */
    @Column(name = "USER_PHONE")
    private String userPhone;

    /**
     * 用户住址
     */
    @Column(name = "USER_ADDRESS")
    private String userAddress;

    /**
     * 获取id
     *
     * @return USER_ID - id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置id
     *
     * @param userId id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取组织id
     *
     * @return ORG_ID - 组织id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置组织id
     *
     * @param orgId 组织id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取部门id
     *
     * @return BROKER_ID - 部门id
     */
    public String getBrokerId() {
        return brokerId;
    }

    /**
     * 设置部门id
     *
     * @param brokerId 部门id
     */
    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    /**
     * 获取用户人员
     *
     * @return USER_NAME - 用户人员
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户人员
     *
     * @param userName 用户人员
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取组织名称
     *
     * @return ORG_NAME - 组织名称
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 设置组织名称
     *
     * @param orgName 组织名称
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * 获取用户性别
     *
     * @return USER_SEX - 用户性别
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * 设置用户性别
     *
     * @param userSex 用户性别
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    /**
     * 获取用户电话
     *
     * @return USER_PHONE - 用户电话
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 设置用户电话
     *
     * @param userPhone 用户电话
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * 获取用户住址
     *
     * @return USER_ADDRESS - 用户住址
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * 设置用户住址
     *
     * @param userAddress 用户住址
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
}