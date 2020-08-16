package com.nacre.assignments.strings.day1;

//Digit checking in a string
import java.util.Scanner;

public class DigitCheckInString {
	private String strVar;

	public String getStrVar() {
		return strVar;
	}

	public void setStrVar(String strVar) {
		this.strVar = strVar;
	}

	public static void main(String[] args) {
		DigitCheckInString dc = new DigitCheckInString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String value = sc.nextLine();
		sc.close();
		dc.setStrVar(value);
		System.out.println("Given String is:" + dc.getStrVar());
		boolean temp = dc.digitCheckingOperation();
		if (temp)
			System.out.println("Given string contains a digit");
		else
			System.out.println("Given String doesnt contains a digit");

	}

	private boolean digitCheckingOperation() {
		for (int i = 0; i < strVar.length(); i++) {
//			int num=Character.getNumericValue(strVar.charAt(i));
//			if (num >= 0 && num <= 9) {
//				count++;
//			}
			if (Character.isDigit(strVar.charAt(i))) {
				return true;
			}
		}
		return false;
	}

}
