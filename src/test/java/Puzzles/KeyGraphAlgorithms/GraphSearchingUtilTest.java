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
    public void testRecursiveDFSNoPath()
    {
        GraphSearchingUtil util = new GraphSearchingUtil();
        Assert.assertEquals(0, util.DFS(CNode, ANode, new HashSet<>(), new ArrayList<>()).size());
        Assert.assertEquals(0, util.DFS(DNode, BNode, new HashSet<>(), new ArrayList<>()).size());
        Assert.assertEquals(0, util.DFS(BNode, DNode, new HashSet<>(), new ArrayList<>()).size());
    }

    //notice DFS doesn't always find the shortest path, but it does find a path
    @Test
    public void testRecursiveDFSPathExists()
    {
        List<Integer> path4 = util.DFS(ANode, CNode, new HashSet<>(), new ArrayList<>());
        Assert.assertEquals(List.of(ANode, DNode, ENode, CNode), path4);

        List<Integer> path5 = util.DFS(BNode, CNode, new HashSet<>(), new ArrayList<>());
        Assert.assertEquals(List.of(BNode, CNode), path5);

        List<Integer> path6 = util.DFS(ANode, ENode, new HashSet<>(), new ArrayList<>());
        Assert.assertEquals(List.of(ANode, DNode, ENode), path6);
    }

    @Test
    public void testBFSNoPath()
    {
        Assert.assertEquals(new ArrayList<>(), util.findShortestPath(CNode, ANode));
        Assert.assertEquals(new ArrayList<>(), util.findShortestPath(DNode, BNode));
        Assert.assertEquals(new ArrayList<>(), util.findShortestPath(BNode, DNode));
    }

    //BFS always finds the shortest path
    @Test
    public void testBFSShortestPathFinder()
    {
        Assert.assertEquals(3, util.findShortestPath(ANode, CNode).size());
        Assert.assertEquals(3, util.findShortestPath(ANode, ENode).size());
    }
}
