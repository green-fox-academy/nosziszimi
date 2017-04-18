package main.java.music;

/**
 * Created by Nóra on 2017. 04. 18..
 */
public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    this(4);
  }

  public BassGuitar(int strings) {
    numberOfStrings = strings;
    sound = "Duum-duum-duum";
  }
}
