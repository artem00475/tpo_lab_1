package second;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    Node root;
    List<Integer> list;

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else {
            current.right = addRecursive(current.right, value);
        }

        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
            if (current.left == null && current.right == null) {
                return null;
            }

            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }

            int biggestValue = findBiggestValue(current.left);
            current.value = biggestValue;
            current.left = deleteRecursive(current.left, biggestValue);
            return current;
        }
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }

    private int findBiggestValue(Node root) {
        return root.right == null ? root.value : findBiggestValue(root.right);
    }

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    private void showRecursive(Node current) {
        if (current.left != null) {
            list.add(current.left.value);
            showRecursive(current.left);
        }
        if (current.right != null) {
            list.add(current.right.value);
            showRecursive(current.right);
        }
    }

    public List<Integer> show() {
        list = new ArrayList<>();
        if (root != null) {
            list.add(root.value);
            showRecursive(root);
        }
        return list;
    }
}
