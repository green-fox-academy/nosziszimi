import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by Nóra on 2017. 03. 31..
 */
public class TriangleFractals {
  public static void mainDraw(Graphics graphics) {
    triangleDrawer(0,0,300, 300, graphics);
  }
  public static void triangleDrawer(int x, int y, int width, int height, Graphics graphics) {
    int[] xPoly1 = {x, x+width/2, x+width/4};
    int[] yPoly1 = {y, y, y+height/2};

    int[] xPoly2 = {xPoly1[1], xPoly1[1]+width/2, x+3*width/4};
    int[] yPoly2 = {yPoly1[1], yPoly1[1], y+height/2};

    int[] xPoly3 = {xPoly1[2], xPoly2[2], x+width/2};
    int[] yPoly3 = {yPoly1[2], yPoly2[2], y+height};

    if (width <= 1 || height <= 1){
    }
    else {
      graphics.drawPolygon(xPoly1, yPoly1, xPoly1.length);
      graphics.drawPolygon(xPoly2, yPoly2, xPoly2.length);
      graphics.drawPolygon(xPoly3, yPoly3, xPoly3.length);

      triangleDrawer(x, y,width/2, height/2, graphics);
      triangleDrawer(x+width/2, y,width/2, height/2, graphics);
      triangleDrawer(x+width/4, y+height/2,width/2, height/2, graphics);
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
      this.setBackground(Color.yellow);
      mainDraw(graphics);
    }
  }
}
