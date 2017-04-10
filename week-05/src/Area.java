import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Nóra on 2017. 04. 10..
 */
public class Area {
  ArrayList<Tile> tilesList;

  public Area() {
    tilesList = new ArrayList<>();
  }

  void fillTilesList() {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        tilesList.add(new Floor(i*72, j*72));
      }
    }
  }
}
