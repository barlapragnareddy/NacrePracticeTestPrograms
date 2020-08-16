package com.nacre.assignments;

//7>Creating Array of objects using setters and getters to intialize values
import java.util.Scanner;

class StudentArray {
	String stuName;
	int rollno;
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
}

public class MainClassArray {
	
	public static void main(String[] args) {
		StudentArray[] studentObjects = new StudentArray[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			StudentArray s = new StudentArray();
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter rollNo");
			int rollno = sc.nextInt();
			s.setStuName(name);
			s.setRollno(rollno);
			studentObjects[i] = s;
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Student " + (i + 1) + " object:");
			System.out.println(studentObjects[i].getStuName());
			System.out.println(studentObjects[i].getRollno());
		}
	}
}
