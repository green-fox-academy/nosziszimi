/**
 * Created by Nóra on 2017. 03. 30..
 */
public class Ex_05_EarsOfBunnies {
  public static void main(String[] args) {
    System.out.println(bunny (18));
  }

  public static int bunny (int n) {
    if (n == 0) {
      return 0;
    }
    else {
      return bunny(n-1) + 2;
    }
  }
}
