package com.practice.initialization;

public class Child extends Parent {
    int a, b, c;

    public Child(int a) {
        this.a = a;
    }

    public Child(int a, int b) {
        this(a);
        this.b = b;
    }

    Child() {
        System.out.println("Child.Child constructor");
    }

    static {
        System.out.println("Child.static initializer 1");
    }

    static {
        System.out.println("Child.static initializer 2");
    }

    {
        System.out.println("Child.instance initializer 1");
    }

    {
        System.out.println("Child.instance initializer 2");
    }

    {
        System.out.println("Child.instance initializer 3");
    }

    @Override
    public String toString() {
        return "Child{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
