package com.beiming.consumer.config;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ConsumerConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.ProviderConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDubbo(scanBasePackages = "com.beiming.consumer.service")
@ComponentScan(value = {"com.beiming.consumer"})
public class ConsumerConfiguration {

//  @Value("${dubbo.application.name}")
//  private String dubboApplicationName;
//
//  @Value("${dubbo.registry.address}")
//  private String dubboRegistryAddress;

  @Bean // #1
  public ApplicationConfig applicationConfig() {
    ApplicationConfig applicationConfig = new ApplicationConfig();
    applicationConfig.setName("consumer");
    applicationConfig.setVersion("2.7.3");
    return applicationConfig;
  }

  @Bean // #1 服务提供方配置
  public ProviderConfig providerConfig() {
    ProviderConfig providerConfig = new ProviderConfig();
    providerConfig.setTimeout(10000);
    return providerConfig;
  }

  @Bean // #2
  public ConsumerConfig consumerConfig() {
    ConsumerConfig consumerConfig = new ConsumerConfig();
    consumerConfig.setTimeout(10000);
    consumerConfig.setCheck(false);
    return consumerConfig;
  }

  @Bean // #3
  public RegistryConfig registryConfig() {
    RegistryConfig registryConfig = new RegistryConfig();
    registryConfig.setProtocol("zookeeper");
    registryConfig.setAddress("47.106.248.229:2181");
    registryConfig.setPort(2181);
    return registryConfig;
  }

  @Bean // #4  协议配置
  public ProtocolConfig protocolConfig() {
    ProtocolConfig protocolConfig = new ProtocolConfig();
    protocolConfig.setName("dubbo");
    protocolConfig.setPort(20881);
    return protocolConfig;
  }
}
