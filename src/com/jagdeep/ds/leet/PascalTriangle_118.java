package com.jagdeep.ds.leet;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle_118 {

    public static void main(String[] args) {
        List<List<Integer>> generate = generate(5);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subList1 = new ArrayList<>();
        List<Integer> subList2 = new ArrayList<>();
        subList1.add(1);
        subList2.add(1);
        subList2.add(1);
        if(numRows>0)
            result.add(subList1);
        if(numRows>1)
            result.add(subList2);

        for(int i =2 ; i< numRows; i++){
            List<Integer> sublist = new ArrayList<>();
            for (int j = 0; j < i+1; j++) {
                if(j == 0 || j == i) {
                    sublist.add(1);
                }else{
                    sublist.add(j,result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }
            }

            result.add(sublist);
        }
        return result;
    }
}
