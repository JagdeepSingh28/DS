package com.jagdeep.ds.leet;

import java.util.ArrayList;
import java.util.List;

public class _46_permutation {

    public static void main(String[] args) {
        _46_permutation permutation = new _46_permutation();

        List<List<Integer>> sub = permutation.permute(new int[]{1,2,3});

        for (int i = 0; i < sub.size(); i++) {
            List<Integer> s2 = sub.get(i);
            System.out.print("[");
            for (int i1 = 0; i1 < s2.size(); i1++) {
                System.out.print(s2.get(i1));
            }
            System.out.println("]");
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        // Arrays.sort(nums); // not necessary
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
        if(tempList.size() == nums.length){
            list.add(new ArrayList<>(tempList));
        } else{
            for(int i = 0; i < nums.length; i++){
                if(tempList.contains(nums[i])) continue; // element already exists, skip
                tempList.add(nums[i]);
                backtrack(list, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
