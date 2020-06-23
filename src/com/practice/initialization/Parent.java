package com.practice.initialization;

public class Parent extends GrandParent {
    private static final String TAG = "Parent";

    Parent() {
        System.out.println("Parent.Parent constructor");
    }

    static {
        System.out.println("Parent.static initializer 1");
    }

    static {
        System.out.println("Parent.static initializer 2");
    }

    {
        System.out.println("Parent.instance initializer 1");
    }

    {
        System.out.println("Parent.instance initializer 2");
    }

    {
        System.out.println("Parent.instance initializer 3");
    }
}
