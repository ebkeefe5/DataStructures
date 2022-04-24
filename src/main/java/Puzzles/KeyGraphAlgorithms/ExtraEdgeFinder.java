package Puzzles.KeyGraphAlgorithms;

/*
 * https://leetcode.com/problems/redundant-connection/
 * In this problem, a tree is an undirected graph that is connected and has no cycles.

 * You are given a graph that started as a tree with n nodes labeled from 1 to n, with one additional edge added. The added edge has two different vertices chosen from 1 to n, and was not an edge that already existed. The graph is represented as an array edges of length n where edges[i] = [ai, bi] indicates that there is an edge between nodes ai and bi in the graph.

 * Return an edge that can be removed so that the resulting graph is a tree of n nodes. If there are multiple answers, return the answer that occurs last in the input.
 */

/*
 * I find this problem quite weird
 * the solution is basically to build the graph, and as you add each edge, do a DFS
 * between the two nodes in the edges to check if there is already a path between them
 * if there already is a path the edge you are about to add is not needed
 */


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ExtraEdgeFinder {

    private int MAX_NODES = 1000;

    public int[] findRedundantConnection(int[][] edges)
    {
        ArrayList<Integer>[] graph = new ArrayList[MAX_NODES + 1];

        for (int i = 1; i < graph.length; i++)
        {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge: edges)
        {
            if (DFS(edge[0], edge[1], graph, new HashSet<>()))
                return edge;
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        return new int[2];
    }

    private boolean DFS(int curr, int target, ArrayList<Integer>[] graph, Set<Integer> seen)
    {
        if (curr == target)
        {
            return true;
        }
        seen.add(curr);
        List<Integer> adjacent = graph[curr];
        if (adjacent == null) //safety check shouldn't really happen
            return false;
        for (Integer adj: adjacent)
        {
            if (!seen.contains(adj) && DFS(adj, target, graph, seen))
                return true;
        }
        return false;
    }
}
