package com.ylx.model;

import java.io.Serializable;
import java.util.Date;

public class Notice implements Serializable {
    private Integer id;          //id
    private String title;        //标题
    private String content;      //内容
    private Date createDate;    //发布日期
    private User user;         //发布人
    public Notice(){
        super();
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public User getUser() {
        return user;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
