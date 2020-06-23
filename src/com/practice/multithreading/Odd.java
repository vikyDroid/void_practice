package com.practice.multithreading;

public class Odd implements Runnable {
    Pojo pojo;

    Odd(Pojo pojo) {
        this.pojo = pojo;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (pojo) {
                while (pojo.i % 2 == 0) {
                    try {
                        pojo.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
//                System.out.println(Thread.currentThread().toString());
                System.out.println("Odd : " + pojo.i++);
                pojo.notify();
                if (pojo.i > 10) break;
            }
        }
    }
}
