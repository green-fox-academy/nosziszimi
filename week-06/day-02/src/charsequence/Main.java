package charsequence;

/**
 * Created by Nóra on 2017. 04. 18..
 */
public class Main {

  public static void main(String[] args) {
    CharOperations c = new CharOperations("alma");
    System.out.println(c.length());
    System.out.println(c.charAt(2));
    System.out.println(c.subSequence(1, 3));
    System.out.println(c);
  }
}
