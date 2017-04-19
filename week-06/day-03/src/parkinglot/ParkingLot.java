package parkinglot;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nóra on 2017. 04. 19..
 */
public class ParkingLot {

  public static void main(String[] args) {
    List<Car> carList = new ArrayList<>();

    for (int i = 0; i < 256; i++) {
      carList.add(new Car(CarTypes.randomColor(), Colors.randomColor()));
    }

    int trabantCounter = 0;
    int mercedesCounter = 0;
    int audiCounter = 0;

    int redCounter = 0;
    int greenCounter = 0;
    int blueCounter = 0;

    for (Car car : carList) {
      if (car.type == CarTypes.TRABANT) {
        trabantCounter++;
      } else if (car.type == CarTypes.MERCEDES) {
        mercedesCounter++;
      } else if (car.type == CarTypes.AUDI) {
        audiCounter++;
      }

      if (car.color == Colors.RED) {
        redCounter++;
      } else if (car.color == Colors.GREEN) {
        greenCounter++;
      } else if (car.color == Colors.BLUE) {
        blueCounter++;
      }
    }

    System.out.printf("There are %d %s.", trabantCounter, "Trabant");
    System.out.println();
    System.out.printf("There are %d %s.", mercedesCounter, "Mercedes");
    System.out.println();
    System.out.printf("There are %d %s.", audiCounter, "Audi");
    System.out.println();
    System.out.println();
    System.out.printf("There are %d %s cars.", redCounter, "red");
    System.out.println();
    System.out.printf("There are %d %s cars.", greenCounter, "green");
    System.out.println();
    System.out.printf("There are %d %s cars.", blueCounter, "blue");
  }
}
