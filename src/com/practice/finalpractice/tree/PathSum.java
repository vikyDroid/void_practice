package com.practice.finalpractice.tree;

public class PathSum {
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();
        tree.root = new Node<>(10);
        tree.root.left = new Node<>(8);
        tree.root.left.left = new Node<>(3);
        tree.root.left.right = new Node<>(5);
        tree.root.right = new Node<>(2);
        tree.root.right.left = new Node<>(2);
        int sum = 42;
        System.out.println(new PathSum().hasPathSum(tree.root, sum));
    }

    public boolean hasPathSum(Node<Integer> root, int sum) {
        if (root == null) return sum == 0;
        return hasPathSum(root.left, sum - root.data)
                || hasPathSum(root.right, sum - root.data);

    }

    public int maxPathSum(Node<Integer> root) {
        if (root == null) return 0;
        int left = root.left != null ? root.left.data : 0;
        int right = root.left != null ? root.right.data : 0;
        Math.max(left, right);
        return Math.max(root.data + left + right,
                root.data, root.data + left, root.data + right);
    }
}
