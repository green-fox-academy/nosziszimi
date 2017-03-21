/**
 * Created by Nóra on 2017. 03. 21..
 */
import java.util.Scanner;

public class Exercise15_MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a distance in miles: ");
        int userInput = scanner.nextInt();
        System.out.println(userInput + " miles are equal to " + (userInput / 0.621371192237) + " km.");
    }

}
