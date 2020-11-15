package com.jagdeep.ds.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class _56_merge_interval {

    public static void main(String[] args) {
        _56_merge_interval merge_interval = new _56_merge_interval();
        merge_interval.merge(new int[][]{
                {1,3},{2,6},{8,10},{15,18}
//                {1,4},{0,4}
        });
    }

    public int[][] merge(int[][] nums) {
        ArrayList<Integer[]> result = new ArrayList<>();

        int min = 0;
        int max = 0;

        Arrays.sort(nums, Comparator.comparingInt(i -> i[0]));

        for (int i = 0; i < nums.length; i++) {
            if(i==0){
                min = nums[i][0];
                max = nums[i][1];
            }else{
                if(nums[i][0] > max){
                    result.add(new Integer[]{min,max});
                    min = nums[i][0];
                    max = nums[i][1];
                }else{
                    if(nums[i][1]>max)
                        max = nums[i][1];
                }

            }
            if(i==nums.length-1){
                result.add(new Integer[]{min,max});
            }
        }

        int[][] res = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            res[i][0]  = result.get(i)[0];
            res[i][1]  = result.get(i)[1];
        }

        return res;
    }
}
