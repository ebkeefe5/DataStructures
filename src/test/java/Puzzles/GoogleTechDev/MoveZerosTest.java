package Puzzles.GoogleTechDev;

import org.junit.Assert;
import org.junit.Test;

public class MoveZerosTest
{
    private MoveZeros zeroMover = new MoveZeros();

    @Test
    public void testBasicInputOne()
    {
        int[] input = {0,1,0,3,12};
        int[] expected = {1,3,12,0,0};
        Assert.assertArrayEquals(expected, zeroMover.moveZeroes(input));
    }

    @Test
    public void testBasicInputTwo()
    {
        int[] input = {0};
        int[] expected = {0};
        Assert.assertArrayEquals(expected, zeroMover.moveZeroes(input));
    }

}
