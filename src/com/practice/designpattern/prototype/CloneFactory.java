package com.practice.designpattern.prototype;

public class CloneFactory {

    Animal getCopy(Animal animal) {
        return animal.makeCopy();
    }
}
