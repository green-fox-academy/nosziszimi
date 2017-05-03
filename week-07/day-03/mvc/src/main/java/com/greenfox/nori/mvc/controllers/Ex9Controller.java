package com.greenfox.nori.mvc.controllers;

import com.greenfox.nori.mvc.model.BankAccount;
import java.util.ArrayList;
import java.util.List;
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

  @RequestMapping("/Exercise9")
  public String showElements(Model model) {
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
    model.addAttribute("list", bankAccounts);
    return "ex9";
  }

  @RequestMapping("/hit")
  public String hit(@RequestParam("id") int id) {
    bankAccounts.get(id).setBalance(bankAccounts.get(id).getBalance()+10);
    return "redirect:/Exercise10";
  }

  @RequestMapping("/Exercise10")
  public String showList( Model model){
    model.addAttribute("list", bankAccounts);
    return "ex9";
  }
}
