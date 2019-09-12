package com.jagdeep.ds.leet;

import java.util.ArrayList;
import java.util.List;

public class NumberDisappearedInArray {

    public static void main(String[] args) {
        NumberDisappearedInArray numberDisappearedInArray = new NumberDisappearedInArray();

        int[] num = new int[]{4,3,2,7,8,2,3,1};
        List<Integer> result = numberDisappearedInArray.findNumberDisappearedInArray(num);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }


    }

    public List<Integer> findNumberDisappearedInArray(int[] num){
        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
            int index = Math.abs(num[i])-1;
            if(num[index]>0)
                num[index] = -num[index];
        }

        for (int i = 0; i < num.length; i++) {
            if(num[i] > 0)
                integers.add(i+1);
        }

        return integers;
    }
}
