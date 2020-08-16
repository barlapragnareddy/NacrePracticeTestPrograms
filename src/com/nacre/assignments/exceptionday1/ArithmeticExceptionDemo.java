package com.nacre.assignments.exceptionday1;

//Arithmetic exception example
public class ArithmeticExceptionDemo {
	private void checkException() {
		try {
			int num1 = 30;
			int num2 = 0;
			int operation = num1 / num2;
			System.out.println("Result:" + operation);
		} catch (ArithmeticException a) {
			a.printStackTrace();
			System.out.println("You Shouldn't divide a number by zero");
		}
	}

	public static void main(String[] args) {
		ArithmeticExceptionDemo ae = new ArithmeticExceptionDemo();
		ae.checkException();
	}
}
