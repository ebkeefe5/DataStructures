package  Puzzles.KeyGraphAlgorithms;

/*
There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.

For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
Return true if you can finish all courses. Otherwise, return false.

This is an example of a cycle detection problem as a valid topological sort exists only if
there are no cycles in the graph

*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Courses {

    Set<Integer> SEEN = new HashSet<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        ArrayList<Integer>[] courseGraph = new ArrayList[numCourses];

        for (int i = 0 ; i < numCourses; i ++)
        courseGraph[i] = new ArrayList<>();

        for (int i = 0; i < prerequisites.length; i++)
        {
            int[] prerequisite = prerequisites[i];
            courseGraph[prerequisite[1]].add(prerequisite[0]);
        }

        for (int i = 0; i < courseGraph.length; i++)
        {
            if (!SEEN.contains(i) && isCyclic(i, courseGraph, new HashSet<>()))
                return false;
        }

        return true;
    }

    /*
    * DFS approach to check if there is a cycle that can be found
    * starting from a specific node
    * when we come out of the deep search we must mark nodes as permanently seen
    * as we already know these nodes cannot be contained in a cycle
    * we could also remove them from the visited(in the current deep search)
    * set but that would be less optimal
    */
    private boolean isCyclic(Integer course, List<Integer>[] courseGraph, Set<Integer> visited)
    {
        if (visited.contains(course))
            return true;

        //add the course to visited within the current DFS
        visited.add(course);

        for (Integer followUpCourse: courseGraph[course])
        {
            if (!SEEN.contains(followUpCourse) && isCyclic(followUpCourse, courseGraph, visited))
                return true;
        }

        //back tracking out of the current DFS
        SEEN.add(course);
        //if we were not optimizing with SEEN we would also need to remove course from visited

        return false;
    }
 }
 