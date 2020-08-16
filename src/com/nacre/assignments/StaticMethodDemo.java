package com.nacre.assignments;

//1>calling static method from static method in different ways
public class StaticMethodDemo {
	static void displayStaticMessage() {
		System.out.println("this is a static method");
	}

	public static void main(String[] args) {
		StaticMethodDemo.displayStaticMessage();// calling with class name
		StaticMethodDemo sm = new StaticMethodDemo();
		sm.displayStaticMessage();// calling with object
		StaticMethodDemo s1 = null;
		s1.displayStaticMessage();// calling with null reference

	}
}
