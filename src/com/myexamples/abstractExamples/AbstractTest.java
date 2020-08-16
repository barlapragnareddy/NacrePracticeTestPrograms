package com.myexamples.abstractExamples;
abstract class A{
	//empty abstract class also possible
}


abstract class Animal {
	int a=20;
	public static int b=40;
	public abstract void sound();

	public abstract void color();
	public abstract void eat();

	public void legs() {
		System.out.println("Shows no of legs");

	}
	static void m2() {
		System.out.println("m2 static method in interface");
	}
}


abstract class Cat extends Animal {
	
	public void sound() {
		System.out.println("meowwww");
		
	}
	public abstract void color();
	//public abstract void eat();
	public void tail() {
		System.out.println("no");
		
	}
}

 class Dog extends Cat {
	 
	public void color() {
		System.out.println("white dog");
	}
	public void sound() {
		System.out.println("bowbow");
	}
	public void eat() {
		System.out.println("pea");
	}
	public void tail() {
		System.out.println("yes");
	}
	static void m2() {
		System.out.println("m2 static method in class");
	}
}

public class AbstractTest {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.color();
		d.legs();
		d.sound();
		d.m2();
		
		System.out.println(d.a);
		Cat c=new Dog();
		c.tail();
		c.color();
        c.legs();
        c.a=30;
        System.out.println(c.a);
        Animal a=new Dog();
        a.legs();
        a.color();
        a.sound();
        a.m2();
        System.out.println(a.a);
        Animal.b=50;
        System.out.println(c.b);
	}

}
