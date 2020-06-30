package com.practice.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class DummyAbs {
    protected String name;
    public String string;
    private String string2;
    static public String string3;
    static private String string4;
    static protected String string5;

    List<String> strings = new ArrayList<>();

    void myFunnn(){
//       strings.fi

    }


    public abstract void myFun();

    public void myFun2() {
        System.out.println("Dummy.myFun2");
    }

    public static void myFun3() {
        System.out.println("Dummy.myFun3");
    }
}
