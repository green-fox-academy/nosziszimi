import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by Nóra on 2017. 03. 28..
 */
public class Ex_02_ColoredBoxDraw {
  public static void mainDraw(Graphics graphics){
    // draw a box that has different colored lines on each edge.
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
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

      graphics.setColor(Color.RED);
      graphics.drawLine(25,25,75,25);

      graphics.setColor(Color.GREEN);
      graphics.drawLine(75,25,75,50);

      graphics.setColor(Color.BLUE);
      graphics.drawLine(75,50,25,50);

      graphics.setColor(Color.BLACK);
      graphics.drawLine(25,50,25,25);

    }
  }

}
