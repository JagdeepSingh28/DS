package com.jagdeep.ds.leet;

import java.util.Arrays;

public class PartitionEqualSubset {

    public static void main(String[] args) {

        PartitionEqualSubset  isEqualPartitionSubset= new PartitionEqualSubset();

        int[] arr = new int[]{1, 5, 11, 5};
//        int[] arr = new int[]{1,2,3,4,5,6,7};
//        System.out.print(isEqualPartitionSubset.isEqualPartitionSubset(arr));

        System.out.print(isSubsetSum(arr, arr.length, 11));
    }

    static boolean isSubsetSum (int arr[], int n, int sum)
    {
        // Base Cases
        if (sum == 0)
            return true;
        if (n == 0 && sum != 0)
            return false;

        // If last element is greater than sum, then ignore it
        if (arr[n-1] > sum)
            return isSubsetSum (arr, n-1, sum);

        /* else, check if sum can be obtained by any of
           the following
        (a) including the last element
        (b) excluding the last element
        */
        return isSubsetSum (arr, n-1, sum) ||
                isSubsetSum (arr, n-1, sum-arr[n-1]);
    }

    private boolean isEqualPartitionSubset(int[] arr){
        if(arr==null || arr.length == 0)
            return false;

        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        int sum_i = arr[i];
        int sum_j = arr[j];

        while(i<j){

            if(sum_i == sum_j && i == j-1)
                return true;

            if(sum_i<sum_j){
                i++;
                sum_i = sum_i + arr[i];
            }
            else{
                j--;
                sum_j = sum_j + arr[j];
            }
        }

        return false;
    }
}
