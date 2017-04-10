import java.awt.Graphics;

/**
 * Created by Nóra on 2017. 04. 10..
 */
public class Floor extends Tile {

  public Floor(int posX, int posY) {
    super("assets/floor.png", posX, posY);
  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, posX, posY,null);
    }
  }
}

