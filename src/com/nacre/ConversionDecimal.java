package com.nacre;

import java.util.Scanner;

public class ConversionDecimal {

	int decimalToOctal(int n) {
		String s = "";
		int r;
		while (n != 0) {
			r = n % 8;// r=7,r=2
			s = r + s;// s=7+"=7, s=2+7=27
			n = n / 8;// n=2
		}
		return Integer.valueOf(s);
	}

	public static void main(String[] args) {
		System.out.println("Enter decimal number");//num=023
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		ConversionDecimal cd = new ConversionDecimal();
		int res = cd.decimalToOctal(num);
		System.out.println("Octal num is "+ res);
	}

}
