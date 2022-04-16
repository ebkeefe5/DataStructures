import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    //findNemo(List.of("Nemo", "Dory", "Gill"));
    //logTwoFish(List.of("Nemo", "Dory", "Gill"));
    //Pairs.printPairs();
    //Twitter.findTweets();
    //ArraysPlayGround.doStuff();
    //useMyOwnHashMap();
     //useLinkedList();
    // System.out.println("-------------");
    // useDoublyLinkedList();
    Fibonacci f = new Fibonacci();
    System.out.println(f.fibLoop(30));
    System.out.println(f.fibRec(30));
    //useQueue();
    //useTree();
    // Factorial factorial = new Factorial();
    // System.out.println(factorial.factorialR(5));
    // System.out.println(factorial.factorialL(5));
    // ReverseString r = new ReverseString();
    // System.out.println(r.reverse("whatTheHeck"));
    //useSortingPlayground();
   
  }

  private static void useSortingPlayground()
  {
    SortingPlayground p = new SortingPlayground();
    List<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(3);
    list.add(65);
    list.add(7);
    p.bubbleSort(Arrays.asList(2, 3, 65, 7, 1, 3, 4, 2, 1, 10));
    p.selectionSort(Arrays.asList(2, 3, 65, 7, 1, 3, 4, 2, 1, 10));
    p.insertionSort(Arrays.asList(2, 3, 65, 7, 1, 3, 4, 2, 1, 10));
    System.out.println(p.mergeSort(Arrays.asList(2, 3, 65, 7, 1, 3, 4, 2, 1, 10)));
  }

  private static void useTree()
  {
    BinarySearchTree<Integer> tree = new BinarySearchTree<>();
    tree.insert(9);
    tree.insert(4);
    tree.insert(6);
    tree.insert(20);
    tree.insert(170);
    tree.insert(15);
    tree.insert(1);
    //////////9 
    /////4       20
    ///1   6  15    170
    tree.printInOrder();
    tree.printPreOrder();
    tree.printPostOrder();
    tree.printLevelOrder();
    //System.out.println(tree.lookup(170));
    //System.out.println(tree.lookup(200));
    
  }

  private static void useQueue()
  {
    MyQueue<Integer> queue = new MyQueue<>();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    System.out.println(queue.peek());
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    queue.enqueue(5);
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
  }

  private static void useStack()
  {
    MyStack<Integer> stack = new MyStack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    System.out.println(stack.peek());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    stack.push(5);
    System.out.println(stack.pop());
    System.out.println(stack.pop());
  }
  
   static void useDoublyLinkedList()
  {
    DoubleLinkedListIml<String> iml = new DoubleLinkedListIml<>();
    iml.insert("chicken", 0);
    iml.append("chicken");
    iml.append("fish");
    iml.prepend("turkey");
    iml.prepend("bark");
    iml.insert("shark", 2);
    iml.insert("lobster", 1000);
    iml.insert("elephant", 2);
    iml.insert("bacon", 0);
    iml.remove(3);
    iml.remove(0);
    iml.remove(100);
    System.out.println(iml);
  }

  static void useLinkedList()
  {
    LinkedListIml<String> iml = new LinkedListIml<>();
    iml.insert("chicken", 0);
    iml.append("chicken");
    iml.append("fish");
    iml.prepend("turkey");
    iml.prepend("bark");
    iml.insert("shark", 2);
    iml.insert("lobster", 1000);
    iml.insert("elephant", 2);
    iml.insert("bacon", 0);
    iml.remove(3);
    iml.remove(0);
    iml.remove(100);
     System.out.println(iml);
    iml.reverse();
    System.out.println(iml);
  }

  static void useMyOwnHashMap()
  {
    MyStringStringHashTable tb = new MyStringStringHashTable(5);

    tb.put("chicken", "turkey");
    tb.put("frog", "dog");
    tb.put("ark", "bark");
    tb.put("shark", "tank");
    tb.put("cowboy", "boots");
    tb.put("what", "dark");
    System.out.println(tb.get("what"));
    //tb.remove("cowboy");
    System.out.println(tb.get("cowboy"));
    System.out.println(tb.keys());
  }

  static void findNemo(List<String> fish) //O(n) operation
  {
    for (String item: fish)
    {
      if (item.equals("Nemo"))
        System.out.println("found Nemo");
    }
  }

  static void logTwoFish(List<String> fish) //O(2) operation
  {
    System.out.println(fish.get(0)); //O(1)
    System.out.println(fish.get(1)); //O(1)
  }
}