package com.company;

public class Main {

    public static void main(String[] args) {
//        String[] st = new String[2];
//        try {
//            System.out.println(st[3]);
//        } catch (Throwable ex) {
//            System.out.println("Элемент массива по данному индексу не существует");
//        }


        try {
            throw new MyException();
        } catch (MyException e) {
            e.printStackTrace();
        }

    }
}
