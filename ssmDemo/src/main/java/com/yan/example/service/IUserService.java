package com.yan.example.service;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. YanHeWen
 * Date 2017/12/21 23:23
 * Function:
 * 用户操作接口文件
 */

import com.yan.example.model.User;
import java.util.List;

public interface IUserService {
  void save(User user);
  boolean delete(int id);
  User findById(int id);
  void disableById(int id);
  List<User> findAll();
}
