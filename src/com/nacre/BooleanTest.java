package com.nacre;

import java.util.Scanner;

public class BooleanTest {
	public boolean countBoolean(boolean b1, boolean b2, boolean b3) {
		return (b1 && b2 ? true : (b2 && b3 ? true : (b1 && b3 ? true : false)));
	}

	public static void main(String[] args) {

		BooleanTest bt = new BooleanTest();
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (n != 1) {
			System.out.println("Enter boolean values:");
			boolean b1 = sc.nextBoolean();
			boolean b2 = sc.nextBoolean();
			boolean b3 = sc.nextBoolean();

			boolean b4 = bt.countBoolean(b1, b2, b3);
			System.out.println(b4);

			System.out.println("Enter 0 to continue else 1 to stop");
			n = sc.nextInt();
		}
		sc.close();
	}

}
