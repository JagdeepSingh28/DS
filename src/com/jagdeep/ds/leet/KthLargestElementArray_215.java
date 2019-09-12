package com.jagdeep.ds.leet;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElementArray_215 {

    public static void main(String[] args) {
//        int[] nums = new int[]{3,2,3,1,2,4,5,5,6};
        int[] nums = new int[]{5,2,1,3,6,4};
        KthLargestElementArray_215 kthLargestElementArray_215 = new KthLargestElementArray_215();
//        System.out.println(kthLargestElementArray_215.findKthLargestElement(nums, 4));
        System.out.println(kthLargestElementArray_215.findKthLargestElementPriorityQueue(nums, 2));
    }

    public int findKthLargestElement(int[] num, int index){
        Arrays.sort(num);
        return num[num.length-index];
    }

    public int findKthLargestElementPriorityQueue(int[] num, int index){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int nums : num) {
            priorityQueue.add(nums);
            if(priorityQueue.size()>index)
                priorityQueue.remove();
        }
        return priorityQueue.remove();
    }
}
