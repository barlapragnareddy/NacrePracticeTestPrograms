package com.nacre;

import java.util.Scanner;

public class RoundingNext10 {
	public int oddRounder(int num) {
		int q = 0;
		if (num < 0)
			return -1;
		else if (num == 0)
			return -2;
		else if (num % 2 == 0)
			return num;
		else {
			return (num/10 * 10) + 10;
		}

	}

	public static void main(String[] args) {
		RoundingNext10 rn = new RoundingNext10();
		System.out.println("Enter a num");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int res = rn.oddRounder(n);
		System.out.println("Next multiple of 10=" + res);

	}

}
