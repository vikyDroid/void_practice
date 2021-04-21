package com.practice.practice.interviews.times.design;

import com.practice.practice.interviews.times.design.cakes.Cake;
import com.practice.practice.interviews.times.design.cakes.ChocolateCake;
import com.practice.practice.interviews.times.design.cakes.FruitCake;
import com.practice.practice.interviews.times.design.cakes.VanillaCake;
import com.practice.practice.interviews.times.design.vas.CreamVAS;
import com.practice.practice.interviews.times.design.vas.VAS;

public class Driver {

    enum TYPE {
        FRUIT, CHOCOLATE, VANILLA
    }

    enum VAS_TYPE {
        CREAM, FLOWER, GIFT_WRAP
    }

    public static void main(String[] args) {
        Cake cake = getCake(TYPE.FRUIT);
        if (cake != null) {
            System.out.println("Total Cost :" + cake.getCost());
            System.out.println(cake.getDesc());
        }

        VAS vas = getVAS(VAS_TYPE.CREAM, cake);
    }

    private static VAS getVAS(VAS_TYPE type, Cake cake) {
        switch (type) {
            case CREAM:
                return new CreamVAS(cake);
            /*case FLOWER:
                return new CreamVAS(cake);
            case GIFT_WRAP:
                return new CreamVAS(cake);*/
        }
        return null;
    }

    private static Cake getCake(TYPE type) {
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
