package com.practice.oops;

public class Observable {
    Subscriber subscriber;

    static Observable create(OnSubscribe onSubscribe) {
        return new Observable();
    }

    void subscribe(Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    interface OnSubscribe {
        void call(Subscriber<String> subscriber);
    }
}
