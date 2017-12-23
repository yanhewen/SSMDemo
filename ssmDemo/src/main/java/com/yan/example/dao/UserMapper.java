package com.yan.example.dao;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. YanHeWen
 * Date 2017/12/21 23:11
 * Function:
 *
 */

import com.yan.example.model.User;
import java.util.List;

public interface UserMapper {
  void save(User user);
  boolean update(User user);
  boolean delete(int id);
  void disableById(int id);
  User findById(int id);
  List<User> findAll();
}
