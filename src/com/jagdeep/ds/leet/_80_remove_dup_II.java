package com.jagdeep.ds.leet;

public class _80_remove_dup_II {

    public static void main(String[] args) {
//        System.out.println(removeDup(new int[]{1, 1, 1, 2, 2, 3}));
        System.out.println(removeDup(new int[]{1,1,1,1,1, 2, 3, 4, 5}));
    }

    public static int removeDup(int[] num){
        int left = 2;
        for (int right = 2; right < num.length; right++) {
            if(num[left-2]!=num[right]){
                num[left] = num[right];
                left++;
            }
        }

        return left;
    }
}
