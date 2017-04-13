import java.awt.image.BufferedImage;

/**
 * Created by Nóra on 2017. 04. 10..
 */
public class Hero extends Character {
  int maxHP, currentHP, dP, sP;

  public Hero() {
    super(0, 0);
    image = ImageLoader.getInstance().HERO_DOWN;
    maxHP = 10;
    currentHP = 10;
    dP = 8;
    sP = 6;
  }
}
