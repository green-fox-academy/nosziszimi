package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nóra on 2017. 05. 02..
 */
@RestController
public class HelloRESTController {

  @RequestMapping(value="/greeting")
  @ResponseBody
  public Greeting greeting(@RequestParam("name")String name) {
    return Greeting.of(1, "Hello " + name + "!");
  }
}
