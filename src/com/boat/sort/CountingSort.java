package com.boat.sort;

import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
		// we assume array values are positive
		// and its within specific range and cant be huge
		// unstable algorithm

		int arr[] = { 8, 4, 2, 7, 10, 8, 7, 2, 1, 8 };

		countingSort(arr, 1, 10);

		System.out.println(Arrays.toString(arr));

	}

	private static void countingSort(int[] arr, int min, int max) {

		int countArr[] = new int[(max - min) + 1];

		for (int i = 0; i < arr.length; i++) {
			countArr[arr[i] - min]++;
		}

//		System.out.println(Arrays.toString(countArr));

		int j = 0;

		for (int i = min; i <= max; i++) {

			while (countArr[i - min] > 0) {
				arr[j++] = i;
				countArr[i - min]--;
			}

		}

	}

}
