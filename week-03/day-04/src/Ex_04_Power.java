/**
 * Created by Nóra on 2017. 03. 30..
 */
public class Ex_04_Power {
  public static void main(String[] args) {
    System.out.println(power(3,3));
  }
  public static int power (int base, int n) {
    if (n == 0){
      return 1;
    }
    else {
      return power(base, n-1) * base;
    }
  }
}
