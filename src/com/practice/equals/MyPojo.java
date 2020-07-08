package com.practice.equals;

import java.util.ArrayList;
import java.util.Objects;

public class MyPojo {
    String name;
    int age;
    int height;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        new ArrayList<>(new ArrayList<>());
        MyPojo myPojo = (MyPojo) o;
        return age == myPojo.age &&
                height == myPojo.height &&
                name.equals(myPojo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height);
    }
}
