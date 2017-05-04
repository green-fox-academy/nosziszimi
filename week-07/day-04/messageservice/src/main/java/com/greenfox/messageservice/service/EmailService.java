package com.greenfox.messageservice.service;

import org.springframework.stereotype.Component;

/**
 * Created by Nóra on 2017. 05. 04..
 */
@Component
public class EmailService extends MessageService {


  public void sendMessage() {
    System.out.println("Email sent to " + getAddress() + " with the message: " + getMessage());
  }
}
