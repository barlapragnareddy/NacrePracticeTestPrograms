package com.nacre.assignments.strings.day1;

import java.util.Scanner;

//Checking string present in given string using contains method
public class CheckStringByContains {

	public static void main(String[] args) {
		CheckStringByContains cs = new CheckStringByContains();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		sc.close();
		boolean b = cs.checkStringSequence(str);
		if (b)
			System.out.println("Specified string is present in given string ");
		else
			System.out.println("Specified string not present");
	}

	private boolean checkStringSequence(String str) {

		return str.contains("party");// checking 'party' string in user entered string
	}

}
