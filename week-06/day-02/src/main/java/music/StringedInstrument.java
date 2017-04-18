package main.java.music;

/**
 * Created by Nóra on 2017. 04. 18..
 */
public abstract class StringedInstrument extends Instrument{
  int numberOfStrings;
  String sound;
  final String formatForPlay = "%s, a %d-stringed instrument that %s\n";

  @Override
  public void play() {
    System.out.printf(formatForPlay, name, numberOfStrings, sound);
  }
}
