package com.ylx.model;

import java.io.Serializable;

public class Dept implements Serializable {
    private Integer id;      //id
    private String name;     //部门名称
    private String remark;   //描述

    public Dept() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRemark() {
        return remark;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
