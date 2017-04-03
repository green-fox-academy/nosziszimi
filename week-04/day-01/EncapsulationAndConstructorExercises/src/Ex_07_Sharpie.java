/**
 * Created by Nóra on 2017. 04. 03..
 */
public class Ex_07_Sharpie {
  String color;
  float width;
  float inkAmount;

  public Ex_07_Sharpie(String color, float width) {
    this.color = color;
    this.width = width;
    inkAmount = 100;
  }

  public void use() {
    inkAmount--;
  }
}
