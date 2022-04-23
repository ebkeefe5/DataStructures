package DataStructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTreeTest {

    BinarySearchTree<Integer> tree = new BinarySearchTree<>();
    TreeNode<Integer> root;

    //////////9
    /////4       20
    ///1   6  15    170
    @Before
    public void setUp()
    {
        tree = new BinarySearchTree<>();
        tree.insert(9);
        tree.insert(4);
        tree.insert(6);
        tree.insert(20);
        tree.insert(170);
        tree.insert(15);
        tree.insert(1);
        root = tree.getRoot();
    }

    @Test
    public void testInOrderTraversal()
    {
        List<Integer> inOrderList = tree.inOrderTraversal(root, new ArrayList<>());

        List<Integer> expected = List.of(1, 4, 6, 9, 15, 20, 170);

        Assert.assertEquals(inOrderList, expected);
    }

    @Test
    public void testPreOrderTraversal()
    {
        List<Integer> preOrderTraversal = tree.preOrderTraversal(root, new ArrayList<>());

        //////////9
        /////4       20
        ///1   6  15    170
        List<Integer> expected = List.of(9, 4, 1, 6, 20, 15, 170);

        Assert.assertEquals(preOrderTraversal, expected);
    }

    @Test
    public void testPostOrderTraversal()
    {
        List<Integer> postOrderList = tree.traversePostOrder(root, new ArrayList<>());

        List<Integer> expected = List.of(1, 6, 4, 15, 170, 20, 9);

        Assert.assertEquals(postOrderList, expected);
    }

    @Test
    public void testLevelOrderTraversal()
    {
        List<Integer> levelOrderList = tree.traverseLevelOrder();

        List<Integer> expected = List.of(9, 4, 20, 1, 6, 15, 170);

        Assert.assertEquals(levelOrderList, expected);
    }
}
