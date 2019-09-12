package com.jagdeep.ds.geeks;

public class AloneInCouple {

    public static void main (String[] args) {

//            int[] arr = new int[]{1, 2, 3, 2, 1};
            AloneInCouple aloneInCouple = new AloneInCouple();
//            System.out.println(aloneInCouple.findLoneNumber(arr));

        int a = 0;
        int b = 3;
        System.out.println(aloneInCouple.bitdifference(a,b));

    }

    public int findLoneNumber(int[] arr) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            x ^= arr[i];
        }
        return x;
    }

    public int bitdifference(int n1, int n2) {
        int count = 0;
        int x = n1 ^ n2;
        while (x > 0) {
            x = x & (x - 1);
            count++;
        }
        return count;
    }
}
