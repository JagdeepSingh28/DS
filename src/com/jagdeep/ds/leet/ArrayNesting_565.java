package com.jagdeep.ds.leet;

import java.util.HashSet;

public class ArrayNesting_565 {

    public static void main(String[] args) {
        int[] a = new int[]{5,4,0,3,1,6,2};
        System.out.println(arrayNesting(a));
    }

    public static int arrayNesting(int[] nums) {
        int maxCount = 0;
        int index;
        for(int i=0; i<nums.length; i++){
            HashSet<Integer> mSet = new HashSet<>();
            index = i;
            mSet.add(index);
            while(true){
                int num = nums[index];
                if(mSet.contains(num)){
                    maxCount = mSet.size();
                    break;
                }
                mSet.add(num);
                index = nums[num];
            }
        }

        return maxCount;
    }
}
