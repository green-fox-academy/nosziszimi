import java.util.Scanner;

/**
 * Created by Nóra on 2017. 03. 21..
 */
public class Exercise21_Party {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please give me the number of girls coming to the party:");
    int Girls = scanner.nextInt();
    System.out.println("Please give me the number of boys coming to the party:");
    int Boys = scanner.nextInt();
    if ((Girls == Boys) && ((Girls+Boys) >= 20)) {
      System.out.println("The party is excellent!");
    }else if (false){}
  }
}

