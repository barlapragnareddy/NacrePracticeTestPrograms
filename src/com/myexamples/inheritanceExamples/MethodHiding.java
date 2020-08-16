package com.myexamples.inheritanceExamples;

class BaseClass{
	 static void display() {
		System.out.println("I am base class method");
	}
}
class DervivedClass extends BaseClass{
	static void display() {
		BaseClass.display();
		System.out.println("I am derived class method");
	}
	public int sum(int a) {
		return a;
	}
}

public class MethodHiding {

	public static void main(String[] args) {
		BaseClass bc=new DervivedClass();
		bc.display();//it hides child class method so static method is not override in this case.
		DervivedClass.display();
		BaseClass.display();
		
		
	}

}
