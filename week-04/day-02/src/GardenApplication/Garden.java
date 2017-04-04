package GardenApplication;

import java.util.ArrayList;

/**
 * Created by Nóra on 2017. 04. 04..
 */
public class Garden {
  String name;
  ArrayList<Plant> plants;

  public Garden(String name) {
    this.name = name;
    plants = new ArrayList<>();
  }

  public ArrayList<Plant> getNeedsWaterPlants() {
    ArrayList<Plant> needsWaterPlants = new ArrayList<>();
    for (Plant plant : plants) {
      if (plant.needWater) {
        needsWaterPlants.add(plant);
      }
    }
    return needsWaterPlants;
  }

  public void water(double amountOfWater) {
    double waterForEach = amountOfWater/getNeedsWaterPlants().size();
    for (int i = 0; i < getNeedsWaterPlants().size(); i++) {
      getNeedsWaterPlants().get(i).beingWatered(waterForEach);
    }
  }
}
