import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by Nóra on 2017. 03. 28..
 */
public class Ex_14_FunctionToCenter {
  public static void mainDraw(Graphics graphics){
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // fill the canvas with lines from the edges, every 20 px, to the center.
    int x1 = 0;
    int y1 = 0;
    for (int i = 1; i < 5; i++) {
      if (i == 1){
        for (int j = 0; j < 301 ; j+=20) {
          x1 = j;
          y1 = 0;
          goToCenter(x1,y1,graphics);
        }
      }
      else if (i == 2){
        for (int j = 0; j < 301 ; j+=20) {
          x1 = 300;
          y1 = j;
          goToCenter(x1,y1,graphics);
        }
      }
      else if (i == 3){
        for (int j = 0; j < 301 ; j+=20) {
          x1 = j;
          y1 = 300;
          goToCenter(x1,y1,graphics);
        }
      }
      else if (i == 4){
        for (int j = 0; j < 301 ; j+=20) {
          x1 = 0;
          y1 = j;
          goToCenter(x1,y1,graphics);
        }
      }
    }
  }
  public static void goToCenter (int x, int y, Graphics grafics){
    grafics.setColor(Color.BLACK);
    grafics.drawLine(x, y,150,150);
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
