package binary_tree_basic;

public class MakeBinaryTreeManually {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(3);

        // Hello brother
        root.left = node1;
        root.right = node2;
    }
}
