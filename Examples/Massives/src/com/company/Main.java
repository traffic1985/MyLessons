package com.company;

public class Main {
    static String[] nums = new String[3];
    public static void main(String[] args) {
        nums[0] = "Нулевая";
        nums[1] = "Первая";
        nums[2] = "Вторая";


        for (int i = 0; i < nums.length; i++) {
            System.out.println(i+"->"+nums[i]+" ");
        }
    }
}
