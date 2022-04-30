package Puzzles.GoogleTechDev;

import org.junit.Assert;
import org.junit.Test;

public class QueueUsingStacksTest
{
    @Test
    public void testQueueUsingStacks()
    {
        QueueUsingStacks queueUsingStacks = new QueueUsingStacks();
        queueUsingStacks.push(1);
        queueUsingStacks.push(5);
        queueUsingStacks.push(10);
        Assert.assertEquals(1, queueUsingStacks.peek());
        Assert.assertEquals(1, queueUsingStacks.poll());
        queueUsingStacks.push(50);
        Assert.assertEquals(5, queueUsingStacks.poll());
        Assert.assertEquals(10, queueUsingStacks.poll());
        Assert.assertEquals(50, queueUsingStacks.poll());
    }

}
