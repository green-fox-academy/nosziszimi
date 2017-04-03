/**
 * Created by Nóra on 2017. 04. 03..
 */
public class Ex_05_FleetOfThings {
  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    Thing t1 = new Thing("Get milk");
    Thing t2 = new Thing("Remove the obstacles");
    Thing t3 = new Thing("Stand up");
    Thing t4 = new Thing("Eat lunch");

    t3.complete();
    t4.complete();

    fleet.add(t1);
    fleet.add(t2);
    fleet.add(t3);
    fleet.add(t4);

    System.out.println(fleet);
  }
}
