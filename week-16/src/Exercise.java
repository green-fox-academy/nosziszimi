import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Nóra on 2017. 07. 10..
 */
public class Exercise {

  public static void main(String[] args) {
    List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
    List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
    List<Integer> list3 = Arrays.asList(1, 2, 3, 4);

    List<List<Integer>> matrix = Arrays.asList(list1, list2, list3);

    System.out.println(sumOfMatrix(matrix));
  }

  public static int sumOfMatrix(List<List<Integer>> matrix) {
    int sum = 0;
    for (int i=0; i<matrix.size(); i++) {
      List<Integer> actualList = matrix.get(i);
      for (int j = 0; j<actualList.size(); j++) {
        sum += actualList.get(j);
      }
    }
    return sum;
  }

}
