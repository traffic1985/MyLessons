package com.company;

import java.io.PrintStream;

public class MyException extends Exception {

    @Override
    public void printStackTrace(PrintStream s) {
        System.err.println("Error! Ты ошибка,блять! ");
    }
}
