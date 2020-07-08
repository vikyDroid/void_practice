package com.practice.multithreading;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallThreads {
    public static void main(String[] args) {
        Pojo pojo = new Pojo(1);
        Thread t1 = new Thread(new Odd(pojo), "Odd Thread");
        Thread t2 = new Thread(new Even(pojo), "Even Thread");
        t1.start();
        t2.start();
        Thread t3 = new Thread(() -> {
            throw new IndexOutOfBoundsException();
        });
        t3.setUncaughtExceptionHandler((t, e) -> System.out.println(t.toString()
                + " & " + e.toString()));
        t3.start();

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new Odd(pojo));
        executor.execute(new Even(pojo));
        executor.shutdown();

        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

        t1.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                e.printStackTrace();
            }
        });

    }
}
