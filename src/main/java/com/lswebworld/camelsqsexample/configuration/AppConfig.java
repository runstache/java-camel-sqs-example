package com.lswebworld.camelsqsexample.configuration;

import com.lswebworld.camelsqsexample.processors.MessageProcessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


  @Bean(name = "MessageProcessor")
  public MessageProcessor messageProcessor() {
    return new MessageProcessor();
  }
}