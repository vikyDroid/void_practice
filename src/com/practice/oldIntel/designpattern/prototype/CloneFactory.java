package com.practice.oldIntel.designpattern.prototype;

public class CloneFactory {

    Animal getCopy(Animal animal) {
        return animal.makeCopy();
    }
}
