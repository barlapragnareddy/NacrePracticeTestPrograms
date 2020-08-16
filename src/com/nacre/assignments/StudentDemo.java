package com.nacre.assignments;
//printing object content by constructing parameterised constructor and printing object
public class StudentDemo {
int studentRNo;
String studentName;

	public StudentDemo(int studentRNo, String studentName) {
	super();
	this.studentRNo = studentRNo;
	this.studentName = studentName;
}



	public static void main(String[] args) {
		StudentDemo student1=new StudentDemo(3,"Ranjitha");
		System.out.println(student1);
		StudentDemo student2=new StudentDemo(10,"Pragna");
		System.out.println(student2);
		
	}

}
