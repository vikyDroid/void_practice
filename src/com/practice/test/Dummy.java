package com.practice.test;

import com.practice.practice.finalpractice.tree.Node;

import java.util.*;

public class Dummy {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some String");
        String s = scanner.next();
        System.out.println("Entered String is: "+s);*/

        HashMap<String, Object> map = new HashMap<>();
        map.values().iterator();

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(2);
        queue.add(5);
        queue.add(9);
        queue.add(1);
        queue.add(7);
        System.out.println(Arrays.toString(new PriorityQueue[]{queue}));

    }

    int getHeight(Node<Integer> root) {
        if (root == null) return 0;
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    void invert(Node<Integer> root) {
        if (root == null)
            return;
        Node<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
    }

    boolean isIdentical(Node root1, Node root2) {
        if (root1 == root2)
            return true;
        if (root1 != null && root2 != null) {
            return isIdentical(root1.left, root2.left)
                    && isIdentical(root1.right, root2.right);
        }
        return false;
    }

    boolean isPathSumFound(Node<Integer> root, int sum) {
        if (root == null)
            return false;
        if (sum == root.data)
            return true;
        return isPathSumFound(root.left, sum - root.data) ||
                isPathSumFound(root.right, sum - root.data);
    }

    int maxPathSum(Node<Integer> root) {
        if (root == null)
            return 0;
        return root.data + maxPathSum(root.left) + maxPathSum(root.right);
    }

    void flatten(Node<Integer> root) {
        if (root == null)
            return;
        if (root.left != null) {
            flatten(root.left);
            Node<Integer> right = root.right;
            root.right = root.left;
            root.left = null;

            root.right.right = right;
        } else {
//            root.right
        }
    }

    boolean isBST(Node<Integer> root) {
        if (root == null)
            return true;
        return root.left.data < root.data && root.right.data > root.data
                && isBST(root.left) && isBST(root.right);
    }
}
