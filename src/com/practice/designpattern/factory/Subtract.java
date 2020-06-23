package com.practice.designpattern.factory;

public class Subtract implements Calculate {
    @Override
    public void calc(int a, int b) {
        System.out.println("Subtract is:" + (a - b));
    }
}
