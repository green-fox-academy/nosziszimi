/**
 * Created by Nóra on 2017. 03. 22..
 */
public class Ex02_GreeterFunction {
  public static void main(String[] args){
    String al = "Greenfox";
    System.out.println(greet(al));
  }
  public static String greet (String greeted){
    return ("Greetings dear, " + greeted + "!");
  }
}
