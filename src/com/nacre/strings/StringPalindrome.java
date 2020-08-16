package com.nacre.strings;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		StringPalindrome sp = new StringPalindrome();
		System.out.println("Please enter a string:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		boolean b = sp.palindromeOperation(s);
		if (b)
			System.out.println("Palindrome string");
		else
			System.out.println("Not a palindrome string");
	}

	private boolean palindromeOperation(String s) {
		int len = s.length();
		for (int i = 0; i < len; i++) {
			len--;
			if (s.charAt(i) == s.charAt(len)) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

}
