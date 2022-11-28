package com.boat.practice;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		int arr[] = { 20, 35, -15, 7, 55, 1, -22 };

//		int arr[] = { 8, 4, 2, 7, 10, 8, 7, 2, 1, 8 };

//		int arr[] = { 4725, 4586, 1330, 8792, 1594, 5729 };

		// Bubble Sort
		// Selection Sort
		// Insertion Sort
		// Shell Sort
		// Merge Sort
		// Quick Sort
		// Counting Sort
		// Radix Sort

		System.out.println(Arrays.toString(arr));
	}

	public static void swap(int arr[], int a, int b) {
		int temp = 0;

		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;

	}

}