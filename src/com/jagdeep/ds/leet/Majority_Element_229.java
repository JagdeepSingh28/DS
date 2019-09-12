package com.jagdeep.ds.leet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Majority_Element_229 {

    public static void main(String[] args) {
        Majority_Element_229 majority_element_229 = new Majority_Element_229();
        int[] nums = new int[]{1,2};
        List<Integer> result = majority_element_229.majorityElement(nums);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }

    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        if(nums.length == 1){
            result.add(nums[0]);
            return result;
        }

        HashMap<Integer, Integer> majElements = new HashMap<>();

        for (int num: nums) {
            if(majElements.containsKey(num) && ((majElements.get(num)+1) > Math.floor(nums.length/3)))
                result.add(num);
            else
                majElements.put(num, majElements.getOrDefault(num, 0)+1);
        }

        return result;
    }
}
