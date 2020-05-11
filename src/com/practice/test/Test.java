package com.practice.test;

import java.util.Arrays;

public class Test {

    int a;

    public static void main(String[] args) {

        System.out.println(Arrays.toString(Arrays.copyOfRange(new int[]{1, 2, 4, 5, 3, 6}
                , 1, 2)));
    }

    private static void swap(Test t1, Test t2) {
        Test temp = t1;
//        temp = t1;
        t1 = t2;
//uncomment below line to see difference!
// t1.a=999999999;
        t2 = temp;
    }

    private static void swap(Test t1, Test t2, boolean flag) {
        Test temp = new Test();
        temp.a = t1.a;
        t1.a = t2.a;
        t2.a = temp.a;
    }
}