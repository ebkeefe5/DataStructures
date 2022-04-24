package  Puzzles.KeyGraphAlgorithms;

/*
There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.

For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
Return true if you can finish all courses. Otherwise, return false.

This is an example of a cycle detection problem
to determine if a valid topological sort exists on the graph

if we know a toplogical sorting exists we can then find the topological ordering fairly easily
It would be nice if I could do this all in one step but I am not sure how to at present moment

*/

import java.util.*;

class Courses {

    Set<Integer> SEEN = new HashSet<>();

    public List<Integer> getCourseList(int numCourses, int[][] prerequisites) {

        ArrayList<Integer>[] courseGraph = new ArrayList[numCourses];

        //part 1 build course graph
        for (int i = 0 ; i < numCourses; i ++)
        courseGraph[i] = new ArrayList<>();

        for (int i = 0; i < prerequisites.length; i++)
        {
            int[] prerequisite = prerequisites[i];
            courseGraph[prerequisite[1]].add(prerequisite[0]);
        }

        //part 2 detect if there is a cycle, if there is stop early and return an empty list
        for (int i = 0; i < courseGraph.length; i++)
        {
            if (!SEEN.contains(i) && isCyclic(i, courseGraph, new HashSet<>()))
                throw new IllegalArgumentException("No valid ordering");
        }

        //part 3 if there is no cycle let's find the toplogical sorting using DFS and a stack
        SEEN.clear();
        Stack<Integer> courseStack = new Stack<>();
        for (int i = 0; i < numCourses; i++)
        {
            if (!SEEN.contains(i))
            {
                toplogicalSortUtil(i, courseGraph, courseStack);
            }
        }

        List<Integer> answer = new ArrayList<>();
        while(!courseStack.isEmpty())
        {
            answer.add(courseStack.pop());
        }
        return answer;
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

    //IMPORTANT
    //this function assumes that the graph has a valid topological sorting
    private void toplogicalSortUtil(Integer course, List<Integer>[] courseGraph, Stack<Integer> courses)
    {
        SEEN.add(course);

        for (Integer followUpCourse: courseGraph[course])
        {
            if (!SEEN.contains(followUpCourse))
                toplogicalSortUtil(followUpCourse, courseGraph, courses);
        }

        //back tracking out of the current DFS
        courses.push(course);
    }
 }
 