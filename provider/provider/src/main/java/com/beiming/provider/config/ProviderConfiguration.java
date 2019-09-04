package com.beiming.provider.config;


import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.ProviderConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDubbo(scanBasePackages = "com.beiming.provider.service.impl")
public class ProviderConfiguration {

  @Bean // #1 服务提供方配置
  public ProviderConfig providerConfig() {
    ProviderConfig providerConfig = new ProviderConfig();
    providerConfig.setTimeout(10000);
    return providerConfig;
  }

  @Bean // #2  应用配置
  public ApplicationConfig applicationConfig() {
    ApplicationConfig applicationConfig = new ApplicationConfig();
    applicationConfig.setName("dubbo-annotation-provider");
    return applicationConfig;
  }

  @Bean // #3  注册中心配置
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
    protocolConfig.setPort(20880);
    return protocolConfig;
  }
}
