import java.util.Scanner;

/**
 * Created by Nóra on 2017. 03. 21..
 */
public class Exercise17_SumAndAverage {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please give me 5 numbers, and I will calculate the sum and average of them:");
    int i1 = scanner.nextInt();
    int i2 = scanner.nextInt();
    int i3 = scanner.nextInt();
    int i4 = scanner.nextInt();
    int i5 = scanner.nextInt();
    int Sum = i1 + i2 + i3 + i4 + i5;
    System.out.println("Sum: " + Sum + ", Average: " + (Sum / 5.));
  }

}
