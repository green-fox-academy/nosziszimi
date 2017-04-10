import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Nóra on 2017. 04. 10..
 */
public class Area {
  ArrayList<Tile> tilesList;
  ArrayList<Tile> wallList;

  public Area() {
    tilesList = new ArrayList<>();
  }

  void fillTilesList() {
    for (int column = 0; column < 10; column++) {
      for (int row = 0; row < 10; row++) {
        tilesList.add(new Floor(column, row));
      }
    }
  }
  void fillWallList() {
    for (int column = 0; column < 10 ; column++) {
      if (column == 0) {
        wallList.add(new Wall(column, 4));
      }
      if (column == 1) {
        for (int row = 2 ; row < 10; row+=2) {
          wallList.add(new Wall(column, row));
        }
        wallList.add(new Wall(column, 5 ));
      }
    }



  }
}
