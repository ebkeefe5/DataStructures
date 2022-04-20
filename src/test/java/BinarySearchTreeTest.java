import org.junit.Before;
import org.junit.Test;
import src.main.java.BinarySearchTree;

public class BinarySearchTreeTest {

    BinarySearchTree<Integer> tree = new BinarySearchTree<>();

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
        //////////9
        /////4       20
        ///1   6  15    170
    }

    @Test
    public void testInOrderTraversal()
    {
        tree.traverse
    }
}
