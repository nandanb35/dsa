package com.boat.sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int arr[] = { 20, 35, -15, 7, 55, 1, -22 };

		/*
		 * we will divide the array and then merge it
		 * 
		 */
		quickSort(arr, 0, arr.length);

		System.out.println(Arrays.toString(arr));
	}

	public static void quickSort(int arr[], int start, int end) {

		if (end - start < 2) {
			return;
		}

		// this function will return pivotIndex
		int pivotIndex = partition(arr, start, end);

		// recursive calls
		quickSort(arr, start, pivotIndex);
		quickSort(arr, pivotIndex + 1, end);

	}

	private static int partition(int[] arr, int start, int end) {

		// we will take index start as pivot index

		int pivotValue = arr[start];
		int i = start;
		int j = end;

		// checking if i did not cross j
		while (i < j) {

			// checking if i did not cross j
			// arr[j] is less than arr[i]
			// we did --j to aviod indexOutOfBoundsException
			while (i < j && arr[--j] > arr[i])
				;

			// again checking i did not cross j
			if (i < j) {
				// copying arr[j] to arr[i]
				arr[i] = arr[j];
			}

			// checking if i did not cross j
			// arr[i] is greater than arr[j]
			// we did ++i because index start is pivotValue
			while (i < j && arr[++i] < arr[j])
				;
			// again checking i did not cross j
			if (i < j) {
				// copying arr[i] to arr[j]
				arr[j] = arr[i];
			}

		}
		// now at iteration is over and pivotIndex is j
		// copying pivot value to arr[j]

		arr[j] = pivotValue;

		return j;
	}

}
