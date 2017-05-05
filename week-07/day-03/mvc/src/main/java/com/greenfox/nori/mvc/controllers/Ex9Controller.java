package com.greenfox.nori.mvc.controllers;

import com.greenfox.nori.mvc.model.BankAccount;
import com.greenfox.nori.mvc.model.Hit;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Nóra on 2017. 05. 03..
 */
@Controller
public class Ex9Controller {

  List<BankAccount> bankAccounts = new ArrayList<>();

  @Autowired
  Hit increase;



  @RequestMapping("/Exercise9")
  public String showElements(Model model) {
    if (bankAccounts.size() == 0) {
      bankAccounts.add(new BankAccount
              ("Rafiki", 800, "mandrill", false, false));
      bankAccounts.add(new BankAccount
              ("Simba", 1000, "lion", true, false));
      bankAccounts.add(new BankAccount
              ("Nala", 1000, "lion", false, false));
      bankAccounts.add(new BankAccount
              ("Zordon", 500, "lion", false, true));
      bankAccounts.add(new BankAccount
              ("Timon", 600, "meerkat", false, false));
      bankAccounts.add(new BankAccount
              ("Pumba", 700, "warthog", false, false));
    }
    model.addAttribute("list", bankAccounts);
    model.addAttribute("hitObject", increase);
    return "ex9";
  }

  @RequestMapping("/hit")
  public String hit(Hit hit) {
    int index = hit.getAccountIndexInt();
    int increase = hit.getHitInt();
    bankAccounts.get(index).increaseBalance(increase);
    return "redirect:/Exercise9";
  }
}
