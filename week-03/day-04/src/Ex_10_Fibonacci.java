/**
 * Created by Nóra on 2017. 03. 30..
 */
public class Ex_10_Fibonacci {
  public static void main(String[] args) {
    System.out.println(fibo(7));
  }
  public static int fibo(int n) {
    if (n == 0) {
      return 0;
    }
    else if (n == 1) {
      return 1;
    }
    else {
      return fibo(n-1) + fibo(n-2);
    }
  }
}
