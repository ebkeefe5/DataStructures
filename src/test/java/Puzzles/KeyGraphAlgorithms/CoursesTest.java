package Puzzles.KeyGraphAlgorithms;

import org.junit.Assert;
import org.junit.Test;

public class CoursesTest
{
    private int[][] preRequisites;
    private Courses courseChecker = new Courses();

    @Test
    public void checkCourses_NoCycle()
    {
        preRequisites = new int[][]{
                {1, 0},
                {2, 1},
                {3, 2}
        };

        Assert.assertTrue(courseChecker.canFinish(4, preRequisites));
    }

    @Test
    public void checkCourses_Cycle()
    {
        preRequisites = new int[][]{
                {1, 0},
                {2, 1},
                {3, 2},
                {0, 3}
        };

        Assert.assertFalse(courseChecker.canFinish(4, preRequisites));
    }

    //multiple paths to a vertex from a starting vertex but no cycles
    @Test
    public void checkCourses_NoCycle_repeatPaths()
    {
        preRequisites = new int[][]{
                {0, 1},
                {0, 2},
                {2, 3},
                {1, 3},
                {3, 4},
                {4, 5}
        };

        Assert.assertTrue(courseChecker.canFinish(6, preRequisites));
    }
}
