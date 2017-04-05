package Ex_03_Anagram;

/**
 * Created by Nóra on 2017. 04. 05..
 */
public class Anagram {

  public String sort (String incomingString) {
    incomingString = incomingString.toLowerCase();
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
    return incomingString;
  }

  boolean areAnagrams(String string1, String string2) {
    if(sort(string1).equals(sort(string2))) {
      return true;
    } else {
      return false;
    }
  }
}
