/**
 * Created by Nóra on 2017. 03. 30..
 */
public class Ex_08_StringXRemove {
  public static void main(String[] args) {
    System.out.println(removeX("jxhgdxljxljx", 0));
  }
  public static String removeX(String text, int n) {
    if (n == text.length()) {
      return "";
    }
    else if (text.charAt(n) == 'x') {
      return "" + removeX(text, ++n);
    }
    else {
      return text.charAt(n) + removeX(text, ++n);
    }
  }
}
