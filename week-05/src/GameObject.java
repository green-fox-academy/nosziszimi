import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Created by Nóra on 2017. 04. 10..
 */
public class GameObject {
  BufferedImage image;
  int posX, posY;

  public GameObject() {

  }

  public GameObject(String filename, int column, int row) {
    this.posX = column*72;
    this.posY = row*72;
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
