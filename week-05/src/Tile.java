import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Created by Nóra on 2017. 04. 10..
 */
public class Tile extends GameObject {

  public Tile() {

  }

  public Tile(String filename, int column, int row) {
    super(filename,column, row);
  }
}

