package cowsandbulls;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Nóra on 2017. 04. 05..
 */

// Create a class what is capable of playing exactly one game of Cows and Bulls (CAB).
// The player have to guess a 4 digit number. For every digit that the player
// guessed correctly in the correct place, they have a “cow”.
// For every digit the player guessed correctly in the wrong place is a “bull.”
//The CAB object should have a random 4 digit number, which is the goal to guess.
//The CAB object should have a state where the game state is stored (playing, finished).
//The CAB object should have a counter where it counts the guesses.
//The CAB object should have a guess method, which returns a string of the guess result.
//All methods, including constructor should be tested .

public class CowsAndBulls {
  int numberToGuess, guessCounter, cowCounter, bullCounter, playersGuess;
  boolean gameFinished;
  String guessInfo;

  public CowsAndBulls() {
    numberToGuess = 1000 + (int) (Math.random()*9000);
    guessCounter = 0;
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

  void guess() {
    ArrayList<Integer> digitsOfNumberToGuess = separateDigits(numberToGuess);
    ArrayList<Integer> digitsOfguess = separateDigits(playersGuess);
    cowCounter = 0;
    bullCounter = 0;
    for (int i = 0; i < 4 ; i++) {
      if (digitsOfNumberToGuess.get(i) == digitsOfguess.get(i)) {
        cowCounter++;
      } else {
        for (int j = 0; j < 4 ; j++) {
          if (i != j) {
            if (digitsOfNumberToGuess.get(i) == digitsOfguess.get(j)){
              bullCounter++;
            }
          }
        }
      }
    }
    guessCounter++;
    guessInfo = "You have " + cowCounter + " cow, and " + bullCounter + " bull.";
    updateTheState();
    checkTheState();
  }

  void updateTheState() {
    if (cowCounter == 4) {
      gameFinished = true;
    }
  }

  void checkTheState() {
      if (gameFinished) {
        System.out.println("The game is finished. You won!! It took you only " + guessCounter + " guess to win.");
      } else {
        System.out.println(guessInfo);
        nextGuess();
      }
  }
  void startingTheGame() {
    System.out.println("I taught of a positive 4 digit number. Try to guess my number!");
    Scanner scanner = new Scanner(System.in);
    playersGuess = scanner.nextInt();
      while (!(playersGuess < 10000 && playersGuess > 999)) {
        System.out.println("It was not a positive for digit number. Try again to guess my number!");
        playersGuess = scanner.nextInt();
      }
    guessCounter++;
  }
  void nextGuess() {
    System.out.println("Give me your next guess!");
    Scanner scanner = new Scanner(System.in);
    playersGuess = scanner.nextInt();
    while (!(playersGuess < 10000 && playersGuess > 999)) {
      System.out.println("It was not a positive for digit number. Try again to guess my number!");
      playersGuess = scanner.nextInt();
    }
    guessCounter++;
  }


}
