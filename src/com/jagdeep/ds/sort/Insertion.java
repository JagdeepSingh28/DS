package com.jagdeep.ds.sort;

import com.jagdeep.ds.Utils;

// COMPLEXITY IS ORDER OF N-SQUARE
public class Insertion {

	public static void main(String[] args) {
		int[] arrElement = {11,2,4,23,54,10,1,45,8};
		for (int i = 0; i < arrElement.length; i++) {
			System.out.print(arrElement[i] + " ");
		}
		insertionSort(arrElement);
	}

	private static void insertionSort(int[] array) {
		
		for(int i=1; i<array.length; i++){
			int n = i;
			
			while(n>0 && array[n]<array[n-1]){
				Utils.swapArray(array,n, n-1);
				n--;
			}
		}
		
		System.out.println();
		for (int k = 0; k < array.length; k++) {
			System.out.print(array[k] + " ");
		}
	}
	
}
