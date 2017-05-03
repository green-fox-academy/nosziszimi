package com.greenfox.nori.mvc.controllers;

import com.greenfox.nori.mvc.model.BankAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Nóra on 2017. 05. 03..
 */
@Controller
public class Ex8Controller {
  @RequestMapping("/Exercise8")
  public String showElements(Model model) {
    List<BankAccount> bankAccounts = new ArrayList<>();
    bankAccounts.add(new BankAccount("Rafiki", 800, "mandrill", false, false));
    bankAccounts.add(new BankAccount("Simba", 1000, "lion", true, false));
    bankAccounts.add(new BankAccount("Nala", 1000, "lion", false, false));
    bankAccounts.add(new BankAccount("Zordon", 500, "lion", false, true));
    bankAccounts.add(new BankAccount("Timon", 600, "meerkat", false, false));
    bankAccounts.add(new BankAccount("Pumba", 700, "warthog", false, false));
    model.addAttribute("list", bankAccounts);
    return "ex8";
  }
}
