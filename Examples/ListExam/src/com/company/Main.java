package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList();

//        list.add(2); //0
//        list.add(5); //1

        Iterator<Integer> iterator = list.iterator();

        boolean empty = list.isEmpty();
        System.out.println(empty);

    }
}
