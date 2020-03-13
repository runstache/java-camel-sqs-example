package com.lswebworld.camelsqsexample.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageProcessor implements Processor {

  private static final Logger LOG = LoggerFactory.getLogger(MessageProcessor.class);
  
  @Override
  public void process(Exchange exchange) throws Exception {
    
    if (exchange.getIn().getBody() != null) {
      LOG.info(exchange.getIn().getBody().toString().replace("\\n", "").replace("\\r", ""));
    }

  }

}