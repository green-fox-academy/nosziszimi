package Ex_03_Anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Created by Nóra on 2017. 04. 05..
 */
class AnagramTest {
  Anagram a = new Anagram();
  String s1;
  String s2;

  @Test
  void sort() {
    s1 = "cba";
    assertEquals("abc", a.sort(s1));
  }

  @Test
  void isAnagram() {
    s1 = "dpddo";
    s2 = "oddpd";
    assertEquals(true, a.areAnagrams(s1, s2));
  }

}