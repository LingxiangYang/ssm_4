package com.ylx.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer id;       //id
    private String username;  //用户名
    private String loginname; //登录名
    private String password;  //密码
    private String status;    //状态
    private Date createDate;  //建档信息

    public User(){
        super();
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getLoginname() {
        return loginname;
    }

    public String getPassword() {
        return password;
    }

    public String getStatus() {
        return status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
