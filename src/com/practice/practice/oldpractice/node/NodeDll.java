package com.practice.practice.oldpractice.node;

public class NodeDll {
    public int data;
    public NodeDll prev;
    public NodeDll next;

    NodeDll(int data) {
        this.data = data;
        prev = next = null;
    }
}
