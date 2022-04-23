// class Solution {
//     public int lengthOfLIS(int[] nums) {
//         int[] LIS = new int[nums.length];
        
//         //LIS at each index is at least 1
//         for (int i = 0; i < LIS.length; i++)
//         {
//             LIS[i] = 1;
//         }
        
//         for (int i = 0; i < nums.length; i++)
//         {
//             for (int j = 0; j < i; j++)
//             {
//                 if (nums[j] < nums[i])
//                 {
//                     if (LIS[j] >= LIS[i])
//                     {
//                         LIS[i] = LIS[j] + 1;
//                     }
//                 }
//             }
//         }
        
//         int max = 1;
//         for (int i = 0; i < LIS.length; i++)
//         {
//             if (LIS[i] > max)
//                 max = LIS[i];
//         }
//         return max;
        
//     }   
// }
