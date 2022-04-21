import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class MyGraphTest
{
    MyGraph<Integer> graph;

    @Before
    public void setUp()
    {
        graph = new MyGraph<>();
        graph.addEdge(1, 2);
        graph.addEdge(1, 6);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(5, 1);
    }

    @Test
    public void TestDFSFindsConnectedNodes()
    {
        Assert.assertSame(4, graph.DFS(1, 4));
        Assert.assertSame(6, graph.DFS(1, 6));
        Assert.assertSame(5, graph.DFS(4, 5));
    }

    @Test
    public void testDFSReturnsNullSearchingForUnconnectedNode()
    {
        Assert.assertSame(null, graph.DFS(1, 7));
    }

    @Test
    public void TestBFSFindsShortestPath()
    {
        List<Integer> path =  graph.BFS(1, 5);
        Assert.assertEquals(List.of(5, 1), path);

        List<Integer> path2 =  graph.BFS(1, 4);
        Assert.assertEquals(List.of(4, 3, 2, 1), path2);
    }

    @Test
    public void testBFSReturnsNullSearchingForUnconnectedNode()
    {
        Assert.assertSame(null, graph.BFS(1, 7));
    }

}
