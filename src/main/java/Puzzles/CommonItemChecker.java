//Given two arrays create a function that returns whether the arrays have any common items in between them

import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class CommonItemChecker<T extends Comparable<T>>
{
  /*
  * @Param listOne a list of comparables
  * @Param listTwo a list of comparables
  * @Return returns a boolean represeting whether the lists have any items in common
  */
  public static<T> boolean hasCommonItems(List<T> listOne, List<T> listTwo)
  {
    Set<T> items = new HashSet<>();
    for (T item: listOne)
    {
      items.add(item);
    }
    for (T item: listTwo)
    {
      if (items.contains(item))
        return true;
    }
    return false;
  }
}