package com.practice.test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put(null, 2);
        map.put(null, null);

        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey() +" --> "+ e.getValue());
        }

        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("null", 0);

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(null, null);

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("null", null);


        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(10);
        }
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
        System.out.println(list.size());
    }
}
