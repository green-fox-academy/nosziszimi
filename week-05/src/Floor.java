import java.awt.Graphics;

/**
 * Created by Nóra on 2017. 04. 10..
 */
public class Floor extends Tile {

  public Floor(int column, int row) {
    super(column, row);
    image = ImageLoader.getInstance().FLOOR;
  }
}

