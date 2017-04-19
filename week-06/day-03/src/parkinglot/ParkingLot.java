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
  }

}
