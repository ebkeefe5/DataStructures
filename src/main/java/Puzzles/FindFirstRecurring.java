import java.util.Set;
import java.util.HashSet;
import java.util.List;

class FindFirstRecurring
{
  public FindFirstRecurring(){}
  
  public Integer findFirstRecurring(List<Integer> list)
  {
    Set<Integer> integers = new HashSet<>();
    for (Integer value: list)
    {
      if (integers.contains(value))
        return value;
      integers.add(value);
    }
    return null;
  }

  //brute force solution
  //loop over the list twice
  //inside the nested portion, if there is a match, return the value
//this is O(n^2) time complextiy

  //slightly better
  //copy the list and sort it
  //loop through the list, checking for how many occurences there are in the copied sorted list, using binary search
  //as soon as we find a character that repeats more than once return it
}