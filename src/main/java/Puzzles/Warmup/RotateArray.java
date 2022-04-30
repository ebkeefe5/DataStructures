package Puzzles.Warmup;/*
Given an array, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
*/

class RotateArray {
  //non in place rotation  
  public void rotate(int[] nums, int k) {
                
        k = k%nums.length;
        
        int[] answer = new int[nums.length];
        
        int index = 0;
        
        for (int i = nums.length - k; i < nums.length; i++)
        {
            answer[index] = nums[i];
            index++;
        }
        
        for (int i = 0; i < nums.length - k; i++)
        {
            answer[index] = nums[i];
            index++;
        }
        
        
      for (int i = 0; i < nums.length; i++)
      {
        nums[i] = answer[i];
        }
    }

    //crazy in place rotation algorithm uses GCD
    public void rotate2(int[] nums, int k) {

        k = k % nums.length;

        int numSets = gcd(nums.length, k);
        for (int i = 0 ; i < numSets; i++)
        {
            juggle(nums, i, nums.length/numSets, k);
        }
    }

    private int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    private void juggle(int[] nums, int startIndex, int setSize, int k)
    {
        int prev = nums[startIndex];
        for (int i = 0; i < setSize; i++)
        {
            int moveIndex = ((i+1)*k+startIndex)%nums.length;
            int temp = nums[moveIndex];
            nums[moveIndex] = prev;
            prev = temp;
        }
    }
    
}