package com.jagdeep.ds.array;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		int index =  binarySearch(3,arr,0,arr.length-1);
		if(index!=-1)
			System.out.println("Index is" + index);
		else
			System.out.println("Index not found");
	}
	
	public static int binarySearch(int ele,int[] arr,int startIndex, int lastindex){
		
		if(arr.length==0)
			System.out.println("Length is zero");
		
		
		
		while(startIndex <= lastindex){
			int mid = (lastindex+startIndex)/2;
			
			if(ele==arr[mid])
				return mid;
			else if(ele<arr[mid])
				lastindex = mid; //binarySearch(ele, arr,startIndex,mid);
			else if(ele>arr[mid])
				startIndex = mid; // binarySearch(ele, arr, mid, lastindex);
		}
		return -1;
	}
}
