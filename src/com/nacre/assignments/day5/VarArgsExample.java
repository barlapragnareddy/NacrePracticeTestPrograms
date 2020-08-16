package com.nacre.assignments.day5;
//7>Var args example 

public class VarArgsExample {
	static void display(String... values) {
		System.out.println("hii");
		for (String v : values) {
			System.out.print(v + " ");
		}
	}

	public static void main(String[] args) {
		display();
		display("I", "Love", "India");
	}

}
