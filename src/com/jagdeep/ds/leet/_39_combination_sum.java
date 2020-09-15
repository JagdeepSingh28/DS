package com.jagdeep.ds.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _39_combination_sum {

    public static void main(String[] args) {
        _39_combination_sum combination_sum = new _39_combination_sum();

        List<List<Integer>> sub = combination_sum.combinationSum(new int[]{2,3,5}, 8);

        for (int i = 0; i < sub.size(); i++) {
            List<Integer> s2 = sub.get(i);
            System.out.print("[");
            for (int i1 = 0; i1 < s2.size(); i1++) {
                System.out.print(s2.get(i1));
            }
            System.out.println("]");
        }
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, target, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
        if(remain < 0) return;
        else if(remain == 0) list.add(new ArrayList<>(tempList));
        else{
            for(int i = start; i < nums.length; i++){
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, remain - nums[i], i); // not i + 1 because we can reuse same elements
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
