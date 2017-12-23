package com.yan.example.controller;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. YanHeWen
 * Date 2017/12/21 23:24
 * Function:
 * User Controller
 */

import com.yan.example.model.ResultObject;
import com.yan.example.model.User;
import com.yan.example.service.impl.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService userService;

  /**
   * ����û�
   * @param user
   * @return
   */
  @ResponseBody
  @RequestMapping("/save")
  public ResultObject save(@RequestBody User user){
    userService.save(user);
    return new ResultObject("����ɹ���");
  }

  /**
   * ����ID��ѯ�û���Ϣ
   * @param id
   * @return
   */
  @ResponseBody
  @RequestMapping("/findById")
  public ResultObject findById(@RequestBody int id){
    User user = userService.findById(id);
    return new ResultObject(1,"��ѯ�ɹ���",user);
  }

  /**
   * ��ID�����û�
   * @param id
   * @return
   */
  @ResponseBody
  @RequestMapping("/disableById")
  public ResultObject disableById(@RequestBody int id){
    userService.disableById(id);
    return new ResultObject("���óɹ���");
  }

  /**
   * ��ѯ�����û��б�
   * @return
   */
  @ResponseBody
  @RequestMapping("/getAllUser")
  public ResultObject getAllUser(){
    List<User> user = userService.findAll();
    return new ResultObject(1,"��ѯ�ɹ���",user);
  }
}
