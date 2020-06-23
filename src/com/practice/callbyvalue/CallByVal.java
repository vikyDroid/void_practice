package com.practice.callbyvalue;

import com.practice.oldpractice.ll.LinkedList;
import com.practice.oldpractice.node.Node;

public class CallByVal {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        ll.push(5);
        ll.push(6);
        ll.push(7);

        ll.printList();

        System.out.println();

        System.out.println("DATTT : " + ll.head.data);
        navigate(ll);
        System.out.println("DATTT : " + ll.head.data);
        ll.printList();

        System.out.println();
        navigate(ll.head);

        /*Node test = new Node(45);
        test.next = new Node(55);
        System.out.println("DATTT 2 : " + test.data);
        navigate(test);
        System.out.println("DATTT 2 : " + test.data);*/

        System.out.println();


        MyInt A = new MyInt(10);
        MyInt B = new MyInt(20);
        System.out.println("Before : " + A.a + "," + B.a);
        swap2(A, B);
        System.out.println("Before : ====" + A.a + "," + B.a);
        update(A.a);
        System.out.println("Before : ====" + A.a + "," + B.a);

        MyDeepInt deepInt = new MyDeepInt();
        deepInt.myInt = new MyInt(22);
        System.out.println("deep 1 = " + deepInt.myInt.a);
        update(deepInt);
        System.out.println("deep 2 = " + deepInt.myInt.a);

        A = new MyInt(99);
        System.out.println("myInt 2 = " + A.a);
        update(A);
        System.out.println("myInt 2 = " + A.a);

    }

    private static void update(MyDeepInt deepInt) {
        deepInt.myInt.a += 100;
    }

    private static void update(MyInt a) {
        a.a += 100;
    }

    private static void update2(MyInt a) {
        a = new MyInt(a.a + 100);
        a.a += 100;
    }

    private static void update(int a) {
        a += 100;
    }

    /*private static void navigate(LinkedList ll) {
        Node last = ll.head.next;
        while (last.next != null) {
            last = last.next;
        }
    }*/
    private static void navigate(LinkedList ll) {
        while (ll.head.next != null) {
            ll.head = ll.head.next;
        }
    }

    private static void navigate(Node head) {
        while (head.next != null) {
            head = head.next;
        }
        System.out.println(head.data+"==> Inner");
    }

    private static void swap(MyInt a, MyInt b) {
        MyInt temp = new MyInt(b.a);
        b.a = a.a;
        a.a = temp.a;
    }

    private static void swap2(MyInt a, MyInt b) {
        MyInt temp = b;
        b = a;
        a = temp;
    }


}
