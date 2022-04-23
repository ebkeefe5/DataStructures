package Puzzles.KeyGraphAlgorithms;

import org.junit.Assert;
import org.junit.Test;
import Puzzles.KeyGraphAlgorithms.GraphSearchingUtil.Node;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class GraphSearchingUtilTest {

    private static GraphSearchingUtil util = new GraphSearchingUtil();

    private Node<String> CNode = new Node<>("C", null);
    private Node<String> ENode = new Node<>("E", List.of(CNode));
    private Node<String> BNode = new Node<>("B", List.of(CNode, ENode));
    private Node<String> DNode = new Node<>("D", List.of(ENode));
    private Node<String> ANode = new Node<>("A", List.of(DNode, BNode));
    /*
    A -> B  ---->---
    \       \       \> C
     \> D -> \> E -->-^
     */

    @Test
    public void testRecursiveDFS()
    {
        GraphSearchingUtil util = new GraphSearchingUtil();
        Assert.assertFalse(util.DFS(CNode, ANode, new HashSet<>()));
        Assert.assertFalse(util.DFS(DNode, BNode, new HashSet<>()));
        Assert.assertFalse(util.DFS(BNode, DNode, new HashSet<>()));
        Assert.assertTrue(util.DFS(ANode, CNode, new HashSet<>()));
        Assert.assertTrue(util.DFS(BNode, CNode, new HashSet<>()));
    }

    @Test
    public void testBFSShortestPathFinder()
    {
        Assert.assertEquals(new ArrayList<>(), util.findShortestPath(CNode, ANode));
        Assert.assertEquals(new ArrayList<>(), util.findShortestPath(DNode, BNode));
        Assert.assertEquals(new ArrayList<>(), util.findShortestPath(BNode, DNode));

        List<Node> shortestPath = util.findShortestPath(ANode, CNode);
        Assert.assertEquals(3, util.findShortestPath(ANode, CNode).size());
        Assert.assertEquals(3, util.findShortestPath(ANode, ENode).size());
    }
}
