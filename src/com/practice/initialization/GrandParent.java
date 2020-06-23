package com.practice.initialization;

public class GrandParent {
    static {
        System.out.println("GrandParent.static initializer");
    }
    {
        System.out.println("GrandParent.instance initializer");
    }

    GrandParent(){
        System.out.println("GrandParent.GrandParent constructor");
    }
}
