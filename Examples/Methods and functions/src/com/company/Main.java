package com.company;

public class Main {

    public static void main(String[] args) {

        //calcSum(2,9);
        int val = calcSumNotVoid(1, -1);
        System.out.println(val);

    }

    static void calcSum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    static int calcSumNotVoid(int a, int b) {
        int sum = a + b;
        if (sum == 0) {
            sum=calcSumNotVoid(1,1);
        }
        return sum;
    }
}
