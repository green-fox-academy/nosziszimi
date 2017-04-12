/**
 * Created by Nóra on 2017. 04. 10..
 */

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.awt.*;

  public class Board extends JComponent implements KeyListener {
    static final int BOARD_WIDTH = 720;
    static final int BOARD_HEIGHT = 720;
    Area area;
    Hero hero;

    public Board() {
      area = new Area();
      hero = new Hero();

      area.fillTilesList();
      area.fillWallList();

      // set the size of your draw board
      setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));
      setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
      super.paint(graphics);
      // here you have a 720x720 canvas
      // you can create and draw an image using the class below e.g.

      for (Tile tile : area.tilesList) {
        tile.draw(graphics);
      }
      for (Tile tile : area.wallList) {
        tile.draw(graphics);
      }
      hero.draw(graphics);
    }

    public static void main(String[] args) {
      // Here is how you set up a new window and adding our board to it
      JFrame frame = new JFrame("RPG Game");
      Board board = new Board();
      frame.add(board);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      frame.pack();
      // Here is how you can add a key event listener
      // The board object will be notified when hitting any key
      // with the system calling one of the below 3 methods
      frame.addKeyListener(board);
      // Notice (at the top) that we can only do this
      // because this Board class (the type of the board object) is also a KeyListener
    }

    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
      // When the up or down keys hit, we change the position of our box
      if (e.getKeyCode() == KeyEvent.VK_UP) {
        hero.image = ImageLoader.getInstance().HERO_UP;
        hero.rowIndex--;
      } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
        hero.image = ImageLoader.getInstance().HERO_DOWN;
        hero.rowIndex++;
      } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
        hero.image = ImageLoader.getInstance().HERO_LEFT;
        hero.columnIndex--;
      } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
        hero.image = ImageLoader.getInstance().HERO_RIGHT;
        hero.columnIndex++;
      }
      // and redraw to have a new picture with the new coordinates
      invalidate();
      repaint();
    }
  }