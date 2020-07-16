package com.practice.cloning;

public class MyImmutable implements Cloneable{
    private final StringBuilder builder;

    public MyImmutable(StringBuilder builder) {
        this.builder = builder;
    }

    public StringBuilder getBuilder() {
        return builder;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "MyImmutable{" +
                "builder=" + builder +
                '}';
    }
}
