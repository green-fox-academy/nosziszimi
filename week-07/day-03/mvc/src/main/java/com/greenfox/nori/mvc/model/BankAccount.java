package com.greenfox.nori.mvc.model;

import org.springframework.stereotype.Component;

/**
 * Created by Nóra on 2017. 05. 03..
 */
@Component
public class BankAccount {
  private String name, animalType;
  private float balance;
  private boolean king, badGuy;

  public BankAccount(){

  }

  public BankAccount(String name, float balance, String animalType){
   this(name, balance, animalType, false);
  }

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

  public void setBalance(float balance) {
    this.balance = balance;
  }

  public void increaseBalance(int increase) {
    balance += increase;
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
