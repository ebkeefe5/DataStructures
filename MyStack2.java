import java.util.List;
import java.util.ArrayList;

//first in, last out
//plates stacked on top of each other
//lookup O(n) shouldn't be used
//pop O(1) take out the last item
//push O(1) push an item into the stack
//peek O(1) look at the top item of the stack

//implementation of a stack using and array
//array is probably better
class MyStack2<T>
{
  List<T> data;
  
  MyStack2()
  {
    data = new ArrayList<>();
  }

  public T pop()
  {
    if (data.size() == 0)
      return null;

    return data.remove(data.size() - 1);
  }

  public T peek()
  {
    if (data.size() == 0)
      return null;
    return data.get(data.size() - 1);
  }

  public void push(T value)
  {
    data.add(value);
  }  
}

