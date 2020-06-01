package com.jagdeep.ds.leet;

public class SortColors_75 {

    public static void main(String[] args) {
        int[] a = new int[]{2,0,2,1,1,1};
        sortColors(a);
        for (int i : a) {
            System.out.print(i);
        }
    }

    public static void sortColors(int[] nums) {
        int redSt=0, bluSt=nums.length-1;
        int i=0;
        while(i<bluSt+1){
            if(nums[i]==0){
                int tmp = nums[i];
                nums[i] = nums[redSt];
                nums[redSt] = tmp;
                redSt++;
                i++;
                continue;
            }
            if(nums[i] ==2){
                int tmp = nums[i];
                nums[i] = nums[bluSt];
                nums[bluSt] = tmp;
                bluSt--;
                continue;
            }
            i++;
        }
    }
}
