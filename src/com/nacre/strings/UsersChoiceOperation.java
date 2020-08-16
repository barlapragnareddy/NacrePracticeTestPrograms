package com.nacre.strings;

import java.util.Scanner;

public class UsersChoiceOperation {

	public static void main(String[] args) {
		UsersChoiceOperation uc = new UsersChoiceOperation();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter String name");
			String name = sc.next();
			System.out.println("Enter choice");
			String choice = sc.next();
			uc.changeString(name, choice);
			System.out.println("");
			System.out.println("Press false to stop and true to continue");
			boolean b = sc.nextBoolean();
			if (!b)
				break;
		}
	}

	private void changeString(String name, String choice) {
		char[] m = name.toCharArray();
		if (choice.equalsIgnoreCase("A")) {
			System.out.println("After adding string to itself: ");
			System.out.println(name.concat(name));
		} else if (choice.equalsIgnoreCase("B")) {
			System.out.println("After replacing alternate positions with *: ");
			for (int i = 0; i < m.length; i++) {
				if (i % 2 != 0)
					m[i] = '*';
				System.out.print(m[i]);

			}
		} else if (choice.equalsIgnoreCase("C")) {
			System.out.println("after removing duplicate characters in a string: ");
			for (int i = 0; i < m.length; i++) {
				int count = 0;
				for (int j = i + 1; j < m.length; j++) {
					if (m[i] == m[j])
						count++;
				}
				if (count == 0) {
					System.out.print(m[i]);
				}
			}
		} else if (choice.equalsIgnoreCase("D")) {
			System.out.println("by changing alternate characters to uppercase: ");
			for (int i = 0; i < m.length; i++) {
				if (i % 2 != 0) {
					System.out.print((m[i] + "").toUpperCase());
				} else
					System.out.print(m[i]);
			}
		}

	}
}
