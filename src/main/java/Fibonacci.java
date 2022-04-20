package src.main.java;//Given a number n return the index of the Fibonacci
//sequence where the number is

//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
//the pattern of the sequence is that each number
//is the sum of the two previous numbers

import java.util.Map;
import java.util.HashMap;

class Fibonacci
{

  Map<Integer, Integer> cache = new HashMap<>();
  
  public Fibonacci(){};
  
  public int fibRec(int index) //O(2^n)
  {
    Integer val = cache.get(index);
    if (val != null)
      return val;
    
    if (index < 2)
    {
      return index;
    }
    
    cache.put(index, fibRec(index - 1) + fibRec(index - 2));
    return cache.get(index);
  } 

  public int fibLoop(int index) //O(n)
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