package Puzzles.GoogleTechDev;

import org.junit.Assert;
import org.junit.Test;

public class MinStackTest
{

    private MinStack minStack = new MinStack();

    @Test
    public void testAllOperations()
    {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        Assert.assertEquals(-3, minStack.getMin()); // return -3
        minStack.pop();
        Assert.assertEquals(0, minStack.top());    // return 0
        Assert.assertEquals(-2, minStack.getMin()); // return -2
    }
}
