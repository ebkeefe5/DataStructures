/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
Constraints:
1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
*/

package Puzzles.GoogleTechDev;

class MoveZeros {

    public int[] moveZeroes(int[] nums) {
       int countZeros = 0;
       for (int i = 0; i < nums.length; i++)
       {
         if (nums[i] == 0)
           countZeros ++;
         else
           nums[i-countZeros] = nums[i];
       }
       for (int i = nums.length - countZeros; i < nums.length; i++)
       {
           nums[i] = 0;
       }
       return nums;
     }
 }