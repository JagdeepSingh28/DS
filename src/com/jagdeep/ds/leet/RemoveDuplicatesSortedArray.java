package com.jagdeep.ds.leet;

public class RemoveDuplicatesSortedArray {

    public static void main(String[] args) {

        int nums[] = new int[]{0,0,1,1,1,2,2,3,3,4};
        int len = removeDuplicates(nums);

        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]);
        }
    }

    public static int removeDuplicates(int[] nums) {
        int pointer1 = 0;
        int pointer2 = 1;

        while(pointer2 < nums.length){
            if(nums[pointer1] == nums[pointer2]){
                pointer2++;
            }else{
                pointer1++;
                swap(nums, pointer1, pointer2);
                pointer2++;
            }
        }
        return (pointer1+1);
    }

    private static void swap(int[] nums, int num1, int num2){
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }

}
