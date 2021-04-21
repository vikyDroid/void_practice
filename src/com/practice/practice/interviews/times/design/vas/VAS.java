package com.practice.practice.interviews.times.design.vas;

import com.practice.practice.interviews.times.design.cakes.Cake;

public abstract class VAS {
    Cake cake;

    VAS(Cake cake) {
        this.cake = cake;
    }

    abstract int getCost();
    abstract String getDesc(String s);
}
