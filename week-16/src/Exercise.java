import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nóra on 2017. 07. 10..
 */
public class Exercise {

  public static void main(String[] args) {

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
