package com.greenfox.nori.tennisrefactoringkata.model;

/**
 * Created by Nóra on 2017. 05. 23..
 */
public class Player {

  String name;
  int score;

  public Player() {

  }

  public Player(String name) {
    this.name = name;
    score = 0;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getTheScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public void incrementScore() {
    score += 1;
  }
}
