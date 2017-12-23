package com.yan.example.model;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. YanHeWen
 * Date 2017/12/23 14:26
 * Function:
 * 消息返回对象
 */

import com.yan.example.constant.Constant;

public class ResultObject {

  // 应答码
  private int code = Constant.CODE_SUCCESS;
  // 应答描述
  private String desc = Constant.DESC_SUCCESS;
  // 返回的数据
  private Object data;

  public ResultObject() {
  }

  // 仅录入返回信息的时候，默认为成功响应
  public ResultObject(String desc) {
    this.code = Constant.CODE_SUCCESS;
    this.desc = desc;
  }

  public ResultObject(int code) {
    this.code = code;

    if (code == Constant.CODE_SUCCESS){
      this.desc = Constant.DESC_SUCCESS;
    }
    else if (code == Constant.CODE_FAIL){
      this.desc = Constant.DESC_FAIL;
    }
    else
      this.desc = Constant.DESC_ERROR;
  }

  public ResultObject(Object data) {
    this.code = Constant.CODE_SUCCESS;
    this.desc = Constant.DESC_SUCCESS;
    this.data = data;
  }

  public ResultObject(int code, String desc) {
    this.code = code;
    this.desc = desc;
  }

  public ResultObject(int code, String desc, Object data) {
    this.code = code;
    this.desc = desc;
    this.data = data;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "ResultObject [code=" + code + ", desc=" + desc + "]";
  }
}
