/**
 * Created by Nóra on 2017. 03. 30..
 */
public class Ex_01_Counter {
  public static void main(String[] args) {
    counter(15);
  }
  public static void counter (int n){
    if (n < 0) {
      return ;
    }
    else {
      System.out.println(n);
      counter(--n);
    }
  }
}
