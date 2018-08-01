/**
 * 
 */
package com.jagdeep.ds.strings;

/**
 * @author jagdeep.singh
 *
 */
public class SearchInRotatedArray {

	public static void main(String[] args) {
		int[] arr = {6,7,8,9,10,11,12,13,1,2,3,4,5};
		int element = 13;
		
		searchElementRecurrsion(arr, element , 0, arr.length-1);
	
	}
	
	private static int searchElementRecurrsion(int[] arr, int element, int start, int end ) {
		if(arr.length<=0)
			return -1;
		
		int mid = (end - start)/2; 
		if(arr[mid] == element){
			return mid;
		}
		
//		[{6,7,8,9,10,11},12,13,1,2,3,4,5]
//		[13,1,2,3,4,5,6,7,8,9,10,11,12]
		if(arr[start]<element && element<arr[mid]){
			searchElementRecurrsion(arr, element , 0, mid-1);
		}else if(arr[mid]<element && element<arr[end]){
			searchElementRecurrsion(arr, element , mid, end);
		}
		
		return -1;
	}
}
