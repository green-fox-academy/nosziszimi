package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Nóra on 2017. 05. 02..
 */
@Controller
public class HelloWebController {

  @RequestMapping(value="/web/greeting")
  public String greeting(@RequestParam("name") String name,  Model model) {
    model.addAttribute("name", name);
    model.addAttribute("count", Greeting.atomicLong.incrementAndGet());
    return "greet";
  }
}
