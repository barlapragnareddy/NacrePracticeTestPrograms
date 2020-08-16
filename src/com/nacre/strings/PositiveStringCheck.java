package com.nacre.strings;

import java.util.Scanner;

public class PositiveStringCheck {

	public static void main(String[] args) {
		PositiveStringCheck ps = new PositiveStringCheck();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String name");
		String name = sc.next();
		boolean b = ps.checkPositive(name);
		if (b) {
			System.out.println("String is positive");
		} else
			System.out.println("String is negative");
	}
	private boolean checkPositive(String name) {
		char[] arrayName = name.toCharArray();
		for (int i = 0; i < arrayName.length-1; i++) {
			int c = arrayName[i] + "".compareTo(arrayName[i + 1] + "");
			if (c == 1) {
				continue;
			} else if (c == -1 || c == 0) {
				return false;
			}
		}
		return true;

	}
}
