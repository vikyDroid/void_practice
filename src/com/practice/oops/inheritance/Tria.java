package com.practice.oops.inheritance;

public class Tria {
    public static void main(String[] args) {
        Paa paa = new Paa();

        Addr age = paa.getAddress();
        System.out.println(age);
        age.s = "asdasdasd";
        System.out.println(paa.getAddress());

//        age = paa.getAddress();
//        System.out.println(age);

    }
}
