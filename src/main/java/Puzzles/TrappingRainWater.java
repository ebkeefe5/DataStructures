// class Solution {
//     public int trap(int[] height) {
                                
//         int maxLeftHeight = 0;
//         int trappedWater = 0;
        
//         int[] rightMaxHeights = new int[height.length];
//         int rightMaxHeight = 0;
        
//         for (int i = height.length - 1; i >=0; i--)
//         {
//             if (height[i] > rightMaxHeight)
//                 rightMaxHeight = height[i];
//             rightMaxHeights[i] = rightMaxHeight;
               
//         }
        
//         for (int i = 0; i < height.length; i++)
//         {
//             if (height[i] > maxLeftHeight)
//                 maxLeftHeight = height[i];
            
//             trappedWater += Math.min(maxLeftHeight, rightMaxHeights[i]) - height[i];
//         }
        
//         return trappedWater;  
//     }       
// }