package com.yan.example.service.impl;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. YanHeWen
 * Date 2017/12/21 23:23
 * Function:
 *
 */

import com.yan.example.mapper.UserMapper;
import com.yan.example.model.User;
import com.yan.example.service.UserService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
// �˴����ٽ��д���SqlSession���ύ���񣬶��ѽ���springȥ�����ˡ�
public class UserServiceImpl implements UserService {

  @Resource
  private UserMapper mapper;

  /**
   * ����  id  ɾ�� ����
   */
  public boolean delete(int id) {
    return mapper.delete(id);
  }
  /**
   * ��ѯUser��ȫ������
   */
  public List<User> findAll() {
    List<User> findAllList = mapper.findAll();
    return findAllList;
  }
  /**
   * ���� id ��ѯ ��Ӧ����
   */
  public User findById(int id) {
    User user = mapper.findById(id);
    return user;
  }
  /**
   * ��������
   */
  public void save(User user) {
    mapper.save(user);
  }
  /**
   * ���� id �޸Ķ�Ӧ����
   */
  public boolean update(User user) {
    return mapper.update(user);
  }

}