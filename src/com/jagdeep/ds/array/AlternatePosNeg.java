package com.jagdeep.ds.array;

public class AlternatePosNeg {

    public static void alternateArray(int[] arr){

        int n = arr.length;

        int i =-1;
        for(int j = 0; j<n; j++){
            if(arr[j]<0){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // I represent the last index of negative no.


        int pos = i+1;
        int neg = 0;

        while(pos < n && neg < pos ){
            int temp = arr[pos];
            arr[pos] = arr[neg];
            arr[neg] = temp;

            pos++;
            neg+=2;
        }

        // Print all array
        for (int a : arr) {
            System.out.println(a);
        }

    }

    public static void main(String[] arg){
        int[] arr = new int[]{-1,2,-3,4,-5,-6,-7,-8,-9};
        alternateArray(arr);
    }

}
