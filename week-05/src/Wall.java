import java.awt.Graphics;

/**
 * Created by Nóra on 2017. 04. 10..
 */
public class Wall extends Tile {

  public Wall(int column, int row) {
    super("assets/wall.png", column, row);
  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, posX, posY,null);
    }
  }
}
