package com.nacre.assignments.exceptionday1;

/*Method overriding where parent not throwing 
exception but child can throw an unchecked exception*/

class ParentClass {
	public void get() {
		System.out.println("I am parent class method");
	}
}

class SubClass extends ParentClass {
	@Override
	public void get() throws RuntimeException {
		System.out.println("I am child class method");
	}
}

public class NoParentThrowException {

	public static void main(String[] args) {
		ParentClass pc = new SubClass();
		pc.get();
	}

}
