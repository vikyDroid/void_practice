package com.practice.test.simplecallback;

public class CallBackReceiver implements CallBack {

    @Override
    public void doSomething(String msg) {
        System.out.println("Message received : " + msg);
    }
}
