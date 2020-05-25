package com.practice.finalpractice.tree;

public class PathSum {
    int max = Integer.MIN_VALUE;

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
        System.out.println(new PathSum().maxPathSum(tree.root));
    }

    public boolean hasPathSum(Node<Integer> root, int sum) {
        if (root == null) return sum == 0;
        return hasPathSum(root.left, sum - root.data)
                || hasPathSum(root.right, sum - root.data);

    }

    public int maxPathSum(Node<Integer> root) {
        helper(root);
        return max;
    }

    private int helper(Node<Integer> root) {
        if (root == null) return 0;

        int left = Math.max(helper(root.left), 0);
        int right = Math.max(helper(root.right), 0);

        max = Math.max(max, root.data + left + right);

        return root.data + Math.max(left, right);
    }
}
