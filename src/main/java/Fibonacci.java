import java.util.Map;
import java.util.HashMap;

/*
Given an index n return the Fibonacci number
at that index in the sequence

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
the pattern of the sequence is that each number
is the sum of the two previous numbers
*/

class Fibonacci
{

  Map<Integer, Integer> cache = new HashMap<>();
  
  public Fibonacci(){};
  
  public int memoizedRecursivefibRec(int index) //O(2^n)
  {
    Integer val = cache.get(index);
    if (val != null)
      return val;
    
    if (index < 2)
    {
      return index;
    }
    
    cache.put(index, memoizedRecursivefibRec(index - 1) + memoizedRecursivefibRec(index - 2));
    return cache.get(index);
  } 

  public int iterativeFib(int index) //O(n)
  {
    //index 2 -> 1
    //index 3 -> 2
    if (index < 2)
    {
      return index;
    }
    int answer = 1;
    int previous = 0;
    for (int i = 1; i < index; i ++)
    {
      int temp = answer;
      answer += previous;
      previous = temp;
    }
    return answer;
  }   
}