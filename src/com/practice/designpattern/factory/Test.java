package com.practice.designpattern.factory;

public class Test {

    public static void main(String[] args) {
        Calculate calculate = null;
        calculate = new CalculateFactory().getCalculationObj("divide");
        calculate.calc(2, 2);
    }
}
