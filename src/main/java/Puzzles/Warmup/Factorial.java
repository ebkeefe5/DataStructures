package Puzzles.Warmup;

class Factorial
{
  public int factorialL(int num)
  {
    int fac = 1;
    for (int i = num; i >=2; i--)
    {
      fac = fac * i;
    }
    return fac;
  }
  
  public int factorialR(int num)
  {
    if (num == 1)
      return num;
    return num * factorialR(num-1);      
  }
}