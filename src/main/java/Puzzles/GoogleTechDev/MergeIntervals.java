package Puzzles.GoogleTechDev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MergeIntervals {
     public int[][] merge(int[][] intervals) {
         if (intervals.length < 2)
             return intervals;

         Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

       List<int[]> answer = new ArrayList<>();
       answer.add(intervals[0]);
       for (int i = 1; i < intervals.length; i++)
       {
           int[] prev = answer.get(answer.size() - 1);
           int[] curr = intervals[i];
          
           if (prev[1] >=  curr[0])
           {
               int end = Math.max(prev[1], curr[1]);
               int[] interval = {prev[0], end};
               answer.set(answer.size() - 1, interval);
           }
           else
               answer.add(curr);
       }

       return answer.toArray(new int[answer.size()][]);
     }
 }
