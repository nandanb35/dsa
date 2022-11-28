package com.boat.basic;

public class FibinocciSeries {

	public static void main(String[] args) {

		// 1 2 3 5 8
		// c = a + b
		// a = b;
		// b = c;

		int a = 0, b = 1, c = 0;

		for (int i = 0; i < 10; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
		
		

	}

	
}
