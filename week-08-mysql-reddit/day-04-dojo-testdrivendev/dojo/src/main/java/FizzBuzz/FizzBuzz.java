package FizzBuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nóra on 2017. 05. 11..
 */
public class FizzBuzz {

  public static String fizzBuzz(int incomingNumber) {
    String result = "";

    if (incomingNumber % 3 == 0) {
      result += "Fizz";
    }

    if (incomingNumber % 5 == 0) {
      result += "Buzz";
    }

    if (incomingNumber % 3 != 0 && incomingNumber % 5 != 0) {
      result = Integer.toString(incomingNumber);
    }

    return result;
  }
}
