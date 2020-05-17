package com.practice.finalpractice.tree;

public class ConstructTree {
    Tree<Character> tree = new Tree<>();
    char[] inOrder = {'D', 'B', 'E', 'A', 'F', 'C'};
    char[] preOrder = {'A', 'B', 'D', 'E', 'C', 'F'};
    char[] postOrder = {'D', 'E', 'B', 'F', 'C', 'A'};
    int preIndex, postIndex = postOrder.length - 1;

    public static void main(String[] args) {
        ConstructTree constructTree = new ConstructTree();
        int n = constructTree.inOrder.length;
        constructTree.tree = new Tree<>();
        constructTree.tree.root = constructTree.getNode(constructTree.inOrder, constructTree.postOrder, 0, n - 1);
        constructTree.tree.inOrder();
        System.out.println();
        constructTree.tree.preOrder();
        System.out.println();
        constructTree.tree.postOrder();

    }

    public Node<Character> getNode(char[] inOrder, int start, int end) {
        if (start > end)
            return null;
        Node<Character> node = new Node<>(preOrder[preIndex++]);
        if (start == end)
            return node;
        int inIndex = search(inOrder, start, end, node.data);
        node.left = getNode(inOrder, start, inIndex - 1);
        node.right = getNode(inOrder, inIndex + 1, end);
        return node;
    }

    private int search(char[] in, int start, int end, char val) {
        int i;
        for (i = start; i <= end; i++) {
            if (in[i] == val) {
                return i;
            }
        }
        return i;
    }


    public Node<Character> getNode(char[] inOrder, char[] postOrder, int start, int end) {
        if (start > end) return null;
        Node<Character> node = new Node<>(postOrder[postIndex--]);
        if (start == end) return node;
        int match = search(inOrder, start, end, node.data);
        node.right = getNode(inOrder, postOrder, match + 1, end);
        node.left = getNode(inOrder, postOrder, start, match - 1);
        return node;
    }

}
