package com.jagdeep.ds.array;

public class MajorityElement2 {

	static int count = 0;
	static int candidate = 0;
	
	public static void main(String[] args) {
		int majorityElement = findMajorityElement(new int[]{1,2,2,1,2,2});
		if(count == 0)
			System.out.println("No Majority Element");
		else
			System.out.println(majorityElement);
	}

	private static int findMajorityElement(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			if(count == 0){
				candidate = arr[i];
				count++;
			}else{
				if(candidate == arr[i])
					count++;
				else
					count--;
			}
		}
		System.out.println(count);
		return candidate;
	}
	
	
	
}
