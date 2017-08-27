package com.ricelink.weixin.mapper.model;

import javax.persistence.*;

@Table(name = "nobee_weixin.wx_menu_table")
public class WxMenuTable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "MENU_NUMBER")
    private String menuNumber;

    @Column(name = "MENU_NAME")
    private String menuName;

    @Column(name = "MENU_TYPE")
    private String menuType;

    @Column(name = "MENU_PARENT")
    private Integer menuParent;

    @Column(name = "MESSAGE_TYPE")
    private String messageType;

    @Column(name = "MP_ID")
    private Integer mpId;

    @Column(name = "MENU_URL")
    private String menuUrl;

    @Column(name = "MENU_STATE")
    private String menuState;

    @Column(name = "MENU_LEVEL")
    private Integer menuLevel;

    @Column(name = "MENU_KEY")
    private String menuKey;

    @Column(name = "MESSAGE_CONTENT")
    private String messageContent;

    @Column(name = "PAGE_ID")
    private String pageId;

    @Column(name = "MENU_GROUP_ID")
    private String menuGroupId;

    @Column(name = "MENU_APP_URL")
    private String menuAppUrl;

    @Column(name = "MENU_APP_KEY")
    private String menuAppKey;

    @Column(name = "IS_MRO")
    private String isMro;

    @Column(name = "CP_APP_ID")
    private Integer cpAppId;

    @Column(name = "CONDITION_VALUE")
    private String conditionValue;

    @Column(name = "CONDITION_TYPE")
    private String conditionType;

    /**
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return MENU_NUMBER
     */
    public String getMenuNumber() {
        return menuNumber;
    }

    /**
     * @param menuNumber
     */
    public void setMenuNumber(String menuNumber) {
        this.menuNumber = menuNumber;
    }

    /**
     * @return MENU_NAME
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * @param menuName
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * @return MENU_TYPE
     */
    public String getMenuType() {
        return menuType;
    }

    /**
     * @param menuType
     */
    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    /**
     * @return MENU_PARENT
     */
    public Integer getMenuParent() {
        return menuParent;
    }

    /**
     * @param menuParent
     */
    public void setMenuParent(Integer menuParent) {
        this.menuParent = menuParent;
    }

    /**
     * @return MESSAGE_TYPE
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * @param messageType
     */
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * @return MP_ID
     */
    public Integer getMpId() {
        return mpId;
    }

    /**
     * @param mpId
     */
    public void setMpId(Integer mpId) {
        this.mpId = mpId;
    }

    /**
     * @return MENU_URL
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * @param menuUrl
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    /**
     * @return MENU_STATE
     */
    public String getMenuState() {
        return menuState;
    }

    /**
     * @param menuState
     */
    public void setMenuState(String menuState) {
        this.menuState = menuState;
    }

    /**
     * @return MENU_LEVEL
     */
    public Integer getMenuLevel() {
        return menuLevel;
    }

    /**
     * @param menuLevel
     */
    public void setMenuLevel(Integer menuLevel) {
        this.menuLevel = menuLevel;
    }

    /**
     * @return MENU_KEY
     */
    public String getMenuKey() {
        return menuKey;
    }

    /**
     * @param menuKey
     */
    public void setMenuKey(String menuKey) {
        this.menuKey = menuKey;
    }

    /**
     * @return MESSAGE_CONTENT
     */
    public String getMessageContent() {
        return messageContent;
    }

    /**
     * @param messageContent
     */
    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    /**
     * @return PAGE_ID
     */
    public String getPageId() {
        return pageId;
    }

    /**
     * @param pageId
     */
    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    /**
     * @return MENU_GROUP_ID
     */
    public String getMenuGroupId() {
        return menuGroupId;
    }

    /**
     * @param menuGroupId
     */
    public void setMenuGroupId(String menuGroupId) {
        this.menuGroupId = menuGroupId;
    }

    /**
     * @return MENU_APP_URL
     */
    public String getMenuAppUrl() {
        return menuAppUrl;
    }

    /**
     * @param menuAppUrl
     */
    public void setMenuAppUrl(String menuAppUrl) {
        this.menuAppUrl = menuAppUrl;
    }

    /**
     * @return MENU_APP_KEY
     */
    public String getMenuAppKey() {
        return menuAppKey;
    }

    /**
     * @param menuAppKey
     */
    public void setMenuAppKey(String menuAppKey) {
        this.menuAppKey = menuAppKey;
    }

    /**
     * @return IS_MRO
     */
    public String getIsMro() {
        return isMro;
    }

    /**
     * @param isMro
     */
    public void setIsMro(String isMro) {
        this.isMro = isMro;
    }

    /**
     * @return CP_APP_ID
     */
    public Integer getCpAppId() {
        return cpAppId;
    }

    /**
     * @param cpAppId
     */
    public void setCpAppId(Integer cpAppId) {
        this.cpAppId = cpAppId;
    }

    /**
     * @return CONDITION_VALUE
     */
    public String getConditionValue() {
        return conditionValue;
    }

    /**
     * @param conditionValue
     */
    public void setConditionValue(String conditionValue) {
        this.conditionValue = conditionValue;
    }

    /**
     * @return CONDITION_TYPE
     */
    public String getConditionType() {
        return conditionType;
    }

    /**
     * @param conditionType
     */
    public void setConditionType(String conditionType) {
        this.conditionType = conditionType;
    }
}