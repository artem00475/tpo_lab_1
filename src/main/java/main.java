import first.Arctg;
import second.BinaryTree;

public class main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(1);
        bt.add(4);
        bt.add(4);
        bt.add(-1);
        System.out.println(bt.show());

        System.out.println(bt.show());
        bt.delete(6);

        System.out.println(bt.show());

        bt.delete(8);

        System.out.println(bt.show());
    }
}
