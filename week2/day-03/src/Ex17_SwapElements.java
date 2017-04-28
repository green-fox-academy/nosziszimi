import java.util.Arrays;

/**
 * Created by Nóra on 2017. 03. 22..
 */
public class Ex17_SwapElements {
  public static void main(String[] args) {
    String[] abc = {"first", "second", "third"};
    String swap = abc[0];
    abc[0] = abc[2];
    abc[2] = swap;
    System.out.println(Arrays.toString(abc));
  }
}
