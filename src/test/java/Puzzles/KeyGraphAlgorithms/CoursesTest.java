package Puzzles.KeyGraphAlgorithms;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

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

        List<Integer> courseList = courseChecker.getCourseList(4, preRequisites);

        Assert.assertEquals(List.of(0, 1, 2, 3), courseList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCourses_Cycle()
    {
        preRequisites = new int[][]{
                {1, 0},
                {2, 1},
                {3, 2},
                {0, 3}
        };

       courseChecker.getCourseList(4, preRequisites);
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

        List<Integer> courseList = courseChecker.getCourseList(6, preRequisites);

        Assert.assertEquals(List.of(5, 4, 3, 2, 1, 0), courseList);
    }
}
