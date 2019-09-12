package com.jagdeep.ds.leet;

import java.util.HashMap;

public class MajorityElement_169 {

    public static void main(String[] args) {
        int[] a = new int[]{2,2,1,1,1,2,2};
        System.out.println(majorityElement(a));
    }

    public static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> majElements = new HashMap<>();

        for (int num: nums) {
            if(majElements.containsKey(num) && ((majElements.get(num)+1) > nums.length/2))
                return num;
            else
                majElements.put(num, majElements.getOrDefault(num, 0)+1);
        }

        return -1;
    }
}
