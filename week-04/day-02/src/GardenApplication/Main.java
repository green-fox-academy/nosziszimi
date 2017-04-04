package GardenApplication;

/**
 * Created by Nóra on 2017. 04. 04..
 */
public class Main {

  public static void main(String[] args) {
    Garden myGarden = new Garden("My Garden");

    Flower f1 = new Flower("yellow");
    Flower f2 = new Flower("blue");

    Tree t1 = new Tree("purple");
    Tree t2 = new Tree("orange");

    myGarden.plants.add(f1);
    myGarden.plants.add(f2);
    myGarden.plants.add(t1);
    myGarden.plants.add(t2);

    myGarden.info();
    myGarden.water(40);
    myGarden.info();
    myGarden.water(70);
    myGarden.info();
  }
}
