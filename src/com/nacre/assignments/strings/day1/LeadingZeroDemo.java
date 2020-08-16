package com.nacre.assignments.strings.day1;

//adding leading and trailing zeros using left and right padding of format method
import java.util.Scanner;

public class LeadingZeroDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string number");
		String number = sc.next();
		System.out.println("Enter how many digit number format by adding leading zeros using left pad");
		int num = sc.nextInt();
		sc.close();
		int a = Integer.parseInt(number);
		System.out.println(String.format("%0" + num + "d", a));
		System.out.println("By adding trailing zeros using right padding,the format is:");
		System.out.println(String.format("%" + (-num) + "s", a).replace(' ', '0'));
	}

}
