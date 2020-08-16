package com.nacre.assignments.strings.day1;

//converting string into char array and printing the elements in an array
public class StringToArrayDemo {

	public static void main(String[] args) {
		String s = "Naresh I Technologies, A Buzz Word in Training Industry";
		char[] ch = s.toCharArray();
		for (char c : ch) {
			System.out.println(c);
		}
	}

}
