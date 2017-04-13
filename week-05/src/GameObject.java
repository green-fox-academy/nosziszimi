import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Created by Nóra on 2017. 04. 10..
 */
public class GameObject {

  public static final int COLUMN_WIDTH = 72;
  public static final int ROW_HEIGHT = 72;
  BufferedImage image;
  int columnIndex, rowIndex;
  public static WallChecker wallChecker = new WallChecker();


  public GameObject() {

  }

  public GameObject(int column, int row) {
    this.columnIndex = column;
    this.rowIndex = row;
  }

  public GameObject(Area area) {
    while (!isFree(area)) {
      columnIndex = (int) (Math.random() * 10);
      rowIndex = (int) (Math.random() * 9);
    }
  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, columnIndex * COLUMN_WIDTH, rowIndex * ROW_HEIGHT, null);
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