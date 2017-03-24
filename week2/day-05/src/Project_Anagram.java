import java.util.Scanner;

/**
 * Created by Nóra on 2017. 03. 23..
 */
public class Project_Anagram {
  public static void main(String[] args) {
    System.out.println("Please enter a nice little word:");
    Scanner scanner = new Scanner(System.in);
    String string1 = scanner.nextLine();
    System.out.println("Please enter another nice little word, and I will say if the two words are anagram:");
    String string2 = scanner.nextLine();
    String sortedString1 = sort(string1);
    String sortedString2 = sort(string2);

    if (sortedString1.equals(sortedString2)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }

  public static String sort (String incomingString) {
    incomingString = incomingString.toLowerCase();
    for (int i = 0; i < incomingString.length(); i++) {
      for (int j = i; j < incomingString.length(); j++) {
        if (incomingString.charAt(i) > incomingString.charAt(j)) {
          incomingString = incomingString.substring(0, i)
                  + incomingString.charAt(j)
                  + incomingString.substring(i + 1, j)
                  + incomingString.charAt(i)
                  + incomingString.substring(j + 1, incomingString.length());
        }
      }
    }
  return incomingString;
  }
}
