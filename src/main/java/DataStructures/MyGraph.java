package DataStructures;

import java.util.*;

class MyGraph<T extends Comparable<T>>
{
  private int numberOfNodes;
  private Map<T, List<T>> adjacent;
  
  public MyGraph()
  {
    this.numberOfNodes = 0;
    this.adjacent = new HashMap<>();
  }

  public void addEdge(T node1, T node2)
  {
    if (this.adjacent.get(node1) == null)
      this.adjacent.put(node1, new ArrayList<>(Arrays.asList(node2)));
    else
      this.adjacent.get(node1).add(node2);
    if (this.adjacent.get(node2) == null)
      this.adjacent.put(node2, new ArrayList<>(Arrays.asList(node1)));
    else
      this.adjacent.get(node2).add(node1);
  }

  T DFS(T currNode, T targetNode)
  {
    return DFS(currNode, targetNode, new HashSet<T>());
  }

  private T DFS(T currNode, T targetNode, Set<T> seen)
  {
    if (currNode == null)
      return null;
    if (currNode.equals(targetNode))
      return currNode;
    seen.add(currNode);
    List<T> adjacentNodes = adjacent.get(currNode);
    if (adjacentNodes == null)
      adjacentNodes = new ArrayList<>();
    for (T adjNode: adjacentNodes)
    {
      if (!seen.contains(adjNode))
      {
        T search = DFS(adjNode, targetNode, seen);
        if (search != null)
          return  search;
      }
    }   
    return null;
  }

  List<T> BFS(T currNode, T targetNode)
  {
    return BFS(currNode, targetNode, new HashSet<T>());
  }

  //more common BFS implementation using Queue
  //this version returns the list of nodes in one of the shortest path from
  //the start node to the end node if one exists
  //otherwise it will just return null
  private List<T> BFS(T startNode, T targetNode, Set<T> seen)
  {
    HashMap<T, T> backTrackMap = new HashMap<>();
    if (startNode == null)
      return null;
    seen.add(startNode);
    Queue<T> toTraverse = new LinkedList<>();
    toTraverse.add(startNode);
    while(!toTraverse.isEmpty())
    {
      T curr = toTraverse.poll();
      if (curr.equals(targetNode))
        return getPath(backTrackMap, targetNode, startNode);
      List<T> adjacentNodes = adjacent.get(curr);

      for (T adjacent: adjacentNodes)
      {
        if (!seen.contains(adjacent))
        {
          seen.add(adjacent);
          toTraverse.add(adjacent);
          backTrackMap.put(adjacent, curr);
        }
      }
    }
    return null;
  }

  private List<T> getPath(Map<T, T> backTrackMap, T targetNode, T startNode)
  {
    List<T> answer = new ArrayList<>();
    answer.add(targetNode);
    T curr = backTrackMap.get(targetNode);
    while(curr != startNode)
    {
      answer.add(curr);
      curr = backTrackMap.get(curr);
    }
    if (startNode != targetNode)
      answer.add(startNode);
    return answer;

  }
}