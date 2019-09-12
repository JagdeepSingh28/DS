package com.jagdeep.ds.leet;

import java.util.HashSet;

public class ContainsDuplicate_219 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1};
        System.out.print(containsNearbyDuplicate(nums,3));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean[] duplicateBool = new boolean[nums.length];
        HashSet<Integer> duplicateHS = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(duplicateHS.contains(nums[i]))
                duplicateBool[i] = true;
            else
                duplicateBool[i] = false;
        }
        return false;
    }
}
