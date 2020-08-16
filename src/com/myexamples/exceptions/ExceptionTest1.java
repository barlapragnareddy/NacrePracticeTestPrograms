package com.myexamples.exceptions;
//throws keyword handling in catch block 
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest1 {
	public void m3() {
		try {
			
			m1(5);
		} catch (IOException e) {
			System.out.println("Exception handled in m3 catch block");
			
		}
	}
	public void m1(int a) throws IOException {
		if (a == 5)
			throw new IOException("5 is not accepted by program and gets IO Exception");
		else
			throw new FileNotFoundException("5 is not accepted by program and gets IO Exception");
	}

	public static void main(String[] args)  {
		ExceptionTest1 at = new ExceptionTest1();

			at.m3();
		
//		try {
//
//		} catch (Exception e) {
//			System.out.println(e);
//		}
	}

}
