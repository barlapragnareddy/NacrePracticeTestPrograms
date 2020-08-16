package com.nacre.assignments.day5;
//1>use of Inheritance 
class SuperClass2{
	int a;
	int b;
	void display(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("Value of a="+this.a);
		System.out.println("Value of b="+this.b);	
	}
}
public class SubClass2 extends SuperClass2{

	public static void main(String[] args) {
		SubClass2 s=new SubClass2();
		s.display(2,3);
		System.out.println(s.a);
		System.out.println(s.b);
	}

}
