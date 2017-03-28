import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
/**
 * Created by Nóra on 2017. 03. 28..
 */
public class Ex_23_CheckboardPattern {
  public static void mainDraw(Graphics graphics){
    // fill the canvas with a checkerboard pattern.
    for (int i = 0; i < 15 ; i++) {
      graphics.setColor(Color.BLACK);
      graphics.fillRect(i*20, 0,10,10);
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