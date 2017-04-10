import java.awt.Graphics;

/**
 * Created by Nóra on 2017. 04. 10..
 */
public class Floor extends Tile {

  public Floor(int column, int row) {
    super("assets/floor.png", column, row);
  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, posX, posY,null);
    }
  }
}

