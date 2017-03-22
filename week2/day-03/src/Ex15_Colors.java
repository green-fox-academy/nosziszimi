import java.util.Arrays;

/**
 * Created by Nóra on 2017. 03. 22..
 */
public class Ex15_Colors {
  public static void main(String[] args) {
    String[][] color = {
            {"lime", "forest green", "olive", "pale green", "spring green"},
            {"orange red", "red", "tomato"},
            {"orchid", "violet", "pink", "hot pink"}
    };
    for (int i=0; i<color.length; i++){
      System.out.println(Arrays.toString (color[i]));
    }
  }

}
