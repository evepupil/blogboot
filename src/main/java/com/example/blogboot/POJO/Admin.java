package com.example.blogboot.POJO;

import java.util.Date;

/**
 * @ClassName : Admin
 * @Author : Administrator
 * @Date: 2021/6/25 21:09
 * @Description :
 */
public class Admin {      //用户实体类
    Integer id;
    String nickname;
    String username;
    String password;
    String userHeadImg;
    Date registerDate;
    String email;

    public Admin(Integer id, String nickname, String username, String password, String userHeadImg, Date registerDate, String email, String sign) {
        this.id = id;
        this.nickname = nickname;
        this.username = username;
        this.password = password;
        this.userHeadImg = userHeadImg;
        this.registerDate = registerDate;
        this.email = email;
        this.sign = sign;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public Admin(Integer id, String nickname, String username, String password, String userHeadImg, Date registerDate, String sign) {
        this.id = id;
        this.nickname = nickname;
        this.username = username;
        this.password = password;
        this.userHeadImg = userHeadImg;
        this.registerDate = registerDate;
        this.sign = sign;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setUserHeadImg(String userHeadImg) {
        this.userHeadImg = userHeadImg;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getUserHeadImg() {
        return userHeadImg;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public String getSign() {
        return sign;
    }

    String sign;

    public Admin(Integer id, String username, String password, String userHeadImg, Date registerDate, String sign) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.userHeadImg = userHeadImg;
        this.registerDate = registerDate;
        this.sign = sign;
    }

    public Admin(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
