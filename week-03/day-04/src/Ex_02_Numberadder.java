/**
 * Created by Nóra on 2017. 03. 30..
 */
public class Ex_02_Numberadder {
  public static void main(String[] args) {
    System.out.println(numberadder(5));
  }
  public static int numberadder (int n) {
    if (n < 0) {
      return 0;
    }
    else {
      return numberadder (n-1) + n;
    }
  }
}

