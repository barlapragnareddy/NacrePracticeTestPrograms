package com.nacre.assignments.exceptionday1;

//Array Index Out Of Bounds Exception Example
public class ArrayIndexExceptionDemo {

	public static void main(String[] args) {
		ArrayIndexExceptionDemo aie = new ArrayIndexExceptionDemo();
		aie.checkIndexBoundsException();

	}

	private void checkIndexBoundsException() {
		try {
			int[] arr = new int[50];
			arr[60] = 20;
			System.out.println("Value of 6th index in array is: " + arr[6]);
		} catch (ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();
			System.out.println("Array Index Out Of Bounds Exception");
		}
	}

}
