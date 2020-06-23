package com.practice.multithreading.locking;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * In Progress, hence code is broken
 */
public class LockMain {
    public static void main(String[] args) {
        AtomicBoolean syncing = new AtomicBoolean(true);
        AtomicBoolean invoicing = new AtomicBoolean(true);

        Store store = new Store(new MyCallBack() {
            @Override
            public void syncing() {
                syncing.set(false);
            }

            @Override
            public void createInvoice() {
                invoicing.set(false);
            }
        });

        store.syncPrices();
        store.createInvoice();


        while (syncing.get() || invoicing.get()) {
            //running
        }

        System.out.println("Termination");
    }
}
