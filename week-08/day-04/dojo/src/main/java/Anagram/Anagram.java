package Anagram;

/**
 * Created by Nóra on 2017. 05. 11..
 */
public class Anagram {

  public static boolean isAnagram(String s1, String s2) {
    if (s1 == null || s2 == null) {
      return false;
    } else {
      s1 = s1.toLowerCase();
      s2 = s2.toLowerCase();
      if (sort(s1).equals(sort(s2))) {
        return true;
      } else {
        return false;
      }
    }
  }

  public static String sort(String incomingString) {
    for (int i = 0; i < incomingString.length(); i++) {
      for (int j = i; j < incomingString.length(); j++) {
        if (incomingString.charAt(i) > incomingString.charAt(j)) {
          incomingString = incomingString.substring(0, i)
                  + incomingString.charAt(j)
                  + incomingString.substring(i + 1, j)
                  + incomingString.charAt(i)
                  + incomingString.substring(j + 1, incomingString.length());
        }
      }
    }
    return incomingString.trim();
  }
}
