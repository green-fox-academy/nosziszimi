package com.greenfox.nori.mvc.controllers;

import com.greenfox.nori.mvc.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Nóra on 2017. 05. 03..
 */
@Controller
public class Ex1Controller {

  @RequestMapping("/Exercise1")
  public String showFields(Model model) {
    BankAccount b1 = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("simba", b1);
    return "fields";
  }
}
