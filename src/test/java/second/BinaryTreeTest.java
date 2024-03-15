package second;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTreeTest {

    private BinaryTree binaryTree;

    @BeforeEach
    void init() {
        binaryTree = new BinaryTree();
    }

    @Test
    void checkTree() {
        binaryTree.add(6);
        binaryTree.add(4);
        binaryTree.add(8);
        binaryTree.add(3);
        binaryTree.add(5);
        binaryTree.add(7);
        binaryTree.add(9);
        binaryTree.add(1);
        binaryTree.add(4);
        binaryTree.add(4);
        Assertions.assertArrayEquals(new List[]{Arrays.asList(6, 4, 3, 1, 5, 4, 4, 8, 7, 9)}, new List[]{binaryTree.show()});

        binaryTree.delete(4);
        Assertions.assertArrayEquals(new List[]{Arrays.asList(6, 3, 1, 5, 4, 4, 8, 7, 9)}, new List[]{binaryTree.show()});

        binaryTree.delete(6);
        Assertions.assertArrayEquals(new List[]{Arrays.asList(5, 3, 1, 4, 4, 8, 7, 9)}, new List[]{binaryTree.show()});

        binaryTree.delete(8);
        Assertions.assertArrayEquals(new List[]{Arrays.asList(5, 3, 1, 4, 4, 7, 9)}, new List[]{binaryTree.show()});
    }

    @Test
    void checkEmpty() {
        Assertions.assertTrue(binaryTree.show().isEmpty());
    }

    @Test
    void checkAdd() {
        Assertions.assertFalse(binaryTree.containsNode(6));
        binaryTree.add(6);
        Assertions.assertTrue(binaryTree.containsNode(6));
    }

    @Test
    void checkContains() {
        binaryTree.add(6);
        binaryTree.add(4);
        binaryTree.add(8);

        Assertions.assertTrue(binaryTree.containsNode(6));
        Assertions.assertTrue(binaryTree.containsNode(4));
        Assertions.assertTrue(binaryTree.containsNode(8));
        Assertions.assertFalse(binaryTree.containsNode(9));
    }

    @Test
    void checkDelete() {
        binaryTree.add(6);
        Assertions.assertTrue(binaryTree.containsNode(6));
        binaryTree.delete(6);
        Assertions.assertFalse(binaryTree.containsNode(6));
        Assertions.assertDoesNotThrow(() -> binaryTree.delete(6));
    }
}
