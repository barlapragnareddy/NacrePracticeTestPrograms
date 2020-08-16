package com.nacre;

import java.util.Scanner;
//nearest 100 multiple
public class Next100M {
	public int nextMultiple(int num) {
		return (num / 100 + 1) * 100;
	}

	public static void main(String[] args) {
		System.out.println("enter num");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		Next100M nd = new Next100M();
		int res = nd.nextMultiple(num);
		System.out.println("Next multiple of 100: " + res);
	}
}
