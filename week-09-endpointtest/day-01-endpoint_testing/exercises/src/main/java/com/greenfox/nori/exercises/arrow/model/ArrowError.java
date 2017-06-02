package com.greenfox.nori.exercises.arrow.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Nóra on 2017. 05. 15..
 */
@Getter @Setter
public class ArrowError {

  private String arrowErrorMessage;

  public ArrowError() {
    arrowErrorMessage = "Some error in Arrow";
  }
}
