package main.java.music;

/**
 * Created by Nóra on 2017. 04. 18..
 */
public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    this(6);
  }

  public ElectricGuitar(int strings) {
    name = "Electric Guitar";
    numberOfStrings = strings;
    sound = "Twang";
  }
}
