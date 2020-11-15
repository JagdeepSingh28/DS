package com.jagdeep.ds.leet;

public class _35_search_insert_position {

    public static void main(String[] args) {
        int[] ints = {1,3,5,6,8};
//        System.out.println(search(ints, ints.length, 5));
        System.out.println(searchInsert(ints, 9));
    }

    public static int searchInsert(int[] A, int target) {
        int low = 0, high = A.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(A[mid] == target) return mid;
            else if(A[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
}
