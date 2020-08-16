package com.nacre.assignments.day5;
//Encapsulation concept example
class Student {
	private String studentName;
	private int studentRollNo;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentRollNo() {
		return studentRollNo;
	}
	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
}
public class EncapsulationTest {
	
	public static void main(String[] args) {
		Student studentObject = new Student();
		/*
		 * we cannot access student name and roll no directly because it shows compile
		 * time error as they are private variables.
		 */
//		System.out.println("Accessing student name directly: "+studentObject.studentName);
//		System.out.println("Accessing student rollno: "+studentObject.studentRollNo);
		System.out.println("Student 1 object:");
		// we should use setters and getters to set values and get values
		studentObject.setStudentName("Rohita");
		studentObject.setStudentRollNo(12);
		System.out.println("Student name= " + studentObject.getStudentName());
		System.out.println("Student roll no= " + studentObject.getStudentRollNo());

	}

}
