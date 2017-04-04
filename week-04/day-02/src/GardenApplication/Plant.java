package GardenApplication;

/**
 * Created by Nóra on 2017. 04. 04..
 */
public class Plant {
  String color;
  double waterAmount;
  boolean needWater;

  public Plant() {
    this("unknown");
  }

  public Plant(String color) {
    this.color = color;
    waterAmount = 0;
  }

  public boolean isNeedWater() {
    return needWater;
  }

  public void beingWatered(double amountOfWater) {
    waterAmount += amountOfWater;
  }

  public void info() {
    String waterState;
    if (needWater) {
      waterState = "needs";
    } else {
      waterState = "doesnt need";
    }
    System.out.println("The " + color + " Plant " + waterState + "water.");
  }
}
