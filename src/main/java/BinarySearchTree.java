import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class BinarySearchTree<T extends Comparable<T>>
{
    private TreeNode<T> root;
  
    public BinarySearchTree()
    {
      this.root = null;
    }

    public TreeNode<T> getRoot()
    {
      return this.root;
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

    List<T> inOrderTraversal(TreeNode<T> node, List<T> list)
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

     List<T> preOrderTraversal(TreeNode<T> node, List<T> list)
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

    List<T> traversePostOrder(TreeNode<T> node, List<T> list)
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

    //level order traversal also known as a bread first solution
    //this is a more common implentation using a Queue
    List<T> traverseLevelOrder()
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