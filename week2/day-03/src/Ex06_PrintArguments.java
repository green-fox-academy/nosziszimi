import java.util.Scanner;

/**
 * Created by Nóra on 2017. 03. 22..
 */
public class Ex06_PrintArguments {
  public static void main(String[] args) {
    String s1 = "String1";
    String s2 = "String2";
    String s3 = "String3";
    printer(s1, s2, s3);
  }

  public static void printer(String... incomingString) {

    for (String s : incomingString) {
      System.out.println(s);
    }

  }

}
