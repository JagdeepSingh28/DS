package com.jagdeep.ds.leet;

public class PlusOne_66 {

    public static void main(String[] args) {
        int[] nu = new int[]{9,9,9};
        plusOne(nu);
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;
    }
}
