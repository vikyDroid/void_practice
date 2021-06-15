package com.practice.test;

public class Te implements B, A {


    public static void main(String[] args) {
        A a = new Te();
        a.test();
    }

    @Override
    public void test() {
        System.out.println("Te");
    }
}
