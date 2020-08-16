package com.nacre;

import java.util.Scanner;

public class AgeTest {
	public void checkAge(int age) {
		if(age>=18)
			System.out.println("Welcome To Fashion Show");
		else
			System.out.println("Welcome To Cartoon Show");
	}

	public static void main(String[] args) {
		AgeTest at=new AgeTest();
		System.out.println("Enter age of a person");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		sc.close();
		at.checkAge(age);
		
	}

}
