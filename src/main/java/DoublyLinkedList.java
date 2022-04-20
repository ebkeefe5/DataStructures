//really similar to singularly linked lists
//just requires a little extra memory and complexity to implement
//makes it faster to insert and delete if we are doing it towards
//the end because we can loop backwards

class DoubleLinkedListIml<T>
{
  private DoubleNode<T> head;
  private DoubleNode<T> tail;
  private int length;
  
  public DoubleLinkedListIml()
  {
    this.head = null;
    this.tail = null;
    this.length = 0;
  }

  public void insert(T value, int index) //O(n) but better than arraylist
  {
    if (index >= this.length)
    {
      this.append(value);
      return;
    }
      
    if (index == 0)
    {
      this.prepend(value); 
      return;
    }
    
    DoubleNode<T> previousNode = traverseToIndex(index - 1);
    DoubleNode<T> toInsert = new DoubleNode<>(value);
    DoubleNode<T> nextNode = previousNode.next;
    previousNode.next = toInsert;
    toInsert.prev = previousNode;
    toInsert.next = nextNode;  
    nextNode.prev = toInsert;
    length++;
  }

  private DoubleNode<T> traverseToIndex(int index)
  {
    DoubleNode<T> curr = head;
    for (int i = 0; i < index ; i++)
    {
      curr = curr.next;
    }
    return curr;
  }

  public void prepend(T value) //O(1)
  {
    DoubleNode<T> node = new DoubleNode<>(value);
    if (head == null)
    {
      this.head = node;
      this.tail = node;
    }
    else
    {
      node.next = head;
      head.prev = node;
      head = node;
    }
    length++;
  }

  public void remove(int index) 
  {
    if (this.length == 0)
    {
      //log exception
      return;
    }
    //special case for size 1 where we remove the first element
    else if (index == 0 && this.length == 1)
    {
      head = null;
      tail = null;
      length--;
      return;
    }

    //removing at or past the last element in the linked list
    //ie a -> b -> c removing at index 2
    else if (index >= this.length-1 )
    {
      
      DoubleNode<T> beforeNode = traverseToIndex(this.length - 2);
      beforeNode.next = null;
      tail = beforeNode;
      length--;
      return;
    }
    else if (index == 0)
    {
      head.next.prev = null;
      head = head.next;
      length--;
      return;
    }
    DoubleNode<T> beforeNode = traverseToIndex(index - 1);
    DoubleNode<T> removeNode = beforeNode.next;
    removeNode.next.prev = beforeNode;
    beforeNode.next = removeNode.next;
    length--;
  }

  public void append(T value) //O(1)
  {
    DoubleNode<T> node = new DoubleNode<>(value);
    if (tail == null)
    {
      this.head = node;
      this.tail = node;
    }
    else
    {
      node.prev = tail;
      tail.next = node;      
      tail = node;     
    }
    length++;
  }

  @Override
  public String toString()
  {
    String toReturnPartOne = "";
    String toReturnPartTwo = "";
    
    DoubleNode curr = head;
    while(curr != null)
    {
      toReturnPartOne += 
        curr.value.toString() + " ";
      toReturnPartTwo += 
        curr.toString() + " ";
      curr = curr.next;
    }
    return toReturnPartOne + "\n" + "\n" + toReturnPartTwo;
  }
}

class DoubleNode<T>
{
  DoubleNode<T> next;
  DoubleNode<T> prev;
  T value;
  
  public DoubleNode(T value)
  {
    this.value = value;  
    this.next = null;
    this.prev = null;
  }

  @Override
  public String toString()
  {
    String next = this.next == null ? "null" : this.next.value.toString();
    String prev = this.prev == null ? "null" : this.prev.value.toString();
    return "prev: " + prev + " this: " + this.value.toString() + " next: " + next + "\n";   
  }
}