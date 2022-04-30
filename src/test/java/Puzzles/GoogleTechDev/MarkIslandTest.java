package Puzzles.GoogleTechDev;

import org.junit.Assert;
import org.junit.Test;

public class MarkIslandTest
{
    private MarkIsland islandFinder = new MarkIsland();

    @Test
    public void testMarkIsland()
    {
        char[][] island = new char[][]{
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };

        Assert.assertEquals(3, islandFinder.numIslands(island));
    }

}
