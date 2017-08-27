package com.ricelink.weixin.mapper.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "rl_order_evaluation")
public class RlOrderEvaluation {
    /**
     * 主键
     */
    @Id
    @Column(name = "EVA_ID")
    @GeneratedValue(generator="UUID")
    private String evaId;

    /**
     * 商机ID
     */
    @Column(name = "OPTY_ID")
    private String optyId;

    /**
     * 评价项
     */
    @Column(name = "EVA_OBJECT")
    private String evaObject;

    /**
     * 评价分数
     */
    @Column(name = "EVA_GRADE")
    private String evaGrade;

    /**
     * 记录状态
     */
    @Column(name = "RECORD_STATUS")
    private String recordStatus;

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
     * 评价描述
     */
    @Column(name = "EVA_DESCRIPTION")
    private String evaDescription;

    /**
     * 获取主键
     *
     * @return EVA_ID - 主键
     */
    public String getEvaId() {
        return evaId;
    }

    /**
     * 设置主键
     *
     * @param evaId 主键
     */
    public void setEvaId(String evaId) {
        this.evaId = evaId;
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
     * 获取评价项
     *
     * @return EVA_OBJECT - 评价项
     */
    public String getEvaObject() {
        return evaObject;
    }

    /**
     * 设置评价项
     *
     * @param evaObject 评价项
     */
    public void setEvaObject(String evaObject) {
        this.evaObject = evaObject;
    }

    /**
     * 获取评价分数
     *
     * @return EVA_GRADE - 评价分数
     */
    public String getEvaGrade() {
        return evaGrade;
    }

    /**
     * 设置评价分数
     *
     * @param evaGrade 评价分数
     */
    public void setEvaGrade(String evaGrade) {
        this.evaGrade = evaGrade;
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
     * 获取评价描述
     *
     * @return EVA_DESCRIPTION - 评价描述
     */
    public String getEvaDescription() {
        return evaDescription;
    }

    /**
     * 设置评价描述
     *
     * @param evaDescription 评价描述
     */
    public void setEvaDescription(String evaDescription) {
        this.evaDescription = evaDescription;
    }
}