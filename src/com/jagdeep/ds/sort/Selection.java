package com.jagdeep.ds.sort;

//COMPLEXITY IS ORDER OF N-SQUARE
public class Selection {
	
	public static void main(String[] args) {
		
		int[] arrElement = {11,2,4,23,54,10,1,45,8};
		for (int i = 0; i < arrElement.length; i++) {
			System.out.print(arrElement[i] + " ");
		}
		selectionSort(arrElement);
	}

	private static void selectionSort(int[] arrElement) {
		for (int i = 0; i < arrElement.length-1; i++) {
			int largestElementPos = 0;
			for (int j = 0; j < arrElement.length-i; j++) {
				if(arrElement[largestElementPos]<arrElement[j]){
					largestElementPos = j;
				}
			}
			int temp = arrElement[largestElementPos];
			arrElement[largestElementPos] = arrElement[arrElement.length-i-1] ;
			arrElement[arrElement.length-i-1] = temp;
		}
		System.out.println();
		for (int k = 0; k < arrElement.length; k++) {
			System.out.print(arrElement[k] + " ");
		}
	}
	
}
