package com.boat.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 20, 35, -15, 7, 55, 1, -22 };

		/*
		 * we will spilt the array into 2 parts
		 * |unsortedArray|sortedArray|
		 * in each iteration max value element will be moved to the end of the unsorted array
		 * and the unsortedArrayIndex is decreased
		 */

		int temp = 0;
		for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));

	}

}
