package com.practice.test;

public class Te implements A, B{
    @Override
    public void test() {

    }

    public static void main(String[] args) {
        A a = new Te();
        a.test();
    }
}
