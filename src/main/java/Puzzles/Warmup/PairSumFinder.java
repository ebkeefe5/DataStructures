package Puzzles.Warmup;//[1, 2, 3, 9] sum 8
//[1, 2, 4, 4] sum 8
//return true if the list contains a pair that sums to sum
//return false otherwise

//naive brute force solution is to do nested for loop 
//that loops through both of the lists

//optimal solution is different depending on if the lists are sorted

//if the lists are sorted, the optimal solution is a counter based solution
//if not then you can use a hashset to keep track of the potential matches to look for

import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class PairSumFinder
{
  /*
  * @param list sorted list of Integers
  * @param sum an Integer respresenting a target sum to check for 
  * @Return a boolean representing whether listOne contains a pair of Integers summing to sum
  */
  public static boolean pairSumSortedList(List<Integer> list, Integer sum)
  {
    int beginCounter = 0;
    int endCounter = list.size() - 1;
    while (beginCounter < endCounter)
    {
      int pairSum = list.get(beginCounter) + list.get(endCounter); 
      if (pairSum == sum)
        return true;
      if (pairSum < sum)
        beginCounter ++;
      else
        endCounter--;
    }
    return false;
  }

  /*
  * @param list list of Integers
  * @param sum an Integer respresenting a target sum to check for 
  * @Return a boolean representing whether listOne contains a pair of Integers summing to sum
  */
  public static boolean pairSum(List<Integer> list, Integer sum)
  {
    Set<Integer> potentialMatches = new HashSet<>();
    for (Integer entry: list)
    {
      if (potentialMatches.contains(entry))
        return true;
      else
        potentialMatches.add(sum - entry);
    }
    return false;
  }
}
