package Ex_2_Sum;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by Nóra on 2017. 04. 05..
 */
class SumTest {

  Sum s = new Sum();
  ArrayList<Integer> integers;


  @Test
  void sum() {
    integers = new ArrayList<>(Arrays.asList(1,2,3,4));
    assertEquals(10, s.sum(integers));
  }

  @Test
  void sumEmpty() {
    integers = new ArrayList<>();
    assertEquals(0, s.sum(integers));
  }

  @Test
  void sumOneElement() {
    integers = new ArrayList<>(Arrays.asList(1));
    assertEquals(1, s.sum(integers));
  }

  @Test
  void sumMultipleElement() {
    integers = new ArrayList<>(Arrays.asList(2,3,4));
    assertEquals(9, s.sum(integers));
  }

  @Test
  void sumNull() {
    assertEquals(0, s.sum(integers));
  }

}