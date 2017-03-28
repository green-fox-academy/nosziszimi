import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by Nóra on 2017. 03. 28..
 */
public class Ex_15_LinePlay {
  public static void mainDraw(Graphics graphics) {

    for (int i = 20; i < 281; i+=20) {
      graphics.setColor(Color.pink);
      graphics.drawLine(i, 0, 300, i);
      graphics.setColor(Color.green);
      graphics.drawLine(0, i, i,300);
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

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }
}


