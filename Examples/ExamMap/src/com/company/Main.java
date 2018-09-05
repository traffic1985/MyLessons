package com.company;


import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("key", 2);
        map.put("key1", 7);
        map.put("key2", 8);
        map.put("key3", 10);

        map.get("key");

        map.remove("key1");

        for (Integer i : map.values()
                ) {
            System.out.println(i);
        }

    }
}
