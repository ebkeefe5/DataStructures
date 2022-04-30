package Puzzles.Memoization;

import org.junit.Assert;
import org.junit.Test;

public class ClimbingStairsTest {

    @Test
    public void TestClimbStairsBaseCases()
    {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        Assert.assertEquals(0, climbingStairs.climbStairs(0));
        Assert.assertEquals(1, climbingStairs.climbStairs(1));
        Assert.assertEquals(2, climbingStairs.climbStairs(2));

        Assert.assertEquals(1318412525, climbingStairs.climbStairs(1000));
    }

}
