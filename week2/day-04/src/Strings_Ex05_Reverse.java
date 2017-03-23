/**
 * Created by Nóra on 2017. 03. 23..
 */
public class Strings_Ex05_Reverse {
  public static void main(String[] args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    String temp = "";
    int length = reversed.length();
    for (int i=length-1; i>=0; i--){
      temp = temp + (reversed.charAt(i));

    }
    System.out.println(temp);
  }
}
