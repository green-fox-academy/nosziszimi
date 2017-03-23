/**
 * Created by Nóra on 2017. 03. 23..
 */
public class Strings_Ex01_SimpleReplace {
  public static void main(String[] args) {
    String example = "In a dishwasher far far away";

    String replaced = new String (example.replace("dishwasher", "galaxy"));

    System.out.println(replaced);
  }
}
