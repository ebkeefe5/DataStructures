//Data Structures
//Arrays          Trees
//Stacks          Tries
//Queues          Graphs
//Linked Lists    HashTables

//Algorithms
//Sorting
//Dynamic Programming
//BFS + DFS (Searching)
//Recursion

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    //runMaximumSubArrayFinder();
    SortUsingBuiltInSort sorter = new SortUsingBuiltInSort();
    List<Integer> list = Arrays.asList(4, 1, 5, 6, 9, 10);
    int[] array = {5, 3, 10, 9, 10};
    sorter.sortList(list);
    sorter.sortArray(array);
    System.out.println(list);
    for (int element: array)
      {
        System.out.println(element);
      }
    
  
  }

  private static void runMaximumSubArrayFinder()
  {
      int[] list = {-2,1,-3,4,-1,2,1,-5,4};
      System.out.println(MaximumSubarray.findMaximumSubArray(list));

      int[] listTwo = {1};
      System.out.println(MaximumSubarray.findMaximumSubArray(listTwo));

      int[] listThree = {5,4,-1,7,8};
      System.out.println(MaximumSubarray.findMaximumSubArray(listThree));

      int[] listFour = {4,-4,-1,7,8};
      System.out.println(MaximumSubarray.findMaximumSubArray(listFour));

      int[] listFive = {4,-4,-1,-7,-8};
      System.out.println(MaximumSubarray.findMaximumSubArray(listFive));
  }

  private static void runCommonItemChecker()
  {
    System.out.println(CommonItemChecker.hasCommonItems(List.of('a', 'b', 'c', 'y'), List.of('z', 'y', 'i')));

    System.out.println(CommonItemChecker.hasCommonItems(List.of('a', 'b', 'c', 'y'), List.of('z', 'x', 'i')));

  }
  
  private static void runPairSumFinder()
  {
    System.out.println(PairSumFinder.pairSumSortedList(List.of(1, 2, 3, 9), 8));
    System.out.println(PairSumFinder.pairSumSortedList(List.of(1, 2, 4, 4), 8));

    System.out.println(PairSumFinder.pairSumSortedList(List.of(1, 10, 2, 3), 8));
    System.out.println(PairSumFinder.pairSumSortedList(List.of(4, 2, 1, 4), 8));
    System.out.println(PairSumFinder.pairSumSortedList(List.of(99, 2, 3, 1), 100));
  }
}