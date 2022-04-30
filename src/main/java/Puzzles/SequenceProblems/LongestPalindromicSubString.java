class LongestPalindromicSubString {
    
    public String longestPalindrome(String s) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++)
        {
           String odd = oddPal(s, i); //longest odd pal centered at i
           String even = evenPal(s, i); //longest even pal centered at i
           if (odd.length() > answer.length())
               answer = odd;
           if (even.length() > answer.length())
               answer = even;
        }
        return answer;
    }
    
    private String oddPal(String s, int i)
    {
        String pal = "" + s.charAt(i);
        int left = i - 1;
        int right = i + 1;
        while (left >= 0 && right < s.length())
        {
            char leftC = s.charAt(left);
            char rightC = s.charAt(right);
            if (leftC == rightC)
                pal = leftC + pal + rightC;
            else
                break;
            left --;
            right ++;
        }
        return pal;   
    }
    
    private String evenPal(String s, int i)
    {
        String pal = "";
        int left = i;
        int right = i + 1;
        while (left >= 0 && right < s.length())
        {
            char leftC = s.charAt(left);
            char rightC = s.charAt(right);
            if (leftC == rightC)
                pal = leftC + pal + rightC;
            else
                break;
            left --;
            right ++;
        }
        return pal;   
    }    
}