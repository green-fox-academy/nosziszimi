package parkinglot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/**
 * Created by Nóra on 2017. 04. 19..
 */
public class ParkingLot {

  public static void main(String[] args) {
    List<Car> carList = new ArrayList<>();

    for (int i = 0; i < 256; i++) {
      carList.add(new Car(CarTypes.randomType(), Colors.randomColor()));
    }

    int typeCounter = 0;
    HashMap<String, Integer> typeOccurrences = new HashMap<>();
    for (CarTypes carType : CarTypes.values()) {
      for (Car car : carList) {
        if (car.type.equals(carType)) {
          typeCounter++;
        }
      }
      String typeName = carType.toString();
      typeOccurrences.put(typeName, typeCounter);
    }

    System.out.println(typeOccurrences);

    int colorCounter = 0;
    HashMap<String, Integer> colorOccurrences = new HashMap<>();
    for (Colors color : Colors.values()) {
      for (Car car : carList) {
        if (car.color.equals(color)) {
          colorCounter++;
        }
      }
      String colorName = color.toString();
      colorOccurrences.put(colorName, colorCounter);
    }

    System.out.println(colorOccurrences);

    HashMap<String, Integer> occurences2 = new HashMap();
    List<Integer> occurrences = new ArrayList<>();
    int maxValue = 0;
    for (CarTypes carType : CarTypes.values()) {
      for (Colors color : Colors.values()) {
        int counter = 0;
        for (Car car : carList) {
          if (car.type.equals(carType) && car.color.equals(color)) {
            counter++;
          }
        }
        String carColorAndType = color.toString() + " " + carType.toString();
        occurences2.put(carColorAndType, counter);
      }

      maxValue = Collections.max(occurences2.values());

    }
    for (Entry<String, Integer> entry : occurences2.entrySet()) {
      if (entry.getValue().equals(maxValue)) {
        System.out.println("The most frequently occurring vehicle is: " + entry.getKey());
      }
    }
  }
}