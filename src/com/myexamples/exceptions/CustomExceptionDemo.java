package com.myexamples.exceptions;
class ExceptionMine extends Exception{
	
	ExceptionMine(){
		
	}
	ExceptionMine(String s){
		super(s);
	}
	
}
public class CustomExceptionDemo {

	public static void main(String[] args) {
		try {
		m1("Manoj");
		}
		catch(ExceptionMine em) {
			System.out.println("Exception handled in main method catch ");
			em.printStackTrace();
	}}

	private static void m1(String string) throws ExceptionMine {
		if(string.equals("pragna"))
			System.out.println(string);
		else
			throw new ExceptionMine(string+"is not pragna");
	}
}