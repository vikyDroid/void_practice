package com.practice.designpattern.observer;

/**
 * Observable
 */
public interface Subject {
    void register(Observer o);

    void unRegister(Observer o);

    void notifyObserver();
}
