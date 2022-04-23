/*
In this problem, a tree is an undirected graph that is connected and has no cycles.

You are given a graph that started as a tree with n nodes labeled from 1 to n, with one additional edge added. The added edge has two different vertices chosen from 1 to n, and was not an edge that already existed. The graph is represented as an array edges of length n where edges[i] = [ai, bi] indicates that there is an edge between nodes ai and bi in the graph.

Return an edge that can be removed so that the resulting graph is a tree of n nodes. If there are multiple answers, return the answer that occurs last in the input.
*/

// class Solution {
    
//     Set<Integer> seen = new HashSet();
//     int MAX_EDGE_VAL = 1000;
    
//     public int[] findRedundantConnection(int[][] edges) {
//         ArrayList<Integer>[] graph = new ArrayList[MAX_EDGE_VAL + 1];
//         for (int i = 0; i <= MAX_EDGE_VAL; i++) {
//             graph[i] = new ArrayList();
//         }
        
        
//         for (int[] edge: edges)
//         {
//             seen.clear();
//             if (!graph[edge[0]].isEmpty()
//                 && !graph[edge[1]].isEmpty()
//                 && DFS(edge[0], edge[1], graph))
//             {
//                  return edge;
//             }  
//             graph[edge[0]].add(edge[1]);
//             graph[edge[1]].add(edge[0]);    
//         }
        
//         return new int[0];
//     }
    
//     private boolean DFS(int source, int target, ArrayList<Integer>[] graph)
//     {
//         if (seen.contains(source))
//             return false;       
//         seen.add(source);
//         if (source == target) return true;
//         for (Integer next: graph[source])
//         {
//             if (DFS(next, target, graph))
//                 return true;
//         }                 
//         return false;
//     }       
// }