package com.nacre;

import java.util.Scanner;

public class Bodmas {

	public void operations(String s, int a, int b) {
		switch (s) {
		case "*":
			System.out.println(a * b);
			break;
		case "%":
			System.out.println(a % b);
			break;
		case "+":
			System.out.println(a + b);
			break;
		case "-":
			System.out.println(a - b);
			break;
		default:
			System.out.println("Symbol is not found");
		}
	}

	public void operations1(String s, int a, int b) {
		if (s.equals("*"))
			System.out.println(a * b);
		else if (s.equals("%"))
			System.out.println(a % b);
		else if (s.equals("+"))
			System.out.println(a + b);
		else if (s.equals("-"))
			System.out.println(a - b);
		else
			System.out.println("Symbol not found");
	}

	public static void main(String[] args) {
		int a, b;
		Bodmas bd = new Bodmas();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
		a = sc.nextInt();
		System.out.println("Enter b:");
		b = sc.nextInt();
		System.out.println("Enter string s:");
		String s = sc.next();
		sc.close();
//		bd.operations(s, a, b);
		bd.operations1(s, a, b);
	}

}
