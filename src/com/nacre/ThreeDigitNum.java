package com.nacre;

import java.util.Scanner;
//three digit num
public class ThreeDigitNum {
	public int sumOfThree(int n) {
		int q = n / 10;
		return n % 10 + q % 10 + (q / 10) % 10;
	}

	public static void main(String[] args) {
		System.out.println("enter num");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		ThreeDigitNum nd = new ThreeDigitNum();
		int res = nd.sumOfThree(num);
		System.out.println("sum of digits is " + res);
	}

}
