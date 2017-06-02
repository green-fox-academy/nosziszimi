package Anagram;

import static junit.framework.TestCase.assertEquals;

import Anagram.Anagram;
import org.junit.Test;

/**
 * Created by Nóra on 2017. 05. 11..
 */
public class AnagramTest {

  @Test
  public void TestEqualStrings() {
    assertEquals(true, Anagram.isAnagram("dog", "dog"));
  }

  @Test
  public void TestEqualStringsAnagram() {
    assertEquals(true, Anagram.isAnagram("dog", "god"));
  }

  @Test
  public void TestEqualStringsNotAnagram() {
    assertEquals(false, Anagram.isAnagram("dog", "foo"));
  }

  @Test
  public void TestAnagramWithCapitalLetters() {
    assertEquals(true, Anagram.isAnagram("dog", "Dog"));
  }

  @Test
  public void TestAnagramWithSpaces() {
    assertEquals(true, Anagram.isAnagram("dog", "d og"));
  }

  @Test
  public void TestAnagramWithOneNullString() {
    String s = null;
    assertEquals(false, Anagram.isAnagram("dog", s));
  }

  @Test
  public void TestAnagramWithTwoNullStrings() {
    String s = null;
    assertEquals(false, Anagram.isAnagram(null , s));
  }

}