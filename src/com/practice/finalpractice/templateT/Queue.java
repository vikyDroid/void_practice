package com.practice.finalpractice.templateT;

public class Queue<T> {
    Node<T> head;

    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void add(T data) {
        enqueue(data);
    }

    public T dequeue() {
        if (head == null) {
            return null;
        }
        T data = head.data;
        head = head.next;
        return data;
    }
    public T poll(){
        return dequeue();
    }

    public boolean isEmpty() {
        return head == null;
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
        System.out.println("\nItem Deque : " + queue.dequeue());
        System.out.println();
        queue.printAll();
    }
}
