package com.practice.practice.practice9_450;

import java.util.Arrays;

import static com.practice.practice.practice1.constants.MyConstants.swap;

public class MoveAllNegative {
    public static void main(String[] args) {
        int[] a = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        System.out.println(Arrays.toString(a));
        move(a);
        System.out.println(Arrays.toString(a));
    }

    static void move(int[] a) {
        int n = a.length, l = 0, r = n - 1;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                swap(a, i, l);
                l++;
                i--;
            } else if (a[i] > 0) {
                swap(a, i, r);
                r--;
                i--;
            }
        }
    }
}
