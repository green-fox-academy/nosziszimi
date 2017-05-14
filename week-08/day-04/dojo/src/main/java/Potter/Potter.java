package Potter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Nóra on 2017. 05. 11..
 */
public class Potter {

  public static float priceCounter(List<Integer> books) {
    List<Integer> booksCopy = new ArrayList<>();
    Collections.copy(booksCopy, books);
    Collections.sort(booksCopy);
    Map<Integer, Integer> bookOccurrences = getBookOccurrences(booksCopy);

    List<List<Integer>> differentBookSets = getDifferentBookSets(booksCopy);

    switch (books.size()) {
      case 1:
        return 8f;
      case 2:
        if (books.get(0) != books.get(1)) {
          float cost = (2 * 8) * 0.95f;
          return cost;
        } else {
          float cost = (float) (2 * 8);
          return cost;
        }
      case 3:

        break;
      case 4:
        break;
      case 5:
        break;
      default:
        break;
    }

    if (books.size() == 2) {
      if (books.get(0) != books.get(1)) {
        float cost = (2 * 8) * 0.95f;
        return cost;
      } else {
        float cost = (float) (2 * 8);
        return cost;
      }
    } else {
      return 8f;
    }
  }

  private static List<List<Integer>> getDifferentBookSets(List<Integer> books) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> oneSetOfDifferentBooks = new ArrayList<>();
    List<Integer> remaining = new ArrayList<>();




    return result;
  }

  private static Map<Integer, Integer> getBookOccurrences(List<Integer> books) {
    Map<Integer, Integer> result = new HashMap<>();

    for (Integer bookItem : books) {
      if (result.containsKey(bookItem)) {
        int previousAmount = result.get(bookItem);
        result.put(bookItem, ++previousAmount);
      } else {
        result.put(bookItem, 1);
      }
    }
    return result;
  }
}
