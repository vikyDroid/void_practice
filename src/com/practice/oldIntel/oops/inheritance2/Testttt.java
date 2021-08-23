package com.practice.oldIntel.oops.inheritance2;

import java.util.ArrayList;
import java.util.List;

public class Testttt {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Student());
//        list.add(new Being());
        list.add(new Person());

//        Person person = (Person) new Being();
    }
}
