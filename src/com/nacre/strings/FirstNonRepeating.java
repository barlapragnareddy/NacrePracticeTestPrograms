package com.nacre.strings;

public class FirstNonRepeating {

	public static void main(String[] args) {
		String str = "pragna barlap";
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j))
					count++;
			}
			if (count == 0) {
				System.out.println("First Non Repeating char: " + str.charAt(i));
				break;
			}
		}
	}
}