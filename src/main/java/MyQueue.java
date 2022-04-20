//first in, first out
//the first person in, get's to be the first person out
//visualize like a line
//lookup O(n) shouldn't really be used
//enqueue O(1) put into the queue can also use push
//dequeue O(1) take someone out of the queue can also use pop
//peek O(1) look at the first person in line in the queue

class MyQueue<T>
{
  QueueNode<T> first;
  QueueNode<T> last;
  int length;
  
  MyQueue()
  {
    first = null;
    last = null;
    length = 0;
  }

  public T dequeue()
  {
    if (this.length == 0)
      return null;

    if (this.first == this.last)
      this.last = null;

    T answer = first.value;
    first = first.next;
    length--;
    return answer; 
  }

  public T peek()
  {
    if (this.length == 0)
    {
      return null;
    }

    return first.value;
    //peek at the head
  }

  public void enqueue(T value)
  {
    //instead of pushing to the head like in the stack
    //push onto the end of the list
    QueueNode<T> node = new QueueNode<>(value);
    if (this.length == 0)
    {
      first = node;
      last = node;
    }
    else
    {
      this.last.next = node;
      this.last = node;
    }
    length++;
  }  
}

class QueueNode<T>
{
  T value;
  QueueNode<T> next;
  
  QueueNode(T value)
  {
    this.value = value;
    this.next = null;
  }
}