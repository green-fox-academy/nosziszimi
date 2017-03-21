/**
 * Created by Nóra on 2017. 03. 21..
 */
import java.util.Scanner;
public class Exercise14_HelloUser {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your name, and press enter: ");
        String userInput = scanner.nextLine();
        System.out.println("Hello, " + userInput + "!");
    }
}
