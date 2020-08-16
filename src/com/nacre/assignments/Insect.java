package com.nacre.assignments;

//4>process of initialization of non-static members 
public class Insect {
	int i = 1, j;

	{
		System.out.println("This is non static block");
	}

	public Insect() {
		super();
		j = 1;
		System.out.println("value of i=" + i);
		System.out.println("value of j=" + j);
	}

	private int x1 = display("Insect.x1 initialized");

	private int display(String string) {
		System.out.println(string);
		return 0;
	}

	public static void main(String[] args) {
		Insect i = new Insect();
		System.out.println(i.x1);

	}

}
