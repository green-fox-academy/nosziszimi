/**
 * Created by Nóra on 2017. 03. 22..
 */
public class Ex08_CompareLenght {
  public static void main(String[] args) {
    int[] p1 = {1,2,3};
    int[] p2 = {4,5};

    if(p1.length < p2.length) {
      System.out.println("p2 has more elements than p1");
    }
      else{
      System.out.println("p2 has not more element, than p1");
    }
  }
}
