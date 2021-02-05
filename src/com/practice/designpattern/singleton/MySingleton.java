package com.practice.designpattern.singleton;

public class MySingleton {

    /**
     * Happens-before relationship is a guarantee that action performed by one thread
     * is visible to another action in different thread.
     *                ---- OR ----
     * all threads may get the most updated version of the var and not the cached one
     */
    private static volatile MySingleton mInstance;// write happens-before any subsequent read guaranteed
                                                  // all threads may get the most updated version of the var and not the cached one

    private MySingleton() {

    }

    public static MySingleton getInstance() {
        if (mInstance == null) {
            synchronized (MySingleton.class) { // unlocking happens-before any subsequent locking
                if (mInstance == null)
                    mInstance = new MySingleton();
            }
        }
        return mInstance;
    }
}
