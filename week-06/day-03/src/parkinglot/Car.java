package parkinglot;

/**
 * Created by Nóra on 2017. 04. 19..
 */
public class Car {

  Colors color;
  CarTypes type;

  public Car(CarTypes type, Colors color) {
    this.type = type;
    this.color = color;
  }
}
