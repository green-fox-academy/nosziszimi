package Apples;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Nóra on 2017. 04. 05..
 */
class ApplesTest {

  @org.junit.jupiter.api.Test
  void getApple() {
    Apples a = new Apples("alma");
    assertEquals("alma", a.getApple());
  }

}