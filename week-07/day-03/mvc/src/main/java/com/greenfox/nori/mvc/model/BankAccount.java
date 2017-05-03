package com.greenfox.nori.mvc.model;

/**
 * Created by Nóra on 2017. 05. 03..
 */
public class BankAccount {
  private String name, animalType;
  private float balance;
  private boolean king;

  public BankAccount(String name, float balance, String animalType, boolean isKing) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    king = isKing;
  }

  public String getName() {
    return name;
  }

  public float getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public boolean getKing() {
    return king;
  }
}
