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
        return DFS(adjNode, targetNode, seen);
      }
    }   
    return null;
  }

  T BFS(T currNode, T targetNode)
  {
    return BFS(currNode, targetNode, new HashSet<T>());
  }

  //more common BFS implementation using Queue
  private T BFS(T startNode, T targetNode, Set<T> seen)
  {
    if (startNode == null)
      return null;
    Queue<T> toTraverse = new LinkedList<>();
    toTraverse.add(startNode);
    while(!toTraverse.isEmpty())
    {
      T curr = toTraverse.poll();
      if (seen.contains(curr))
        continue;
      if (curr.equals(targetNode))
        return curr;
      seen.add(curr);
      List<T> adjacentNodes = adjacent.get(curr);
      if (adjacentNodes != null)
        toTraverse.addAll(adjacentNodes);
    }
    return null;
  }
}