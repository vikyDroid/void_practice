package com.practice.finalpractice.tree;

import com.practice.finalpractice.templateT.Queue;
import com.practice.finalpractice.templateT.Stack;

public class TreeToLL {
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();
        tree.root = new Node<>(1);
        tree.root.left = new Node<>(2);
        tree.root.left.left = new Node<>(3);
        tree.root.left.right = new Node<>(4);
        tree.root.right = new Node<>(5);
        tree.root.right.right = new Node<>(6);
        tree.preOrder();
        System.out.println();
        tree.inOrder();
        System.out.println();
        tree.levelOrder();
        System.out.println("\nAfter");
        new TreeToLL().flatten4(tree.root);
        tree.levelOrder();
    }

    //Efficient no extra space
    public void flatten(Node<Integer> root) {
        if (root == null || (root.left == null && root.right == null)) return;
        if (root.left != null) {
            flatten(root.left);
            Node<Integer> right = root.right;
            root.right = root.left;
            root.left = null;

            Node<Integer> t = root.right;
            while (t.right != null) {
                t = t.right;
            }
            t.right = right;
        }
        flatten(root.right);
    }

    //Efficient another wo no extra space
    public void flatten3(Node<Integer> root) {
        if (root == null) return;

    }

    //Using Stack
    public void flatten4(Node<Integer> root) {
        if (root == null) return;
        Stack<Node<Integer>> stack = new Stack<>();
        Node<Integer> prev = root;
        while (prev != null || !stack.isEmpty()) {

            if (prev.right != null) {
                stack.add(prev.right);
            }
            prev.right = prev.left;
            prev.left = null;

            if (prev.right == null && !stack.isEmpty()) {
                prev.right = stack.pop();
            }
            prev = prev.right;
        }

    }

    //Un-complete using queue
    /*public Node<Integer> flatten2(Node<Integer> root) {
        if (root == null) return null;
        Node<Integer> prev = root;
        Queue<Node<Integer>> queue = new Queue<>();
        while (prev != null || !queue.isEmpty()) {
            Node<Integer> temp = queue.poll();
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
//            root = temp;
//            root = root.right;
            prev.right = temp;
            prev.left = null;
            prev = prev.right;
        }
        return prev;
    }*/
}
