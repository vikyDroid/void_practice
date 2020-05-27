package com.practice.test;

public class PHPTest {
    public static void main(String[] args) {
        m1();
//        m2();
    }

    private static void m1() {
        int a = 2;
        int b = a++;
        System.out.println(b);
        System.out.println(a);
//        a = a++;
//        a = a++;
//        a += a++;
//        System.out.println(a);
    }

    private static void m2() {
        int a = 5;
        System.out.println(a = a++);
        System.out.println(a++);
        System.out.println(++a == a++);
        System.out.println(++a);
        System.out.println(a);
    }
}
