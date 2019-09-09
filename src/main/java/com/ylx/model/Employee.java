package com.ylx.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
    private Integer id;       //id
    //员工关联的部门对象
    private Dept dept;        //部门
    //员工关联的职位对象
    private Job job;          //职位
    private String name;      //名称
    private String carsId;    //身份证
    private String address;   //地址
    private String postCode;  //邮政编码
    private String tel;       //电话
    private String phone;     //手机
    private String qqNum;     //qq
    private String email;     //邮箱
    private Integer sex;      //性别
    private String party;     //政治面貌
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;    //生日
    private String race;      //民族
    private String education; //学历
    private String speciality;//专业
    private String hobby;     //爱好
    private String remark;    //备注
    private Date createDate;  //建档日期
    public Employee(){
        super();
    }

    public Integer getId() {
        return id;
    }

    public Dept getDept() {
        return dept;
    }

    public Job getJob() {
        return job;
    }

    public String getName() {
        return name;
    }

    public String getCarsId() {
        return carsId;
    }

    public String getAddress() {
        return address;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getTel() {
        return tel;
    }

    public String getPhone() {
        return phone;
    }

    public String getQqNum() {
        return qqNum;
    }

    public String getEmail() {
        return email;
    }

    public Integer getSex() {
        return sex;
    }

    public String getParty() {
        return party;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getRace() {
        return race;
    }

    public String getEducation() {
        return education;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getHobby() {
        return hobby;
    }

    public String getRemark() {
        return remark;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCarsId(String carsId) {
        this.carsId = carsId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setQqNum(String qqNum) {
        this.qqNum = qqNum;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
