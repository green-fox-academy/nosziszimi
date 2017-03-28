import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
/**
 * Created by Nóra on 2017. 03. 28..
 */
public class Ex_12_PurpleSteps3D {
  public static void mainDraw(Graphics graphics){

    for (int i = 0; i < 7 ; i++) {
      graphics.setColor(new Color(190, 81, 215));
      graphics.fillRect(10+(i*(i+1)/2)*10,10+(i*(i+1)/2)*10,(i+1)*10,(i+1)*10);
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

