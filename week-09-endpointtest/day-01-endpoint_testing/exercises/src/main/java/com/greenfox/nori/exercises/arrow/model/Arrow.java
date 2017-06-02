package com.greenfox.nori.exercises.arrow.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Nóra on 2017. 05. 15..
 */
@Getter @Setter
public class Arrow {

  private double distance, time, speed;

  public Arrow() {

  }

  public Arrow(double distance, double time) {
    this.distance = distance;
    this.time = time;
    speed = distance/time;
  }
}
