package com.practice.cloning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCloningInList {
    public static void main(String[] args) {
        ArrayList<NewEmployee> listOriginal = new ArrayList<>();
        listOriginal.add(new NewEmployee(2, "vivek"));
        listOriginal.add(new NewEmployee(3, "rahul"));
        listOriginal.add(new NewEmployee(1, "komal"));
        listOriginal.add(new NewEmployee(4, "shahshank"));
        listOriginal.add(new NewEmployee(5, "vicky"));

//        for (int i = 0; i < 5; i++) {
//            listOriginal.add(i + "");
//        }
//        System.out.println("Original: " + listOriginal);
//        Object clone = listOriginal.clone();
//        System.arraycopy();
        ArrayList<NewEmployee> listClone = (ArrayList<NewEmployee>) listOriginal.clone();
        for (NewEmployee newEmployee : listOriginal) {
            try {
                listClone.add((NewEmployee) newEmployee.clone());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(listOriginal.hashCode() == listClone.hashCode());
//        listClone.get(2).age =  1000000;
//        listClone.add(0, "100000000");
//        System.out.println("Clone: " + clone);
//        System.out.println("Original: " + listOriginal);
//        listOriginal.clear();


        for (int i = 0; i < listOriginal.size(); i++) {
            if (listOriginal.get(i).hashCode() == listClone.get(i).hashCode()) {
                System.out.println("SAME");
            } else {
                System.out.println("NOT-SAME");
            }
        }
    }
}
