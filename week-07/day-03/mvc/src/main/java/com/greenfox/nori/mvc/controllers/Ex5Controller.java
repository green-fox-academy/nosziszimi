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
public class Ex5Controller {

  @RequestMapping("/Exercise5")
  public String showElements(Model model) {
    List<BankAccount> bankAccounts = new ArrayList<>();
    bankAccounts.add(new BankAccount("Rafiki", 800, "mandrill"));
    bankAccounts.add(new BankAccount("Simba", 1000, "lion"));
    bankAccounts.add(new BankAccount("Nala", 1000, "lion"));
    bankAccounts.add(new BankAccount("Zazu", 500, "red-billed hornbill"));
    bankAccounts.add(new BankAccount("Timon", 600, "meerkat"));
    bankAccounts.add(new BankAccount("Pumba", 700, "warthog"));
    model.addAttribute("list", bankAccounts);
    return "list";
  }
}
