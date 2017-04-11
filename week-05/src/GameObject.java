import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Created by Nóra on 2017. 04. 10..
 */
public class GameObject {
  public static final int TILE_WIDTH = 72;
  public static final int TILE_HEIGHT = 72;
  BufferedImage image;
  int posX, posY;


  public GameObject() {

  }

  public GameObject(String filename, int column, int row) {
    this.posX = column*TILE_WIDTH;
    this.posY = row*TILE_HEIGHT;
    try {
      image = ImageIO.read(new File(filename));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, posX, posY,null);
    }
  }
}
