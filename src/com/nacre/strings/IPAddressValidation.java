package com.nacre.strings;

import java.util.Scanner;

public class IPAddressValidation {

	public static void main(String[] args) {
		IPAddressValidation iv = new IPAddressValidation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string ");
		String name = sc.nextLine();
		boolean b = iv.validateIP(name);
		if (b) {
			System.out.println("Valid IP Address");
		} else
			System.out.println("Not a valid address");

	}

	private boolean validateIP(String name) {
		String[] arr = name.split("[.]");
		if (arr.length == 4) {
			for (int i = 0; i < arr.length; i++) {
				Integer i1 = new Integer(arr[i]);
				int i2 = i1.intValue();
				if (i2 >= 0 && i2 <= 255)
					continue;
				else
					return false;
			}
		} else
			return false;
		return true;

	}
}
