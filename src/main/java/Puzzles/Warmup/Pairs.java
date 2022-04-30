package Puzzles.Warmup;

public class Pairs{

  private static int[] numbers = {1, 2, 3, 4, 5};

  public static void printPairs() { //O(n^2)
    
    for (int i = 0; i < numbers.length; i++)
    {
      for (int j = 0; j < numbers.length; j++)
      {
        System.out.println(numbers[i] + " " + numbers[j]);
      }
    }
  }
}
