package Puzzles;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CommonItemCheckerTest
{
    private List<Integer> listOne = List.of(1, 2, 10, 6, 5);
    private List<Integer> listTwo = List.of(10, 3, 9, 20, 21);
    private List<Integer> listThree = List.of(100, 200, 300);

    @Test
    public void testCommonItemChecker()
    {
        Assert.assertTrue(CommonItemChecker.hasCommonItems(listOne, listTwo));
        Assert.assertFalse(CommonItemChecker.hasCommonItems(listOne, listThree));
        Assert.assertFalse(CommonItemChecker.hasCommonItems(new ArrayList<>(), listThree));
    }
}