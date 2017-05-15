package com.greenfox.nori.exercises.arrow.controller;

import com.greenfox.nori.exercises.arrow.model.Arrow;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nóra on 2017. 05. 15..
 */
@RestController
public class ArrowController {

  @ExceptionHandler(Exception.class)
  public String exception() {
      return "Some error happened";
  }

  @GetMapping("/yondu")
  public Arrow speed(@RequestParam("distance") double distance, @RequestParam("time") double time) {
    Arrow arrow = new Arrow(distance, time);
    return arrow;
  }
}
