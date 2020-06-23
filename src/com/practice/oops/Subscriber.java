package com.practice.oops;

interface Subscriber<T> {
    void onCompleted();

    void onError(Throwable throwable);

    void onNext(T data);
}
