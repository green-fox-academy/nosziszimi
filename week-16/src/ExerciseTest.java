import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

/**
 * Created by Nóra on 2017. 07. 10..
 */
public class ExerciseTest {

  @org.junit.Test
  public void sumOfMatrixTest() throws Exception {
    List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
    List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
    List<Integer> list3 = Arrays.asList(1, 2, 3, 4);

    List<List<Integer>> matrix = Arrays.asList(list1, list2, list3);

    assertEquals(30,Exercise.sumOfMatrix(matrix));
  }
}