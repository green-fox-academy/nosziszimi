package com.greenfox.nori.mvc.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Created by Nóra on 2017. 05. 04..
 */
@Component
@Setter
@Getter
public class Hit {

  String hit;
  String accountIndex;

  public int getHitInt() {
    return Integer.parseInt(hit);
  }

  public int getAccountIndexInt() {
    return Integer.parseInt(accountIndex);
  }
}
