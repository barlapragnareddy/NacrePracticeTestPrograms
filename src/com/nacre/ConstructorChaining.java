package com.nacre;

//constructor chaining example
class ChainingTest {
	String studentName;
	int studentId;
	String branch;
	int phoneNo;

	public ChainingTest(String studentName, int studentId) {
		this();
		this.studentName = studentName;
		this.studentId = studentId;

	}

	public ChainingTest() {
		this(234567);
		branch = "CSE";
	}

	public ChainingTest(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void display() {
		System.out.println(this.studentName + " " + this.studentId + " " + this.branch + " " + this.phoneNo);
	}

}

public class ConstructorChaining {

	public static void main(String[] args) {
		ChainingTest ct = new ChainingTest("pragna", 3);
		ct.display();

	}

}
