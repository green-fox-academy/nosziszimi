package GardenApplication;

/**
 * Created by Nóra on 2017. 04. 04..
 */
public class Plant {
  String color;
  int waterAmount;
  boolean needWater;

  public Plant() {
    this("unknown");
  }

  public Plant(String color) {
    this.color = color;
    waterAmount = 0;
  }
}
