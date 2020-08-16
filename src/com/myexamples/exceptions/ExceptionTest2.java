package com.myexamples.exceptions;

import java.util.Arrays;

public class ExceptionTest2 {
	public static void main(String[] args) {
//		ExceptionTest1 e =new ExceptionTest1();
//		e.m1();
		
	try {
		Class c=Class.forName("com.exceptions.ExceptionTest1");
		c.getName();
		System.out.println(c.getDeclaredMethods());
		System.out.println(Arrays.toString(c.getDeclaredMethods()));
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
