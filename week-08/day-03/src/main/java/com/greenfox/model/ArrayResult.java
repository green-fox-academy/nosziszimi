package com.greenfox.model;

import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Nóra on 2017. 05. 10..
 */
@Getter
@Setter
public class ArrayResult {

  ArrayList<Integer> result;

  public static ArrayList<Integer> doubling(ArrayList<Integer> numbers) {
    ArrayList<Integer> doubled = new ArrayList<>();
    for (int i = 0; i < numbers.size(); i++) {
      doubled.add(numbers.get(i) * 2);
    }
    return doubled;
  }
}
