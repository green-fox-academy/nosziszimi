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
    wallList = new ArrayList<>();
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
      if (column == 2) {
        for (int row = 2; row < 10; row*=2) {
          wallList.add(new Wall(column, row));
        }
      }
      if (column == 3) {
        for (int row = 0; row < 10 ; row+=2) {
          wallList.add(new Wall(column, row));
        }
        for (int row = 1; row < 10; row+=4) {
          wallList.add(new Wall(column, row));
        }
      }
      if (column == 5) {
        for (int row = 0; row < 8 ; row+=2) {
          wallList.add(new Wall(column, row));
        }
        for (int row = 1; row < 5 ; row+=2) {
          wallList.add(new Wall(column, row));
        }
        for (int row = 7; row < 10 ; row+=2) {
          wallList.add(new Wall(column, row));
        }
      }
      if (column == 6) {
        wallList.add(new Wall(column, 4));
        wallList.add(new Wall(column, 6));
        wallList.add(new Wall(column, 7));
        wallList.add(new Wall(column, 9));
      }
      if (column == 7) {
        wallList.add(new Wall(column, 1));
        wallList.add(new Wall(column, 2));
        wallList.add(new Wall(column, 4));
      }
      if (column == 8) {
        wallList.add(new Wall(column, 1));
        wallList.add(new Wall(column, 2));
        for (int row = 4; row < 9; row++) {
          wallList.add(new Wall(column, row));
        }
      }
    }



  }
}
