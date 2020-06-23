package com.practice.multithreading.locking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Store {
    Semaphore semaphore = new Semaphore(23);
    Mutex
    private final MyCallBack callBack;
    private final ExecutorService executor = Executors.newFixedThreadPool(2);
    private final List<Item> items = Arrays.asList(new Item("Towel", 100),
            new Item("henky", 10),
            new Item("pen drive", 300));

    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public Store(MyCallBack callBack) {
        this.callBack = callBack;
    }

    void syncPrices() {
        ReentrantReadWriteLock.WriteLock lock = (ReentrantReadWriteLock.WriteLock) readWriteLock.writeLock();
        executor.execute(() -> {
            ReentrantLock  readWriteLock = new ReentrantLock()
            lock.lock();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (Item item : items) {
                item.setPrice(500);
            }
            System.out.println("Prices Hiked");
            lock.unlock();
            callBack.syncing();
        });
    }

    void createInvoice() {
        ReentrantReadWriteLock.ReadLock lock = (ReentrantReadWriteLock.ReadLock) readWriteLock.readLock();
        executor.execute(() -> {
            lock.lock();
            System.out.println("Total amount: " + getTotal());
            lock.unlock();
            callBack.createInvoice();
        });
    }

    private int getTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

}
