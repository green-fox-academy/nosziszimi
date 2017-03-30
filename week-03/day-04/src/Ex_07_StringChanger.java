/**
 * Created by Nóra on 2017. 03. 30..
 */
public class Ex_07_StringChanger {
  public static void main(String[] args) {
    System.out.println(stringChanger("asxlfkjxulkxulk", 0));
  }
  public static String stringChanger(String text, int n) {

    if (n == text.length()) {
      return "";
    }
    else if (text.charAt(n) == 'x') {
      return 'y' + stringChanger(text, ++n);
    }
    else {
      return text.charAt(n) + stringChanger(text, ++n);
    }
  }

}
