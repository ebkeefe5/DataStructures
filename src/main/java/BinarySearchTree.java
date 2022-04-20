package src.main.java;

import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

class BinarySearchTree<T extends Comparable<T>>
{
    private TreeNode<T> root;
  
    public BinarySearchTree()
    {
      this.root = null;
    }

    public void insert(T value)
    {
      //System.out.println(root.value);
      TreeNode<T> toInsert = new TreeNode<>(value);
      TreeNode<T> curr = root;
      TreeNode<T> prev = root;
      if (curr == null)
      {
        root = toInsert;      
        return;
      }
      while(true) //while true works too
      {
        prev = curr;
        if (value.compareTo(curr.value) < 0)
        {
          if (curr.left == null)
          {
            curr.left = toInsert;
            return;
          }
          curr = curr.left;  
        }
          
        else
        {
          if (curr.right == null)
          {
            curr.right = toInsert;
            return;
          }
          curr = curr.right;
        }          
      }      
    }

    public boolean lookup(T value)
    {
      TreeNode<T> curr = root;
      while(curr != null)
      {
        if (curr.value.equals(value))
          return true;
        else if (value.compareTo(curr.value) < 0)
          curr = curr.left;
        else
          curr = curr.right;  
      }
      return false;
    }

  public void printInOrder()
  {
    System.out.println(inOrderTraversal(root, new ArrayList<>()));  
  }

  private List<T> inOrderTraversal(TreeNode<T> node, List<T> list)
  {
    if (node.left != null)
    {
      inOrderTraversal(node.left, list);
    }
    list.add(node.value);
    if (node.right != null)
    {
      inOrderTraversal(node.right, list);
    }
    return list;
  }

  public void printPreOrder() //root, left, right
  {
    System.out.println(preOrderTraversal(root, new ArrayList<>()));
  }

   private List<T> preOrderTraversal(TreeNode<T> node, List<T> list)
  {
    list.add(node.value);
    if (node.left != null)
    {
      preOrderTraversal(node.left, list);
    }
    if (node.right != null)
    {
      preOrderTraversal(node.right, list);
    }
    return list;
  }

  public void printPostOrder()
  {
    System.out.println(traversePostOrder(root, new ArrayList<>()));
  }

  private List<T> traversePostOrder(TreeNode<T> node, List<T> list)
  {
    if (node.left != null)
      traversePostOrder(node.left, list);
    if (node.right != null)
      traversePostOrder(node.right, list);
    list.add(node.value);
    return list;
  }

  public void printLevelOrder()
  {
    System.out.println(traverseLevelOrder());
  }

  //level order traversal
  private List<T> traverseLevelOrder()
  {
    Queue<TreeNode<T>> traverse = new LinkedList<>();
    List<T> answer = new ArrayList<>();
    traverse.add(root);
    while(!traverse.isEmpty())
    {
      TreeNode<T> curr = traverse.remove();
      answer.add(curr.value);
      if (curr.left != null)
        traverse.add(curr.left);
      if (curr.right != null)
        traverse.add(curr.right);
    }
    return answer;
  }
}

////////9
  ///4     20
  //1 6   15 170

  
 //Depth First Traversals: 
//(a) Inorder (Left, Root, Right) : 1, 4, 6, 9, 15, 20, 170
  //intuitively, this should print a binary tree in order
// (b) Preorder (Root, Left, Right) : 
  // 9, 4, 1, 6, 20, 15, 170
// (c) Postorder (Left, Right, Root) : 1 6 4 15 170 20 9
// Breadth-First or Level Order Traversal: 9, 4, 20, 1, 6, 15, 170
//can be done with a queue, put the root in the queue
  //while the queue is not empty, shift from the queue, put the shifted element into the answer list, and it's left and right child into the queue


class TreeNode<T extends Comparable<T>>
{
  TreeNode<T> left;
  TreeNode<T> right;
  T value;
  
  TreeNode(T value)
  {
    this.left = null;
    this.right = null;
    this.value = value;
  }
  
}