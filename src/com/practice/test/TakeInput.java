package com.practice.test;

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some String");
        String s = scanner.next();
        System.out.println("Entered String is: "+s);
    }
}
