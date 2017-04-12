/**
 * Created by Nóra on 2017. 04. 12..
 */
public class Monster extends Character {

  static WallChecker wallChecker = new WallChecker();

  public Monster() {

  }

  public Monster(Area area) {
    while (!isFree(area)) {
      columnIndex = (int) (Math.random() * 10);
      rowIndex = (int) (Math.random() * 10);
    }
  }

  public boolean isFree(Area area) {
    for (Character character : Character.characterList) {
      if (character.columnIndex == columnIndex && character.rowIndex == rowIndex) {
        return false;
      }
    }
    if (wallChecker.isWall(area, this)) {
      return false;
    } else {
      return true;
    }
  }
}
