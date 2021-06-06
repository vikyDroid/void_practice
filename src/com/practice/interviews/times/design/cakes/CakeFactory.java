package com.practice.interviews.times.design.cakes;

import com.practice.interviews.times.design.enums.FLAVOR_TYPE;

public class CakeFactory {
    public static Cake getCake(FLAVOR_TYPE type) {
        switch (type) {
            case FRUIT:
                return new FruitCake();
            case CHOCOLATE:
                return new ChocolateCake();
            case VANILLA:
                return new VanillaCake();
        }
        return null;
    }
}
