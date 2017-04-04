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

  public void beingWatered(double amountOfWater) {
    waterAmount += amountOfWater*0.4;
  }

  public void info() {
    String waterState;
    if (needWater) {
      waterState = "needs";
    } else {
      waterState = "doesnt need";
    }
    System.out.println("The " + color + " Tree " + waterState + "water.");
  }
}
