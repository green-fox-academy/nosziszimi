import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
/**
 * Created by Nóra on 2017. 03. 28..
 */
public class Ex_13_CheckboardPattern {
  public static void mainDraw(Graphics graphics){
    // fill the canvas with a checkerboard pattern.

    graphics.setColor(Color.BLACK);

    for (int row = 0; row < 30 ; row++) {
      if (row%2 != 1) {
        for (int column = 0; column < 15; column++) {
          graphics.fillRect(column * 20, 0+row*10, 10, 10);
        }
      }
      else {
        for (int column = 0; column < 15; column++) {
          graphics.fillRect(10 + column * 20, row*10, 10, 10);
        }
      }
    }
  }
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(320, 343));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}