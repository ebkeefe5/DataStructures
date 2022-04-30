package Puzzles.TreeProblems;

public class TreeNode<T extends  Comparable>
{
    T value;
    TreeNode left;
    TreeNode right;

    public TreeNode(T value, TreeNode left, TreeNode right)
    {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
