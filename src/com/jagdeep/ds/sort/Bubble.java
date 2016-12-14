package com.jagdeep.ds.sort;


//COMPLEXITY IS ORDER OF N-SQUARE
public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrElement = {11,2,4,23,54,10,1,45,8};
		for (int i = 0; i < arrElement.length; i++) {
			System.out.print(arrElement[i] + " ");
		}
		bubbleSort(arrElement);
	}
	
	public static void bubbleSort(int[] arrElement){
		for(int i=0; i<arrElement.length; i++){
			for(int j=1; j<arrElement.length-i; j++){
				if(arrElement[j]<arrElement[j-1]){
					int temp = arrElement[j];
					arrElement[j] = arrElement[j-1];
					arrElement[j-1] = temp;
				}
			}
			System.out.println();
			for (int k = 0; k < arrElement.length; k++) {
				System.out.print(arrElement[k] + " ");
			}
		}
		
	}

}
