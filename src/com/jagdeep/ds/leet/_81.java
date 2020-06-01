package com.jagdeep.ds.leet;


// 81. Search in Rotated Sorted Array II
public class _81 {

    public static void main(String[] args) {
        System.out.println(search(new int[]{2,5,6,0,0,1,2}, 0));
    }

    public static boolean search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target)
                return true;
        }
        return false;
    }

}
