package com.yan.example.model;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. YanHeWen
 * Date 2017/12/21 23:10
 * Function:
 * 用户实体类
 */

public class User {
  private int id;
  private String userName;
  private String age;

  @Override
  public String toString() {
    return "User [id=" + id + ", age=" + age + ", userName=" + userName
        + "]";
  }
  public User(){
    super();
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getAge() {
    return age;
  }
  public void setAge(String age) {
    this.age = age;
  }
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }
  public User(int id, String age, String userName) {
    super();
    this.id = id;
    this.age = age;
    this.userName = userName;
  }
}
