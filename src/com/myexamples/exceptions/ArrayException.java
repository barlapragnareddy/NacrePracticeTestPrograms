package com.myexamples.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ArrayException {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			int arr[] = { 1, 2, 3, 4, 5 };
//			System.out.println(arr[5]);
			 fis = new FileInputStream("");
		}
		catch (NullPointerException | ClassCastException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch (RuntimeException e) {
			System.out.println("RuntimeException");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				fis.close();
			} catch (Exception e) {
				System.out.println("finally exception");
				e.printStackTrace();
			}
		}

	}

}
