package com.ricelink.weixin.mapper.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "material_mp_cp_table")
public class MaterialMpCpTable {
    @Id
    @Column(name = "ID")
    private Integer id;

    /**
     * text 文字、image 图片、voice 语音、video 视频、pictures 图文、file 文件
     */
    @Column(name = "MATERIAL_TYPE")
    private String materialType;

    /**
     * micro 公众号、 cp 企业号
     */
    @Column(name = "WEIXIN_TYPE")
    private String weixinType;

    @Column(name = "MP_CP_ID")
    private Integer mpCpId;

    @Column(name = "MEDIA_ID")
    private String mediaId;

    @Column(name = "MATERIAL_ID")
    private Integer materialId;

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
     * 获取text 文字、image 图片、voice 语音、video 视频、pictures 图文、file 文件
     *
     * @return MATERIAL_TYPE - text 文字、image 图片、voice 语音、video 视频、pictures 图文、file 文件
     */
    public String getMaterialType() {
        return materialType;
    }

    /**
     * 设置text 文字、image 图片、voice 语音、video 视频、pictures 图文、file 文件
     *
     * @param materialType text 文字、image 图片、voice 语音、video 视频、pictures 图文、file 文件
     */
    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    /**
     * 获取micro 公众号、 cp 企业号
     *
     * @return WEIXIN_TYPE - micro 公众号、 cp 企业号
     */
    public String getWeixinType() {
        return weixinType;
    }

    /**
     * 设置micro 公众号、 cp 企业号
     *
     * @param weixinType micro 公众号、 cp 企业号
     */
    public void setWeixinType(String weixinType) {
        this.weixinType = weixinType;
    }

    /**
     * @return MICRO_CP_ID
     */
    public Integer getMpCpId() {
        return mpCpId;
    }

    /**
     * @param mpCpId
     */
    public void setMpCpId(Integer mpCpId) {
        this.mpCpId = mpCpId;
    }

    /**
     * @return MEDIA_ID
     */
    public String getMediaId() {
        return mediaId;
    }

    /**
     * @param mediaId
     */
    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    /**
     * @return MATERIAL_ID
     */
    public Integer getMaterialId() {
        return materialId;
    }

    /**
     * @param materialId
     */
    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }
}