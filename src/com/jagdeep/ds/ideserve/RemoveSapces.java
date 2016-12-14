package com.jagdeep.ds.ideserve;

import java.util.Arrays;

public class RemoveSapces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String withSpaceString = "Hi, How are you doing?";
		String withoutSpaceString = removeSpace(withSpaceString);
		
		
		System.out.println("String without Space is"+ withoutSpaceString);
		
	}

	private static String removeSpace(String withSpaceString) {
		
		char[] mCharArray = withSpaceString.toCharArray();
		int spaceCount = 0;
		
		for (int i = 0; i < mCharArray.length; i++) {
			if(mCharArray[i] == ' '){
				spaceCount ++;
			}else{
				mCharArray[i - spaceCount] = mCharArray[i];
			}
		}
		
		mCharArray = Arrays.copyOf(mCharArray, mCharArray.length - spaceCount);
		
		return new String(mCharArray);
		
	}

}
