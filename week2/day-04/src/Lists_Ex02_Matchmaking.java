import java.util.*;

/**
 * Created by Nóra on 2017. 03. 23..
 */
public class Lists_Ex02_Matchmaking {
  public static void main(String[] args) {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));
    ArrayList<String> order = new ArrayList<String>();

    int boysSize = boys.size();
    int girlsSize = girls.size();
    int size = 0;

    if (boysSize >= girlsSize){
      size = boysSize;
    }
    else {
      size = girlsSize;
    }


    for (int i=0; i<size; i++){

      if (i < girlsSize){
        order.add(girls.get(i));
      }

      if (i < boysSize) {
        order.add(boys.get(i));
      }
    }
    System.out.println(order);
  }
}
