package com.nacre.strings;

import java.util.Scanner;

//User name validation
public class CheckingUSerName {

	private boolean validateUserName(String userName) {
		// calculating index of "_job".Then use it as argument for substring.
		String s1 = userName.substring(0, userName.lastIndexOf("_job"));
		// logic for validation
		if (userName.endsWith("_job") && s1.length() >= 8)
			return true;
		else
		return false;
	}

	public static void main(String[] args) {
		CheckingUSerName c = new CheckingUSerName();
		System.out.println("Enter Username");
		Scanner sc = new Scanner(System.in);
		String userName = sc.next();
		boolean b = c.validateUserName(userName);
		System.out.println(b);
		if (b)
			System.out.println("Username is accepted ");
		else
			System.out.println("Username is not accepted");
	}

}
