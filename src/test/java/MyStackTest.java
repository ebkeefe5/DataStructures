import org.junit.Assert;
import org.junit.Test;

public class MyStackTest
{
    @Test
    public void testStack() {
        MyStack<String> stack = new MyStack<>();
        stack.push("bottom");
        stack.push("middle");
        stack.push("top");
        Assert.assertEquals("top", stack.peek());
        Assert.assertEquals("top", stack.pop());
        Assert.assertEquals(2, stack.length);
        Assert.assertEquals("middle", stack.top.value);
        Assert.assertEquals("bottom", stack.bottom.value);
    }
}
