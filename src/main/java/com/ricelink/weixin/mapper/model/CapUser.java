package com.ricelink.weixin.mapper.model;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "cap_user")
public class CapUser {
    @Column(name = "OPERATOR_ID")
    private String operatorId;

    @Column(name = "TENANT_ID")
    private String tenantId;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "INVALDATE")
    private Date invaldate;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "REAL_NAME")
    private String realName;

    @Column(name = "AUTHMODE")
    private String authmode;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "UNLOCKTIME")
    private Date unlocktime;

    @Column(name = "MENUTYPE")
    private String menutype;

    @Column(name = "LASTLOGIN")
    private Date lastlogin;

    @Column(name = "ERRCOUNT")
    private Long errcount;

    @Column(name = "STARTDATE")
    private Date startdate;

    @Column(name = "ENDDATE")
    private Date enddate;

    @Column(name = "VALIDTIME")
    private String validtime;

    @Column(name = "MACCODE")
    private String maccode;

    @Column(name = "IPADDRESS")
    private String ipaddress;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "CREATEUSER")
    private String createuser;

    @Column(name = "CREATETIME")
    private Date createtime;

    @Column(name = "USER_TYPE")
    private String userType;

    /**
     * 审图接单标识
     */
    @Column(name = "APPROVE_DRAW_FLAG")
    private String approveDrawFlag;

    /**
     * 微信ID
     */
    @Column(name = "WX_OPENID")
    private String wxOpenid;

    /**
     * @return OPERATOR_ID
     */
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * @return TENANT_ID
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     * @param tenantId
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * @return USER_ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return PASSWORD
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return INVALDATE
     */
    public Date getInvaldate() {
        return invaldate;
    }

    /**
     * @param invaldate
     */
    public void setInvaldate(Date invaldate) {
        this.invaldate = invaldate;
    }

    /**
     * @return USER_NAME
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return REAL_NAME
     */
    public String getRealName() {
        return realName;
    }

    /**
     * @param realName
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * @return AUTHMODE
     */
    public String getAuthmode() {
        return authmode;
    }

    /**
     * @param authmode
     */
    public void setAuthmode(String authmode) {
        this.authmode = authmode;
    }

    /**
     * @return STATUS
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return UNLOCKTIME
     */
    public Date getUnlocktime() {
        return unlocktime;
    }

    /**
     * @param unlocktime
     */
    public void setUnlocktime(Date unlocktime) {
        this.unlocktime = unlocktime;
    }

    /**
     * @return MENUTYPE
     */
    public String getMenutype() {
        return menutype;
    }

    /**
     * @param menutype
     */
    public void setMenutype(String menutype) {
        this.menutype = menutype;
    }

    /**
     * @return LASTLOGIN
     */
    public Date getLastlogin() {
        return lastlogin;
    }

    /**
     * @param lastlogin
     */
    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

    /**
     * @return ERRCOUNT
     */
    public Long getErrcount() {
        return errcount;
    }

    /**
     * @param errcount
     */
    public void setErrcount(Long errcount) {
        this.errcount = errcount;
    }

    /**
     * @return STARTDATE
     */
    public Date getStartdate() {
        return startdate;
    }

    /**
     * @param startdate
     */
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    /**
     * @return ENDDATE
     */
    public Date getEnddate() {
        return enddate;
    }

    /**
     * @param enddate
     */
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    /**
     * @return VALIDTIME
     */
    public String getValidtime() {
        return validtime;
    }

    /**
     * @param validtime
     */
    public void setValidtime(String validtime) {
        this.validtime = validtime;
    }

    /**
     * @return MACCODE
     */
    public String getMaccode() {
        return maccode;
    }

    /**
     * @param maccode
     */
    public void setMaccode(String maccode) {
        this.maccode = maccode;
    }

    /**
     * @return IPADDRESS
     */
    public String getIpaddress() {
        return ipaddress;
    }

    /**
     * @param ipaddress
     */
    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
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
     * @return CREATEUSER
     */
    public String getCreateuser() {
        return createuser;
    }

    /**
     * @param createuser
     */
    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    /**
     * @return CREATETIME
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return USER_TYPE
     */
    public String getUserType() {
        return userType;
    }

    /**
     * @param userType
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * 获取审图接单标识
     *
     * @return APPROVE_DRAW_FLAG - 审图接单标识
     */
    public String getApproveDrawFlag() {
        return approveDrawFlag;
    }

    /**
     * 设置审图接单标识
     *
     * @param approveDrawFlag 审图接单标识
     */
    public void setApproveDrawFlag(String approveDrawFlag) {
        this.approveDrawFlag = approveDrawFlag;
    }

    /**
     * 获取微信ID
     *
     * @return WX_OPENID - 微信ID
     */
    public String getWxOpenid() {
        return wxOpenid;
    }

    /**
     * 设置微信ID
     *
     * @param wxOpenid 微信ID
     */
    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid;
    }
}