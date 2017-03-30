/**
 * Created by Nóra on 2017. 03. 30..
 */
public class Ex_06_Bunnies2 {
  public static void main(String[] args) {
    System.out.println(bunny(5));
  }
  public static int bunny(int n) {
    if (n == 0) {
      return 0;
    }
    else if (n%2 == 1) {
      return bunny(n-1) + 2;
    }
    else {
      return bunny(n-1) +3;
    }
  }
}
