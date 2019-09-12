package com.jagdeep.ds.leet;

public class Climbing_Stairs_70 {

    public static void main(String[] args) {
        Climbing_Stairs_70 climbing_stairs_70 = new Climbing_Stairs_70();
        System.out.println(climbing_stairs_70.climbStairs(5));
    }

    public int climbStairs(int n) {
        int[] result = new int[n+1];

        if(n==0||n==1||n==2)
            return n;

        result[0] = 1;
        result[1] = 1;

        for (int i = 2; i <= n; i++) {
            result[i] = result[i-1] + result[i-2];
        }

        return result[n];
    }


//
//    Input:
//            [4,3,2,7,8,2,3,1]
//
//    Output:
//            [5,6]
}
