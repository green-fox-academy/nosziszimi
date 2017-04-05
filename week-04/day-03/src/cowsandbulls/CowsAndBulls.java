package cowsandbulls;

import java.util.ArrayList;

/**
 * Created by Nóra on 2017. 04. 05..
 */
public class CowsAndBulls {
  int numberToGuess, guessCounter;
  boolean gameFinished;

  public CowsAndBulls() {
    numberToGuess = 1000 + (int) (Math.random()*10000);
    guessCounter =0;
    gameFinished = false;
  }

  ArrayList<Integer> separateDigits(int numberToSeparate) {
    ArrayList<Integer> separatedDigits = new ArrayList<>();
    for (int i = 0; i < 4 ; i++) {
      separatedDigits.add(numberToSeparate % 10);
      numberToSeparate /= 10;
    }
    return separatedDigits;
  }

  String guess(int guessedNumber) {

  }


}
