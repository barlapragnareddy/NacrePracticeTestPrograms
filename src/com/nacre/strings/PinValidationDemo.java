package com.nacre.strings;

import java.util.Scanner;

public class PinValidationDemo {
	static String defaultPin="23456";
	static int count=0;
	static int i=3;
	private boolean validatePin(String pinEntered) {
		if(pinEntered.equals(PinValidationDemo.defaultPin))
			return true;
		else 
			return false;
	}


	public static void main(String[] args) {
		
		PinValidationDemo pd=new PinValidationDemo();
		Scanner sc=new Scanner(System.in);
		while(count<3) {
		System.out.println("Please Enter Pin");
		String pinEntered=sc.next();
		boolean b=pd.validatePin(pinEntered);
		if(b) {
			System.out.println("Valid Pin");
			break;
		}
		else if(count==2)
			System.out.println("Invalid Pin and pin no blocked for 24 hrs");
		else{
				System.out.println("Invalid Pin");
				System.out.println("You have remaining " + (i - 1) + " chances.Please provide correct pin");
			}
		count++;
		i--;
		
		}
	}

	
}
