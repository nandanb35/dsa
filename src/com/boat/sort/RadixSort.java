package com.boat.sort;

import java.util.Arrays;

public class RadixSort {

	public static void main(String[] args) {
		// assumes data
		// data must have same radix and width
		// data must be integers and string
		// stable algorithm

		int arr[] = { 4725, 4586, 1330, 8792, 1594, 5729 };

//		System.err.println(getDigit(4725, 3, 10));

		radixSort(arr, 4, 10);

		System.out.println(Arrays.toString(arr));

	}

	private static void radixSort(int[] arr, int width, int radix) {
		for (int i = 0; i < width; i++) {
			radixSingleSort(arr, i, radix);
		}

	}

	private static void radixSingleSort(int[] arr, int position, int radix) {

		int[] countArr = new int[radix];

		// counting array
		for (int i = 0; i < arr.length; i++) {
			countArr[getDigit(arr[i], position, radix)]++;
		}

		System.out.println("postion  : " + position + " ->" + Arrays.toString(countArr));

		// Adjust the count array
		for (int i = 1; i < radix; i++) {
			countArr[i] += countArr[i - 1];
		}

		System.out.println("adjust   : " + position + " ->" + Arrays.toString(countArr));

		int tempArr[] = new int[arr.length];

		for (int i = tempArr.length - 1; i >= 0; i--) {
			tempArr[--countArr[getDigit(arr[i], position, radix)]] = arr[i];
		}

		System.arraycopy(tempArr, 0, arr, 0, arr.length);

		System.out.println("copying  : " + position + " ->" + Arrays.toString(arr));

		System.out.println();

	}

	public static int getDigit(int number, int position, int radix) {
		return (number / (int) Math.pow(10, position)) % radix;
	}
}
