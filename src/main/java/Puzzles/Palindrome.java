class Palindrome {
    
    public String longestPalindrome(String s) {
        for (int i = s.length(); i >= 0; i--)
        {
            String pal = palindrome(s, i);
            if (pal != null)
                return pal;
        }
        return null; //should never reach here
    }
    
    private String palindrome(String s, int l)
    { 
        for (int i = 0; i < s.length() + 1 -l ; i ++)
        {
            String pal = palindrome(s.substring(i, i + l));
            if (pal != null);
                return pal;
        }
        return null;
    }
    
    private String palindrome(String s)
    {
        for (int i = 0; i < s.length()/2; i++)
        {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return null;
        }
        return s;
    }
}