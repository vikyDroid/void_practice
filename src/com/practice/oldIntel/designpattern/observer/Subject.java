package com.practice.oldIntel.designpattern.observer;

/**
 * Observable
 */
public interface Subject {
    void register(Observer o);

    void unRegister(Observer o);

    void notifyObserver();
}
