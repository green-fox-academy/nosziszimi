import java.util.Scanner;

/**
 * Created by Nóra on 2017. 03. 22..
 */
public class Ex04_Summing {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please tell me until which number should I sum the numbers:");
    int i1 = scanner.nextInt();
    System.out.println(sum(i1));
  }
  public static int sum (int number ) {
    int summed = 0;
    for (int i = 0; i < (number + 1); i++) {
      summed += i;
    }

      return summed;
  }
}

