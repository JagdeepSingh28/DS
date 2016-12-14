package com.jagdeep.ds.dynamic;

public class RodCutting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int profit = profit(new int[]{1,5,8,9,10,17,17,20,24,30},10);
		System.out.println(profit);

	}
	
	public static int profit(int[] value, int length) {
		if (length <= 0)
			return 0;
			// either we will cut it or don't cut it
			int max = -1;
			for(int i=0;i<length;i++)
				max = Math.max(max, value[i] + profit(value, length-(i+1)));			
			return max;		
	}

}
