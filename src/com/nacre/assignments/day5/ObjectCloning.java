package com.nacre.assignments.day5;
//6>object cloning example

class StudentClass implements Cloneable {
	private int age;
	private String name;
	private String adrress;

	public StudentClass(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getAdrress() {
		return adrress;
	}

	public void setAdrress(String adrress) {
		this.adrress = adrress;
	}

	@Override
	public StudentClass clone() throws CloneNotSupportedException {

		return (StudentClass) super.clone();

	}
}

public class ObjectCloning {

	public static void main(String[] args) {
		StudentClass s = new StudentClass(1, "Pragna");
		// s.setAdrress("16-11/1/A");
		StudentClass s1 = null;
		StudentClass s2 = s;
		try {
			// creating object of student using clone method
			s1 = s.clone();
		} catch (CloneNotSupportedException c) {
			c.printStackTrace();
		}
		s.setAdrress("16-11/1/A");
		System.out.println(s + " " + s1 + " " + s2);
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println("Age is= " + s.getAge() + " name is= " + s.getName() + " Address= " + s.getAdrress());
		System.out.println("Age is= " + s1.getAge() + " name is= " + s1.getName() + "Address =" + s1.getAdrress());
		System.out.println("Age is= " + s2.getAge() + " name is= " + s2.getName() + "Address =" + s2.getAdrress());

	}

}
