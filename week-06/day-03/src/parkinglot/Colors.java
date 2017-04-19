package parkinglot;

/**
 * Created by Nóra on 2017. 04. 19..
 */
public enum Colors {
  RED, GREEN, BLUE;

  public static Colors randomColor() {
    return values()[(int) (Math.random() * values().length)];
  }
}
