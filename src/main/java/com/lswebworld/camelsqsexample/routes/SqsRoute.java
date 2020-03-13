package com.lswebworld.camelsqsexample.routes;

import com.lswebworld.camelsqsexample.configuration.AppSettings;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SqsRoute extends RouteBuilder {

  @Autowired
  AppSettings settings;

  @Override
  public void configure() throws Exception {
    
    from("aws-sqs://" + buildUrl())
      .routeId("sqs-test-route")
      .threads(25,50)
      .to("bean:MessageProcessor")
      .log("Done")
      .end();

  }

  /**
   * Creates the SQS URI for the component.
   * @return
   */
  private String buildUrl() {
    StringBuilder builder = new StringBuilder();
    builder.append(settings.getQueueUrl());
    builder.append("?accessKey=RAW(" + settings.getKey() + ")");
    builder.append("&secretKey=RAW(" + settings.getSecret() + ")");
    builder.append("&region=" + settings.getRegion());
    builder.append("&greedy=true");
    return builder.toString();
  }
}