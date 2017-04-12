import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by Nóra on 2017. 04. 12..
 */
public class Skeleton extends Character {
  static WallChecker wallChecker = new WallChecker();

  public Skeleton() {

  }
  public Skeleton(Area area) {
      while (!isFree(area)){
      columnIndex = (int) (Math.random() * 10);
      rowIndex = (int) (Math.random() * 10);
    }
    image = ImageLoader.getInstance().SKELETON;
    Character.characterList.add(this);
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
