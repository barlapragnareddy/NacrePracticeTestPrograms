package com.myexamples.inheritanceExamples;


class Substraction{
	public void Minus(int a,int b) {
		System.out.println(a-b);
	}
	public void Minus(int a,int b,float c) {
		System.out.println(a+b-c);
	}
	public void Minus(String s) {
		System.out.println(s);
	}
}
public class MthodOverloading {

	public static void main(String[] args) {
		Substraction sub=new Substraction();
		sub.Minus(2,3);
		sub.Minus(1, 5, 2.2F);
		sub.Minus("Pragna");
		
	}

}
