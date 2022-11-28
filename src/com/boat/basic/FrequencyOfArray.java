package com.boat.basic;

import java.util.Arrays;

public class FrequencyOfArray {

	public static void main(String[] args) {
		String str = "nandan";
		
		char[] arr = str.toCharArray();
		
		int fr[] = new int[arr.length];
		
		
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				
				if (arr[i] == arr[j]) {
					count ++;
					fr[j] = -1;
				}

			}
			
			if (fr[i] != -1) {
				fr[i] = count;
			}
		}
		
		System.out.println(Arrays.toString(fr));
	}
	
}
