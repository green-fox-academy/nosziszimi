import java.util.Scanner;

/**
 * Created by Nóra on 2017. 03. 21..
 */
public class Exercise19_OneTwo {
  public static void main(String[] args) {
    int a = 5;
    while (a < 10){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please give me a number:");
      int i1 = scanner.nextInt();
      if (i1 <= 0) {
        System.out.println("Not enough.");
      }else if (i1 == 1) {
        System.out.println("One.");
      }else if (i1 == 2) {
        System.out.println("Two");
      }else {
        System.out.println("A lot.");
      }
    }
  }


}
