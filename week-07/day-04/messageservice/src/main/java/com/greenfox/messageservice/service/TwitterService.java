package com.greenfox.messageservice.service;

import org.springframework.stereotype.Component;

/**
 * Created by Nóra on 2017. 05. 04..
 */
@Component
public class TwitterService extends MessageService {

  public void sendMessage(){
    System.out.println("Tweet sent to " + getAddress() + " with the message: " + getMessage());
  }
}
