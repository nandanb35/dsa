package com.boat.sort;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		int arr[] = { 20, 35, -15, 7, 55, 1, -22 };
		
		/*
		 * we will spilt the array into 2 parts
		 * |sortedArray|unsortedArray|
		 * 
		 */
		
		//assuming element at index 0 sorted
		for (int firstSortedIndex = 1; firstSortedIndex < arr.length; firstSortedIndex++) {
			
			int newElement = arr[firstSortedIndex];
			
			int i;
			//iteration starts from firstSortedIndex and decrements
			//and will check if we hit the front of the array i > 0
			//and will check if arr[i] is greater than newElement and shift it
			for (i = firstSortedIndex; i > 0 && arr[i - 1] > newElement; i--) {
				arr[i] = arr[i - 1];
			}
			arr[i] = newElement;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
