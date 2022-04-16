import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysPlayGround
{
  public static void doStuff()
  {
    List<Integer> integerList = new ArrayList(List.of(1, 2, 3, 4));

    int second  = integerList.get(1); //O(1)

    integerList.add(5); //probably O(1) but may be O(n) good for adding at the end of array

    integerList.remove(2); //O(n)

    integerList.add(1, 100); //O(n) 

    integerList.add(0, 200); //O(n) bad for adding to the beginning of the array

    System.out.println(integerList);
  }

}