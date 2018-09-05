package com.company;

public class Main {

    public static void main(String[] args) {

        int z = 0;
        for (int i = 0; i < 10; i++) {
            int a = i;
            System.out.print(++a+" ");

        }
        System.out.println();


        while (z < 10) {
            System.out.print(z+" ");
            z++;
        }
        System.out.println();


        String[] strings = "Helllo world".split(" ");
        for (String s : strings
                ) {
            System.out.println(s);
        }
    }
}
