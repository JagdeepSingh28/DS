package com.jagdeep.ds.array;

public class SegregateZeroAndOne {

    void segregateArray(int[] arr){
        if(arr == null)
            System.out.println("Array cant be null");
        if(arr.length<2)
            return;

        int j = -1;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]<1){
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] arg){
        int[] arr = new int[]{0,1,0,1,1,0,0,1,1};
        SegregateZeroAndOne s = new SegregateZeroAndOne();
        s.segregateArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

}
