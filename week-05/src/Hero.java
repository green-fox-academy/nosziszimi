import java.awt.image.BufferedImage;

/**
 * Created by Nóra on 2017. 04. 10..
 */
public class Hero extends Character {

  public Hero() {
    super(0, 0);
    image = ImageLoader.getInstance().HERO_DOWN;
  }
}
