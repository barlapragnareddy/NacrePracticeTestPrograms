package com.nacre;

//non argument constructor example
class Employee {
	// same name for all objects
	String companyName;

//no arguments constructor declaration
	public Employee() {
		companyName = "Virtusa";

	}

//display value
	public void display() {
		System.out.println("company name=" + companyName);
	}
}

public class Non_ArguementConstructor {
	public static void main(String[] args) {
		// creating objects and calling no arg constructor
		Employee rohita = new Employee();
		rohita.display();
		Employee nitya = new Employee();
		nitya.display();

	}
}
