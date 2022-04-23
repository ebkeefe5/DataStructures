import java.util.List;
import java.util.Collections;
import java.util.Arrays;

class SortUsingBuiltInSort
{
  public SortUsingBuiltInSort(){};

    public void sortArray(int[] list)
    {
       Arrays.sort(list);
      //for reverse list, reverse in place
      //same algorithm as you would use to reverse a string
      //just do a while loop, and loop backwards and forwards
      //wapping elements until i and j are equal
    }

  public void sortList(List<Integer> list)
  {
    Collections.sort(list, (a, b) -> b - a); //reverse order
  }
  
}