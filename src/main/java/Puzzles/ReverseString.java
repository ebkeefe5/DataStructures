public class ReverseString
{
  public static String reverseTheString(String input)
  {
    return new StringBuilder(input).reverse().toString();
  }

  public static String sillyReverseTheString(String input)
  {
    StringBuilder reversed = new StringBuilder();
    char[] chrs = input.toCharArray();
    for (int i = chrs.length-1; i>=0; i--)
    {
      reversed.append(chrs[i]);
    }
    return reversed.toString();
  }

  public static void reverseStringByWords(String string) 
  {
    StringBuilder stringBuilder = new StringBuilder();
    String[] words = string.split(" ");

    for (int j = words.length-1; j >= 0; j--) {
        stringBuilder.append(words[j]).append(' ');
    }
    System.out.println("Reverse words: " + stringBuilder);
  }
  
    //reverses a string in place with only O(1) extra memory
    public void reverseString(char[] s) {
        // ["h","e","l","l","o"]
        
        for (int i = 0; i < s.length/2; i++)
        {
            char temp = s[s.length - 1 -i];
            s[s.length - 1 - i] = s[i];
            s[i] = temp;
        }
        
    }

}