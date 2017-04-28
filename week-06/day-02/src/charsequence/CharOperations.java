package charsequence;

/**
 * Created by Nóra on 2017. 04. 18..
 */
public class CharOperations implements java.lang.CharSequence {

  String myString;

  public CharOperations(String myString) {
    this.myString = myString;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    String reversed = new StringBuilder(myString).reverse().toString();
    return reversed.charAt(index);
  }

  @Override
  public java.lang.CharSequence subSequence(int start, int end) {
    String reversed = new StringBuilder(myString).reverse().toString();
    return reversed.subSequence(start, end);
  }

  public String toString() {
    String reversed = new StringBuilder(myString).reverse().toString();
    return reversed;
  }
}
