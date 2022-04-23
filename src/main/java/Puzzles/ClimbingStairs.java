import java.util.Map;
import java.util.HashMap;

///ou are climbing a staircase. It takes n steps to reach the top.

//Each time you can either climb 1 or 2 steps. In how many //distinct ways can you climb to the top?


class ClimbingStairs {
    public int climbStairs(int n) {
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