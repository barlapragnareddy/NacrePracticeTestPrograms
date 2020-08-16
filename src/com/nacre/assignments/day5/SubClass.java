package com.nacre.assignments.day5;
//5>Covarient Returntype example

class Super {
	public Super get() {
		return this;
	}
}

public class SubClass {
	/*if we change return type as 'super' for get(), we
	 *  get compile time error because 
	 *  subclass cannot convert to super.
	 */
	public SubClass get() {
		return this;
	}
/*subclass method returntype must be a 
	subclass of parents class returntype or subclass return type.
	Then it is called covarient return type*/
	public void message() {
		System.out.println("this is subclass message method");
	}

	public static void main(String[] args) {

		new SubClass().get().message();
	}

}
