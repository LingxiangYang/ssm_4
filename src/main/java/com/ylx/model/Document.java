package com.ylx.model;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.Date;

public class Document implements Serializable {
    private int id;               //编号
    private String title;         //标题
    private String filename;      //文件名
    private MultipartFile file;   //文件
    private String remark;        //描述
    private Date createDate;      //上传时间
    private User user;            //上传人
    public Document(){
        super();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getFilename() {
        return filename;
    }

    public MultipartFile getFile() {
        return file;
    }

    public String getRemark() {
        return remark;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public User getUser() {
        return user;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
