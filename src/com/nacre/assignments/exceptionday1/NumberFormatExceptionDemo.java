package com.nacre.assignments.exceptionday1;

//Number Format Exception Example
public class NumberFormatExceptionDemo {

	public static void main(String[] args) {
		NumberFormatExceptionDemo ne = new NumberFormatExceptionDemo();
		ne.checkNumberExcetion();
	}

	private void checkNumberExcetion() {
		try {
			// we are trying to pass string value of string type
			int num = Integer.parseInt("60");
			System.out.println("Value of num=" + num);
		} catch (NumberFormatException nf) {
			nf.printStackTrace();
			System.out.println("Number Format Exception Occured");
		}
	}

}
