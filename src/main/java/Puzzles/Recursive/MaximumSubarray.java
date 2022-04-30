package Puzzles.Recursive;/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1

Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
*/

import java.lang.Math;

public class MaximumSubarray
{

  public static int findMaxCrossingSum(int[] list, int m, int l, int h)
  {
    //find the maximum sum on the LHS
    int LHS = Integer.MIN_VALUE;
    int sum = 0;
    for (int i = m; i >=l; i--)
    {
      sum += list[i];
      if (sum > LHS)
        LHS = sum;
    }
    
    //find the maximum sum on the RHS
    int RHS = Integer.MIN_VALUE;
    sum = 0;
    for (int i = m + 1; i <= h; i++)
    {
      sum += list[i];
      if (sum > RHS)
        RHS = sum;
    }

    return Math.max(LHS + RHS, Math.max(LHS, RHS));
  }

  public static int findMaximumSubArray(int[] list, int l, int h)
  {
    //if there is only 1 element return that element
    if (l == h)
      return list[l];

    int m = (l + h)/2;

    return Math.max(Math.max(findMaximumSubArray(list, l, m),
                    findMaximumSubArray(list, m + 1, h)),
                    findMaxCrossingSum(list, m, l, h));
  }

  public static int findMaximumSubArray(int[] list)
  {
    return findMaximumSubArray(list, 0, list.length - 1);
  }

}

