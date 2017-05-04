package com.greenfox.messageservice.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Created by Nóra on 2017. 05. 04..
 */
@Component
@AllArgsConstructor
public abstract class MessageService {

  public MessageService() {

  }

  @Setter
  @Getter
  private String address, message;

  public abstract void sendMessage();
}
