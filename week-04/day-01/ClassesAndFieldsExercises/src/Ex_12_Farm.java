import java.util.List;

/**
 * Created by Nóra on 2017. 04. 03..
 */
public class Ex_12_Farm {
  List<Animal> animals;
  int slots;

  public void breed() {
    if (animals.size() < slots) {
      new Animal();
    }
  }

  public void slaughter() {
    Animal leastHungryAnimal = animals.get(0);
    for (Animal animal : animals) {
      if (animal.hunger < leastHungryAnimal.hunger) {
        leastHungryAnimal = animal;
      }
    }
    animals.remove(leastHungryAnimal);
  }
}
