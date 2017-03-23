import java.util.*;
/**
 * Created by Nóra on 2017. 03. 23..
 */
public class Lists_Ex04_Candyshop {
  public static void main(String[] args) {
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("Cupcake");
    arrayList.add(2);
    arrayList.add("Brownie");
    arrayList.add(false);

    arrayList.set(1, "Croissant");
    arrayList.set(3, "Ice Cream");
    System.out.println(arrayList);
  }
}
