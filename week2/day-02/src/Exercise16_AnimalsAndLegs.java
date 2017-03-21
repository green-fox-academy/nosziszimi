import java.util.Scanner;

/**
 * Created by Nóra on 2017. 03. 21..
 */
public class Exercise16_AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please giv me the numbers of chickens the farmer has: ");
        int chickensNumber = scanner.nextInt();
        System.out.println("Please give me the number of pigs the farmer has: ");
        int pigsNumber = scanner.nextInt();
        System.out.println("All the animals have " + ((chickensNumber * 2) + (pigsNumber * 4)) + " legs.");
    }
}
