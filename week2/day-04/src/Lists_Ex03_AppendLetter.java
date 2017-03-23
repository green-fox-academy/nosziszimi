import java.util.*;
/**
 * Created by Nóra on 2017. 03. 23..
 */
public class Lists_Ex03_AppendLetter {
  public static void main(String[] args) {
    ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
    ArrayList<String> newFar = new ArrayList<String>();
    
    for (int i = 0; i < far.size(); i++) {
      newFar.add(far.get(i) + "a");
    }
    far = newFar;
    System.out.println(far);
  }
}
