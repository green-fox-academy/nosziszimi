/**
 * Created by Nóra on 2017. 04. 03..
 */
public class Ex_01_PostIt {
  String backgroundColor;
  String text;
  String textColor;

  public Ex_01_PostIt(String backgroundColor, String text, String textColor) {
    this.backgroundColor = backgroundColor;
    this.text = text;
    this.textColor = textColor;
  }

  public static void main(String[] args) {
    Ex_01_PostIt p1 = new Ex_01_PostIt("orange", "Idea 1", "blue");
    Ex_01_PostIt p2 = new Ex_01_PostIt("pink", "Awsome", "black");
    Ex_01_PostIt p3 = new Ex_01_PostIt("yellow", "Superb!", "green");
  }
}

