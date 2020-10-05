package com.nacre.assignments.exceptionday1;

//String Index Out Of Bounds Exception
public class StringIndexBoundsExceptionDemo {

	public static void main(String[] args) {
		StringIndexBoundsExceptionDemo si = new StringIndexBoundsExceptionDemo();
		si.checkStringIndexException();

	}

	private void checkStringIndexException() {
		try {
			String str = "Hello World";
			System.out.println("String length:" + str.length());
			char c = str.charAt(6);
			System.out.println(c);
			char d = str.charAt(15);
			System.out.println(d);
		} catch (StringIndexOutOfBoundsException sb) {
			sb.printStackTrace();
			System.out.println("String Index Out Of Bounds Exception!");
		}
	}

}
