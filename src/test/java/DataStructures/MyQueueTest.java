package DataStructures;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest
{
    @Test
    public void testQueueBasicFunctionality()
    {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(10);
        Assert.assertEquals(3, queue.dequeue().intValue()); //first in first out
        Assert.assertEquals(5, queue.peek().intValue());
        Assert.assertEquals(2, queue.length);
        queue.enqueue(50);
        Assert.assertEquals(5, queue.first.value.intValue());
        Assert.assertEquals(50, queue.last.value.intValue());
    }
}
