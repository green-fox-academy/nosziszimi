package com.greenfox.model;

import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Nóra on 2017. 05. 10..
 */
@Setter @Getter
public class Result {

  int result;

  public static int numberadder(int n) {
    if (n < 0) {
      return 0;
    } else {
      return numberadder(n - 1) + n;
    }
  }

  public static int factor(int n) {
    if (n < 1) {
      return 1;
    } else {
      return factor(n - 1) * n;
    }
  }

  public static int sum(ArrayList<Integer> numbers) {
    Integer sum = 0;
    for (int i = 0; i < numbers.size(); i++) {
      sum += numbers.get(i);
    }
    return sum;
  }

  public static int multiply(ArrayList<Integer> numbers) {
    Integer multiplication = 1;
    for (int i = 0; i < numbers.size(); i++) {
      multiplication *= numbers.get(i);
    }
    return multiplication;
  }

}
