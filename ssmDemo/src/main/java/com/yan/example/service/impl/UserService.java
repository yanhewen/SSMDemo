package com.yan.example.service.impl;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. YanHeWen
 * Date 2017/12/21 23:23
 * Function:
 * Service userServiceImpl
 */

import com.yan.example.dao.UserMapper;
import com.yan.example.model.User;
import com.yan.example.service.IUserService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService implements IUserService {

  @Resource
  private UserMapper mapper;


  /**
   * ����û�
   * User�������ԣ�id, username, gender, mobile, email, birthday
   */
  public void save(User user) {
    mapper.save(user);
  }

  /**
   * ����ID��ѯ�û���Ϣ
   */
  public User findById(int id) {
    User user = mapper.findById(id);
    return user;
  }

  /**
   * ��ѯ�����û��б�
   */
  public List<User> findAll() {
    List<User> findAllList = mapper.findAll();
    return findAllList;
  }

  /**
   * ����ID�����û�
   * @param id
   */
  public void disableById(int id) {
    mapper.disableById(id);
  }
}