package com.ricelink.weixin.mapper.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "rl_potential_requirements")
public class RlPotentialRequirements {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "REQUIREMENT_ID")
    @GeneratedValue(generator = "UUID")
    private String requirementId;

    /**
     * 商机ID
     */
    @Column(name = "OPPORTUNITY_ID")
    private String opportunityId;

    /**
     * 需求类型
     */
    @Column(name = "REQUIREMENT_TYPE")
    private String requirementType;

    /**
     * 需求功能
     */
    @Column(name = "REQUIREMENT_FUNCTION")
    private String requirementFunction;

    /**
     * 需求描述
     */
    @Column(name = "REQUIREMENT_DESCRIPTION")
    private String requirementDescription;

    /**
     * 创建人
     */
    @Column(name = "CREATED_BY")
    private String createdBy;

    /**
     * 创建日期
     */
    @Column(name = "CREATION_DATE")
    private Date creationDate;

    /**
     * 最后更新人
     */
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;

    /**
     * 最后更新时间
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
     * 更新标记位
     */
    @Column(name = "UPDATE_FLAG")
    private String updateFlag;

    /**
     * 客户更新日期
     */
    @Column(name = "CLIENT_UPDATE_DATE")
    private Date clientUpdateDate;

    /**
     * 获取主键ID
     *
     * @return REQUIREMENT_ID - 主键ID
     */
    public String getRequirementId() {
        return requirementId;
    }

    /**
     * 设置主键ID
     *
     * @param requirementId 主键ID
     */
    public void setRequirementId(String requirementId) {
        this.requirementId = requirementId;
    }

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
     * 获取需求类型
     *
     * @return REQUIREMENT_TYPE - 需求类型
     */
    public String getRequirementType() {
        return requirementType;
    }

    /**
     * 设置需求类型
     *
     * @param requirementType 需求类型
     */
    public void setRequirementType(String requirementType) {
        this.requirementType = requirementType;
    }

    /**
     * 获取需求功能
     *
     * @return REQUIREMENT_FUNCTION - 需求功能
     */
    public String getRequirementFunction() {
        return requirementFunction;
    }

    /**
     * 设置需求功能
     *
     * @param requirementFunction 需求功能
     */
    public void setRequirementFunction(String requirementFunction) {
        this.requirementFunction = requirementFunction;
    }

    /**
     * 获取需求描述
     *
     * @return REQUIREMENT_DESCRIPTION - 需求描述
     */
    public String getRequirementDescription() {
        return requirementDescription;
    }

    /**
     * 设置需求描述
     *
     * @param requirementDescription 需求描述
     */
    public void setRequirementDescription(String requirementDescription) {
        this.requirementDescription = requirementDescription;
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
     * 获取最后更新人
     *
     * @return LAST_UPDATED_BY - 最后更新人
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * 设置最后更新人
     *
     * @param lastUpdatedBy 最后更新人
     */
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * 获取最后更新时间
     *
     * @return LAST_UPDATE_DATE - 最后更新时间
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * 设置最后更新时间
     *
     * @param lastUpdateDate 最后更新时间
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
}