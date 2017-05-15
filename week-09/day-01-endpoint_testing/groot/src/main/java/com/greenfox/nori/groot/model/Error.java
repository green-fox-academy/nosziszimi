package com.greenfox.nori.groot.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Nóra on 2017. 05. 15..
 */
@Getter @Setter
public class Error {

  String error;

  public Error() {
    error = "I am Groot!";
  }
}
