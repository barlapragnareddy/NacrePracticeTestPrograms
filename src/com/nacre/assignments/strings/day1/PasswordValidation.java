package com.nacre.assignments.strings.day1;
//Password validation 

import java.util.Scanner;

public class PasswordValidation {
	public static void main(String[] args) {
		PasswordValidation pv = new PasswordValidation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a password");
		String password = sc.next();
		sc.close();
		boolean b = pv.checkPassword(password);
		if (b)
			System.out.println("Valid password");
		else
			System.out.println("Not a valid password");
	}
	private boolean checkPassword(String password) {
		int count = 0, temp = 0, flag = 0;
		if (password.length() != 8)  return false;
		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);
			int a = ch;
			if (ch >= 'a' && ch <= 'z') {
				count++;
			}
			if (ch >= 'A' && ch <= 'Z') {
				temp++;
			}
			if (a >= 32 && a <= 47 || a >= 58 && a <= 64 || a >= 91 && a <= 96 || a >= 123 && a <= 126) {
				flag++;
			}
		}
		if (count >= 1 && temp >= 1 && flag >= 1)
			return true;
		else
			return false;
	}
}
