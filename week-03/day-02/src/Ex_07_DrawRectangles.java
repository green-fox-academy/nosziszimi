import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by Nóra on 2017. 03. 28..
 */
public class Ex_07_DrawRectangles {
  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.
    graphics.setColor(Color.BLACK);
    graphics.fillRect(12,12, 50,20);

    graphics.setColor(Color.GREEN);
    graphics.fillRect(80,40, 100,50);

    graphics.setColor(Color.BLUE);
    graphics.fillRect(25,100, 75,30);

    graphics.setColor(Color.RED);
    graphics.fillRect(50,150, 25,40);
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

    }
  }

}
