package com.ricelink.weixin.mapper.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "sys_attachment")
public class SysAttachment {
    /**
     * 主键
     */
    @Id
    @Column(name = "FILE_ID")
    private String fileId;

    /**
     * 附件名称
     */
    @Column(name = "FILE_NAME")
    private String fileName;

    @Column(name = "FILE_SOURCE")
    private String fileSource;

    @Column(name = "ABS_PATH")
    private String absPath;

    /**
     * 附件类型
     */
    @Column(name = "FILE_TYPE")
    private String fileType;

    /**
     * 附件大小
     */
    @Column(name = "FILE_SIZE")
    private Long fileSize;

    /**
     * 附件路径
     */
    @Column(name = "FILE_PATH")
    private String filePath;

    @Column(name = "GROUP_NO")
    private String groupNo;

    @Column(name = "GROUP_NAME")
    private String groupName;

    @Column(name = "RES_ID")
    private String resId;

    @Column(name = "CREATEBY")
    private String createby;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 资源所属功能（表名或者功能）
     */
    @Column(name = "RESOURCE_TYPE")
    private String resourceType;

    /**
     * 资源ID
     */
    @Column(name = "RESOURCE_ID")
    private String resourceId;

    /**
     * 获取主键
     *
     * @return FILE_ID - 主键
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * 设置主键
     *
     * @param fileId 主键
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * 获取附件名称
     *
     * @return FILE_NAME - 附件名称
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 设置附件名称
     *
     * @param fileName 附件名称
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @return FILE_SOURCE
     */
    public String getFileSource() {
        return fileSource;
    }

    /**
     * @param fileSource
     */
    public void setFileSource(String fileSource) {
        this.fileSource = fileSource;
    }

    /**
     * @return ABS_PATH
     */
    public String getAbsPath() {
        return absPath;
    }

    /**
     * @param absPath
     */
    public void setAbsPath(String absPath) {
        this.absPath = absPath;
    }

    /**
     * 获取附件类型
     *
     * @return FILE_TYPE - 附件类型
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * 设置附件类型
     *
     * @param fileType 附件类型
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    /**
     * 获取附件大小
     *
     * @return FILE_SIZE - 附件大小
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * 设置附件大小
     *
     * @param fileSize 附件大小
     */
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * 获取附件路径
     *
     * @return FILE_PATH - 附件路径
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * 设置附件路径
     *
     * @param filePath 附件路径
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * @return GROUP_NO
     */
    public String getGroupNo() {
        return groupNo;
    }

    /**
     * @param groupNo
     */
    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    /**
     * @return GROUP_NAME
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * @return RES_ID
     */
    public String getResId() {
        return resId;
    }

    /**
     * @param resId
     */
    public void setResId(String resId) {
        this.resId = resId;
    }

    /**
     * @return CREATEBY
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * @param createby
     */
    public void setCreateby(String createby) {
        this.createby = createby;
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取资源所属功能（表名或者功能）
     *
     * @return RESOURCE_TYPE - 资源所属功能（表名或者功能）
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * 设置资源所属功能（表名或者功能）
     *
     * @param resourceType 资源所属功能（表名或者功能）
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * 获取资源ID
     *
     * @return RESOURCE_ID - 资源ID
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * 设置资源ID
     *
     * @param resourceId 资源ID
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
}