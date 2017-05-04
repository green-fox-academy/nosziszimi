package com.greenfox.messageservice;

import com.greenfox.messageservice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Nóra on 2017. 05. 04..
 */
@Component
public class MessageProceeder {
  //field-based DI
  //@Autowired
  MessageService ms;

  //constructor-based DI
  @Autowired
  public MessageProceeder(MessageService ms) {
    this.ms = ms;
  }

  public void setMs(MessageService ms) {
    this.ms = ms;
  }

  public void processMessage(String message, String address) {
    ms.setMessage(message);
    ms.setAddress(address);
    ms.sendMessage();
  }

}
