package com.beiming.provider.service.impl;

import com.beiming.provider.dao.CarMapper;
import com.beiming.provider.domain.Car;
import com.beiming.provider.service.CarService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CarServiceImpl implements CarService {


  @Autowired
  private CarMapper carMapper;


  @Override
  public void addCar(Car car) {
    carMapper.insert(car);
  }

}
