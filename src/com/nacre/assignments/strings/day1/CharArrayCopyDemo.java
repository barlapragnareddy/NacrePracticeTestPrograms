package com.nacre.assignments.strings.day1;

//Converting char array to String using valueOf and copyValueOf methods
import java.util.Scanner;

public class CharArrayCopyDemo {

	public static void main(String[] args) {
//		ch = { 'n', 'a', 'r', 'e', 's', 'h', 'i', 't', 'e', 'c', 'h' };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		char[] ch = new char[size];
		System.out.println("Enter array elements");
		for (int i = 0; i < size; i++) {
			char c = sc.next().charAt(0);
			ch[i] = c;
		}
		sc.close();
		System.out.println("Using char[]arg:" + String.valueOf(ch));
		System.out.println("-------------------------");
		String s = "";
		for (int i = 0; i < ch.length; i++) {
			s = s + String.valueOf(ch[i]);
		}
		System.out.println("Using char arg:" + s);
		System.out.println("----------------------------------");
		System.out.println("Using copyValue of:" + String.copyValueOf(ch));

	}

}
