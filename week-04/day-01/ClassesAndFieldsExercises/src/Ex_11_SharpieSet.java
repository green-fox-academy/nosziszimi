import java.util.List;

/**
 * Created by Nóra on 2017. 04. 03..
 */
public class Ex_11_SharpieSet {
  List<Sharpie> sharpieSet;

  public Ex_11_SharpieSet() {
    sharpieSet = new List<>();
  }

  public int countUsable() {
    int usable = 0;
    for (Sharpie sharpie : sharpieSet) {
      if (sharpie.inkAmount > 0) {
        usable++;
      }
    }
    return usable;
  }

  public void removeTrash() {
    for (int i = 0; i < sharpieSet.size();) {
      if (sharpieSet.get(i).inkAmount <= 0) {
        sharpieSet.remove(i);
      } else {
        i++;
      }
    }
  }
}
