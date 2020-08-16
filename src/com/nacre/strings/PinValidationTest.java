package com.nacre.strings;

import java.util.Scanner;

public class PinValidationTest {
	private static int count = 0;
	private static int i = 3;

	private boolean pinValidate(String string) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the pin no:");
		String enteredPin = sc.next();
		if (enteredPin.equals(string))
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		PinValidationTest pv = new PinValidationTest();
		while (count < 3) {
			boolean b1 = pv.pinValidate("23456");
			if (b1) {
				System.out.println("Valid Pin");
				break;
			} else if (count == 2) {
				System.out.println("Invalid pin and pin no blocked");
				break;
			} else {
				System.out.println("Invalid pin");
				System.out.println("You have remaining " + (i - 1) + " chances. Please provide correct password");
			}
			i--;
			count++;
		}
	}
}
