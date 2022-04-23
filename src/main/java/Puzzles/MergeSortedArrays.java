import java.util.ArrayList;

public class MergeSortedArrays
{
  public static ArrayList<Integer> mergeSortedArrays(ArrayList<Integer> sortedListOne, ArrayList<Integer> sortedListTwo)
  {
    ArrayList<Integer> answer = new ArrayList<>();
    int i = 0;
    int j = 0;
    while (i < sortedListOne.size() && j < sortedListTwo.size())
    {
      if (sortedListOne.get(i) < sortedListTwo.get(j))
      {
        answer.add(sortedListOne.get(i));
        i++;
      }
      else
      {
        answer.add(sortedListTwo.get(j));
        j++;
      }       
    }

    if (i < sortedListOne.size())
    {
      answer.addAll(sortedListOne.subList(i, sortedListOne.size()));
    }
    else if (j < sortedListTwo.size())
    {
      answer.addAll(sortedListTwo.subList(j, sortedListTwo.size()));
    }
    return answer;
  }
}