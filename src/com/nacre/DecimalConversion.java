package com.nacre;

import java.util.Scanner;
//decimal to octal conversion

public class DecimalConversion {

	int decimalToOctal(int num) {
		int i=1,sum=0;
		while (num != 0) {
			sum = sum+(num % 8)*i;
			num=num/10;
			i=i*10;
			
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Enter decimal number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		DecimalConversion cd = new DecimalConversion();
		int res = cd.decimalToOctal(num);
		System.out.println("Octal num is " + res);
	}

}
