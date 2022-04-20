package src.main.java;//first in, last out
//plates stacked on top of each other
//lookup O(n) shouldn't be used
//pop O(1) take out the last item
//push O(1) push an item into the stack
//peek O(1) look at the top item of the stack

//implementation of a stack using a linked list
//array is probably better
class MyStack<T>
{
  StackNode<T> top;
  StackNode<T> bottom;
  int length;
  
  MyStack()
  {
    top = null;
    bottom = null;
    length = 0;
  }

  public T pop()
  {
    if (this.length == 0)
      return null;

    StackNode<T> answer = top;
    top = top.next;
    if (top == null)
      bottom = null;
    this.length--;
    return answer.value;
  }

  public T peek()
  {
    if (this.length > 0)
      return this.top.value;
    return null;
  }

  public void push(T value)
  {
    StackNode<T> newNode = new StackNode<>(value);
    if (length == 0)
    {
      top = newNode;
      bottom = newNode;
    }
    else
    {
      StackNode<T> temp = top;
      top = newNode;
      top.next = temp;
    }
    this.length++;
  }  
}

class StackNode<T>
{
  T value;
  StackNode<T> next;
  
  StackNode(T value)
  {
    this.value = value;
    this.next = null;
  }
}