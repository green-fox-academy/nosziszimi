/**
 * Created by Nóra on 2017. 04. 06..
 */
public class ToDo {

  boolean isDone;
  String task;
  static int counter;
  int id;

  public ToDo() {
    this("");
  }

  public ToDo(String task) {
    this("", task);
  }

  public ToDo(String check, String task) {
    this(check, task, 1);
  }

  public ToDo(String check, String task, int id) {
    if (check.equals("[x]")) {
      isDone = true;
    } else {
      isDone = false;
    }
    this.task = task;
    counter = id;
    counter++;

  }

}
