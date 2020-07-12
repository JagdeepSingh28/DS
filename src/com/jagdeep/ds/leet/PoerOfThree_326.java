package com.jagdeep.ds.leet;

public class PoerOfThree_326 {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(45));
    }

    public static boolean isPowerOfThree(int n) {
        if(n>1)
            while(n%3==0)
                n /= 3;
        return n==1;

    }

//    3^0 = 1 -- 3^1 = 3 -- 3^2 = 9 -> 3^3 = 27
}
