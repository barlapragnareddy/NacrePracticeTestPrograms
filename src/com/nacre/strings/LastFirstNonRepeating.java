package com.nacre.strings;

public class LastFirstNonRepeating {

	public static void main(String[] args) {
		String str = "pragna barlap";
		for (int i = str.length() - 1; i >= 0; i--) {
			int count = 0;
			for (int j = i - 1; j >= 0; j--) {
				if (str.charAt(i) == str.charAt(j))
					count++;
			}
			if (count == 0) {
				System.out.println("Last First Non Repeating char: " + str.charAt(i));
				break;
			}
		}
	}

}
