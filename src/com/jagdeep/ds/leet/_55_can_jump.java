package com.jagdeep.ds.leet;

public class _55_can_jump {
    public static void main(String[] args) {
        canJump(new int[]{3,3,1,0,4});
    }

    public static boolean canJump(int[] nums) {
        if(nums.length < 2) return true;

        for(int curr = nums.length-2; curr>=0;curr--){
            if(nums[curr] == 0){
                int neededJumps = 1;
                while(neededJumps > nums[curr]){
                    neededJumps++;
                    curr--;
                    if(curr < 0) return false;
                }
            }
        }
        return true;
    }
}
