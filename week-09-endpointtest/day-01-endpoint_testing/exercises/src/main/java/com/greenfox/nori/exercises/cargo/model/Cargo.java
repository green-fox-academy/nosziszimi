package com.greenfox.nori.exercises.cargo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Created by Nóra on 2017. 05. 15..
 */
@Component
@Getter @Setter
public class Cargo {

  int caliber25, caliber30, caliber50;
  String shipstatus = "empty";
  boolean ready;

  public int amount() {
    int amount = caliber25 + caliber30 + caliber50;
    return amount;
  }
}
