package com.practice.designpattern.prototype;

public class MainForCloning {
    public static void main(String[] args) {
        Sheep sheep = new Sheep();

        Sheep sheep1 = (Sheep) new CloneFactory().getCopy(sheep);

        System.out.println("Sheep: " + System.identityHashCode(sheep));
        System.out.println("Sheep: " + System.identityHashCode(sheep1));
//        System.out.println("Sheep: " + sheep1.hashCode());
    }
}
