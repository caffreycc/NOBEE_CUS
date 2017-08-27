package com.ricelink.weixin.mapper.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by aixiaoai on 2016/9/21.
 */
@Table(name = "base_seq")
public class BaseSeq {

    @Id
    @Column(name = "NAME")
    private String name;

    @Column(name = "CODE")
    private Integer code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
