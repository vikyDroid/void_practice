package com.practice.multithreading;

import kotlin.concurrent.LocksKt;

import java.util.concurrent.locks.Lock;

public class Even implements Runnable , Thread.UncaughtExceptionHandler {
    final Pojo pojo;

    Even(Pojo pojo) {
        this.pojo = pojo;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (pojo) {
                while (pojo.i % 2 != 0) {
                    try {
                        pojo.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
//                System.out.println(Thread.currentThread().toString());
                System.out.println("Even : " + pojo.i++);
                pojo.notify();
                if (pojo.i > 10) break;
            }
        }
    }



    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(e.toString());

        
    }
}
