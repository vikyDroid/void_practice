package com.practice.cloning;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayCloneVsCopy {
    public static void main(String[] args) {
        int[][] a = {{1, 1}, {2, 2}};
        int[][] b = new int[a.length][a[0].length];

        /*NewEmployee[] c = {
                new NewEmployee(1, "vivek"),
                new NewEmployee(2, "komu")
        };*/
        String[] c = {"1", "2", "3", "4", "5"};
        b = a.clone();
        String[] d = Arrays.copyOf(c, c.length);
        c[0]+="dsada";
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        for (int i = 0; i < c.length; i++) {
            if (c.hashCode() == d.hashCode()) {
                System.out.println("SAME");
            } else {
                System.out.println("NOT-SAME");
            }
        }
        /*for (int i = 0; i < a.length; i++) {
            b[i] = a[i].clone();
        }*/
        a[0][0]++;
       /* for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.println(b);
            }
        }*/
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(b[i]));
        }
    }
}
