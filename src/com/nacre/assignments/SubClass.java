package com.nacre.assignments;
//Constructor Chaining
 class SuperClass {
	String name;
	String course;
	long phoneNo;
	String address;

	public SuperClass() {
		address = "Srininagar Colony";	
		System.out.println("parent class no arg constructor");
	}

	public SuperClass(long phoneNo) {
		this();
		this.phoneNo = phoneNo;
		System.out.println("parent class 1 arg constructor");
	}

	public SuperClass(String name, String course) {
		this(9491491967l);
		this.name = name;
		this.course = course;
		System.out.println("parent class 2 arg constructor ");
	}

	@Override
	public String toString() {
		return "SuperClass [name=" + name + ", course=" + course + ", phoneNo=" + phoneNo + ", address=" + address
				+ "]";
	}
	
}
public class SubClass extends SuperClass{
	String designition;
	int age;
	String caste;
	
	public SubClass() {
		super("Bunny","ECE");
		System.out.println("subclass no arg constructor");
	}
	public SubClass(String caste) {
		this();
		this.caste = caste;
		System.out.println("Subclass 1 arg constructor");
	}

	public SubClass(String designition, int age) {
		this("OC");
		this.designition = designition;
		this.age = age;
		System.out.println("subclass 2 arg constructor");
	}
	
	@Override
	public String toString() {
		System.out.println(super.toString());
		return "SubClass [designition=" + designition + ", age=" + age + ", caste=" + caste + "]";
	}
	public static void main(String[] args) {
		SubClass sc=new SubClass("Analyst",24);
		System.out.println(sc);
	}	
}

