//Write two functions that returns the factorial
//of any number. 
//one should be recursive and one should just use
//a for loop
class Factorial
{

  public int factorialL(int num)
  {
    int fac = 1;
    for (int i = num; i >=2; i--)
    {
      fac = fac* i;
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