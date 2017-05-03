package com.greenfox.nori.mvc.model;

/**
 * Created by Nóra on 2017. 05. 03..
 */
public class BankAccount {
  private String name, animalType;
  private float balance;
  private boolean king, badGuy;

  public BankAccount(String name, float balance, String animalType, boolean isKing) {
    this(name, balance, animalType, isKing, false);
  }

  public BankAccount(String name, float balance, String animalType, boolean isKing, boolean isBad) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    king = isKing;
    badGuy = isBad;
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

  public boolean getBadGuy() {
    return badGuy;
  }
}
