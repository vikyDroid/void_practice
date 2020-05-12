package com.practice.finalpractice.templateT;

public class Queue<T> {
    Node<T> head;

    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    public T dequeue() {
        T data = head.data;
        head = head.next;
        return data;
    }

    public void printAll() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.printAll();
        System.out.println("\nItem Deque : " + queue.dequeue());
        System.out.println();
        queue.printAll();
    }
}
