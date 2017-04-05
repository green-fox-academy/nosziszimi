package Ex_2_Sum;

import java.util.ArrayList;

/**
 * Created by Nóra on 2017. 04. 05..
 */
public class Sum {

  public int sum(ArrayList<Integer> numbers) {
    int sum = 0;
    if (numbers == null) {
      return 0;
    } else {
      for (Integer number : numbers) {
        sum += number;
      }
      return sum;
    }
  }
}
