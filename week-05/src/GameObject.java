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


  public GameObject() {

  }

  public GameObject(String filename, int column, int row) {
    this.columnIndex = column;
    this.rowIndex = row;
    try {
      image = ImageIO.read(new File(filename));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, columnIndex * COLUMN_WIDTH, rowIndex * ROW_HEIGHT,null);
    }
  }
}
