import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
/**
 * Created by Nóra on 2017. 03. 31..
 */
public class FractalTree {
  public static void mainDraw(Graphics graphics) {
    treeDrawer(400,500, -90, 4, graphics );
  }
  public static void treeDrawer (int x, int y, double angle, double depth, Graphics g) {
    if (depth == 0) return;
    int x2 = x + (int) (Math.cos(Math.toRadians(angle)) * depth * 15.0);
    int y2 = y + (int) (Math.sin(Math.toRadians(angle)) * depth * 15.0);
    g.drawLine(x, y, x2, y2);
    treeDrawer(x2, y2, angle-30, depth-0.5, g);
    treeDrawer(x2, y2, angle+30, depth-0.5, g);
    treeDrawer(x2, y2, angle, depth-0.5,g);
  }
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(800, 600));
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
