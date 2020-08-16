package com.nacre.assignments;
//Use of super and this keyword
class ParentClass {
	int a;

	public ParentClass() {
		super();
		System.out.println("Zero Parameter Constructor");
	}

	public ParentClass(int a) {
		this();
		System.out.println("One Parameter Constructor");
		this.a = a;

	}

	void message() {
		System.out.println(" I am super class method");
	}

}

public class ChildClass extends ParentClass {
	int b;

	public ChildClass(int b) {
		super(b);
		this.b = b;
		System.out.println("This is subclass one parameter constructor");
		System.out.println("superclass value:" + super.a + " subclass value:" + this.b);
	}

	void message() {
		System.out.println(" I am subclass method");
	}

	void display() {
		this.message();
		super.message();
	}

	public static void main(String[] args) {
		ChildClass s = new ChildClass(5);
		System.out.println("-------------------------------");
		s.display();

	}

}
