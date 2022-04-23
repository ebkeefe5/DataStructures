/*
There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.

For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
Return true if you can finish all courses. Otherwise, return false.
*/

// class Solution {
    
//     Set<Integer> SEEN = new HashSet<>();
    
//     public boolean canFinish(int numCourses, int[][] prerequisites) {
        
//         boolean[] recursiveSeen = new boolean[numCourses];
//         ArrayList<Integer>[] courseGraph = new ArrayList[numCourses]; 
        
//         for (int i = 0; i < numCourses; i++) 
//         {
//             courseGraph[i] = new ArrayList<>();
//         }
        
//         for (int[] prerequisite: prerequisites)
//         {
//             courseGraph[prerequisite[1]].add(prerequisite[0]);          
//         }
        
//         for (int i = 0; i < numCourses; i++)
//         {
//             SEEN.clear();
//             recursiveSeen = new boolean[numCourses];
//             if (isCyclic(i, courseGraph, recursiveSeen))
//                 return false;
//         }
       
//         return true;   
//     }
   
//     private boolean isCyclic(Integer course, List<Integer>[] courseGraph, boolean[] recursiveSeen)
//     {
        
//         //check this other data structure to tell if there is a cycle
//         //we cannot just check if we hit something that is already seen 
        
//         if (recursiveSeen[course])
//             return true;
        
//         if (SEEN.contains(course))
//             return false;
//         SEEN.add(course);
//         recursiveSeen[course] = true;
        
//         for (Integer followUpCourse: courseGraph[course])
//         {
//             if (isCyclic(followUpCourse, courseGraph, recursiveSeen))
//                 return true;
//         }
        
//         recursiveSeen[course] = false;
//         return false;           
//     }  
// }
 