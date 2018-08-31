package com.beike.hcc.blog.model;




import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Date;


public class User {

    private Integer userId;
     @NotEmpty(message = "姓名不能为空")
    private String userName;
     @NotEmpty(message = "密码不能为空")
     @Length(min=6,message="密码长度不能小于6位")
    private  String passWord;
    @Email(message ="邮箱格式错误")
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
