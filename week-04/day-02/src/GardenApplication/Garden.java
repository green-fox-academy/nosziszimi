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
      if (plant.isNeedWater()) {
        needsWaterPlants.add(plant);
      }
    }
    return needsWaterPlants;
  }

  public void water(double amountOfWater) {
    double waterForEach = amountOfWater/getNeedsWaterPlants().size();
    ArrayList<Plant> needsWaterPlants = getNeedsWaterPlants();
    for (int i = 0; i < needsWaterPlants.size(); i++) {
      needsWaterPlants.get(i).beingWatered(waterForEach);
    }
    System.out.println();
    System.out.println("Watering with " + amountOfWater);
  }

  public void info() {
    for (Plant p : plants) {
      p.info();
    }
  }
}
