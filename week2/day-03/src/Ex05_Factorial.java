import java.util.Scanner;

/**
 * Created by Nóra on 2017. 03. 22..
 */
public class Ex05_Factorial {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please tell me a number and I will calculate the factorial of it:");
    int i1 = scanner.nextInt();
    System.out.println(factorio(i1));
  }
  public static int factorio (int number) {
    int fact = 1;
    for (int i = 1; i < number+1; i++) {
      fact *= i;
    }
    return fact;
  }
}
