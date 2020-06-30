package com.practice.designpattern.decorator;

public class PizzaMaker {
    public static void main(String[] args) {
        Pizza pizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

        System.out.println("Ingredients: " + pizza.getDescription());
        System.out.println("Cost: " + pizza.getCost());
    }
}
