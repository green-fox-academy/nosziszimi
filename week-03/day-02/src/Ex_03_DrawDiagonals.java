import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
/**
 * Created by Nóra on 2017. 03. 28..
 */
public class Ex_03_DrawDiagonals {
  public static void mainDraw(Graphics graphics){
    // draw the canvas' diagonals in green.
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

      graphics.setColor(Color.GREEN);
      graphics.drawLine(0,0,300,300);
      graphics.drawLine(0,300,300,0);

    }
  }

}
