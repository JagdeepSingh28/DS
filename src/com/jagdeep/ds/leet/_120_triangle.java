package com.jagdeep.ds.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _120_triangle {

    public static void main(String[] args) {
        List<List<Integer>> l1 = new ArrayList<>();
        l1.add(Arrays.asList(new Integer[]{2}));
        l1.add(Arrays.asList(new Integer[]{3,4}));
        l1.add(Arrays.asList(new Integer[]{6,5,7}));
        l1.add(Arrays.asList(new Integer[]{4,1,8,3}));

        _120_triangle triangle = new _120_triangle();
        triangle.minimumTotal(l1);
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int[] A = new int[triangle.size()+1];
        for(int i=triangle.size()-1;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                A[j] = Math.min(A[j],A[j+1])+triangle.get(i).get(j);
            }
        }
        return A[0];
    }
}
