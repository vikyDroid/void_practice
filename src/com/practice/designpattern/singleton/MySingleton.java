package com.practice.designpattern.singleton;

public class MySingleton {

    static final Integer k=0;
    private static volatile MySingleton mInstance;// write happens-before, any thread gets updated value only

    private MySingleton() {

    }

    public static MySingleton getInstance() {
        if (mInstance == null) {
            synchronized (k) {
                if (mInstance == null)
                    mInstance = new MySingleton();
            }
        }
        return mInstance;
    }
}
