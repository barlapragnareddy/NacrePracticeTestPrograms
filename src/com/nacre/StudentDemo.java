package com.nacre;
//program for parameterized constructor
class Student {
	String studentName;
	int studentNumber;

//parameterized constructor declaration
	public Student(String studentName, int studentNumber) {
		this.studentName = studentName;
		this.studentNumber = studentNumber;
	}

//displaying values
	public void display() {
		System.out.println("student name=" + studentName);
		System.out.println("student number=" + studentNumber);
	}
}

//Execution logic
public class StudentDemo {

	public static void main(String[] args) {
		/* Calling parameterized constructor 
		   to initialize object properties */

		Student ram = new Student("Ram", 2);
		ram.display();
		Student sita = new Student("Sita", 3);
		sita.display();
	}

}
