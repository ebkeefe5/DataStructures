package Puzzles.Sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SortingPlaygroundTest
{
    private static List<Integer> unsortedList = Arrays.asList(2, 3, 65, 7, 1, 3, 4, 2, 1, 10);
    private static List<Integer> sortedList = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 7, 10, 65);
    private SortingPlayground p = new SortingPlayground();

    @Test
    public void testBubbleSort()
    {
        Assert.assertEquals(sortedList, p.bubbleSort(unsortedList));
    }

    @Test
    public void testSelectionSort()
    {
        Assert.assertEquals(sortedList, p.selectionSort(unsortedList));
    }

    @Test
    public void testInsertionSort()
    {
        Assert.assertEquals(sortedList, p.insertionSort(unsortedList));
    }

    @Test
    public void testMergeSort()
    {
        Assert.assertEquals(sortedList, p.mergeSort(unsortedList));
    }
}
