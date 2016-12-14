package com.jagdeep.ds.sort;

public class Merge {

	public static void main(String[] args) {
		
		int A[] = {1,2,10};
		int B[] = {8,11,12,23,35};
		int C[] = new int[A.length + B.length];
		
		merge(A, A.length, B, B.length, C);
	}
	
	public static void merge(int[] A, int m , int[] B, int n , int[] C){
		
		int i=0; int j= 0; int k = 0;
		
		while(k<m+n){
			if(j==n || A[i]<=B[j]){
				C[k] = A[i];
				i++;
				k++;
			}else if(i == m || B[j]<=A[i]){
				C[k] = B[j];
				j++;
				k++;
			}
		}
		
		for (int k2 = 0; k2 < C.length; k2++) {
			System.out.println(C[k2]);
		}
	}
}
