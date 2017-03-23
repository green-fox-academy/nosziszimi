import java.util.*;
/**
 * Created by Nóra on 2017. 03. 23..
 */
public class Lists_Ex01_SolarSystem {
  public static void main(String[] args) {
    ArrayList<String> planetList = new ArrayList<>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));
    planetList.add(5, "Saturn");
    System.out.println(planetList);
  }
}
