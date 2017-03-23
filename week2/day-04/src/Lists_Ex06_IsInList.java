import java.util.*;

/**
 * Created by Nóra on 2017. 03. 23..
 */
public class Lists_Ex06_IsInList {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
    ArrayList<Integer> searched = new ArrayList<Integer>(Arrays.asList(4,8,12,16,));
    ArrayList<Integer> indexOfSearchedNumbers = new ArrayList<Integer>();

    if (list.containsAll(searched)){
      System.out.println("Hoorray!");
    }
    else {
      System.out.println("Nooooo.");
    }

    for (int i = 0; i <searched.size(); i++) {
      int searchedNumber = searched.get(i);
      Object searchedNumObj = (Integer) searchedNumber;
      if (list.indexOf(searchedNumObj) >= 0) {
        indexOfSearchedNumbers.add(list.indexOf(searchedNumObj));
      }
    }

    if (indexOfSearchedNumbers.size() == searched.size()){
      System.out.println("Hoorray!");
    }
    else {
      System.out.println("Nooooo.");
    }

  }
}
