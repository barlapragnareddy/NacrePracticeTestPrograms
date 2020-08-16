package com.nacre.assignments;

//Process of initialization of static members
public class InsectDemo {
	static int i = 1;
	static {
		System.out.println("I am static block");
	}
	private static int x1 = display("Insect.x1 initialized");

	private static int display(String string) {
		System.out.println(string);
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("value of x1 is="+x1+" value of i is="+i);
		
		
	}

}
