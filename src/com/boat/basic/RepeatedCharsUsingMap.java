package com.boat.basic;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharsUsingMap {

	public static void main(String[] args) {
		String str = "nandan";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		// split str to char arr
		// check in map if key exists
		// if does not exist add key
		// if key exists increment

		char[] arr = str.toCharArray();

		for (char c : arr) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		
		System.out.println(map);

	}

}
