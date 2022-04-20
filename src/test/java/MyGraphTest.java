import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
        graph.addEdge(4, 5);
        graph.addEdge(4, 1);
        graph.addEdge(5, 1);
    }

    @Test
    public void TestDFSFindsConnectedNodes()
    {
        Assert.assertSame(4, graph.DFS(1, 4));
        Assert.assertSame(6, graph.DFS(5, 6));
    }

    @Test
    public void testDFSReturnsNullSearchingForUnconnectedNode()
    {
        Assert.assertSame(null, graph.DFS(1, 7));
    }

    @Test
    public void TestBFSFindsConnectedNodes()
    {
        Assert.assertSame(4, graph.BFS(1, 4));
        Assert.assertSame(6, graph.BFS(5, 6));
    }

    @Test
    public void testBFSReturnsNullSearchingForUnconnectedNode()
    {
        Assert.assertSame(null, graph.BFS(1, 7));
    }

}
