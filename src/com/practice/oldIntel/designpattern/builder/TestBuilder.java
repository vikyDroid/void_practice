package com.practice.oldIntel.designpattern.builder;

public class TestBuilder {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .setBattery(200)
                .setOs("Android")
                .build();
        System.out.println(phone);
    }
}
