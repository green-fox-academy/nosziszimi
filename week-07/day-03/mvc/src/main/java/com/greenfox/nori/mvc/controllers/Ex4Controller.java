package com.greenfox.nori.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Nóra on 2017. 05. 03..
 */
@Controller
public class Ex4Controller {

  @RequestMapping("/Exercise4")
  public String giveBackText(Model model) {
    String text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("text", text);
    return "text";
  }
}
