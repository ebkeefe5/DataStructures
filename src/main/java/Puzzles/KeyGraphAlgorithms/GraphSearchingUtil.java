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


    public List<Node> DFS(Node curr, Node target, Set<Node> seen, List<Node> path)
    {
        if (curr.value == null)
            return new ArrayList<>();

        if (curr.value.equals(target.value))
        {
            path.add(curr);
            return path;
        }

        path.add(curr);

        List<Node> adjacent = curr.adjacent;
        if (adjacent == null)
            return new ArrayList<>();

        for (Node adj: adjacent)
        {
            if (!seen.contains(adj) && !DFS(adj, target, seen, path).isEmpty())
                return path;
        }

        seen.add(curr);
        path.remove(curr);

        return new ArrayList<>();
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