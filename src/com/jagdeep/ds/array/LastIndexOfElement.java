package com.jagdeep.ds.array;

/***
 * Given a sorted array of integers containing duplicates, write a program which returns the last index of an element.
 *
 * Example:
 * Input:
 * array = {0, 1, 2, 2, 4, 5, 5, 5, 8};
 * num = 5;
 * Output:
 * Element 5 found at index 7
 */
public class LastIndexOfElement {

    public static void main(String[] arg){
        int[] arr = {0, 1, 2, 2, 4, 5, 5, 5, 8};
        int num = 9;
        System.out.println(findLastIndexOfElementBinary(arr, num));
    }

    // Complexity is O(n)
    private static int findLastIndexOfElementLinear(int[] arr, int num) {

        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                if(i+1<arr.length && arr[i+1]!=num){
                    return i;
                }else if(i+1 == arr.length){
                    return i;
                }
            }
        }
        return -1;
    }

//    O(log n)
    private static int findLastIndexOfElementBinary(int[] array, int num) {

        if (array == null || array.length == 0) {
            return -1;
        }

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if ( (array[mid] == num) && ((mid == end) || (array[mid + 1] > num)) ) {
                return mid;
            } else if (num < array[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

}
