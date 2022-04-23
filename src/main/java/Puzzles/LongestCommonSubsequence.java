// //top down recursive memoization approach
// //this can also be done with a double for loop in a bottom up manner
// //the cache has to have 1 extra space
// class Solution {
    
//     int[][] cache;
    
//     public int longestCommonSubsequence(String text1, String text2) 
//     {
//         cache = new int[text1.length() + 1][text2.length() + 1];
//         for (int i = 0; i <= text1.length(); i++)
//             for (int j = 0; j <= text2.length(); j++)
//                 cache[i][j] = -1;
        
        
//         return this.longestCommonSubsequence(text1, text2, text1.length(), text2.length());
        
//     }
    
//     private int longestCommonSubsequence(String X, String Y, int m, int n)
//     {
//         // return if the end of either sequence is reached
//         if (m == 0 || n == 0) {
//             return 0;
//         }
        
//         if (cache[m][n] != -1)
//             return cache[m][n];
 
//         // if the last character of `X` and `Y` matches
//         if (X.charAt(m - 1) == Y.charAt(n - 1)) {
//             cache[m][n] = longestCommonSubsequence(X, Y, m - 1, n - 1) + 1;
//             return cache[m][n];
//         }
 
//         // otherwise, if the last character of `X` and `Y` don't match
//         cache[m][n - 1] = longestCommonSubsequence(X, Y, m, n - 1);
//         cache[m-1][n] = longestCommonSubsequence(X, Y, m - 1, n);
//         return Integer.max(cache[m][n - 1], cache[m-1][n]);
//     }
    
   
// }