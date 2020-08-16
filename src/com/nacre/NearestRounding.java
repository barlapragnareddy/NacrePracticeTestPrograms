package com.nacre;

import java.util.Scanner;
//multiple 10 nearest
public class NearestRounding {
	public int nextMultiple(int num) {
		int rem = num % 10;
		int quo = num / 10;
		boolean a = (rem > 5) && (quo == quo++);
		return quo * 10;
		
	}

	public static void main(String[] args) {
		System.out.println("enter num");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		NearestRounding nd = new NearestRounding();
		int res = nd.nextMultiple(num);
		System.out.println("Next multiple of 10 : " + res);
	}

}
