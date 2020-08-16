package com.nacre.assignments;
//calling static and non static variable from main static method
public class VariableExample {
	static int x = 10;
	int y = 20;

	public static void main(String[] args) {
		/*object ref or class name is not required 
		to call static variable in a same class*/
		System.out.println("value of x="+x);
		VariableExample ve=new VariableExample();
		//object is required to call non static variable
		System.out.println("value of y="+ve.y);
	}

}
