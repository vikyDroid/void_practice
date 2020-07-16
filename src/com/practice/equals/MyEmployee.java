package com.practice.equals;

import java.util.Objects;

public class MyEmployee {
    String name;
    int age;
    int height;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyEmployee myEmployee = (MyEmployee) o;
        return age == myEmployee.age &&
                height == myEmployee.height &&
                Objects.equals(name, myEmployee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height);
    }
}
