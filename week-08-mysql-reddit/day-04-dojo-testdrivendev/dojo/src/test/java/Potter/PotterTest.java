package Potter;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Test;

/**
 * Created by Nóra on 2017. 05. 11..
 */
public class PotterTest {

  @Test
  public void priceCounter_OneBook() throws Exception {
  assertEquals(8f, Potter.priceCounter(Arrays.asList(1)), 0.001f);
  }

  @Test
  public void priceCounter_Different2() throws Exception {
  assertEquals(15.2f, Potter.priceCounter(Arrays.asList(1, 2)), 0.001f);
  }

  @Test
  public void priceCounter_Same2() throws Exception {
    assertEquals(16f, Potter.priceCounter(Arrays.asList(1, 1)), 0.001f);
  }

  @Test
  public void priceCounter_Different3() throws Exception {
    assertEquals(21.6f, Potter.priceCounter(Arrays.asList(1, 2, 3)), 0.001f);
  }


}