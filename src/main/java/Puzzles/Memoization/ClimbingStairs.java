package Puzzles.Memoization;

import java.util.Map;
import java.util.HashMap;

/*
* Problem
* you are climbing a staircase. It takes n steps to reach the top.
* Each time you can either climb 1 or 2 steps
* In how many //distinct ways can you climb to the top?
 */

class ClimbingStairs {

    public ClimbingStairs(){};

    //bottom up, iterative, memoized approach
    public int climbStairs(int n) {

        //there is 0 ways to climb 0 stairs
        //there is 1 way to climb 1 stairs
        //there are 2 ways to climb 3 stairs
            //climb 2 stairs
            //climb 1 stair twice
        if (n < 3)
            return n;
        
        Map<Integer, Integer> climbMap = new HashMap<>();
        climbMap.put(0, 1);
        climbMap.put(1, 2);
        for (int i = 2; i < n; i++)
        {
            climbMap.put(i, climbMap.get(i -1) + climbMap.get(i - 2));
        }
        return climbMap.get(n - 1);        
    }
}