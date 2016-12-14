package com.jagdeep.ds.strings;

public class RotateArray {

	public static void main(String[] args) {
		
		int k = 3; 
		int[] mArray = new int[]{1,2,3,4,5,6,7};
		
//		rotate(mArray,k);
		bubbleRotate(mArray,k);		
	}
	
	public static void rotate(int[] nums, int k) {
	    if(k > nums.length) 
	        k=k%nums.length;
	 
	    int[] result = new int[nums.length];
	 
	    for(int i=0; i < k; i++){
	        result[i] = nums[nums.length-k+i];
	    }
	 
	    int j=0;
	    for(int i=k; i<nums.length; i++){
	        result[i] = nums[j];
	        j++;
	    }
	 
//	    System.arraycopy( result, 0, nums, 0, nums.length );
	    for(int s:result){
	    	System.out.print(s+",");
	    }
	    
	}
	
	public static void bubbleRotate(int[] arr, int order) {
		if (arr == null || order < 0) {
		    throw new IllegalArgumentException("Illegal argument!");
		}
	 
		for (int i = 0; i < order; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}
		
		for(int s:arr){
	    	System.out.print(s+",");
	    }
	}
}
