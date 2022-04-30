package Puzzles.Warmup;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest
{
    private static ReverseString reverser = new ReverseString();

    @Test
    public void testReverseString()
    {
        Assert.assertEquals("nekcihc", reverser.reverse("chicken"));
        Assert.assertEquals("", reverser.reverse(""));
        Assert.assertEquals("a", reverser.reverse("a"));
    }
}
