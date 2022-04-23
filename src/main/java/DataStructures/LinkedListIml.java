package DataStructures;

//prepend (append to beginning) O(1)
//append (append to end) O(1)
//insert O(n) to insert at specific position
//delete O(n) to delete at a specifc position
//lookup O(n)

//compare to an arraylist, it's a lot easier to prepend.
//for an arraylist, you have to shift the entire array over
//so it's O(n) for a linked list, you just have to
//update the head, it's O(1)

//deletion and inserts tend to also be better for linked
//lists. worst case is O(n), but it's dependent on how far 
//in the linked list you have to insert or delete at
//whereas an arraylist is always n

//the thing that's better about a list is lookup. 
//you know the index, so it's a simple lookup. for a linked
//list you have to loop through the whole list to get the element

class LinkedListIml<T>
{
  private Node<T> head;
  private Node<T> tail;
  private int length;
  
  public LinkedListIml()
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
    
    Node<T> previousNode = traverseToIndex(index - 1);
    Node<T> toInsert = new Node<>(value);
    Node<T> nextNode = previousNode.next;
    previousNode.next = toInsert;
    toInsert.next = nextNode;   
    length++;
  }

  private Node<T> traverseToIndex(int index)
  {
    Node<T> curr = head;
    for (int i = 0; i < index ; i++)
    {
      curr = curr.next;
    }
    return curr;
  }

  public void prepend(T value) //O(1)
  {
    Node<T> node = new Node<>(value);
    if (head == null)
    {
      this.head = node;
      this.tail = node;
    }
    else
    {
      node.next = head;
      head = node;
    }
    length++;
  }

  public void remove(int index) 
  {
    if (this.length == 0)
    {
      //log some sort of warning or throw an exception
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
      
      Node<T> beforeNode = traverseToIndex(this.length - 2);
      beforeNode.next = null;
      tail = beforeNode;
      length--;
      return;
    }
    else if (index == 0)
    {
      head = head.next;
      length--;
      return;
    }
    Node<T> beforeNode = traverseToIndex(index - 1);
    Node<T> removeNode = beforeNode.next;
    beforeNode.next = removeNode.next; 
    length--;
  }

  public void append(T value) //O(1)
  {
    Node<T> node = new Node<>(value);
    if (tail == null)
    {
      this.head = node;
      this.tail = node;
    }
    else
    {
      tail.next = node;
      tail = node;      
    }
    length++;
  }

  public void reverse()
  {
    //reverse the linked list

    if (head == null || this.length == 1)
      return;
    Node<T> first = head;
    Node<T> second = head.next;
    
    while(second != null)
    {
      //a -> b -> c ->d
      //a -><-b c -> d
      //a -><-b <-c -> d
      //a -><-b <-c <- d
      Node<T> temp = second.next;
      second.next = first;
      first = second;
      second = temp;     
    }

     //a -><-b <-c <- d
    this.head.next = null;
    //a <-b <-c <-d
    head = first;
    //d -> c -> b ->a
  }

  @Override
  public String toString()
  {
    String toReturn = "";
    Node curr = head;
    while(curr != null)
    {
      toReturn += curr.value.toString() + " ";
      curr = curr.next;
    }
    return toReturn;
  }
}

class Node<T>
{
  Node<T> next;
  T value;
  
  public Node(T value)
  {
    this.value = value;  
    this.next = null;
  }
}