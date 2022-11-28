package com.boat.basic;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 54819;
		int reverseNum = 0;
		int sum = 0;
		
		while (num > 0) {
			reverseNum = num % 10;
			sum = (sum * 10) + reverseNum;
			num = num / 10;
		}
		
		
		
		System.out.println(sum);
	}
	
}
