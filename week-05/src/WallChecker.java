import java.lang.*;

/**
 * Created by Nóra on 2017. 04. 12..
 */
public class WallChecker {

  WallChecker() {

  }

  public boolean isLeftWall(Area area, Character character) {
    boolean isWall = false;
    for (Tile wall : area.wallList) {
      if (wall.columnIndex == character.columnIndex - 1 && wall.rowIndex == character.rowIndex) {
        isWall = true;
      }
    }
    return isWall;
  }
  public boolean isRightWall(Area area, Character character) {
    boolean isWall = false;
    for (Tile wall : area.wallList) {
      if (wall.columnIndex == character.columnIndex + 1 && wall.rowIndex == character.rowIndex) {
        isWall = true;
      }
    }
    return isWall;
  }
  public boolean isUpWall(Area area, Character character) {
    boolean isWall = false;
    for (Tile wall : area.wallList) {
      if (wall.columnIndex == character.columnIndex && wall.rowIndex == character.rowIndex - 1) {
        isWall = true;
      }
    }
    return isWall;
  }
  public boolean isDownWall(Area area, Character character) {
    boolean isWall = false;
    for (Tile wall : area.wallList) {
      if (wall.columnIndex == character.columnIndex && wall.rowIndex == character.rowIndex + 1) {
        isWall = true;
      }
    }
    return isWall;
  }
  public boolean isWall(Area area, Character character) {
    boolean isWall = false;
    for (Tile wall : area.wallList) {
      if (wall.columnIndex == character.columnIndex && wall.rowIndex == character.rowIndex) {
        isWall = true;
      }
    }
    return isWall;
  }
}
