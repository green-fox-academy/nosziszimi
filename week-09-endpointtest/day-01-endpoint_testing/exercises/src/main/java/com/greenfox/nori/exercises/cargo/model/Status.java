package com.greenfox.nori.exercises.cargo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Created by Nóra on 2017. 05. 15..
 */
@Component
@Getter @Setter
public class Status {

  String received;
  int amount;
  String shipstatus;
  boolean ready;
}
