package com.nacre.assignments;

//4>static and non static blocks execution flow order change
public class BlockDemo {
	{
		System.out.println("Non-Static Block 1");
	}
	{
		System.out.println("Non-Static Block 2");
	}
	{
		System.out.println("Non-Static Block 3");
	}
	static {
		System.out.println("Static Block 1");
	}
	static {
		System.out.println("Static Block 2");
	}
	static {
		System.out.println("Static Block 3");
	}
	

	public static void main(String[] args) {
		BlockDemo bd = new BlockDemo();

	}

}
