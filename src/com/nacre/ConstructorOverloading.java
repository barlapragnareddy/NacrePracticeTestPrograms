package com.nacre;
//constructor overloading example
class OverloadingTest {
	int age;
	String name;
	long phoneNo;
	String designation;

	public OverloadingTest(int age, String name, long phoneNo, String designation) {
		this.age = age;
		this.name = name;
		this.phoneNo = phoneNo;
		this.designation = designation;
		System.out.println(this.age + " " + this.name + " " + this.phoneNo + " " + this.designation);
	}

	public OverloadingTest() {
		name = "Lasya";
		phoneNo = 34567;
		System.out.println(name + " " + phoneNo);
	}

	public OverloadingTest(int age, String name) {
		this.age = age;
		this.name = name;
		System.out.println(this.age + " " + this.name);
	}

	public OverloadingTest(String name) {
		this.name = name;
		System.out.println(this.name);
	}

}

public class ConstructorOverloading {
	public static void main(String[] args) {

//calling multiple constructors with different types
		OverloadingTest ravi = new OverloadingTest();
		OverloadingTest sravani = new OverloadingTest(24, "Sravani");
		OverloadingTest mohan = new OverloadingTest(25, "Mohan", 4567834, "Assistant Professor");
		OverloadingTest rohita = new OverloadingTest("Rohita");

	}
}
