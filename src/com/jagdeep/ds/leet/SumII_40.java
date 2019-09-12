package com.jagdeep.ds.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumII_40 {

    public static void main(String[] args) {
        combinationSum2(new int[]{10,1,2,7,6, 1, 5}, 8);
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> combination = new ArrayList<>();

        int i =0;
        int j = candidates.length -1;

        int leftSum = 0;

        ArrayList<Integer> tempIntegers = new ArrayList<>();
        while(i<j){
            ArrayList<Integer> integers = new ArrayList<>();
            leftSum += candidates[i];
            if(leftSum + candidates[j] == target){
                integers.addAll(tempIntegers);
                integers.add(candidates[i]);
                integers.add(candidates[j]);
                i=0;
                j--;
                leftSum = 0;
                tempIntegers.clear();
            }else if(leftSum + candidates[j] <= target){
                tempIntegers.add(candidates[i]);
                i++;
            }else{
                i=0;
                j--;
                leftSum = 0;
                tempIntegers.clear();
            }
            if(integers.size()>0)
                combination.add(integers);
        }

        return combination;
    }
}
