package com.yan.example.model;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. YanHeWen
 * Date 2017/12/21 23:10
 * Function:
 * 人员实体类
 */

import java.sql.Timestamp;
import java.util.Date;

public class User {
  private int id;
  private String userName;
  private String password;
  private int gender;
  private String mobile;
  private String email;
  private String birthday;
  private int level;
  private int enable;
  private Timestamp createTime;
  private Timestamp lastTime;

  @Override
  public String toString() {
    return "User [id=" + id + ", userName=" + userName + ", gender=" + (gender==1?"女":"男")
        + ", mobile=" + mobile + ", email=" +email + ", birthday=" + birthday
        + "]";
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getGender() {
    return gender;
  }

  public void setGender(int gender) {
    this.gender = gender;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public int getEnable() {
    return enable;
  }

  public void setEnable(int enable) {
    this.enable = enable;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
  }

  public Timestamp getLastTime() {
    return lastTime;
  }

  public void setLastTime(Timestamp lastTime) {
    this.lastTime = lastTime;
  }

  /* 通过禁用默认构造方法，实现添加用户时必录项
  public User(){
    super();
  }
  */

  public User(int id, String userName, int gender, String mobile, String email, String birthday) {
    super();
    this.id = id;
    this.userName = userName;
    this.gender = gender;
    this.mobile = mobile;
    this.email = email;
    this.birthday = birthday;
  }
}
