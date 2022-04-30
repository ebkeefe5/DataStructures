import java.util.*; 
import java.io.*;

class LongestString {

  public static String LongestWord(String sen) {
    String[] words = sen.replaceAll("[^a-zA-Z ]", "").split(" ");
    int maxLength = -1;
    String longestWord = "";
    for (String word: words)
    {
      if (word.length() > maxLength)
      {
        longestWord = word;
        maxLength = word.length();
      }
    } 
    return longestWord;
  }
}