import java.awt.Graphics;

/**
 * Created by Nóra on 2017. 04. 10..
 */
public class Wall extends Tile {

  public Wall(int column, int row) {
    super(column, row);
    image = ImageLoader.getInstance().WALL;
  }
}
