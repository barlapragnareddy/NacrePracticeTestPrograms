package com.nacre.assignments.exceptionday1;

/*sub class overriding method throwing 
exception of higher type than parent*/

class SuperClass {
	public void get() throws Exception {
		System.out.println("I am super class method");
	}
}

class BaseClass extends SuperClass {
	@Override
	public void get() throws ClassNotFoundException {// Compile Time Error
		System.out.println("I am child class method");
	}
}

public class ChildThrowSubClassException {

	public static void main(String[] args) {
		SuperClass sp = new BaseClass();
		try {
			sp.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
