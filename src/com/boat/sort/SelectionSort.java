package com.boat.sort;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		int arr[] = { 20, 35, -15, 7, 55, 1, -22 };
		
		/*
		 * we will spilt the array into 2 parts
		 * |unsortedArray|sortedArray|
		 * in each iteration max value element and it will be swapped with the last element of the unsorted array
		 * and the unsortedArrayIndex is decreased
		 */
		
		int temp = 0;
		for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			int largestIndex = 0;
			for (int i = 0; i <= lastUnsortedIndex; i++) {
				if (arr[i] > arr[largestIndex]) {
					largestIndex = i;
				}
			}
			//swapping
			temp = arr[largestIndex];
			arr[largestIndex] = arr[lastUnsortedIndex];
			arr[lastUnsortedIndex] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
