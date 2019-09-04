package com.beiming.consumer.service.impl;

import com.beiming.consumer.dao.UserMapper;
import com.beiming.consumer.domain.User;
import com.beiming.consumer.service.UserService;
import com.beiming.provider.domain.Car;
import com.beiming.provider.service.CarService;
import javax.annotation.Resource;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService {


  @Resource
  private UserMapper userMapper;


  @Reference
  CarService carService;

  @Override
  public void addUser(User user) {
    userMapper.insert(user);
    carService.addCar(new Car(2, "思域", "本田"));
  }
}
