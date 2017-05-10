package com.greenfox.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Nóra on 2017. 05. 10..
 */
@Controller
public class MainController {

  @RequestMapping("/")
  public String index(Model model) {
    return "index";
  }
}
