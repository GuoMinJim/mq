package com.beiming.provider;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;


@MapperScan("com.beiming.provider.dao")
@DubboComponentScan(value = "com.beiming.provider.service")
@ComponentScan("com.beiming.provider.config")
@SpringBootApplication
public class ProviderApplication {

  public static void main(String[] args) {
    SpringApplication.run(ProviderApplication.class, args);
  }

}
