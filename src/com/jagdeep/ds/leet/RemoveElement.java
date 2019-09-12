package com.jagdeep.ds.leet;

public class RemoveElement {

    public static void main(String[] args) {

        int nums[] = new int[]{3,3,4,5,2,2,3};
        int len = removeElement(nums, 2);

        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]);
        }
    }

    public static int removeElement(int[] nums, int val){
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

//    public static int removeElement(int[] nums, int val) {
//        if(nums.length == 0)
//            return 0;
//
//        int pointer1 = nums.length-1;
//        int pointer2 = nums.length-2;
//
//        if(pointer2<0){
//            if(nums[pointer1]==val)
//                return 0;
//            else
//                return 1;
//        }
//
//        while(pointer2>0){
//            if(nums[pointer1] == val){
//                pointer1--;
//                pointer2--;
//                continue;
//            }else
//                break;
//        }
//        while(pointer2>=0){
//            if(nums[pointer2] == val){
//                swap(nums, pointer1, pointer2);
//                pointer1--;
//                pointer2--;
//            }else{
//                pointer2--;
//            }
//        }
//
//        return pointer1;
//    }

    private static void swap(int[] nums, int num1, int num2){
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }
}

