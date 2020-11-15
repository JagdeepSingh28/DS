package com.jagdeep.ds.leet;


// 81. Search in Rotated Sorted Array II
public class _81 {

    public static void main(String[] args) {
//        System.out.println(search_(new int[]{1,1}, 3));
        System.out.println(search_(new int[]{2,5,6,2,2,2,2}, 3));
//        System.out.println(search_(new int[]{2,5,6,0,0,1,2}, 3));
    }

    public static boolean search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target)
                return true;
        }
        return false;
    }

    public static boolean search_(int[] nums, int target){
        // note here end is initialized to len instead of (len-1)
        int start = 0, end = nums.length;
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target)
                return true;
            if (nums[mid] > nums[start]) { // nums[start..mid] is sorted
                // check if target in left half
                if (target < nums[mid] && target >= nums[start])
                    end = mid;
                else
                    start = mid + 1;
            } else if (nums[mid] < nums[start]) { // nums[mid..end] is sorted
                // check if target in right half
                if (target > nums[mid] && target < nums[start])
                    start = mid + 1;
                else
                    end = mid;
            } else { // have no idea about the array, but we can exclude nums[start] because nums[start] == nums[mid]
                start++;
            }
        }
        return false;
    }

}
