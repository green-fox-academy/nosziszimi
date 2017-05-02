package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Nóra on 2017. 05. 02..
 */

@AllArgsConstructor(staticName = "of")
public class Greeting {

  static AtomicLong atomicLong = new AtomicLong(0);

  @Getter
  @Setter
  private long id;
  @Getter
  @Setter
  private String content;

}
