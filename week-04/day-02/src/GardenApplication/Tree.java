package GardenApplication;

/**
 * Created by Nóra on 2017. 04. 04..
 */
public class Tree extends Plant{

  public Tree() {
    this("unknown");
  }

  public Tree(String color) {
    super("unknown");
    needWater = (waterAmount < 10);
  }
}
