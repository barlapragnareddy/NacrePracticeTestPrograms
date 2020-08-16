package com.myexamples.exceptions;
//custom exception use of catch
class MyException extends Exception {
	String str1;
	public MyException() {
		super();
	}

	public MyException(String msg) {
		super(msg);
		this.str1=msg;
	}

	@Override
	public String toString() {
		return "MyException [str1=" + str1 + "]";
	}

}

public class CustomExceptionTest {
	public static void main(String[] args) {
		CustomExceptionTest c = new CustomExceptionTest();
		int a = c.m1("Manoj");
		System.out.println(a);
		if(a==10)
			System.out.println("pragna gave me 10");
		else
			System.out.println("manoj gave me 20");
	}

	private int m1(String msg) {
		try {
			if (msg.equals("pragna"))
				return 10;
			else
				throw new MyException(msg + " is not pragna");
		} catch (MyException e) {			
			e.printStackTrace();
			return 20;
		}

	}
}
