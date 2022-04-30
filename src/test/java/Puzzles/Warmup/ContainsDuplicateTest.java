package Puzzles.Warmup;

import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicateTest
{
    @Test
    public void testContainsDuplicate()
    {
        ContainsDuplicate duplicateChecker = new ContainsDuplicate();
        Assert.assertTrue(duplicateChecker.containsDuplicate(new int[]{2, 1, 5, 4, 1}));
        Assert.assertFalse(duplicateChecker.containsDuplicate(new int[]{2, 1, 10, 11}));
        Assert.assertFalse(duplicateChecker.containsDuplicate(new int[]{}));
    }
}
