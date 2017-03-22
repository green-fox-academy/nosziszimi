/**
 * Created by Nóra on 2017. 03. 22..
 */
public class Ex12_PrintElement {
  public static void main(String[] args) {
    int[] af = {4,5,6,7};
    printer(af);
  }
  public static void printer (int[] array){
    for (int i : array ) {
      System.out.println(i);
    }
  }
}
