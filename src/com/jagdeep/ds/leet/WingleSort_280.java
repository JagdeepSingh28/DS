package com.jagdeep.ds.leet;


/*
Given an unsorted array nums, reorder it in-place such that nums[0] <= nums[1] >= nums[2] <= nums[3]....

For example, given nums = [3, 5, 2, 1, 6, 4], one possible answer is [1, 6, 2, 5, 3, 4].
 */

import java.util.Arrays;

public class WingleSort_280 {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 5, 2, 1, 6, 4};
        wiggleSort(nums);
    }

    public static void wiggleSort(int[] nums) {
        Arrays.sort(nums); // {1,2,3,4,5,6}
        int[] result = new int[nums.length];

        int i = 0;
        int j = 0;
        while(i < nums.length/2){
            result[j] = nums[i];
            i++;
            j+=2;
        }

        i = nums.length-1;
        j = 1;

        while(i >= nums.length/2){
            result[j] = nums[i];
            i--;
            j+=2;
        }

        for (int num : result) {
            System.out.println(num);
        }
    }
}
