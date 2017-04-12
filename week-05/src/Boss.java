/**
 * Created by Nóra on 2017. 04. 12..
 */
public class Boss extends Monster {

  public Boss() {
  }

  public Boss(Area area) {
    super(area);
    image = ImageLoader.getInstance().BOSS;
  }
}
