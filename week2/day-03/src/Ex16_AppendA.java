import java.util.Arrays;

/**
 * Created by Nóra on 2017. 03. 22..
 */
public class Ex16_AppendA {
  public static void main(String[] args) {
    String[] nimals = {"kuty", "macsk", "cic"};
    for (int i = 0; i <nimals.length; i++) {
      nimals[i] += "a";

    }
    System.out.println(Arrays.toString(nimals));
  }
}
