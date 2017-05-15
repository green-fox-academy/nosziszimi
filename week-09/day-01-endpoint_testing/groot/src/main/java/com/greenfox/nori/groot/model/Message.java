package com.greenfox.nori.groot.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Nóra on 2017. 05. 15..
 */
@Getter @Setter
public class Message {

  private String received, translated;

  public Message() {
    translated = "I am Groot!";
  }

  public Message(String message) {
    received = message;
    translated = "I am Groot!";
  }
}
