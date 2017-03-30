/**
 * Created by Nóra on 2017. 03. 30..
 */
public class Ex_09_StringCharSeparator {
  public static void main(String[] args) {
    System.out.println(charSeparator("A lklkhj lkj lkj lk jlj lkj."));
  }
  public static String charSeparator(String text) {
    if (text.length() < 1) {
      return "";
    }
    else if (text.length() == 1) {
      return text.charAt(0) + charSeparator(text.substring(1));
    }
    else {
      return text.charAt(0) + "*" + charSeparator(text.substring(1));
    }
  }
}
