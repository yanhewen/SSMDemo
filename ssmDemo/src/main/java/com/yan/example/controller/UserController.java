package com.yan.example.controller;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. YanHeWen
 * Date 2017/12/21 23:24
 * Function:
 * User Restful Controller
 */

import com.yan.example.model.ResultObject;
import com.yan.example.model.User;
import com.yan.example.service.IUserService;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

  private static Logger logger = Logger.getLogger(UserController.class);

  @Autowired
  private IUserService userService;

  /**
   * ����û�
   * @param user
   * @return
   */
  @ResponseBody
  @RequestMapping(value = "/user", method = RequestMethod.POST)
  public ResultObject save(@RequestBody User user){
    logger.info("���������û�...");
    logger.info("�û���Ϣ��" + user.toString());
    userService.save(user);
    logger.info("����ɹ���");
    return new ResultObject("����ɹ���");
  }

  /**
   * ����ID��ѯ�û���Ϣ
   * @param id
   * @return
   */
  @ResponseBody
  @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
  public ResultObject findById(@PathVariable int id){
    logger.info("���ڲ�ѯ�û���Ϣ...");
    logger.info("����������id=" + id);
    User user = userService.findById(id);
    logger.info("������ɣ�" + user.toString());
    return new ResultObject(1,"��ѯ�ɹ���",user);
  }

  /**
   * ��ID�����û�
   * @param id
   * @return
   */
  @ResponseBody
  @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
  public ResultObject disableById(@PathVariable int id){
    logger.info("���ڽ����û��ʺ�[id=" + id +"]...");
    userService.disableById(id);
    logger.info("ִ�н������û�[id=" + id + "]�ѽ��á�");
    return new ResultObject("���óɹ���");
  }

  /**
   * ��ѯ�����û��б�
   * @return
   */
  @ResponseBody
  @RequestMapping(value = "/users", method = RequestMethod.GET)
  public ResultObject getAllUser(){
    logger.info("���ڲ�ѯ������Ա��Ϣ...");
    List<User> userList = userService.findAll();
    logger.info("��ѯ��������Ա��Ϣ��");
    for (User user:userList)
      logger.info(user.toString());
    return new ResultObject(1,"��ѯ�ɹ���",userList);
  }
}
