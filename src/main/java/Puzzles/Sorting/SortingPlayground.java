package Puzzles.Sorting;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

class SortingPlayground
{

  public SortingPlayground()
  {
    
  }

  public List<Integer> sort(List<Integer> list)
  {
    Collections.sort(list);

    return list;
  }

  public List<Integer> bubbleSort(List<Integer> list)
  {
    for (int i = 0; i < list.size(); i++)
    {
      for (int j = 0; j < list.size() - i - 1; j++)
      {
        if (list.get(j) > list.get(j+1))
        {
          int temp = list.get(j+1);
          list.set(j+1, list.get(j));
          list.set(j ,temp);       
        }
      }
    }
    return list;
  }

  public List<Integer> selectionSort(List<Integer> list)
  {
     for (int i = 0; i < list.size(); i++)
    {
      int minIndex = i;
      int temp = list.get(i);
      for (int j = i + 1; j < list.size(); j++)
      {
        if (list.get(j) < list.get(minIndex))
          minIndex = j;
      }
      list.set(i, list.get(minIndex));
      list.set(minIndex, temp);    
      
    }
    return list;
  }

  //implemeneted as bubble sort backwards
  public List<Integer> insertionSort(List<Integer> list)
  {
    for (int i = 0; i < list.size(); i++)
    {
      for (int j = i - 1; j >= 0; j--)
      {
        if (list.get(j) > list.get(j + 1))
        {
            //swap
            int temp = list.get(j);
            list.set(j, list.get(j + 1));
            list.set(j + 1, temp);
        }   
      }  
    }
    return list;
  }

  public List<Integer> mergeSort(List<Integer> list)
  {
    if (list.size() == 1)
    {
      return list;
    }

    return merge(mergeSort(list.subList(0, list.size()/2)),
                mergeSort(list.subList(list.size()/2, list.size())));
  }

  private List<Integer> merge(List<Integer> left, List<Integer> right)
  {
    List<Integer> answer = new ArrayList<>();
    int leftPointer = 0;
    int rightPointer = 0;
    while (leftPointer < left.size() && rightPointer < right.size())
      {
        if (left.get(leftPointer) < right.get(rightPointer))
        {
          answer.add(left.get(leftPointer));
          leftPointer++;
        }
        else
        {
          answer.add(right.get(rightPointer));
          rightPointer++;
        }
      }
    while (leftPointer < left.size())
      {
        answer.add(left.get(leftPointer));
          leftPointer++;
      }
    while (rightPointer < right.size())
      {
       answer.add(right.get(rightPointer));
          rightPointer++;
      }
    return answer;
  }
}