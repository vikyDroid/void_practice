package com.practice.cloning;

public class TestCloningInObjects {
    public static void main(String[] args) {
        Employee e1 = new Employee(10, "Vikkkkk", new Address("Delhi", "India"),
                new MyImmutable(new StringBuilder("myDataaaaa")), new StringBuilder("MyCustomBuilder"));
        Employee e2 = null;
        try {
            e2 = (Employee) e1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("is builder Same: " + (e1.builder.hashCode() == e2.builder.hashCode()));
        e1.builder = new StringBuilder("fffffffffffffffffffffffffffffffffff");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println("is obj Same: " + (e1.hashCode() == e2.hashCode()));
        System.out.println("is address Same: " + (e1.address.hashCode() == e2.address.hashCode()));
        System.out.println("is builder Same: " + (e1.builder.hashCode() == e2.builder.hashCode()));
    }
}
