package cowsandbulls;

/**
 * Created by Nóra on 2017. 04. 05..
 */
public class CowsAndBullsApp {

  public static void main(String[] args) {
    CowsAndBulls c = new CowsAndBulls();
    System.out.println(c.numberToGuess);
    c.startingTheGame();
    while(!c.gameFinished) {
      c.guess();
    }
  }





}
