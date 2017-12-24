# SSMDemo
## This SSMDemo is for interview
---
1.涉及主框架如下：

  `maven + Spring 4.3.2 + Spring mvc + Mybatis 3.4.4`
  
  
2.遵从`restful`规范：

  > 查询（**GET**）
  
    查询全部人员 : /user/users
    
    查询指定ID人员：/user/users/{id}
    
  > 新增(**POST**)
  
    新增人员：/user/user 入参为JSON格式数据
    
  > 修改（**PUT**）
  
    修改指定ID人员信息：user/user/{id}
    
3.数据库`MySQL 5.6.36 GPL`
  + 表结构
  
  ```
    CREATE TABLE t_user (
    id int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
    username varchar(32) NOT NULL DEFAULT '' COMMENT '用户名',
    password varchar(32) NOT NULL DEFAULT '' COMMENT '登陆密码',
    gender tinyint(4) NOT NULL DEFAULT '0' COMMENT '性别,0:男,1:女',
    mobile varchar(11) NOT NULL DEFAULT '' COMMENT '用户手机号码',
    email varchar(32) NOT NULL DEFAULT '' COMMENT '邮箱地址',
    birthday varchar(8) NOT NULL DEFAULT '' COMMENT '生日,格式:yyyyMMdd',
    level tinyint(4) NOT NULL DEFAULT '0' COMMENT '用户等级',
    enable tinyint(4) NOT NULL DEFAULT '0' COMMENT '状态,0:可用,1:禁用',
    create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
    last_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近修改时间',
    PRIMARY KEY ('id')
  ) COMMENT='用户信息表'
```
  
  + 测试数据
  ```
  insert into `t_user` (`id`, `username`, `password`, `gender`, `mobile`, `email`, `birthday`, `level`, `enable`, `create_time`, `last_time`) values('1','yan','123abc','0','18899876787','yan-hewen@163.com','19921123','1','0','2017-12-23 15:57:46','2017-12-23 15:57:46');
  insert into `t_user` (`id`, `username`, `password`, `gender`, `mobile`, `email`, `birthday`, `level`, `enable`, `create_time`, `last_time`) values('2','kiki','aaa123','1','17600589966','732076824@qq.com','19880616','2','0','2017-12-23 15:59:23','2017-12-23 15:59:23');
  insert into `t_user` (`id`, `username`, `password`, `gender`, `mobile`, `email`, `birthday`, `level`, `enable`, `create_time`, `last_time`) values('3','lizhiming','abc321','0','13840332987','lizm@neusoft.com','19910812','0','1','2017-12-23 18:06:20','2017-12-23 18:29:50');
  insert into `t_user` (`id`, `username`, `password`, `gender`, `mobile`, `email`, `birthday`, `level`, `enable`, `create_time`, `last_time`) values('4','YangYouGu','yyg321','0','18898654432','yangyg@neusoft.com','19810328','0','0','2017-12-23 18:23:38','2017-12-23 18:23:38');
  insert into `t_user` (`id`, `username`, `password`, `gender`, `mobile`, `email`, `birthday`, `level`, `enable`, `create_time`, `last_time`) values('5','ZhangXC','yyg321','0','18898654432','ZhangXC@neusoft.com','19810328','0','0','2017-12-23 18:29:50','2017-12-23 18:29:50');
  insert into `t_user` (`id`, `username`, `password`, `gender`, `mobile`, `email`, `birthday`, `level`, `enable`, `create_time`, `last_time`) values('6','Kobe Bryant','kb123','0','18766765466','kobe@163.com','19801021','4','1','2017-12-24 14:00:47','2017-12-24 14:03:38');
  ```
  
