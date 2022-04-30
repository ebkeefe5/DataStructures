package Puzzles.Memoization;//find maximal sum of elements in a list
//but you can only take out elements
//that are not next to each other
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0)
            return 0;
        
        if (nums.length == 1)
            return nums[0];
        
        if (nums.length == 2)
            return Math.max(nums[0], nums[1]);
            
        Map<Integer, Integer> cache = new HashMap<>();
        cache.put(0, nums[0]); //size 1 
        cache.put(1, Math.max(nums[0], nums[1])); //size 2
        for (int i = 2; i < nums.length; i++)
        {
            int ans = Math.max((nums[i] + cache.get(i-2)), cache.get(i-1));
            cache.put(i, ans);
        }
        
        return cache.get(nums.length - 1);
    }
}