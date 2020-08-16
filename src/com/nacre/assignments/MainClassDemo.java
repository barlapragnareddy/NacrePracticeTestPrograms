package com.nacre.assignments;
//creating student array objects and assigning 
//values through constructor and display them
import java.util.Scanner;

class Student1 {
	String name;
	int rollNo;

	public Student1(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	public void display() {
		System.out.println("Student name=" + name + "  " + "Student Roll No=" + rollNo);

	}
}

public class MainClassDemo {

	public static void main(String[] args) {
		Student1[] studentObjects = new Student1[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter roll no");
			int rollNo = sc.nextInt();
			Student1 s1 = new Student1(name, rollNo);
			studentObjects[i] = s1;
		}
		sc.close();
		for (int i = 0; i <5; i++) {
			System.out.println("Student "+(i+1)+" object:");
			studentObjects[i].display();
		}

	}
}
