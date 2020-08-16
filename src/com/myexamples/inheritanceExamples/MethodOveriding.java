package com.myexamples.inheritanceExamples;

class Addition {
	public void sum(int a, int b) {
		System.out.println("I am a super class:"+a + b);
	}

	public Addition display() {
		return new Addition();
	}

	public Multiplication multiplyObject() {
		Multiplication ad = new Multiplication();
		return ad;
	}
}

class Multiplication extends Addition {
	public void sum(String a, String b,String c) {
		System.out.println(a);
	}
	public void sum(int a, int b) {
		System.out.println("I am child class:"+a + b);
	}

	public Multiplication multiplyObject() {
		Addition m = new Multiplication();
		return (Multiplication) m;

	}

	public Addition display() {
		return new Multiplication();
	}
}

public class MethodOveriding {

	public static void main(String[] args) {
		Multiplication ml = new Multiplication();
		System.out.println(ml);
		ml.sum(2,4);
		Addition ad = ml.display();
		System.out.println(ad);
		Addition ad2= ml.multiplyObject();
		System.out.println(ad2);
		Addition m2=new Multiplication();
		m2.sum(4, 5);
		Multiplication mt=m2.multiplyObject();
		System.out.println(mt);
		Addition at=new Addition();
		System.out.println(at);
		System.out.println(at.display());
		at.sum(2, 1);
		at.display().sum(1,2);
		
	}

}
