/**
 * Created by Nóra on 2017. 04. 03..
 */
public class Ex_08_Counter {
  int counter;
  int initValue;

  public Ex_08_Counter() {
    counter = 0;
  }

  public Ex_08_Counter(int counter) {
    this.counter = counter;
    initValue = counter;
  }

  public void add(int number) {
    counter += number;
  }

  public void add() {
    counter++;
  }

  public int get() {
    return counter;
  }

  public void reset() {
    counter = initValue;
  }

}
