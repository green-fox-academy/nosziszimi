/**
 * Created by Nóra on 2017. 04. 03..
 */
public class Station {
  int gasAmount;

  public Station() {
    gasAmount = 1000;
  }

  public void refill(Car car) {
    gasAmount -= car.capacity - car.gasAmount;
  }

  public static void main(String[] args) {
    Station s1 = new Station();
    Car car1 = new Car();

    s1.refill(car1);

    System.out.println(s1.gasAmount);
  }
}
