package Puzzles.KeyGraphAlgorithms;

import java.util.*;

/*
 * depth first search involves searching deep first
 * from Google
 * usage include topological sorting, scheduling problems, cycle detection in graphs, and solving puzzles with only one solution
 * such as a maze or suduko puzzle
 */
public class GraphSearchingUtil<T extends Comparable>
{

    public GraphSearchingUtil(){};


    //basic recursive DFS to determine if a path exists between two nodes in a graph
    //this is also implemented in the DataStructures module
    public boolean DFS(Node curr, Node target, Set<Node> seen)
    {
        if (curr.value == null)
            return false;

        if (curr.value.equals(target.value))
            return true;

        seen.add(curr);

        List<Node> adjacent = curr.adjacent;
        if (adjacent == null)
            return false;

        for (Node adj: adjacent)
        {
            if (!seen.contains(adj) && DFS(adj, target, seen))
                return true;
        }

        return false;
    }

    public List<Node> findShortestPath(Node start, Node target)
    {
        return findShortestPath(start, target, new HashSet<>());
    }

   //BFS approach to find the shortest path between two nodes if one exists
   private List<Node> findShortestPath(Node start, Node target, Set<Node> seen)
   {
       if (start == null || target == null)
           return new ArrayList<>();

        seen.add(start);

        Map<Node, Node> backTrackMap = new HashMap<>();

        Queue<Node> toTraverse = new LinkedList<>();
        toTraverse.add(start);

        while(!toTraverse.isEmpty())
        {
            Node curr = toTraverse.poll();
            if (curr.value.equals(target.value))
                return getPath(backTrackMap, curr);
            List<Node> adjacent = curr.adjacent;
            if (adjacent == null)
                continue;
            for (Node adj: adjacent)
            {
                if (!seen.contains(adj)) {
                    backTrackMap.put(adj, curr);
                    toTraverse.add(adj);
                    seen.add(adj);
                }
            }
        }
        return new ArrayList<>();
   }

   private List<Node> getPath(Map<Node, Node> backTrackMap, Node startNode)
   {
       List<Node> answer = new LinkedList<>();
       answer.add(0, startNode);
       Node currNode = startNode;
       Node prevNode = backTrackMap.get(currNode);
       while (prevNode != null)
       {
           currNode = prevNode;
           answer.add(0, currNode);
           prevNode = backTrackMap.get(currNode);
       }
       return answer;
   }

    /*
    * utility class for representing a node in the graph
     */
    static class Node<T extends Comparable>
    {
        T value;
        List<Node> adjacent;

        Node(T value, List<Node> adjacent)
        {
            this.value = value;
            this.adjacent = adjacent;
        }
    }
}