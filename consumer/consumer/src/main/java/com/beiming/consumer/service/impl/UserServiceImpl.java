package com.beiming.consumer.service.impl;

import com.beiming.consumer.dao.UserMapper;
import com.beiming.consumer.domain.User;
import com.beiming.consumer.service.UserService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


  @Resource
  private UserMapper userMapper;

  @Override
  public void addUser(User user) {
    userMapper.insert(user);
  }
}
