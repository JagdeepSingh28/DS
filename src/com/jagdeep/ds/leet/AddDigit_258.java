package com.jagdeep.ds.leet;

public class AddDigit_258 {

    public static void main(String[] args) {
        System.out.println(addDigits(28));
    }

    public static int addDigits(int num) {
        while(num >= 10) {
            int temp = 0;
            while(num > 0) {
                temp += num % 10;
                num /= 10;
            }
            num = temp;
        }

        return num;
    }
}
