package com.jagdeep.ds.array;

import java.util.HashSet;

// Find Longest Consecutive Sum
public class ConsecutiveNum {

	public static void main(String[] args) {
		
		int[] arr = new int[]{1, 3, 8, 14, 4, 10, 2, 11};
//		Output - {1,2,3,4}
		
		findConsNum(arr);
		
	}

	private static void findConsNum(int[] arr) {
		HashSet<Integer> hS = new HashSet<>();
		
		for(int i: arr)
		hS.add(i);
		
		for(int i=0; i<arr.length; i++){
			
		}
	}

}
