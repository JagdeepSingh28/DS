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
	
}
