package Apples;

/**
 * Created by Nóra on 2017. 04. 05..
 */
public class Apples {
  String name;

  public Apples() {
    this("unknown");
  }

  public Apples (String name) {
    this.name = name;
  }

  public String getApple() {
    return name;
  }
}
