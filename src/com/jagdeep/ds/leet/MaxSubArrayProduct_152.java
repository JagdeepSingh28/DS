package com.jagdeep.ds.leet;

import com.jagdeep.ds.Utils.Utils;

public class MaxSubArrayProduct_152 {
    public static void main(String[] args) {
        Utils.print(maxProduct__(new int[]{2,3,-2,4,2}));
    }

    public static int maxProduct__(int[] nums) {

        int prod = 1;
        int result = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            prod = prod * nums[i];
            result = Math.max(prod, result);
            if(prod == 0) {
                prod = 1;
            }
        }
        prod = 1;

        for(int i = nums.length - 1; i >= 0; i--) {

            prod = prod * nums[i];
            result = Math.max(prod, result);
            if(prod == 0) {
                prod = 1;
            }
        }
        return result;
    }


    public static int maxProduct_(int[] nums) {
        int max =Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int currentMax = 1;
            for(int j=i; j<nums.length; j++){
                currentMax = currentMax * nums[j];
                // max = Math.max(currentMax, max);
                if(currentMax>max)
                    max = currentMax;
            }
        }
        return max;
    }

    public static int maxProduct(int[] nums){
        int p2= 0;

        int max = Integer.MIN_VALUE;
        int currentMax = 1;

        while (p2<nums.length){
            currentMax = currentMax * nums[p2];
            if(currentMax>max){
                max = currentMax;
                p2++;
            }else{
                p2++;
                currentMax = 1;
            }
        }
        return max;
    }
}
