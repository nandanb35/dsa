package com.boat.sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 20, 35, -15, 7, 55, 1, -22 };

		/*
		 * we will divide the array and then merge it
		 * 
		 */
		mergeSort(arr, 0, arr.length);

		System.out.println(Arrays.toString(arr));

	}

	public static void mergeSort(int[] arr, int start, int end) {

		// this means only 1 element left in array
		if (end - start < 2) {
			return;
		}

		int middle = (start + end) / 2;

		// dividing the array using recursion
		mergeSort(arr, start, middle);
		mergeSort(arr, middle, end);

		// merging using recursion
		merge(arr, start, middle, end);
	}

	public static void merge(int[] arr, int start, int mid, int end) {

		// this means all the elements in left of the array are less than 
		// all the elemetns in the right of the array
		// because they are sorted
		if (arr[mid - 1] <= arr[mid]) {
			return;
		}

		int[] tempArr = new int[end - start];

		int tempIndex = 0;

		int i = start;
		int j = mid;

		while (i < mid && j < end) {
			tempArr[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
		}

		// to copy left over elements
		// {32, 34} {33, 36} -> 36 will not be copied into temp array as its in its
		// correct position
		// {32, 33, 34, }

		// to copy left over elements
		// {32, 36} {33, 34} -> 36 will not be copied because while loop will be break
		// {32, 33, 34, } -> i will be in current postion, which is 1
		// -> start + tempIndex (0 + 3)
		// -> mid - i (2 - 1)
		System.arraycopy(arr, i, arr, start + tempIndex, mid - i);
		System.arraycopy(tempArr, 0, arr, start, tempIndex);

	}
}
