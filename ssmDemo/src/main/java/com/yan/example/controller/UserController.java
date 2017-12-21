package com.yan.example.controller;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. YanHeWen
 * Date 2017/12/21 23:24
 * Function:
 *
 */

import com.yan.example.model.User;
import com.yan.example.service.UserService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
  @Autowired
  private UserService userService;
  /**
   * ��ȡ�����û��б�
   * @param request
   * @return
   */
  @RequestMapping("/getAllUser")
  public String getAllUser(HttpServletRequest request,Model model){
    List<User> user = userService.findAll();
    model.addAttribute("userList", user);
    request.setAttribute("userList", user);
    return "/allUser";
  }
  /**
   * ��ת�������û�����
   * @param
   * @return
   */
  @RequestMapping("/toAddUser")
  public String toAddUser(){
    return "/addUser";
  }
  /**
   * �����û����ض���
   * @param user
   * @param model
   * @return
   */
  @RequestMapping("/addUser")
  public String addUser(User user,Model model){
    userService.save(user);
    return "redirect:/user/getAllUser";
  }
  /**
   *�༭�û�
   * @param user
   * @param request
   * @return
   */
  @RequestMapping("/updateUser")
  public String updateUser(User user,HttpServletRequest request,Model model){
    if(userService.update(user)){
      user = userService.findById(user.getId());
      request.setAttribute("user", user);
      model.addAttribute("user", user);
      return "redirect:/user/getAllUser";
    }else{
      return "/error";
    }
  }
  /**
   * ����id��ѯ�����û�
   * @param id
   * @param request
   * @return
   */
  @RequestMapping("/getUser")
  public String getUser(int id,HttpServletRequest request,Model model){
    request.setAttribute("user", userService.findById(id));
    model.addAttribute("user", userService.findById(id));
    return "/editUser";
  }
  /**
   * ɾ���û�
   * @param id
   * @param request
   * @param response
   */
  @RequestMapping("/delUser")
  public void delUser(int id,HttpServletRequest request,HttpServletResponse response){
    String result = "{\"result\":\"error\"}";
    if(userService.delete(id)){
      result = "{\"result\":\"success\"}";
    }
    response.setContentType("application/json");
    try {
      PrintWriter out = response.getWriter();
      out.write(result);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}