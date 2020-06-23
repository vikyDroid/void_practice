package com.practice.comparison;

import org.jetbrains.annotations.NotNull;

public class Person implements Comparable<Person> {
    String name;
    int age;
    double height;

    Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(@NotNull Person o) {
        return this.age - o.age;
    }
}
