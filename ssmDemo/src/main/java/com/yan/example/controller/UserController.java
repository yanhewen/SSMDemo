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
   * 添加用户
   * @param user
   * @return
   */
  @ResponseBody
  @RequestMapping(value = "/user", method = RequestMethod.POST)
  public ResultObject save(@RequestBody User user){
    logger.info("正在新增用户...");
    logger.info("用户信息：" + user.toString());
    userService.save(user);
    logger.info("保存成功！");
    return new ResultObject("保存成功！");
  }

  /**
   * 根据ID查询用户信息
   * @param id
   * @return
   */
  @ResponseBody
  @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
  public ResultObject findById(@PathVariable int id){
    logger.info("正在查询用户信息...");
    logger.info("检索条件：id=" + id);
    User user = userService.findById(id);
    logger.info("检索完成：" + user.toString());
    return new ResultObject(1,"查询成功！",user);
  }

  /**
   * 按ID禁用用户
   * @param id
   * @return
   */
  @ResponseBody
  @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
  public ResultObject disableById(@PathVariable int id){
    logger.info("正在禁用用户帐号[id=" + id +"]...");
    userService.disableById(id);
    logger.info("执行结束：用户[id=" + id + "]已禁用。");
    return new ResultObject("禁用成功！");
  }

  /**
   * 查询所有用户列表
   * @return
   */
  @ResponseBody
  @RequestMapping(value = "/users", method = RequestMethod.GET)
  public ResultObject getAllUser(){
    logger.info("正在查询所有人员信息...");
    List<User> userList = userService.findAll();
    logger.info("查询到如下人员信息：");
    for (User user:userList)
      logger.info(user.toString());
    return new ResultObject(1,"查询成功！",userList);
  }
}
