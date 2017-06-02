package com.greenfox.nori.tennisrefactoringkata.model;

/**
 * Created by Nóra on 2017. 05. 23..
 */
public class Player2 {

  int point;
  String result, name;

  public Player2() {
  }

  public Player2(String name) {
    this.name = name;
    point = 0;
  }

  public int getPoint() {
    return point;
  }

  public void setPoint(int point) {
    this.point = point;
  }

  public String getResult() {
    switch(point) {
      case 0:
        return "Love";
      case 1:
        return "Fifteen";
      case 2:
        return "Thirty";
      default:
        return "Forty";
    }
  }

  public void setResult(String result) {
    this.result = result;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void incrementPoint() {
    point += 1;
  }

}
