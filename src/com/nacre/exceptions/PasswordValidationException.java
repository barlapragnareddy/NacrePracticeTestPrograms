package com.nacre.exceptions;
//UserDefined exception class example
import java.util.Scanner;
@SuppressWarnings("serial")
public class PasswordValidationException extends Exception {
	public PasswordValidationException(String s) {
		super(s);
	}
	public PasswordValidationException() {
	}
	public static void main(String[] args) {
		PasswordValidationException pe = new PasswordValidationException();
		System.out.println("Please Enter Password");
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			String password = sc.next();
			pe.validatePassword(password);
		} catch (PasswordValidationException p) {
			p.printStackTrace();
		} finally {
			sc.close();
			System.out.println("password validation completed....");
		}
	}
	public void validatePassword(String password) throws PasswordValidationException {
		int count = 0;
		if (password.length() > 8 && (password.charAt(0) >= 'a' && password.charAt(0) <= 'z')) {
			for (int i = 0; i < password.length(); i++) {
				char ch = password.charAt(i);
				int a = ch;
				if (a >= 32 && a <= 47 || a >= 58 && a <= 64 || a >= 91 && a <= 96 || a >= 123 && a <= 126) {
					count++;
					break;
				}}
			if (count >= 1) {
				System.out.println("Password is strong");
			} else
				throw new PasswordValidationException("Password doesnot met the requirements");
		} else {
			throw new PasswordValidationException("Password doesnot met the requirements");
		}
	}

}
