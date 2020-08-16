package com.nacre.assignments;

//5>instance of operator example
public class InstanceDemo {
	public void demo(InstanceDemo i) {
		if (i instanceof InstanceDemo)
			System.out.println("Yes,this object belongs to this class");
		else
			System.out.println("Oops,this object not belongs to this class");

	}

	public static void main(String[] args) {
		InstanceDemo id = new InstanceDemo();
		id.demo(id);
		InstanceDemo i3 = null;
		id.demo(i3);
	}

}
