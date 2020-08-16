package com.nacre.assignments.strings.day1;

public final class StudentImmutableClass {
	// final fields can be initialised at declaration or using constructor
	private final int rollNo;
	private final String name;

	public StudentImmutableClass(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public static void main(String[] args) {
		StudentImmutableClass si = new StudentImmutableClass(10, "pragna");
		System.out.println("roll no=" + si.rollNo);
		System.out.println("name is=" + si.name);
		//si.rollNo = 13;// final field cannot be modified.
		StudentImmutableClass si1 = new StudentImmutableClass(11, "manoj");
		System.out.println("roll no=" + si1.rollNo);
		System.out.println("name is=" + si1.name);

	}

}
