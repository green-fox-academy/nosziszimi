import java.util.Arrays;

/**
 * Created by Nóra on 2017. 04. 03..
 */
public class Ex_04_Dice {
  //    You have a Dice class which has 6 dice
//    You can roll all of them with roll()
//    Check the current rolled numbers with getCurrent()
//    You can reroll with reroll()
//    Your task is to get where all dice is a 6
  int[] dices = new int[6];

  public int[] roll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
    return dices;
  }

  public int[] getCurrent() {
    return dices;
  }

  public int getCurrent(int i) {
    return dices[i];
  }

  public void reroll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
  }

  public void reroll(int k) {
    dices[k] = (int) (Math.random() * 6) + 1;
  }

  public static void main(String[] args) {
    Ex_04_Dice myDice = new Ex_04_Dice();
    myDice.getCurrent();
    myDice.roll();
    myDice.getCurrent();
    myDice.getCurrent(5);
    myDice.reroll();
    myDice.getCurrent();
    myDice.reroll(4);
    myDice.getCurrent();

    all6(myDice);
  }

  public static void all6 (Ex_04_Dice dice) {
    int dicesWith6 = 0;
    for (int j = 0; dicesWith6 < 6 ; j++) {
      dicesWith6 = 0;
      for (int i = 0; i < 6; i++) {
        if (dice.getCurrent(i) != 6) {
          dice.reroll(i);
        } else {
          dicesWith6++;
        }
      }
    }
    for (int i = 0; i < 6 ; i++) {
      System.out.println(dice.getCurrent(i));
    }
  }
}
