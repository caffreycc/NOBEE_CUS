package com.ricelink.weixin.vo;

/**
 * 获取业务字典信息
 * Created by chenshengju on 2017/7/26 0025.
 */
public class DictInfoVO {

    private String id;
    private String text;
    private String father;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }
}
