package src.main.java;

import java.util.List;
import java.util.ArrayList;

//An array is one of the most basic java data structures
//great for lookup by index and keeping items in similar area in memory
//generally good for inserting at last index although this could
//technically take O(n) time
//bad for inserting at the begining of the list which a linked list is better for

//the following other operations are O(n)
//search by value
//insert at a given index
//remove by value
//remove by index

public class ArraysPlayGround
{
   public static void createArrayList()
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

