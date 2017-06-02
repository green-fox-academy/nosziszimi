package FizzBuzz;
import static junit.framework.TestCase.assertEquals;

import java.util.Arrays;
import org.junit.Test;

/**
 * Created by Nóra on 2017. 05. 11..
 */
public class FizzBuzzTest {

  @Test
  public void fizzBuzz() throws Exception {
  assertEquals("1",FizzBuzz.fizzBuzz(1));
  }

  @Test
  public void fizzBuzz_Two() throws Exception {
  assertEquals("2",FizzBuzz.fizzBuzz(2));
  }

  @Test
  public void fizzBuzz_Three() throws Exception {
  assertEquals("Fizz",FizzBuzz.fizzBuzz(3));
  }

  @Test
  public void fizzBuzz_Five() throws Exception {
  assertEquals("Buzz",FizzBuzz.fizzBuzz(5));
  }

  @Test
  public void fizzBuzz_15() throws Exception {
  assertEquals("FizzBuzz",FizzBuzz.fizzBuzz(15));
  }


}
