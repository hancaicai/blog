package com.beike.hcc.blog.model;

import java.util.Date;

public class User {
    private Integer userId;
    private String userName;
    private  String passWord;
    private  String userEmail;
    private Date lastLoginTime;
    private Date registerTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Date getlastLoginTime() {
        return lastLoginTime;
    }

    public void setlastLoginTime(Date userLastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getregisterTime() {
        return registerTime;
    }

    public void setregisterTime(Date userRegisterTime) {
        this.registerTime = registerTime;
    }
}
