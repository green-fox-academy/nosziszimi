import java.util.Scanner;

/**
 * Created by Nóra on 2017. 03. 21..
 */
public class Exercise20_PrintBiggerNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please give me two number:");
    int i1 = scanner.nextInt();
    int i2 = scanner.nextInt();
    if (i1 > i2) {
      System.out.println("The bigger is: " + i1);
    } else if (i1 < i2) {
      System.out.println("The bigger is: " + i2);
    } else {
      System.out.println("The two numbers are equal.");
    }
  }
}
