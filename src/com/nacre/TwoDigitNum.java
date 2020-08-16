package com.nacre;
//sum of digits in a 2 digit number
import java.util.Scanner;

public class TwoDigitNum {
	public int sumOfDigits(int num) {
		return (num % 10) + (num / 10) % 10;
	}

	public static void main(String[] args) {
		System.out.println("enter num");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		TwoDigitNum nd = new TwoDigitNum();
		int res = nd.sumOfDigits(num);
		System.out.println("sum of digits is " + res);
	}

}
