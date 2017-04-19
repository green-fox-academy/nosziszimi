package parkinglot;

/**
 * Created by Nóra on 2017. 04. 19..
 */
public enum CarTypes {
  TRABANT, MERCEDES, AUDI;

  public static CarTypes randomType() {
    return values()[(int) (Math.random() * values().length)];
  }
}
