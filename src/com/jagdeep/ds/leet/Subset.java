package com.jagdeep.ds.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {

    public static void main(String[] args) {

        int[] num = new int[]{1,2,3};
        Subset subset = new Subset();
        ArrayList<ArrayList<Integer>> sub = subset.subsets(num);

        for (int i = 0; i < sub.size(); i++) {
            List<Integer> s2 = sub.get(i);
            System.out.print("[");
            for (int i1 = 0; i1 < s2.size(); i1++) {
                System.out.print(s2.get(i1));
            }
            System.out.println("]");
        }
    }

    public List<List<Integer>> subsets_(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l = new ArrayList();
        for (int i = 0; i <= nums.length; i++) {
            subsets(nums, i, l, 0, new ArrayList());
        }
        return l;
    }

    private void subsets(int[] nums, int currLength, List<List<Integer>> l, int start, List<Integer> curr) {
        if (curr.size() == currLength) {
            l.add(new ArrayList(curr));
            return;
        }
        for(int i = start; i < nums.length; i++) {
            curr.add(nums[i]);
            subsets(nums, currLength, l, i+1, curr);
            curr.remove(curr.size() - 1);
        }
    }

    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        if (S == null)
            return null;

        Arrays.sort(S);

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < S.length; i++) {
            ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();

            //get sets that are already in result
            for (ArrayList<Integer> a : result) {
                temp.add(new ArrayList<Integer>(a));
            }

            //add S[i] to existing sets
            for (ArrayList<Integer> a : temp) {
                a.add(S[i]);
            }

            //add S[i] only as a set
            ArrayList<Integer> single = new ArrayList<Integer>();
            single.add(S[i]);
            temp.add(single);

            result.addAll(temp);
        }

        //add empty set
        result.add(new ArrayList<Integer>());

        return result;
    }
}
