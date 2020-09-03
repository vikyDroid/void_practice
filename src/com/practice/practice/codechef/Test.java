package com.practice.practice.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter name:");
        String s = br.readLine();
        System.out.println("s = " + s);
        System.out.println("Enter age:");
        int age = Integer.parseInt(br.readLine());
        System.out.println("Age is: " + age);
        System.out.println("Emter space epareted");
        s = br.readLine();
        System.out.println(Arrays.toString(s.split(" ")));

    }
}
