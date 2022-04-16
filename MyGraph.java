import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

class MyGraph<T extends Comparable<T>>
{
  private int numberOfNodes;
  private Map<T, List<T>> adjacent;
  
  public MyGraph()
  {
    this.numberOfNodes = 0;
    this.adjacent = new HashMap<>();
  }

  public void addVertex(T node)
  {
    this.adjacent.put(node, new ArrayList<>());
    this.numberOfNodes++;
  }

  public void addEdge(T node1, T node2)
  {
    this.adjacent.get(node1).add(node2);
    this.adjacent.get(node2).add(node1);
  }  

  private void DFS(T node, Set<T> seen)
  {
    List<T> adjacentNodes = adjacent.get(node);
    if (adjacentNodes == null)
      adjacentNodes = new ArrayList<>();
    for (T adjNode: adjacentNodes)
    {
      if (!seen.contains(adjNode))
      {
        seen.add(adjNode);
        DFS(adjNode, seen);
      }
    }   
    System.out.println(node);
  }
}