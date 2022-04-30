package Puzzles.GoogleTechDev;

import org.junit.Assert;
import org.junit.Test;

public class MergeIntervalsTest
{
    private MergeIntervals intervalMerger = new MergeIntervals();

    @Test
    public void testOneInterval()
    {
        int[][] intervals = new int[][]{{1, 5}};
        Assert.assertEquals(new int[][]{{1, 5}}, intervalMerger.merge(intervals));
    }

    @Test
    public void testMultipleIntervals()
    {
        int[][] intervals = new int[][]{{1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };

        int[][] expected = new int[][]{{1, 6},
                {8, 10},
                {15, 18}
        };

        Assert.assertEquals(expected, intervalMerger.merge(intervals));
    }

    @Test
    public void testMultipleIntervalsTwo()
    {
        int[][] intervals = new int[][]{{1, 4},
                {4, 5}
        };

        int[][] expected = new int[][]{{1, 5}
        };


        Assert.assertEquals(expected, intervalMerger.merge(intervals));
    }
}
