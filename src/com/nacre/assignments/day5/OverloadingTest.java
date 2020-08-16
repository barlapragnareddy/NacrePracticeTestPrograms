package com.nacre.assignments.day5;

//4>Method Overloading Example
class Multiplication {
	// same method with different arguments is called method overloading
	public int multiplyOperation(int a) {
		return a * a;
	}

	public float multiplyOperation(int a, float b) {
		return a * b;
	}

	public void multiplyOperation(String s) {
		System.out.println("perform multiplication");
	}
}

public class OverloadingTest {

	public static void main(String[] args) {
		Multiplication m = new Multiplication();
		// calling method,based on arguments
		// compiler decides which method to be executed
		System.out.println(m.multiplyOperation(2));
		System.out.println(m.multiplyOperation(3, 4.4f));
		m.multiplyOperation("2");
	}

}
