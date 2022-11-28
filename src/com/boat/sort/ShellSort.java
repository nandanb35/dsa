package com.boat.sort;

import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 20, 35, -15, 7, 55, 1, -22 };
		
		/*
		 * improvement of insertion sort
		 * we will use gap concept to reduce shifting
		 */

		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			
			for (int i = gap; i < arr.length; i++) {
				
				int newElement = arr[i];
				
				int j = i;
				
				while (j >= gap && arr[j - gap] > newElement) {
					arr[j] = arr[j - gap];
					j -= gap;
				}
				arr[j] = newElement;
			}

		}

		System.out.println(Arrays.toString(arr));

	}

}
