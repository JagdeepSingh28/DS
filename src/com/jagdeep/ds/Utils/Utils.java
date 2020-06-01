package com.jagdeep.ds.Utils;

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

	public static void printIntegerArray(int A[]){
		System.out.print("[");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]);
			if(i!=A.length-1)
				System.out.print(", ");
		}
		System.out.print("]");
	}

	public static void println(String str){
		System.out.println(str);
	}

	public static void println(int str){
		System.out.println(String.valueOf(str));
	}

	public static void print(String str){
		System.out.print(str);
	}

	public static void print(int str){
		System.out.print(String.valueOf(str));
	}
	
}
