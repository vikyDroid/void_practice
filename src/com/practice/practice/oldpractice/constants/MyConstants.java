package com.practice.practice.oldpractice.constants;

public class MyConstants {
    public static int[] a = {9, 5, 2, 1, 10, 3, 4, -10};
//    public static int[] arr = {9,5, 2, 1, 10, 0, 988, 87, 566, 7, 9, 944, 55, 88, 33};

    public static void swap(int[] A, int from, int to) {
        int temp = A[from];
        A[from] = A[to];
        A[to] = temp;
    }
}
