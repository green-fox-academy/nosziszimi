/**
 * Created by Nóra on 2017. 03. 30..
 */
public class Ex_03_SumDigits {
  public static void main(String[] args) {
    System.out.println(sumDigit(126));
  }
  public static int sumDigit (int n) {
    if (n == 0) {
      return 0;
    }
    else {
      return sumDigit(n/10) + n%10;
    }
  }
}
