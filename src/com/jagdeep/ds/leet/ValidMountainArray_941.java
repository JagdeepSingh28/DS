package com.jagdeep.ds.leet;

public class ValidMountainArray_941 {


    public static void main(String[] args) {
        int[] A = new int[]{2,1,2,3,5,7,9,10,12,14,15,16,18,14,13};
        System.out.println(validMountainArray(A));
    }

    public static boolean validMountainArray(int[] A) {
        if(A.length<3)
            return false;

        int N = A.length;
        int i = 0;

        // walk up
        while (i + 1 < N && A[i] < A[i + 1])
            i++;

        // peak can't be first or last
        if (i == 0 || i == N - 1)
            return false;

        // walk down
        while (i + 1 < N && A[i] > A[i + 1])
            i++;

        return i == N - 1;
    }
}
