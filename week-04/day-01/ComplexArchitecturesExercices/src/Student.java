/**
 * Created by Nóra on 2017. 04. 03..
 */
public class Student {
  int knowledge;

  public Student() {
    knowledge = 25;
  }

  public void learn() {
    knowledge++;
  }

  public void question(Teacher teacher) {
    teacher.answer();
  }
}

