package com.jagdeep.ds.leet;

import java.util.Arrays;

public class ArrayPartitionI_561 {

    public static void main(String[] args) {
        System.out.println(arrayPairSum(new int[]{3,1,9,5}));
    }

    public static int arrayPairSum(int[] nums) {
        int sum = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }
}
