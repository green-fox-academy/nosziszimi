/**
 * Created by Nóra on 2017. 04. 03..
 */
public class Pirate {

  int intoxication;
  int rumCounter;
  boolean isAlive;

  public Pirate() {
    intoxication = 0;
    rumCounter = 0;
    isAlive = true;
  }

  public String drinkSomeRum() {
    if (isAlive) {
      intoxication++;
      rumCounter++;
      return "";
    } else {
      return "he's dead";
    }
  }

  public String howsItGoingMaTe() {

    if (isAlive) {
      if (rumCounter < 5) {
        return "Pour me anudder!";
      } else {
        return "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
      }
    } else {
      return "he is dead.";
    }
  }

  public void die() {
    isAlive = false;
  }

  public String brawl(Pirate pirate) {
    if (isAlive && pirate.isAlive) {
      int chance = (int) (Math.random() * 3);
      if (chance == 0) {
        isAlive = false;
        return "pirate1 has died.";
      } else if (chance == 1) {
        pirate.isAlive = false;
        return "pirate2 has died.";
      } else {
        isAlive = false;
        pirate.isAlive = false;
        return "Both of the pirates died in the brawl.";
      }
    } else {
      return "Unfortunately one of the pirates is dead so they can not brawl.";
    }
  }

  public static void main(String[] args) {
    Pirate p1 = new Pirate();
    Pirate p2 = new Pirate();
    Pirate p3 = new Pirate();
    p1.drinkSomeRum();
    System.out.println(p1.howsItGoingMaTe());

    for (int i = 0; i < 5; i++) {
      p1.drinkSomeRum();
    }
    System.out.println(p1.howsItGoingMaTe());

    p2.die();
    System.out.println(p2.drinkSomeRum());
    System.out.println(p2.howsItGoingMaTe());

    System.out.println(p1.brawl(p2));
    System.out.println(p1.brawl(p3));
  }
}
