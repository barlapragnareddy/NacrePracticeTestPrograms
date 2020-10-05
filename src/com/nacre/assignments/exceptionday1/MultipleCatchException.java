package com.nacre.assignments.exceptionday1;

//Multiple catch example
public class MultipleCatchException {

	public static void main(String[] args) {
		MultipleCatchException mc = new MultipleCatchException();
		mc.multiCatch();

	}

	private void multiCatch() {
		int[] arr = new int[2];
		try {
			arr[1] = 10;
			// arr[4] = 10 / 2;
			arr[4] = 10 / 0;
		} catch (ArrayIndexOutOfBoundsException a) {
			a.printStackTrace();
			System.out.println("Array index out of bounds exception");

		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("Arithmetic exception occured");

		}
	}

}
