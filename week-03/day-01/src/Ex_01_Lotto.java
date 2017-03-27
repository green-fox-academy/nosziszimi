import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Nóra on 2017. 03. 27..
 */

// Create a method that find the 5 most common lotto numbers assets/lotto.csv

public class Ex_01_Lotto {
  public static void main(String[] args) {
    ArrayList<String> numbers = new ArrayList<>();
    ArrayList<Integer> numbersInt = new ArrayList<>();
    ArrayList<Integer> occurences = new ArrayList<>();
    ArrayList<Integer> allLottoNumbers = new ArrayList<>();
    HashMap<Integer, Integer> numbersOccurences = new HashMap<>();
    HashMap<Integer, Integer> mostCommonNumbers = new HashMap<>();
    HashMap<Integer, Integer> sameOccurences = new HashMap<>();
    HashMap<Integer, Integer> highestOccurences = new HashMap<>();


    for (int i = 1; i <91 ; i++) {
      allLottoNumbers.add(i);
    }


    try {
      Path path = Paths.get("assets/otos.csv");
      List<String> lines = Files.readAllLines(path);
      for (String line : lines){
        String[] csvColums = line.split(";");

        for (int i = 11; i < 16 ; i++) {
          numbers.add(csvColums[i]);
        }
      }
      for (String s : numbers) {
        numbersInt.add(Integer.valueOf(s));
      }
      for (int i = 1; i <91 ; i++) {
        occurences.add(Collections.frequency(numbersInt, i));
      }
      for (int i = 0; i < allLottoNumbers.size(); i++) {
        numbersOccurences.put(allLottoNumbers.get(i), occurences.get(i));
      }

      for (int i = 1; i < 6 ; i++) {
        highestOccurences.put(i, 0);
      }

      int largestKey = 0;
      for (int j = 1; j < 6; j++) {
        for (Integer key : numbersOccurences.keySet()) {
          if (numbersOccurences.get(key) > highestOccurences.get(j)) {
            highestOccurences.put(j, numbersOccurences.get(key));
            largestKey = key;
          }
        }
        mostCommonNumbers.put(largestKey, numbersOccurences.get(largestKey));
        numbersOccurences.remove(largestKey);
      }


      System.out.println(mostCommonNumbers);

    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

}