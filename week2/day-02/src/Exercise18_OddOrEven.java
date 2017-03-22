import java.util.Scanner;

/**
 * Created by Nóra on 2017. 03. 21..
 */
public class Exercise18_OddOrEven {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please give me a number, and I will say if it's an odd or an even number:");
    int i1 = scanner.nextInt();
    if (i1%2 == 0) {
      System.out.println("Even");
    }else{
      System.out.println("Odd");
    }
  }
}
