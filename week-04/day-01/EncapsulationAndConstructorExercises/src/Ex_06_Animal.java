/**
 * Created by Nóra on 2017. 04. 03..
 */
public class Ex_06_Animal {
  int hunger;
  int thirst;

  public Ex_06_Animal() {
    hunger = 50;
    thirst = 50;
  }

  public void eat() {
    hunger--;
  }

  public void drink() {
    thirst--;
  }

  public void play() {
    hunger++;
    thirst++;
  }
}
