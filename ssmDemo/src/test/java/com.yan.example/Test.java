package com.yan.example;


import com.alibaba.fastjson.JSON;
import com.yan.example.constant.Constant;
import com.yan.example.model.ResultObject;
import com.yan.example.model.User;
import com.yan.example.service.IUserService;
import java.util.List;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. YanHeWen
 * Date 2017/12/23 12:58
 * Function:
 * Test
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class Test {

  private static Logger logger = Logger.getLogger(Test.class);
  @Resource
  private IUserService userService;

  @org.junit.Test
  public void test(){
    logger.info("********************���Կ�ʼ********************");
    logger.info("��ʼ��Ա��");
    List<User> list = userService.findAll();
    for (User user:list)
      logger.info(user.toString());

    logger.info("��ʼ������Ա��");
    User user = new User(5,"ZhangXC",0,"18898654432","ZhangXC@neusoft.com","19810328");
    user.setPassword("yyg321");
    userService.save(user);

    logger.info("�����ɹ���");
    logger.info("��ѯIDΪ1��User:");
    User _user_1 = userService.findById(1);
    logger.info(_user_1.toString());
    logger.info("����IDΪ3��User:");
    userService.disableById(3);
    logger.info("���óɹ���");
  }
}
