package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//
//        list.add("string1");
//        list.get(0);
//        list.remove(0);
//
//        for (String item : list
//                ) {
//            System.out.println(item);
//
//        }
//
//        Iterator<String> iterator = list.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        Set<String> set = new HashSet<>();

        set.add("string1");
        set.add("string2");
        set.add("string3");
        set.add("string4");

        for (String s : set
                ) {
            System.out.println(s);
        }

        //set.remove("");

    }
}
