package Puzzles.KeyGraphAlgorithms;

import org.junit.Assert;
import org.junit.Test;

public class ExtraEdgeDetectorTest {

  private static ExtraEdgeFinder finder = new ExtraEdgeFinder();

  @Test
  public void testExtraEdge_ThreeEdges()
    {
        int[][] edges = new int[][]{
                {1, 2},
                {1, 3},
                {2, 3}
        };

        int[] answer = finder.findRedundantConnection(edges);
        Assert.assertEquals(2, answer[0]);
        Assert.assertEquals(3, answer[1]);
    }

    @Test
    public void testExtraEdge_FiveEdges()
    {
        int[][] edges = new int[][]{
                {1, 2},
                {2, 3},
                {3, 4},
                {1, 4},
                {1, 5}
        };

        int[] answer = finder.findRedundantConnection(edges);
        Assert.assertEquals(1, answer[0]);
        Assert.assertEquals(4, answer[1]);
    }
}
