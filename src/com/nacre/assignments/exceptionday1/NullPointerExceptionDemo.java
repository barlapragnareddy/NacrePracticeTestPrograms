package com.nacre.assignments.exceptionday1;

//Null Pointer Exception Example
public class NullPointerExceptionDemo {

	public static void main(String[] args) {
		NullPointerExceptionDemo np = new NullPointerExceptionDemo();
		np.checkNullPointer();
	}

	private void checkNullPointer() {
		try {
			String str = null;
			System.out.println("String length:" + str.length());
		} catch (NullPointerException n) {
			n.printStackTrace();
			System.out.println("Null Pointer Exception Occurred");
		}
	}

}
