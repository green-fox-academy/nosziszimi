package com.greenfox.nori.caloriecounter.controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Nóra on 2017. 06. 02..
 */
@org.springframework.stereotype.Controller
public class Controller {

  @GetMapping("")
  public String main() {
    return "index";
  }
}
