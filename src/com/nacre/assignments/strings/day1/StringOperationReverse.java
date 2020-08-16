package com.nacre.assignments.strings.day1;

import java.util.Scanner;

//Reverse of a string using string buffer and without string buffer
class ReverseClass {
	private String strVar;

	public String getStrVar() {
		return strVar;
	}

	public void setStrVar(String strVar) {
		this.strVar = strVar;
	}

	public String reverseBufferString() {
		StringBuffer sb = new StringBuffer(strVar);
		sb.reverse();
		return sb.toString();
	}

	public String reverseWithOutBuffer() {
		/*
		 * char[] ch = strVar.toCharArray(); String s = ""; for (int i = ch.length - 1;
		 * i >= 0; i--) { s = s + ch[i]; }
		 */
		String s = "";
		for (int i = strVar.length() - 1; i >= 0; i--) {

			s = s + strVar.charAt(i);
		}
		return s;
	}
}

public class StringOperationReverse {

	public static void main(String[] args) {
		ReverseClass rc = new ReverseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		rc.setStrVar(s);
		String s1 = rc.reverseBufferString();
		System.out.println("Reverse of string using stringbuffer= " + s1);
		String s2 = rc.reverseWithOutBuffer();
		System.out.println("Reverse of string without using stringbuffer=" + s2);
		sc.close();
	}

}
