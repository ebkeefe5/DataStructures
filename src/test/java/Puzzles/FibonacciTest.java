package Puzzles;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testMemoizedRecursivefibRecNoStackOverFlow()
    {
        Fibonacci fibonacci = new Fibonacci();

        Assert.assertEquals(1556111435, fibonacci.memoizedRecursivefibRec(1000));
    }

    @Test
    public void testMemoizedRecursivefibCorrectAnswers()
    {
        Fibonacci fibonacci = new Fibonacci();

        Assert.assertEquals(0, fibonacci.memoizedRecursivefibRec(0));
        Assert.assertEquals(1, fibonacci.memoizedRecursivefibRec(1));
        Assert.assertEquals(1, fibonacci.memoizedRecursivefibRec(2));
        Assert.assertEquals(13, fibonacci.memoizedRecursivefibRec(7));
    }

    @Test
    public void testIterativeFibNoStackOverflow()
    {
        Fibonacci fibonacci = new Fibonacci();

        Assert.assertEquals(1556111435, fibonacci.iterativeFib(1000));
    }

    @Test
    public void testIterativeFibCorrectAnswers()
    {
        Fibonacci fibonacci = new Fibonacci();

        Assert.assertEquals(0, fibonacci.iterativeFib(0));
        Assert.assertEquals(1, fibonacci.iterativeFib(1));
        Assert.assertEquals(1, fibonacci.iterativeFib(2));
        Assert.assertEquals(13, fibonacci.iterativeFib(7));
    }
}
