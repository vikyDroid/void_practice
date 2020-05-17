package com.practice.finalpractice.tree;

public class Node<T> {
    T data;
    Node<T> left, right;

    public Node(T data) {
        this.data = data;
        left = right = null;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
