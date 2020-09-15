package com.jagdeep.ds.leet;

public class _287_find_duplicate {

    public static void main(String[] args) {
        _287_find_duplicate find_duplicate = new _287_find_duplicate();
        System.out.println(find_duplicate.findDuplicate(new int[]{1, 3, 2, 4, 5, 3}));
    }

    public int findDuplicate(int[] nums) {
        if (nums.length > 1)
        {
            int slow = nums[0];
            int fast = nums[nums[0]];
            while (slow != fast)
            {
                slow = nums[slow];
                fast = nums[nums[fast]];
            }

            fast = 0;
            while (fast != slow)
            {
                fast = nums[fast];
                slow = nums[slow];
            }
            return slow;
        }
        return -1;
    }
}
