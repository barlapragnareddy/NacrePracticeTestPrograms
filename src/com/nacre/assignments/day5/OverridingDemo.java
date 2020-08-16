package com.nacre.assignments.day5;

class SuperClass{
	public void show() {
		System.out.println("this is parents class method");
	}
}
class ChildClass extends SuperClass{
	public void show() {
		System.out.println("this is child class method");
	}
	public void display() {
		System.out.println("Welcome to child class");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		SuperClass s=new ChildClass();
		/*storing child class obj in parents class reference 
		achieves concept of method overriding*/
		s.show();
	}

}
