package com.nacre.assignments;
//1>creating objects & assigning values to instance variables and displaying object content

public class Student {
int studentRollNo;
String studentName;


	public Student(int studentRollNo, String studentName) {
	super();
	this.studentRollNo = studentRollNo;
	this.studentName = studentName;
}

//displaying content of object variables
	@Override
	public String toString() {
		return "Student RollNo=" + studentRollNo + ", Student Name=" + studentName;
	}


	public static void main(String[] args) {
		//assigning values
		Student student1=new Student(5,"Pragna");
		System.out.println(student1);
		Student student2=new Student(6,"Ranjitha");
		System.out.println(student2);
	}

}
