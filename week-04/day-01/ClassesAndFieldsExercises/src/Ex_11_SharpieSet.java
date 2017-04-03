import java.util.List;

/**
 * Created by Nóra on 2017. 04. 03..
 */
public class Ex_11_SharpieSet {
  List<Sharpie> sharpieSet;

  public int countUsable() {
    int usable = 0;
    for (Sharpie sharpie : sharpieSet) {
      if (sharpie.inkAmount < 0) {
        usable++;
      }
    }
    return usable;
  }

  public void removeTrash() {
    for (Sharpie sharpie : sharpieSet) {
      if (sharpie.inkAmount <= 0) {
        sharpieSet.remove(sharpie);
      }
    }
  }
}
