package com.jagdeep.ds.leet;

import com.jagdeep.ds.Utils.Utils;

import java.util.HashMap;

public class TwoSum1 {
    public static void main(String[] args) {
        int target = 6;
        int[] arr = new int[]{3,3};
        Utils.printIntegerArray(twoSum(arr, target));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if(hashMap.containsKey(difference)){
                return new int[]{ hashMap.get(difference), i};
            }
            hashMap.put(nums[i], i);
        }

        throw  new IllegalArgumentException("No Two Sum Solution");
    }
}
