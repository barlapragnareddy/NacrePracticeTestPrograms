package com.nacre.assignments.exceptionday1;

//One multi catch block example
public class OneMultiCatchBlock {

	public static void main(String[] args) {
		OneMultiCatchBlock om = new OneMultiCatchBlock();
		om.multiCatchExceptions();
	}

	private void multiCatchExceptions() {
		int[] arr = new int[2];
		try {
			arr[1] = 10;
			// arr[4] = 10 / 2;
			arr[4] = 10 / 0;
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
			e.printStackTrace();
			System.out.println("Exception occurred");

		}
	}

}
