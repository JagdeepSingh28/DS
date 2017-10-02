package com.jagdeep.ds;

public class Utils {

/*SORTING EFFIENCY OF ALGOS	
 * 
 * BUBBLE SORT < SELECTION SORT < INSERTION SORT
 */
	
	public static void swapArray(int A[], int pos1, int pos2){
		int temp = A[pos1];
		A[pos1] = A[pos2];
		A[pos2] = temp;
	}

	public static void print(String str){
		System.out.println(str);
	}

	public static void print(int str){
		System.out.println(String.valueOf(str));
	}
	
}
