package com.jagdeep.ds.leet;

public class SingleNumberII {

    public static void main(String[] args) {
        int[] nums = new int[]{2,2,3,2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums){
//        int result = 0;
//        int[] bits = new int[32];
//
//        for (int i = 0; i < bits.length; i++){
//            for (int j = 0; j < nums.length; j++){
//                bits[i] += (nums[j] >> i) & 1;
//                bits[i] %= 3;
//            }
//
//            result |= bits[i] << i;
//        }
//
//        return result;

        int len = nums.length;

        int low = 0, high = 0;
        for(int i = 0; i < len; i++){
            int temp_low = (low ^ nums[i]) & ~high;
            high =(high&~low&~nums[i])|(~high&low&nums[i]);
            low=temp_low;
        }
        return low;
    }
}
